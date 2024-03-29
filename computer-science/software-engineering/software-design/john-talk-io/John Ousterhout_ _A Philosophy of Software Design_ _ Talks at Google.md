<<<<<<< HEAD:software-design/john-talk-io/John Ousterhout_ _A Philosophy of Software Design_ _ Talks at Google.md
[DownSub.com]

SPEAKER 1: OK.

So, welcome.

Good morning, everyone.

It's my pleasure to welcome
Professor Ousterhout

for this Talks at
Google presentation.

My name is [INAUDIBLE].

I work in Technical
Infrastructure Cloud.

Very quick intro to John to
get things started here--

John is a Professor of Computer
Science at Stanford University.

He spent, 
before that, 14 years in industry where he founded two companies,
Scriptics and Electric Cloud and, 
before that, 14 years as a professor at UC Berkeley.

Anybody here who has taken
a class with John before--

so a bunch of his
students as well.

So he's pretty distinguished, so I'm not

going to go through a
list of his awards here--

a member of the National Academy of Engineering, 
ACM Software System Award, 
UC Berkeley Distinguished Teaching Award,
to name a few here.

But more relevant
to this talk, John

has built several influential
systems, 
the Sprite operating system, 
Tcl, Tk, log-structured file systems, Raft,
and, more recently, RAMCloud.

And I think his bios says he has literally graded, like, thousands of programming student assignments.

And today, we are going to
hear the synthesis of all

of John's first-hand knowledge
both from his research

and teaching on a topic that's
very close to us, how to design and how not to design software.

There is a book here.

I don't have it to show.

Let me show it to
the camera here.

There is a book or "A
Philosophy of Software Design."

I was pretty lucky to read
the pre-print of this.

It's a really good book.

And hopefully, he'll
tell us a little bit more

about that as well.

And last note, if
you have questions,

since this is being recorded,
just raise your hand,

and you'll get the mic to you.

And then you can ask questions.

So, welcome, John.

JOHN OUTSERHOUT: Great.

Thank you.

[APPLAUSE]

First of all, I do not
have an hour's worth

of material prepared,
because there

will be lots of questions.

I'm happy to take
them in line as we go.

At some point, probably,
there'll be too many

and we're running late,
then I'll cut them off.

But feel free to ask questions,
you know, expresses disbelief,

argue, insult my mother,
whatever you wish,

during the talk.

But do make sure that the
insults are on the mic.

[LAUGHTER]

OK.

susah searching black art di google.

So people have been programming computers for more than 80 years now.
And yet software design is still basically a black art.
There's essentially no agreement on how to do software design or even what a good piece of software looks like.
You know, we talk a lot about software engineering, and software tools, and testing, and processes.
But we have almost no conversation about the fundamental act of designing software.
And this has bugged me for a long time.
So today, I'd like to tell you about some things I've been doing to try and change that, to start the conversation and to see if we can somehow create a more, a greater, sense of design awareness in the software community.
And that consists of a new course I developed at Stanford and then, based on that, a book on software design.

OK.

So let's start with the basics.

If you had to pick one
idea, one concept that's

the most important thing in
all of computer science, one

thing that threads through
every aspect of computer

science from AI to systems
to theory, first of all,

what would you pick?

AUDIENCE: Abstraction.

JOHN OUTSERHOUT: Abstraction.

AUDIENCE: Testing.

JOHN OUTSERHOUT: Sorry?

AUDIENCE: Testing.

JOHN OUTSERHOUT: Testing.

Other ideas?

AUDIENCE: Composition.

JOHN OUTSERHOUT: Sorry?

AUDIENCE: Composition.

JOHN OUTSERHOUT: Composition.

AUDIENCE: Complexity.

JOHN OUTSERHOUT: Sorry?

AUDIENCE: Complexity.

JOHN OUTSERHOUT: Complexity.

So I asked Don Knuth this question.
He said, layers of abstraction, which I would say is almost right.

[LAUGHTER]

Although, some would say,
by definition, it's right.

What I would say is
problem decomposition.

How do you take a
complicated problem or system

and chop it up into
pieces that you can

build relatively independently?

And yet, as far as I know,
aside from what you're

going to hear today, there
is no course anywhere

where that concept is one
of the most important ideas

in the course.

We simply don't teach it.

Second, we all know that
some programmers are way,

way more productive than others.

Google has coined the
term the 10x programmer.

And yet, as far
as I know, no one

attempts to teach
these skills either.

And these ideas have been
sitting in the back of my head

and bugging me for a long time.

How can we have these things
that are so important,

and yet we don't
really make any attempt

to teach people this stuff?

You know, if you're
a great programmer,

somehow you just figure
it out on your own.



So that leads to the
question, can we do this?

And there's three
questions there.

First, is it even possible?

You know, is this just
a some sort of innate

skill that you're born
with in your genes,

or is it something
that can be taught?

So first let's do
a quick survey.

How many of you think this is
something that it's, you know,

either you have it or you don't?

You can't really teach it.

It's just an innate skill.

A few.

How many think
that this could be

taught in some way or another?

Good.

A few summers ago, I
read a really great book

by Geoff Colvin titled
"Talent Is Overrated."

If you want a fun read, read it.

It's a relatively quick read
in which he goes through study

after study that shows in these fields where we think of some people
as being tremendously talented,

# what make differentiates between top performer and average performer ?
in fact, the only thing that really differentiates the top performers from the average performers is "how much they've practiced".

That's the one consistent correlating factor they could find.
It's all about practice.

# is it possible to teach "problem-decomposition"
So that got me thinking, I mean, I believe it's got to be possible to teach this. 
But the second thing is, who's going to do it? 

# why most faculty in 2018 cannot teach it ?
Well, unfortunately, not most of today's faculty.
The problem is the typical faculty member writes a little bit of code as a grad student, never really gets any instruction.
You throw out some crappy code for your dissertation, and then you become a professor.
And then you decide coding is what graduate students do, so you stop coding.
And you never write anymore code.

# how to become a great developer ?
And so, you know, the only way to become a great developer and learn design skills today is with tons of personal experience, sort of trial and error.

Faculty don't have that.
So they can't teach their students.

And so the whole process
just continues over and over

and over again.

But, fortunately, I'm not
one of those faculty members.

So maybe I have a better
chance of doing this.

So, personally, I
love programming.

I mean, programming, it's really
one of the top two or three

things I live for-- you know,
my family, programming--

[LAUGHTER]

--really bad golf game.

There's a sort of few
things [AUDIO OUT]

the things that drive my life.

But if I don't write 5,000
lines of code a year at least,

I feel like it hasn't
been a great year for me.

So in over my career,
I've probably written,

I think now, 250,000 to 300,000 lines of code.

So I've had a chance to observe a lot.

And, again, as
I've been doing it,

I've been thinking
about design stuff.

So I thought maybe, you know, if anybody can do it in academia,
I probably got about as good a shot as anybody.

Then the third question is, well, how do you do it?

So I combined all these three things together.

I finally decided only
one way to find out.

I'm just going to
have to try it.

You know, maybe I'll crash and
burn, but I'll give it a try.

So I created a new course
at Stanford, CS 190 Software Design Studio.

It's not taught like a
typical [INAUDIBLE] course.

It's taught more
like the way you

learned English
writing in high school

with an iterative approach.

So, you know, the way about
writing is you write something.

Your teacher marks it up.

You get it back again.

You rewrite.

They marking up again.

And so the whole process
iterates several times.

And it's that process of
getting criticism, incorporating

the criticism and
learning and seeing

how that makes things better.

That's how you
become a good writer.

So I thought we'll try the
same idea in the class.

And so that's the way it works.

Now, we only have 10
weeks in a quarter system.

So we can only do three
iterations of this cycle.

But the basic way it works
is in the first couple

of weeks of the course,
students in teams of two

build the largest
system they can possibly

build in three weeks.

That's typically about 2,000
to 3,000 lines of code, so,

you know, still
not a huge system.

Then after week three we
go into code review phase.

Students read each
code and write reviews.

And I read every
single line of code

written by all of the students.

This is sort of one of the
limitations of the class

right now.

So I end up reading 20,000
to 30,000 lines of code

in that week.

And then we do code
reviews in class

where students will present
pieces of their project

and other students
will critique it.

And then I do longer code reviews.

I read everybody's projects.

I typically make 50 to 100 comments on every team.

And then I meet with the teams individually for an hour and go over it with them.

Then the second phase is they revise based on the code reviews.

They actually add a little bit
of additional functionality

as well in the second phase.

We do another round
of code reviews.

And then the third phase,
they get a new project.

They start from scratch again.

And we finally do a third
round of code reviews.

And when they do this, the
students get no ideas from me

about how to design.

I just tell them what
the system has to do.

They have to start from
scratch and figure everything

out themselves.

So they make lots of
mistakes in the first phase,

but that's part of the
learning of the class.

Yeah, another question?

Mic's coming here.

AUDIENCE: I watched
your YouTube video

on the same topic you gave.

And in that one, phase three,
it was past the project

to person on the left and
inherit someone else's code.

Why did you change it?

JOHN OUTSERHOUT: Yeah.

In the first two times
I taught the class,

I actually scrambled the
projects in the third phase

and made people add over
somebody else's project.

That was a good
learning experience,

but the problem is people
end up spending a lot of time

decoding other people's projects
and being frustrated with it.

That has some value,
but they don't

spend as much time
doing real design stuff.

And so I finally
decided if what I really

want is to teach
people design, I

think they'll learn more if
they get to start from scratch

and do a new design project.

So I changed it.

I may change back again.

I'll try this for a while
and see if it works.

OK.

So that's the basic
idea of the course.

Now, you may be wondering, so
what are the magic secrets.

How do you do software design?

And by the way,
what makes me think

I know what the secrets are?

So first of all, I don't
claim to know all the answers.

I have, you know, some ideas
that have kind of coalesced

in my mind over the
years, which I'm using

in the course and the book.

I don't claim those are the end.

Actually, I'm hoping more to use those

to start a discussion of
all of them over time.

But in the class, there's about
sort of 10 high level ideas.

They're very abstract,
almost philosophical.

I can't give you a recipe.

You know, follow these
10 steps, and you

will produce a great design.

I'm not sure that
there is such a recipe.

So instead, there
are these vague ideas

that I talk about while
students are doing

their first round of design.

I'm not sure they
sink in very well,

because they're so abstract.

It's probably hard to figure
out how to apply them.

The way they work
best, though, was

when we do the code reviews.

Then I can show the
students how they violated

some of these
principles and what

the consequence
was in their code

and how they should change it.

And then they can go back
and apply the principles

as they revise.

And then I think the
ideas start sinking in.

So it's sort of a--

question in back, yeah.



AUDIENCE: Yeah.

I'm curious what you think about how does the sort of end to end principle in sort of
software design factor into this in terms of trying
to push all the complexity

to the edges of the system?

JOHN OUTSERHOUT: End
to end principle?

AUDIENCE: So like
the [INAUDIBLE]

example of TCP, the checksum,
you know, is done end to end.

It's not in the
intermediate router stages.

And that was a design
principle that they had.

JOHN OUTSERHOUT: I'll
have to think about that.

I'm not sure that relates in a
direct way to this principles,

but I'll have to
think about that.

So there are these
vague principles.

Then the other thing I try and
do is talk about red flags.

So red flags are
very specific things

that, if you see this sort
of behavior or pattern,

you're probably in trouble.

And actually I
think for beginners

in particular, red flags
are really useful to people.

Because even if you don't know
how to design the right system,

if you can see
you're going wrong,

then just try something
else until eventually

the red flags go away.

And you'll probably end up
in a pretty decent place.

So red flags are
really very useful.

So what I'd like
to do is I'm going

to talk about the
four things that

are in red just to give you
a sense of some of the ideas.

Two of them are
design principles.

Classes should be deep.

Define areas out of existence.

And two of them are
more about mindset.

I'll talk about
those afterwards.

So the first one is this notion
that classes should be deep.

This is really just
another way of thinking

about the idea of information
hiding David Parnas first put

out in a paper in
the early 1970s.

By the way, to me,
this paper is one

of the two most important
classic papers and all software

design and engineering.

Has anybody here read
this paper in classes?

Great.

It's still topical
and relevant today.

The last third maybe
not so much so,

but the first part's still--
and it's got a great example

and easy to read.

So the way I think
about it, think

about a class as a rectangle.

And the area of the rectangle
is the functionality

that class provides.

So you can think of that's the
benefit that the class provides

to the rest of the system.

Then think about the
top edge as that's

the interface to the class.

And by interface, I
mean everything someone

has to have in their mind
in order to use that class.

It's not just the signatures
for the functions,

but things like side effects
and dependencies and things

like that.

That's really the cost.

You think that that's
the complexity cost

that this class imposes
on the rest of the system.

So we'd like that to be
as small as possible.

So ideally, what you'd
like is the greatest cost--

sorry, greatest
benefit, least cost.

So you'd like the smallest
interface and then the largest

area.

So the opposite of that
I call a shallow class.

So that's something
that has either

not a whole lot of
functionality or really, really

complicated interface or both.

Those classes, they just
don't give us much leverage

against complexity.

In fact, in the worst
case, in the worst case,

the additional overhead
of the interface

adds more complexity
than what you've

hidden underneath the interface,
and it's a net negative.

What we'd like to have, of
course, on the other side

is a deep class--

very simple interface
with a very large amount

of functionality underneath it.

I mean, that's another way of
thinking about abstraction,

right?

The idea of abstraction
is we're trying

to provide a simple
way of thinking

about something that's actually
quite complicated underneath.

So deep classes are
good abstractions.

And this notion you can
apply it to classes.

You can apply it to
methods within classes.

You can apply it to interfaces
in general or modules

in a system or
subsystems, anything

like that that has an
interface or an implementation.

Yeah, question.

AUDIENCE: Is this
one of the concepts

that you give your
students before they start

the first project or after?

Because it seem important
to give at least

a few hints at the beginning.

JOHN OUTSERHOUT: This is
what I give them before--

well, it's concurrent
while they're

doing the first project.

We don't have enough time for
me to go through all the ideas

before they start designing.

So while they're
designing, we're

talking about this
stuff in class.



Here's a classical example
of a shallow method,

which I have to say I
see distressingly often.

There is essentially
no information hiding

in this method.

In order to use
it, you pretty much

need to understand the
complete implementation.

And, by the way, there's
almost no implementation there.

In fact, this is so bad that
it takes more keystrokes

to invoke the method
than if you had just did

the body of the
function yourself.

So it's basically
a complete loss,

just adding complexity and
getting nothing back for it.

Another example, actually,
of a relatively shallow class

I see all the time is a
class for list manipulation.

This is very shallow.

I mean, lists are really
easy to manipulate.

It's two pointers.

We know the pointers are
hiding underneath there

someplace anyhow.

And so that's a
very shallow class.

Now, you can't always
eliminate shallow classes.

You know, sometimes
you end up the best

you can do is a shallow class.

And so I wouldn't say you
should never, ever have them.

But a shallow class
doesn't buy you

much from a design standpoint.

It doesn't help you in the
fight against complexity.



AUDIENCE: [INAUDIBLE]

AUDIENCE: So I think one thing
that is perhaps a bit subtle

is that the size of the class
is not the amount of code that

is in it right now.

It might be the amount of code
that you eventually have to add

or if you have to have multiple
implementations of it, right?

So maybe this doesn't
make sense in isolation,

but perhaps there
is something else,

there is another
implementation of it

maybe right now or in the future
which is going and storing

stuff in a database or
something like that.

And so I kind of
wonder if you disagree

with that
characterization that you

need to keep track of the
evolution of the class in mind

when deciding on its depth.

JOHN OUTSERHOUT: Well,
I agree with that.

In fact, the whole idea
behind software design

is we're doing things
for the future.

It's we're doing things today
to make it easier for us

to develop in the future.

And you have to think
a little bit ahead.

Although, of course, you
know the classic problem

with software is we can't
visualize the future very well.

So it's dangerous to try
and think too far ahead.

But I agree with your
concept in general.

In this particular case,
though, the problem

is that the interface is
already so specialized

that there's just
probably not a lot of room

for wiggle room under there.

Almost certainly anything you
change to the implementation

is probably also going
to change the interface.

And so, again, it's probably
not going to help you.

But, you know, if you
have reason to believe

it will, well, yeah, sure.



So the problem that leads
to this-- and by the way,

I think this is one of the
biggest mistakes people make,

too many, too small,
too shallow classes.

And the reason people do
that is because they've

been taught classes and
methods should be small.

How many of you at
sometime in some course

were taught your
method should be small?

And how many of you have been
given a number, like any method

larger than n lines,
you should chop it up?

How many of you have heard
something like that said?

OK.

Tell me a small value
of n you've heard.

AUDIENCE: 20.

JOHN OUTSERHOUT: 20?

[INTERPOSING VOICES]

JOHN OUTSERHOUT: Has
anybody heard 10?

[LAUGHTER]

I've heard 10 sometimes.

So if you take this
to the extreme,

this results in what
I call classitis.

Classitis is when somebody
says classes are good

and somebody else
thought what they heard

was more classes are better.

[LAUGHTER]

And so under
classitis, your goal

is to have as many small
classes as possible

where each class
adds the tiniest

possible amount of
new functionality

to the previous classes.

If you want more
functionality than that,

make another class for it.

Probably the best example
of this in the world

today is the Java Class Library.

There's nothing in the Java
language that requires this.

But somehow this has
just become the culture

in the Java world, these tons of
little tiny shallow interfaces.

Like, for example, the thing
that just bugged me about Java

when I started programming,
if I want to open a file

and read serialized
objects from it,

I have to create three
objects for that.

First, I have to create
this file stream.

But for some reason,
I don't get buffering.

If I want buffering--

it's like, do you
want it eat today?

[LAUGHTER]

If I want buffering, I have
to create another object.

And then if I want read
serialized objects,

you add another
object on top of that.

And each of these
can throw exceptions

that I have to catch.

And then exceptions can
come halfway through,

and I have to do clean up--

enormous amount of
complexity for something

that's really, really simple.

So I think they lost sight of
the idea that, first of all,

in managing complexity, the
common case matters a lot.

You want to make the common
case really, really simple.

I shouldn't have
to do all of this.

OK.

Maybe I want to be able
to not have buffering,

but that should be an
option that-- you know,

if I don't want buffering, that
should be where things get more

complicated, not to have to
remember to ask especially

for buffering.

So to me, it's not about length.

Length is really not
the fundamental issues.

I don't have
problems with methods

that are hundreds of lines long
if they're relatively clean

and if they have a
deep interface to them.

It's abstraction.

That's the most important thing.

So rather than
striving for length,

you should first try and
get these deep abstractions.

And then if you end
up with something

that's really big and long,
then see if you can chop it up.

But depth is more important.

So what's an example
of a deep interface?

My favorite in the
world, probably one

of the most beautiful
interfaces ever invented

is that Unix file
I/O interface--

five functions, falling
over easy interfaces

to every function.

The only complexity is the flags
and the permissions for open

are a little bit funky,
but everything else

is very, very simple.

And then think
about what's hidden

behind this simple interface.

There's typically hundreds
of thousands of lines of code

behind that that do everything
from managing disk space

to file caching to, you
know, device drivers--

enormous amount of code and, of
course, many other lower level

interfaces behind this, but
just this amazingly beautiful

five functions.

Now, today, people look at
this and think, well, duh,

of course, that's the
way you design things.

But it was not like this.

Has anybody in this
room actually programmed

at around the time
Unix came out?

Only a few of us are old
enough to have done that.

Things were pretty
horrible before then.

Like, for example, in
pre-Unix file systems,

there would be a totally
different set of kernel calls

if you wanted to open a file for
random access versus sequential

access--

two different sets kernel
calls, different kinds of files.

You'd have to declare your file
random access or sequential.

And Unix just had this
amazing the simple interface.

So anyhow-- a beautiful example.

OK.

Let me go to my second
design principle, which is

define errors out of existence.

So we all know that exceptions
are a huge source of complexity

in systems.

For example, in the
RAMCloud storage system,

we thought we were building
a low latency storage system

and figured out we'd be spending
all of our time making things

really fast and low latency.

But, in fact, 90% of our time
went into doing crash recovery.

So they're a huge
source of complexity.

And, again, the common wisdom
kind of leads people astray.

You're taught to program
defensively, which is good.

But people then
think, ah, I should

be throwing lots of exceptions.

The more exceptions
I'm throwing,

the better defense I'm doing.

And as long as I, building my
module, catch all the errors

and heave them up in
the air as exceptions,

I don't have to worry
about where they land

or who's going to
deal with them.

I've done my job.

In fact, the more of them I
throw, the better programmer

I am.

But then that just
results in this explosion

of exceptions that have
to be caught and handled.

And then the exceptions
themselves create more bugs.

And you have secondary
exceptions and so on.

So I would argue,
in general, overall,

we should try to minimize
the number of places

where you have to
handle exceptions.

You can't completely eliminate
it, but try to minimize that.

And the best case of all--

which I found you can
do surprisingly often--

is simply to redefine
the semantics,

so that there is no error.

There is no exception at all.

That's the best.

It's just gone completely.

So let me give you
three examples of that.

First one-- when I was designing
the Tcl scripting language

many years ago, I introduced
an unset command, which

deletes one and more variables.

When I was doing
this, I thought--

by the way, this is a
classic mistake, people--

I thought why in
their right mind

would anybody ever delete a
variable that doesn't exist?

That makes no sense.

So I'm going to throw
an exception for that.

Well, turns out people
do that all the time.

For example, you're halfway
through a computation.

You decide you
just want to bail.

So you want to clean up all
the mess you might have made.

So you go through and
delete every variable

that you might have
created, but you

don't know which
ones you actually

got around to creating yet.

And so some of them don't exist.

So in practice, people complain
about this all the time.

And in fact, if you
look at Tcl code,

I bet virtually every
invocation of the unset command

is wrapped in a catch command
that will catch the exception

and throw it away
when it happens.

So what I should have done--

in fact, I don't know
why I didn't fix it

once I found the problem.

That was my second mistake.

What I should have done
was redefine the semantics,

so that unset makes
a variable not exist.

And if you think
of it that way, ah,

well, if the variable doesn't
exist already, we're done,

clean, no harm, no foul.

So that's what I
should have done,

should not have
thrown that exception.

Another example
is file deletion.



In Windows, at least
in the early days,

if you tried to
delete a file when

some process had the file
open, that was not allowed.

Anybody experienced this?

Anybody that have used
Windows experience this?

It's this horrible thing.

And then now you figure,
OK, who's got it open?

You start going around killing
programs to try and make it

so you delete the file.

And you can't find which
program has it open.

So finally, you just
give up, and you reboot.

And then it turns out--

[LAUGHTER]

And then it turns out
that it's a system

daemon that has the file open.

So when you reboot,
it's still in use.

You can't delete.

So Unix has a beautiful
really lovely solution

that makes this error go away.

In Unix, if you delete
a file while it's open,

what happens is it deletes
the file from the directory

and from the namespace.

It no longer appears
anywhere in the file system.

But the actual
contents of the file

still hang around, so that any
process that's using the file

can continue to access the file.

And then when the last
open instance of the file

is closed, then finally it
cleans up and throws away

everything else.

It's a lovely solution.

Because you could have
made the other mistake,

which is that I'm going
to delete the file.

And now, anybody doing I/O
on the file gets an error.

That would probably
be even worse,

because now every
program would have

to be written to
handle the case where

the file goes away in the
middle of your accessing it.

So Unix had this beautiful
solution where there's

no errors on either side.

It just does the right thing.

So Windows, they eventually
realized this was a problem.

And I don't know where they are
in the evolution of fixing it.

But I know that the
first stage they did

is they had some
special flag you

could set that would say, delete
the file even if it's open.

Or you can maybe when you
open the file-- so then

you can allow it to be
deleted while it's open.

But they didn't get rid
of the directory entry.

They kept the
directory entry around.

And so you couldn't recreate
the file while it was open.

So if you were, for
example, trying to rebuild

and, you know, the
binary was in use,

you couldn't create a new
version of the binary file,

because the directory
entry was locked down.

So they still
didn't get it right.

So, again-- examples of why you
just want to make these errors

go away.

A third example,
which people often

consider more controversial when
I say this one, is substrings.

So in Java, there's
various methods

that will extract a
substring out of a string.

And these methods are
very exception happy.

If either of indices is outside
the range of the substring

and throws an exception-- and I
believe if they're kind of out

of order, it throws
an exception--

I find this a huge pain.

I end up, typically,
having to write my own code

to effectively clip my indices
to the range of the string

before I invoke the
Java substring command,

so I won't get these exceptions.

I consider this just a bad idea.

Instead, it'd be so
much simpler just

to find substring,
so that it returns

the overlap between the
indices you've specified

and the available
contents of the string.

So if both of the indices
are outside the range

of the string, it
returns an empty string.

You know, if they
are in reverse order,

clearly there can't be
anything in the right order.

It doesn't return and just does
the clipping automatically.

This would eliminate so much
extra code people have to write

and also, I suspect, a lot of
runtime exceptions that occur,

because people forgot
to clip their indices

to the range of the string
before they invoke the command.

So, again, the overall idea
here is to try and reduce

the number of
places where people

have to deal with exceptions.

The book talks about a few
other ways of doing this.

But the best case of all is just
to define the exceptions away.

Just make the normal behavior
always do the right thing.

And nobody's objecting
on the Java substring.

Usually somebody raises their
hand and objects to that.

Yeah.



AUDIENCE: Yeah.

So not objecting, but defining
[INAUDIBLE] the semantics,

perhaps, is a more
complete definition.

I mean, you could
simply say, OK,

whatever set of
parameters you pass,

you have random behavior that
are difficult to explain.

But the examples you gave
were very, very intuitive,

like when you defined
overlap between the indexes

and the available space
or the Tcl, et cetera.

JOHN OUTSERHOUT: Somebody want
to argue that Java substrings

should throw exceptions?

AUDIENCE: Yeah.

[INAUDIBLE]

JOHN OUTSERHOUT: Let's bring
the microphone over here.

AUDIENCE: [INAUDIBLE]

JOHN OUTSERHOUT: I know some
of you thinking it, so yeah.



AUDIENCE: I think it should
throw a runtime exception,

because, like, you can--

sometimes it could be
just the wrong assumptions

on client side.

Like, they've just
done something wrong.

And they're assuming that's
correct range, but it's not.

I think it should be
a runtime exception.

JOHN OUTSERHOUT: This is
part of the philosophy

about we're going to
try and keep people

from making mistakes, which
it's kind of a noble thought.

But the problem is that it's
really hard to keep people

from making mistakes.

And so typically what
happens when we try and do

this is we introduce lots of
complexity, which makes it hard

to even do the right thing.

And so I'd argue, in general,
we want to make it really,

really easy to do the common
case and the right thing.

You still have to do
testing to catch mistakes.

And so this isn't
going to replace

the need for unit tests.

But, in general, I think
when you try and build

systems that can keep
people from making mistakes,

you usually create a whole lot
of complexity for everybody.

AUDIENCE: So how
do you distinguish

between Java substring versus
java.string.character@index?

Should that throw an exception
if the index is out of range?

JOHN OUTSERHOUT: Good question.

That one probably should,
because it can't really

return a character.

You know, what do you--

you know, you could redefine
it kind of like IEEE

Floating-Point did,
where there were

special values that
represented arithmetic errors

and things like that.

So if you have some
sort of a null character

that you could return,
that might make sense.

But we really have that
in our character sets.

So in that case,
you really can't.

I'm not sure what you
would return if you're

going to return something.

So, yeah, so in that
case, you probably

do have to throw an exception.

AUDIENCE: [INAUDIBLE]

AUDIENCE: -optional character.

AUDIENCE: So one
question-- so when

is it a good idea to
actually throw exceptions?

So the intuitive case is you
want to eliminate exceptions

as much as possible, then
how do you decide, no,

there's nothing that I can do?

My changing semantics
doesn't work.

And I really have to
throw an exception now.

JOHN OUTSERHOUT: Well, if you
fundamentally can't carry out

your contract with
your caller and if you

can't implement your
interface, then sort of

have to throw an exception.

You know, like,
if you're reading

[INAUDIBLE] you're
doing a read operation

and the read can't succeed,
because you got an I/O error,

you have to.

That's information that you
do have to reflect that back

to the caller.

So you can't eliminate
all exceptions.

You know, some of the
students in the class

thought this was
really a great idea.

And so they basically
wrote no exception handlers

in their code--

[LAUGHTER]

--and said, I'm just defining
them out of existence.

I said, no, no, some of
them actually matter.

You have to-- and a lot of
software design, I think,

is figuring out what matters
and what doesn't matter.

And, ideally, you'd like to make
as little matter as possible.

You know, you'd like to be as--

to not depend on
very many things.

But you have to recognize
the things that really

are important and do matter.

And those you do have to
reflect in the system.

Yeah.

AUDIENCE: Do you have
thoughts on exceptions

versus extra status code
or extra error code return?

JOHN OUTSERHOUT: Boy, that's
a classic argument, exceptions

versus return values.

Now, there are times
when each make sense.

I believe exceptions actually
provide the most value when

you throw them farthest.

If they're going a
long way up the stack,

that's where they provide
the biggest benefit.

Because you've
made it unnecessary

for a whole bunch of
intermediate layers

to deal with the situation.

You can take it all the way back
to the source and deal with it

at the source.

If you are catching exceptions
in methods you call,

you know, there's not as
much value for that compared

to just getting a return value.

It's not a whole lot different.

One of the problems
with exceptions

is, also, they all
have clunky syntax.

And, actually,
checking a return value

is actually simpler
syntactically

than declaring an
exception handler.

But, you know, a lot of times,
some of these exceptions

you really will want them
to propagate a long ways.

And so then even if the
caller is going to look at it,

you probably want to manifest
it as an exception rather than

a return value.

AUDIENCE: Any
thought on crashing

as a way of, like,
avoiding [INAUDIBLE],, like,

passing [INAUDIBLE]?

JOHN OUTSERHOUT: Any thoughts
on crashing as a way?

AUDIENCE: Yes.

JOHN OUTSERHOUT: Yeah, yeah.

Actually, crashing
is a fine thing

to do in certain situations.

Like, for example,
in most programs,

I would argue you should not
be trying to [AUDIO OUT] out

of memory exceptions.

It's just hopelessly
complicate to try and do that,

because it depends
so much on memory.

That for most applications,
if you run out of memory,

just crash.

I mean, print a
message and crash.

It almost never happens.

Machines today they have
tons of memory anyhow.

You know, again,
use with caution.

But I think there are
situations where just crashing

is a fine thing, a
fine way to do it.

The alternative would
create so much complexity

that you probably wouldn't get
it right in the first place

and it'd end up crashing anyway.

SPEAKER 1: Hey, John, there's
17 questions on the Dory.

So I'll just ask
the top ranked one,

so that we don't
run out of time.

The question is
from [INAUDIBLE]..

And in real life, development is
often under these constraints--

for example, tight
schedule, need

to experiment and be
flexible about design,

lack of mature tools,
library, et cetera.

Does your approach to software
design philosophy change

based on the real
world constraints?

JOHN OUTSERHOUT: Yes.

And actually, that's
a good lead-in.

Let me move on to the
next part of the talk,

which I'm going to
talking about that.

And I think I want
to get moving, too,

because we're starting to
run a little tight on time.

[AUDIO OUT] about a couple
of specific techniques

or philosophies you can use.

But I think one of the biggest
obstacles to good design

is mindset.

If you don't have
the right mindset,

you will just never
produce a good design.

And I think there's two ways
of approaching the programming

or design process, which I
call tactical and strategic.

Unfortunately, most people
take the wrong approach,

which is the tactical approach.

In the tactical
approach, your goal

is to get something working--

you know, your next feature,
fixing a bug, whatever.

But that's your goal, to
get something working.

So you think, how
can that be wrong?

Isn't that the whole goal of,
you know, building systems?

We want them to be working.

Well, the problem
with this approach

is that when you do
it, then you usually

have a mindset that, well, I'll
try and make it mostly clean.

But if I have a little--

if I take a couple of, you
know, short cuts or a little bit

a kluges, as long as I
don't do too many of them,

if I get it working,
that's what really counts.

The problem with that is that
those kluges build up really

fast.

Because not only
are you doing it,

but everybody else on
your team is doing it.

And then after a while you
start saying, well, I probably

shouldn't have made that
decision back there,

but we've got our next
deadline we've got to hit.

You know, I'll try and find
time after that deadline.

But then by the time
the deadline is done,

you've introduced
so many kluges,

you realize it's going to
take weeks to fix all these.

And you don't have
time for that.

And so it just never happens.

So the result of this
inevitably is the system turns

to spaghetti
really, really fast.

And the problem
is that complexity

isn't one mistake you make.

It's not a single big thing that
makes the system complicated.

It's hundreds or
thousands of mistakes

made by many people
over a period of time.

And so that means,
first of all, you

don't notice it as it's
happening, because it's just

a bit at a time.

But then, even worse,
once it's happened,

it's almost impossible to fix.

Because there's no one
thing you can go back

and fix to fix the problem.

It's thousands of things
in hundreds of places.

And so it's just
so overwhelming,

you never get to it.

So, by the way,
there's an extreme

of the tactical programmer,
sort of personality type,

I call the tactical tornado.

This is a person who turns
out enormous amounts of pretty

shoddy code that kind of
80% works at a huge rate

and leaves a wake of
destruction behind them.

[LAUGHTER]

And in many organizations, these
people are considered heroes.

This is who management
goes to when we need

the new feature for tomorrow.

And they'll have
a feature tomorrow

that works for most of
the day tomorrow, anyhow.

In fact, actually, when I gave
this talk, somebody said, oh,

is that what you mean
by the 10x programmers?

[LAUGHTER]

No.

No.

How many of you feel
like you've been

in the presence of one or
more tactical tornadoes

over your career?

Yeah.

Every organization has them.

I'm sure they're here at Google.

And, unfortunately, one
of the things I hope to do

is to provide a
name for this, so we

can start calling them out
and maybe educate management

about them.

How many of you feel like
your management actually

rewards technical tornadoes?

Yeah, that's even
worse, unfortunately.

So, you know, the
tactical approach

is really, really easy to slide
into, very hard not to do that.

But so the first thing
you have to realize,

if you want to do great
design, you have to realize

working code is not enough.

That can't be the only goal.

It's sort of table stakes.

Of course, things have to work.

But that shouldn't
be the real goal.



Instead, you should take what I
call a strategic approach where

the goal is a great design.

That's the most important thing.

Yes, it's got to work today, but
we have to have a great design.

Why do we want a great design?

It's so that we can
develop fast in the future.

So it's really all
about investing.

We'll invest in
good design today,

because most of
the code we develop

is going to be in the future.

And so if we mess
things up today,

we're slowing ourselves
down for the future.

So you have to think
about complexity,

try and find ways to drive
complexity out of the system.

And, fundamentally--
this is the hard part--

you have to sweat
the small stuff.

And you sort of have to have
a zero tolerance approach.

Don't let those little
bits of lint creep in.

Because if they do, then
you're going to slide back

into a tactical mode again.

You know, so if you
program strategically,

you're going to go slower first.

But, presumably, in the end,
you'll end up going faster.

I mean, even with a
strategic approach,

you're development will
still slow down over time,

because complexity
is inevitable.

We can't prevent it.

We can only kind of slow the
growth as much as we can.

But, eventually, you'll end
up [INAUDIBLE] to be faster.

So the issue is
you have to invest.

If you're not willing to take
a little bit of extra time

today, at least a little bit,
you can't do good design.

But in my opinion,
it all pays back.

You always get your
investment back.

Now, the challenge is what are
the parameters of these curves?

Like, how much slower do
I have to go initially?

You know, when do
I get to the point

where the slopes are the same,
so I'm at least now running

as fast as I was tactically?

When do I actually catch up
so I actually have a net gain?

And then how much
faster I go at the end?

Unfortunately, I don't know
of any quantitative answers

to any of those questions.

You know, I have opinions.

Like, my opinion is that
the crossover period

is somewhere in the 6 to
12 month range, roughly

how long it takes you
to forget about why you

wrote that last chunk of code.

But I don't have any data to
back that up, unfortunately.

So that's the challenge.

Because, you know, people
can see the cost today,

but they can't
really estimate when

the benefit's going to come
or how long in the future

it's going to be.

And so it's really easy just
to optimize for this part

down here.



AUDIENCE: Yeah,
just quick question.

Have you thought of analyzing
open source development

and seeing whether or
not you can observe this?

I mean, it would require
some judgment calls, I guess.

But--

JOHN OUTSERHOUT:
I'm not sure how

you do-- you can look
at the rate of commits

from the new lines added.

But the problem is you
don't know how much effort

went into those.

AUDIENCE: Yeah.

JOHN OUTSERHOUT: So--

AUDIENCE: I was thinking like
when a new storage device comes

out and people are writing
new file systems or something.

You know, you could look at
this across different OSs

and see how things happen.

JOHN OUTSERHOUT: Yeah,
that's a thought.

It's hard.

So the question is,
how much do you invest?

Actually, let me charge
for a couple more slides,

because we're starting to
run a little tight on time.

So how much?

What's the right
amount to invest?

And, you know, if you
look at most start-ups,

honestly, they're mostly
completely, 100%, tactical.

They feel a tremendous pressure
to get the products out.

You know, our financing is
going to run out in six months.

Whatever evil we
put in, you know,

when we become famous and
wealthy and do out IPO,

we'll be able to
hire more engineers

to clean up this mess.

And so, you know, they end up
with these horrible spaghetti

code bases.

And, unfortunately, of
course, once you get that,

it's pretty much
impossible to clean it up.

I've never heard
of anybody-- maybe

if you could go back
and completely rewrite,

you could do it.

Maybe there have been
examples of that,

but it almost never happens.

So to me, Facebook is the
poster child for this.

They even built it into
their company motto--

move quickly and break things.

And they did both of those.

[LAUGHTER]

So now, in a sense,
developers kind of like this.

So fresh college
hires could come in.

They're super empowered.

They push their first
commits, and they're changing

the website in one week.

The first week on the job
feels like, you know, really

empowering for them.

But their code base was
just a notorious mess.

One summer, a couple
of my graduate students

went there for internships.

They came back, and
they just couldn't

believe what they'd seen.

And this was interesting,
because my students

had been whining for the
whole previous year about why

do we have to write unit
tests and write documentation.

Linux doesn't have
any unit tests.

And Linux doesn't
have any comments.

Why do we have to do this?

I never heard that again after
they came back from Facebook.

[LAUGHTER]

So Facebook has
eventually realized this.

And so they changed their
motto to "move quickly

with solid infrastructure."

It's like, you know,
no, no, I meant to say

wouldn't, not would.

[LAUGHTER]

So have they been
able to fix it?

I don't know.

Now, people hear this,
they say, well, yeah,

but Mark Zuckerberg is
the fourth wealthiest

person on the planet.

How can this be a bad approach?

And, of course, the
answer is, you know,

you can be successful
with crappy code.

You can be tactical and
build companies that succeed.

Facebook has done it.

But I have two thoughts on this.

One is you can also succeed
with the other approach.

And although, I don't
have personal experience

with either of these
companies, my sense

is that both Google and VMware
took a much more, sort of,

stronger design culture
approach at least

particularly in the early
years, you know, 2000 to 2010.

Those were the two companies
known in Silicon Valley

as this is where the really
great software developers go.

They really care about design.

And they do really good coding.

And the reason this matters is
that if you have that culture,

I think you're in a
much better position

to recruit the best programmers.

And we know about
this 10x phenomenon.

You know, the best way
to get great products out

fast is to get the
best programmers.

And so I think the
strongest argument

in favor of a good
design culture

is that it allows you
to hire top people.

And that will give
you an advantage.

So you can do things the
crappy way if you want,

but there's enough
success stories

to show that you
can make this work.

You can do the
investment approach.

OK.

But then again, OK,
but how much to invest?

I would say how
much can you afford?

You know, just ask
yourself what's

the most we can afford at
this stage in our lifetime

to invest.

I think in terms of maybe 10%
or 20%, something like that.

I bet, almost everybody, you can
afford to go 10% slower today

realizing you're going
to get it all back.

It's not a sunk cost.

It's all coming back to you.

In somewhere, you know,
six months to a few years,

you're going to get
it all back again.

You can afford to do that.

And I think in terms of
small steps, not heroics.

You know, you can't
spend six months

and completely design
the whole system,

you know, from first principles
before you write any code.

That doesn't work.

We know one of the
problems of software

is we can't visualize
the way our systems are

going to turn out.

You have to use a somewhat
iterative approach.

So I'd say, think of it
in terms of small steps.

So when you're
building new modules,

take a little bit of time
to design the interface.

Try to come up
with deep classes.

Write the documentation
as you're going,

unit tests, of course.

And then whenever
you make changes,

you have to realize you can't
get it right the first time.

It's one of the
rules of software.

We just can't.

So assume every time
you're in a system,

you're going to have
to be improving things.

Always look for something
you can make better.

One reason for this is you're
probably making something worse

when you go in also.

So even if you just
want to break even,

you've got to find
something to improve.

So I just think that I'm just
trying to at least break even.

So this is against
the normal philosophy.

I think, oftentimes, when people
are changing existing code,

they go for what's the smallest
number of lines of code

I can possibly
change to do this.

I think sometimes it's
because they're afraid.

I don't understand this.

I'm going to break
something, so I'll

make the fewest lines of change.

So I'll just kind of directly
access a global variable,

another file, rather
than trying to find

a clean interface for it.

So don't do that.

Try and find a clean
way of doing things.

And ideally, in the
best case, you'd

like to end up where
you would have ended up

if you had built the whole
system from scratch knowing

what you know today.

That's what you're like.

Is this the way we would have
done it if we had built it

from scratch?

That's the ideal.

Now, you know, you
can't always do that.

Sometimes that would
be a refactoring

that's way beyond the
scale of what you can do.

So, again, I would just say
ask yourself at any given point

in time, am I doing the
most I possibly can?

Don't just give in
and the boss says

we've got to get a
release out tomorrow,

so I'm just going to
hack this thing in

to make the boss happy.

Ask, is this the best
I can possibly do?

Yeah.

AUDIENCE: John, will
you touch on layering,

which is often considered very
good in software engineering,

but it also has a
challenge of performance

of the code when it executes?

Often, the functionality is
replicated in multiple layers.

And it's not clear
how to distill that

without mucking up the code.



JOHN OUTSERHOUT: So is your
question, are the layers good?

AUDIENCE: Yeah.

So how do [AUDIO OUT]
deal with layers,

the demand for
abstraction layers,

and the demand for
performance both

contradicting each other here?

JOHN OUTSERHOUT: We need
layers for managing complexity.

So in that sense, they're good.

They do have problems
for performance.

I think people do
too many layers.

And so I think that's a
common mistake is just

to throw in lots
of skinny layers,

again, rather than having
a smaller number of meatier

layers.

That's one problem.

The other thing is that
for cases where performance

matters, if you think
a little bit about what

your key performance
metrics are,

I believe you can often define
your layers in a way that

allows you to achieve very high
performance even with layering.

But you have to be thinking a
little bit about sort of this,

the overall, kind of gross
level performance metrics

while you're doing
your system design.



OK.

So anyhow, I think this
investment thing is the biggest

challenge, particularly because
a lot of managers, I think,

don't really get it.

And they're sort of pushing
for the next feature

or the next release.

I don't know how to
combat that except to have

the people that
everybody recognizes

of the great engineers in
the company go to management

and try and get
management buy in.

And I think it'd be
great if companies

can have sort of explicit--
this is in our engineering

philosophy.

We will invest at
10% [INAUDIBLE]..

Roughly, on average,
10% of our resources

are going towards making designs
better, not just cranking out

next features.

Yeah, John.

AUDIENCE: Hi, John.

I haven't looked at
this for 20 years now,

but the quantitative analyzes
that you're describing

were the domain of
the social engineering

community for a while.

I'm wondering if you sort
of poked into that space

to see if they have
experimentation, numbers,

analyzes, that might be useful.

Or have they just
dropped off the map?

JOHN OUTSERHOUT: I haven't
looked very carefully,

partly because I'm sort
of skeptical that it

is possible to measure
it in a meaningful way.

So I haven't-- but I would
[AUDIO OUT] see numbers

if there were [AUDIO OUT]
were believable.

But I haven't looked
enough to know.

OK.

So I just have a
couple more slides,

then I'll open it
up for questions.

So is the course working?

You know, it's hard
to tell for sure.

I mean, you can't become a
great programmer in one quarter.

It'll take, still, lots of
experience for these people.

We'll have to come back
and ask them once they've

been out at industry a while.

This is just sort of the first
step in the process I think.

But the class has a really
fun energy to it, really fun.

The students start off in the
first round of code reviews.

And they're very
tentative, kind of afraid

to criticize each
other, not really sure

what they should be saying.

So the first round's
kind of tentative.

Then they meet with me,
and they get unloaded on.

And then they start-- oh,
OK, I can do that, too.

And so about halfway through the
second code review, typically

the tone of discussions changes
where students are now being

more critical of each other.

We have these interesting
arguments in class

about whether one approach is
more complicated than another.

And it's really clear by
the end of the quarter

that the students are
thinking about programming

in a very different way than
they thought about it before.

So I think that's
really encouraging.

I will have to say, though, even
if the students don't become

better designers, actually,
I'm becoming a better designer

from teaching the class.

It's really interesting for me.

You know, you might
think it's tedious

reading 20,000 lines
of code in a week three

times over a quarter.

And it does take some time.

But, actually, I
learn a lot from that,

because the students are
all doing the same thing

in the same language.

And so I can see
different approaches.

And I can see kind of common
mistakes that they make.

And, actually, what's
ended up happening is

I've changed my view about a
couple of the design issues

as a result of
teaching the course.

And in particular, the one
at the bottom of this slide

was I realized that
making classes just

slightly general purpose,
even though you're only

going to use them in
one place, actually

makes the amazingly
simpler and deeper.

I hadn't realized
that until I saw

some student projects,
actually, the second time I

was teaching the course.

So it's been really
interesting for me to see this.

And I feel like
I'm learning more

about the process
of software design

and getting better ideas
for how to teach it as I go.

Then as I've talked to
people about the course,

people kept saying, well, you
should write a book on this.

And I was on
sabbatical last year,

so I decided, OK,
I would do that.

So I have written this book.

It's a relatively small
book, 170 pages, again,

still fairly philosophical in
nature more than prescriptive.

So the hope is that I can reach
more people, because I can only

teach 20 people a
year in the class.

I can't do more than that.

And ideally, I'm hoping the
book will kind of be a lightning

rod that maybe we can
kick start a discussion.

I hope people write
to me and disagree

with things in the book or
suggest other design ideas

or provide better examples.

I'm also trying to define
terms that people can use.

One of the things I hope
maybe the book can do

is people can use
that in design reviews

to have ideas and
ways of talking

about design and design ideas.

Actually, I have a
question for you.

How many people here
do design reviews?

I assume almost everybody.

And how many of you in your design

reviews it's common for you to discuss

design issues as opposed to coding style and bugs?

How many of you commonly talk about design things?

Good.

Great.

I'd like to see more of that.

So now the book's been out
for a couple of months.

If you read it and have
thoughts or comments,

I'd love to get
your input on it.

My view is this is
just a first stab.

If this actually ends
up being a useful book,

it'll probably be--

it's kind of like software.

At about version
three, you know,

where it really hits
its stride, I'll

need to get feedback and revise
and fix things that are wrong

and add new ideas.

So just to conclude,
I really believe

we can teach software design.

I really believe we can.

My current approach,
unfortunately,

is woefully non-scalable.

I haven't figured that out.

I really need somebody
with a lot of experience

I think reading
the student's code.

I feel like some principles are emerging.

You know, if you read the book
and agree or disagree with me,

I'd be curious to hear
your take on that.

# future of software design
What I hope to do in the future is just to somehow leverage this
out into the community.

I'd love to see just a greater
sense of design awareness

in the software community as a
whole can we have a discussion.

We make an important
part of our community

it's just sad that
we don't really

even have discussion today.
# mana mailing list nya ?
So I created a mailing
list for discussion topics

about the book.

Hasn't been much
traffic on it so far,

but I hope there will
be more in the future.

And, again, I hope to
take ideas from people

and make the book better and
better and the class better

over time.

And the long-term goal is it'd be great if, 5 or 10 years from now, we actually have a relatively robust set of principles that most developers agree are good for software design.

So thanks for your attention, and I'd

be happy to take more questions.

[APPLAUSE]

SPEAKER 1: So let me get a
few questions from the Dory

out here.



Do testing considerations,
like unit testing or marks,

influence interfaces
and abstractions?

JOHN OUTSERHOUT:
Testing considerations--

I'm a huge fan of,
particularly, unit tests--

crucially important.

I have debated whether to try
and teach them in the class.

Actually, I did a little bit
at one time in the class,

but it was just too much of
a distraction for the class.

We only have 10 weeks.

And so I finally
decided, for the class,

I just got to focus on design.

So I don't do unit
testing in the class.

But I'm a complete
advocate of unit tests.

I can't imagine doing
software without unit tests.

AUDIENCE: So I was
intrigued by the first part

of the discussion when you said
in the iterative process you

actually dropped--

you initially had students
build on other students code.

To me, that's a very,
very real world problem.

And I'm just
surprised that you--

I mean, I wish you
would teach that.

JOHN OUTSERHOUT: You
know, I agree with you.

In a perfect world, that would
do one of the things we do.

The problem is
we've got 10 weeks.

How do I use that 10 weeks?

And I decided I want to try and
do the most I can on design.

And so I have to
sacrifice other things.

It's the same reason why
unit testing got thrown out,

because I felt like
it was better for them

to be thinking about more
design issues than unit testing

issues.

But I agree with your
thought completely.

Yeah.

AUDIENCE: Do you have
TAs for the course?

JOHN OUTSERHOUT: Do we have TAs?

Yeah, me.

[LAUGHTER]

Not right now.

Because I just
worry that the TAs

would not be able to give
high enough level of feedback.

I've started wondering if
maybe students who have taken

the course previously could TA.

So far, actually, the demand has
not been more than my capacity.

And so I've been able
to keep it small.

If the demand grows, I
may try an experiment

to see if previous course
participants can TA.

But, again, I worry.

Also, for the first
few offerings,

I wanted to read all
the code myself, too,

because I wanted to
learn from it as well.

AUDIENCE: Have you thought
about using software engineers

as TAs?

We read and write
code every day.

[LAUGHTER]

JOHN OUTSERHOUT: I'm not
opposed to it in principle.

But I'd want to
make sure students

don't get mixed messages.

And so particularly
because the ideas

I'm teaching in
the course are not

ideas that are not necessarily
widely spread in the community.

Like the worst
thing would happened

is if a software engineer comes in and says,

no, this method is longer than 20 lines.

You've got to break it up.



So if I could find people
that are sort of bought

into the philosophy--
and maybe, you know,

the book gets out there
and more people buy in,

maybe we can do more of that.

SPEAKER 1: OK.

One question from the Dory,
the second highest rate one--

are threads still a bad idea?

[LAUGHTER]

JOHN OUTSERHOUT: You know, one
of the interesting things when

the only form in which
you publish something

is a set of slides rather
than a paper-- which that was.

It was just an invited talking
at a [INAUDIBLE] conference

a long time ago.

It's interesting.

People can come
back and interpret

that in whole bunches of
different ways over the years.

So that was done in a very
narrow context of the time

where people were starting to
introduce threads for things

that didn't even need threads.

They were doing threading on
machines that didn't even have

multiple processors on them.

And so that talk was
a reaction to that.

Threads are unavoidable.

I mean, for certain things,
you just have to use them.

But they're still sort
of the next to worst

alternative where the
worst alternative may

be, in some cases,
not using threads--

incredibly hard to program.

So I'm still not
a fan of threads,

but they're kind
of a fact of life.

Yeah.

AUDIENCE: I have a
question on Tcl language.

I think the language is sort
of very simple in itself,

but eventually not gained,
like, larger scope of adoption.

I want to ask, because you
are the language inventor, is

your like high level
issues in the language

of design you saying you got
it wrong, which makes it--

JOHN OUTSERHOUT: What even
happened to Tcl, I think,

would be your question.

I don't want to diverge
too much from that.

I would say two things.

First, one of the
things Tcl was best at

was doing kind of simple
interactive GUIs with Tk.

And when the web came
along, the web basically

took that over and Tcl did not
make the transition to the web.

So a lot of things people would
have used Tcl Tk for, they

end up doing in the web.

The second thing is, is it
really with the right language?

I'm not sure, in retrospect,
that it's the right language.

Actually, I built it for
a very different purpose.

I built it as more of a
textual command language

that you'd be typing
commands to programs,

almost like a shell language.

And then it ended up getting
used as a scripting language.

It has a bunch of
interesting properties.

But I don't know, if
I were doing it again,

I'm not sure I would
design the same language.

But I think that the
biggest thing that

happened is kind of
the web came along

and Tcl did not effectively
make the transition to the web.

# how to hiring people ?
SPEAKER 1: OK.

So there's a lot of really
interesting questions

both on the Dory
and in the room.

In the interest
of time, I'm going

to do two more Dory questions
and two more in the room.

And then John is going to
stay around and hopefully

answer more questions as well.

OK.

So any thoughts on the hiring process

based on what you've observed?

And the question has, how would you change the hiring process
which is so algorithm heavy?

Can you share your experience
when you ran your company?

## john prefer faster learner
JOHN OUTSERHOUT: Hiring process, actually, I'm

not sure it relates
to software design.

But I have a very strong
opinion about hiring process,

which is you should hire
for slope, not y-intercept.

I think people, when they hire,
they do a pattern match of what

this person has
done, try and find

the person who has exactly
done the job we want to do.

I think that's the wrong
way to hire in general.

I think you want to
hire the person who's

the fastest learner, who
has the fastest slope.

I don't particularly
care whether they've

done the job I want to do.

Because particularly
at a startup,

when things change so rapidly,
you know, things change.

So I look for people
who are really smart

fast learners rather.

Also, by the way, the person
who has done this job five times

before, you sort of
wonder, well, you know,

why haven't they moved
on to the next job?

Oftentimes, those people
kind of hit their plateau.

Whereas, the person with the
rapid slope, has the potential.

AUDIENCE: OK.

JOHN OUTSERHOUT:
That's my [INAUDIBLE]..

SPEAKER 1: Last
question from the Dory--

what do you think
about Hyrum's Law?

JOHN OUTSERHOUT: Sorry,
remind what Hyrum's Law is?

SPEAKER 1: It's a--

I googled it and it says with
a sufficient number of uses

of an API, it does
not matter what

you promise in the contract.

All observable
behaviors of your system

will be depended on by somebody.

[LAUGHTER]

JOHN OUTSERHOUT: I
think there's truth

to that, that, yeah, over time
what happens is the, sort of,

application, they
find every crevice

and sink their roots under that.

They will discover.

So unless you're very
careful with your APIs,

I think that's probably true--

sad, but true.

Yeah.

AUDIENCE: Hi.

Have you observed any
change in the simplicity

or the complexity
of a software design

based on the choice of
languages and support ecosystem?

JOHN OUTSERHOUT: Oh, a good question.

There's some languages somehow
lend themselves to better design than other languages.

You know, there probably are--
I think that's mostly a
secondary, sort of second order thing.

But, for example, today, I'd
rather program in C++ than C,

because I liked some of the
object oriented features

in C++.

Now, C++ is sort of a big beast of a language with a horrible learning curve, but I
appreciate the power of it.

But, honestly, I think the design principles are fairly universal.

You can use them
in any language.

You know, that simple file
system interface for Unix

was done in C with no
object oriented stuff.

And then people would
say, oh, no, actually,

you notice it's actually
object oriented,

because there's a
file descriptor that

gets passed around.

And the object oriented
was really crucial to that.

I say, no, they just found a really sweet interface.

So I haven't found one language that somehow was dramatically

better than others for design.

But if people have opinions, I'd be
curious to hear other opinions about that.

SPEAKER 1: So back to hiring, you

mentioned we should hire on
slope, not on y-intercept.

And I radically agree.

How do I estimate the slope?

JOHN OUTSERHOUT:
How do measure that?

SPEAKER 1: Right?

Especially, like--

JOHN OUTSERHOUT: I have no idea.

SPEAKER 1: --you need at least two points, right?

In an interview, I get only one.
And I am terrified of hiring more tactical tornadoes.

[LAUGHTER]

JOHN OUTSERHOUT: I don't know.

You know, so I'll tell you what correlated best for me, but it's sort of crazy is that I found in my experienced, people who worked out best were the ones where I just really enjoyed my conversation with them during the interview. And that's sort of weird. 

I feel kind of funny saying that, because that means somehow somebody sucked up to me. And I liked them and hired them.

I don't think that's it because I have a pretty sensitive meter for suck-upness.

And that really pisses me off.

And people have also pointed,
if you take that edge, that's

kind of a risk that
you're just hiring

more people like yourself.

And so you're not going
to do diversity very well.

So I have no idea
what to make of that

or whether it's
even a good idea.

But that's the one
thing that seemed

to correlate in my experience.

SPEAKER 1: OK.

Yeah.

So let's thank John
once again now.

[APPLAUSE]



=======
[DownSub.com]

SPEAKER 1: OK.

So, welcome.

Good morning, everyone.

It's my pleasure to welcome
Professor Ousterhout

for this Talks at
Google presentation.

My name is [INAUDIBLE].

I work in Technical
Infrastructure Cloud.

Very quick intro to John to
get things started here--

John is a Professor of Computer
Science at Stanford University.

He spent, 
before that, 14 years in industry where he founded two companies,
Scriptics and Electric Cloud and, 
before that, 14 years as a professor at UC Berkeley.

Anybody here who has taken
a class with John before--

so a bunch of his
students as well.

So he's pretty distinguished, so I'm not

going to go through a
list of his awards here--

a member of the National Academy of Engineering, 
ACM Software System Award, 
UC Berkeley Distinguished Teaching Award,
to name a few here.

But more relevant
to this talk, John

has built several influential
systems, 
the Sprite operating system, 
Tcl, Tk, log-structured file systems, Raft,
and, more recently, RAMCloud.

And I think his bios says he has literally graded, like, thousands of programming student assignments.

And today, we are going to
hear the synthesis of all

of John's first-hand knowledge
both from his research

and teaching on a topic that's
very close to us, how to design and how not to design software.

There is a book here.

I don't have it to show.

Let me show it to
the camera here.

There is a book or "A
Philosophy of Software Design."

I was pretty lucky to read
the pre-print of this.

It's a really good book.

And hopefully, he'll
tell us a little bit more

about that as well.

And last note, if
you have questions,

since this is being recorded,
just raise your hand,

and you'll get the mic to you.

And then you can ask questions.

So, welcome, John.

JOHN OUTSERHOUT: Great.

Thank you.

[APPLAUSE]

First of all, I do not
have an hour's worth

of material prepared,
because there

will be lots of questions.

I'm happy to take
them in line as we go.

At some point, probably,
there'll be too many

and we're running late,
then I'll cut them off.

But feel free to ask questions,
you know, expresses disbelief,

argue, insult my mother,
whatever you wish,

during the talk.

But do make sure that the
insults are on the mic.

[LAUGHTER]

OK.

susah searching black art di google.

So people have been programming computers for more than 80 years now.
And yet software design is still basically a black art.
There's essentially no agreement on how to do software design or even what a good piece of software looks like.
You know, we talk a lot about software engineering, and software tools, and testing, and processes.
But we have almost no conversation about the fundamental act of designing software.
And this has bugged me for a long time.
So today, I'd like to tell you about some things I've been doing to try and change that, to start the conversation and to see if we can somehow create a more, a greater, sense of design awareness in the software community.
And that consists of a new course I developed at Stanford and then, based on that, a book on software design.

OK.

So let's start with the basics.

If you had to pick one
idea, one concept that's

the most important thing in
all of computer science, one

thing that threads through
every aspect of computer

science from AI to systems
to theory, first of all,

what would you pick?

AUDIENCE: Abstraction.

JOHN OUTSERHOUT: Abstraction.

AUDIENCE: Testing.

JOHN OUTSERHOUT: Sorry?

AUDIENCE: Testing.

JOHN OUTSERHOUT: Testing.

Other ideas?

AUDIENCE: Composition.

JOHN OUTSERHOUT: Sorry?

AUDIENCE: Composition.

JOHN OUTSERHOUT: Composition.

AUDIENCE: Complexity.

JOHN OUTSERHOUT: Sorry?

AUDIENCE: Complexity.

JOHN OUTSERHOUT: Complexity.

So I asked Don Knuth this question.
He said, layers of abstraction, which I would say is almost right.

[LAUGHTER]

Although, some would say,
by definition, it's right.

What I would say is
problem decomposition.

How do you take a
complicated problem or system

and chop it up into
pieces that you can

build relatively independently?

And yet, as far as I know,
aside from what you're

going to hear today, there
is no course anywhere

where that concept is one
of the most important ideas

in the course.

We simply don't teach it.

Second, we all know that
some programmers are way,

way more productive than others.

Google has coined the
term the 10x programmer.

And yet, as far
as I know, no one

attempts to teach
these skills either.

And these ideas have been
sitting in the back of my head

and bugging me for a long time.

How can we have these things
that are so important,

and yet we don't
really make any attempt

to teach people this stuff?

You know, if you're
a great programmer,

somehow you just figure
it out on your own.



So that leads to the
question, can we do this?

And there's three
questions there.

First, is it even possible?

You know, is this just
a some sort of innate

skill that you're born
with in your genes,

or is it something
that can be taught?

So first let's do
a quick survey.

How many of you think this is
something that it's, you know,

either you have it or you don't?

You can't really teach it.

It's just an innate skill.

A few.

How many think
that this could be

taught in some way or another?

Good.

A few summers ago, I
read a really great book

by Geoff Colvin titled
"Talent Is Overrated."

If you want a fun read, read it.

It's a relatively quick read
in which he goes through study

after study that shows in these fields where we think of some people
as being tremendously talented,

# what make differentiates between top performer and average performer ?
in fact, the only thing that really differentiates the top performers from the average performers is "how much they've practiced".

That's the one consistent correlating factor they could find.
It's all about practice.

# is it possible to teach "problem-decomposition"
So that got me thinking, I mean, I believe it's got to be possible to teach this. 
But the second thing is, who's going to do it? 

# why most faculty in 2018 cannot teach it ?
Well, unfortunately, not most of today's faculty.
The problem is the typical faculty member writes a little bit of code as a grad student, never really gets any instruction.
You throw out some crappy code for your dissertation, and then you become a professor.
And then you decide coding is what graduate students do, so you stop coding.
And you never write anymore code.

# how to become a great developer ?
And so, you know, the only way to become a great developer and learn design skills today is with tons of personal experience, sort of trial and error.

Faculty don't have that.
So they can't teach their students.

And so the whole process
just continues over and over

and over again.

But, fortunately, I'm not
one of those faculty members.

So maybe I have a better
chance of doing this.

So, personally, I
love programming.

I mean, programming, it's really
one of the top two or three

things I live for-- you know,
my family, programming--

[LAUGHTER]

--really bad golf game.

There's a sort of few
things [AUDIO OUT]

the things that drive my life.

But if I don't write 5,000
lines of code a year at least,

I feel like it hasn't
been a great year for me.

So in over my career,
I've probably written,

I think now, 250,000 to 300,000 lines of code.

So I've had a chance to observe a lot.

And, again, as
I've been doing it,

I've been thinking
about design stuff.

So I thought maybe, you know, if anybody can do it in academia,
I probably got about as good a shot as anybody.

Then the third question is, well, how do you do it?

So I combined all these three things together.

I finally decided only
one way to find out.

I'm just going to
have to try it.

You know, maybe I'll crash and
burn, but I'll give it a try.

So I created a new course
at Stanford, CS 190 Software Design Studio.

It's not taught like a
typical [INAUDIBLE] course.

It's taught more
like the way you

learned English
writing in high school

with an iterative approach.

So, you know, the way about
writing is you write something.

Your teacher marks it up.

You get it back again.

You rewrite.

They marking up again.

And so the whole process
iterates several times.

And it's that process of
getting criticism, incorporating

the criticism and
learning and seeing

how that makes things better.

That's how you
become a good writer.

So I thought we'll try the
same idea in the class.

And so that's the way it works.

Now, we only have 10
weeks in a quarter system.

So we can only do three
iterations of this cycle.

But the basic way it works
is in the first couple

of weeks of the course,
students in teams of two

build the largest
system they can possibly

build in three weeks.

That's typically about 2,000
to 3,000 lines of code, so,

you know, still
not a huge system.

Then after week three we
go into code review phase.

Students read each
code and write reviews.

And I read every
single line of code

written by all of the students.

This is sort of one of the
limitations of the class

right now.

So I end up reading 20,000
to 30,000 lines of code

in that week.

And then we do code
reviews in class

where students will present
pieces of their project

and other students
will critique it.

And then I do longer code reviews.

I read everybody's projects.

I typically make 50 to 100 comments on every team.

And then I meet with the teams individually for an hour and go over it with them.

Then the second phase is they revise based on the code reviews.

They actually add a little bit
of additional functionality

as well in the second phase.

We do another round
of code reviews.

And then the third phase,
they get a new project.

They start from scratch again.

And we finally do a third
round of code reviews.

And when they do this, the
students get no ideas from me

about how to design.

I just tell them what
the system has to do.

They have to start from
scratch and figure everything

out themselves.

So they make lots of
mistakes in the first phase,

but that's part of the
learning of the class.

Yeah, another question?

Mic's coming here.

AUDIENCE: I watched
your YouTube video

on the same topic you gave.

And in that one, phase three,
it was past the project

to person on the left and
inherit someone else's code.

Why did you change it?

JOHN OUTSERHOUT: Yeah.

In the first two times
I taught the class,

I actually scrambled the
projects in the third phase

and made people add over
somebody else's project.

That was a good
learning experience,

but the problem is people
end up spending a lot of time

decoding other people's projects
and being frustrated with it.

That has some value,
but they don't

spend as much time
doing real design stuff.

And so I finally
decided if what I really

want is to teach
people design, I

think they'll learn more if
they get to start from scratch

and do a new design project.

So I changed it.

I may change back again.

I'll try this for a while
and see if it works.

OK.

So that's the basic
idea of the course.

Now, you may be wondering, so
what are the magic secrets.

How do you do software design?

And by the way,
what makes me think

I know what the secrets are?

So first of all, I don't
claim to know all the answers.

I have, you know, some ideas
that have kind of coalesced

in my mind over the
years, which I'm using

in the course and the book.

I don't claim those are the end.

Actually, I'm hoping more to use those

to start a discussion of
all of them over time.

But in the class, there's about
sort of 10 high level ideas.

They're very abstract,
almost philosophical.

I can't give you a recipe.

You know, follow these
10 steps, and you

will produce a great design.

I'm not sure that
there is such a recipe.

So instead, there
are these vague ideas

that I talk about while
students are doing

their first round of design.

I'm not sure they
sink in very well,

because they're so abstract.

It's probably hard to figure
out how to apply them.

The way they work
best, though, was

when we do the code reviews.

Then I can show the
students how they violated

some of these
principles and what

the consequence
was in their code

and how they should change it.

And then they can go back
and apply the principles

as they revise.

And then I think the
ideas start sinking in.

So it's sort of a--

question in back, yeah.



AUDIENCE: Yeah.

I'm curious what you think about how does the sort of end to end principle in sort of
software design factor into this in terms of trying
to push all the complexity

to the edges of the system?

JOHN OUTSERHOUT: End
to end principle?

AUDIENCE: So like
the [INAUDIBLE]

example of TCP, the checksum,
you know, is done end to end.

It's not in the
intermediate router stages.

And that was a design
principle that they had.

JOHN OUTSERHOUT: I'll
have to think about that.

I'm not sure that relates in a
direct way to this principles,

but I'll have to
think about that.

So there are these
vague principles.

Then the other thing I try and
do is talk about red flags.

So red flags are
very specific things

that, if you see this sort
of behavior or pattern,

you're probably in trouble.

And actually I
think for beginners

in particular, red flags
are really useful to people.

Because even if you don't know
how to design the right system,

if you can see
you're going wrong,

then just try something
else until eventually

the red flags go away.

And you'll probably end up
in a pretty decent place.

So red flags are
really very useful.

So what I'd like
to do is I'm going

to talk about the
four things that

are in red just to give you
a sense of some of the ideas.

Two of them are
design principles.

Classes should be deep.

Define areas out of existence.

And two of them are
more about mindset.

I'll talk about
those afterwards.

So the first one is this notion
that classes should be deep.

This is really just
another way of thinking

about the idea of information
hiding David Parnas first put

out in a paper in
the early 1970s.

By the way, to me,
this paper is one

of the two most important
classic papers and all software

design and engineering.

Has anybody here read
this paper in classes?

Great.

It's still topical
and relevant today.

The last third maybe
not so much so,

but the first part's still--
and it's got a great example

and easy to read.

So the way I think
about it, think

about a class as a rectangle.

And the area of the rectangle
is the functionality

that class provides.

So you can think of that's the
benefit that the class provides

to the rest of the system.

Then think about the
top edge as that's

the interface to the class.

And by interface, I
mean everything someone

has to have in their mind
in order to use that class.

It's not just the signatures
for the functions,

but things like side effects
and dependencies and things

like that.

That's really the cost.

You think that that's
the complexity cost

that this class imposes
on the rest of the system.

So we'd like that to be
as small as possible.

So ideally, what you'd
like is the greatest cost--

sorry, greatest
benefit, least cost.

So you'd like the smallest
interface and then the largest

area.

So the opposite of that
I call a shallow class.

So that's something
that has either

not a whole lot of
functionality or really, really

complicated interface or both.

Those classes, they just
don't give us much leverage

against complexity.

In fact, in the worst
case, in the worst case,

the additional overhead
of the interface

adds more complexity
than what you've

hidden underneath the interface,
and it's a net negative.

What we'd like to have, of
course, on the other side

is a deep class--

very simple interface
with a very large amount

of functionality underneath it.

I mean, that's another way of
thinking about abstraction,

right?

The idea of abstraction
is we're trying

to provide a simple
way of thinking

about something that's actually
quite complicated underneath.

So deep classes are
good abstractions.

And this notion you can
apply it to classes.

You can apply it to
methods within classes.

You can apply it to interfaces
in general or modules

in a system or
subsystems, anything

like that that has an
interface or an implementation.

Yeah, question.

AUDIENCE: Is this
one of the concepts

that you give your
students before they start

the first project or after?

Because it seem important
to give at least

a few hints at the beginning.

JOHN OUTSERHOUT: This is
what I give them before--

well, it's concurrent
while they're

doing the first project.

We don't have enough time for
me to go through all the ideas

before they start designing.

So while they're
designing, we're

talking about this
stuff in class.



Here's a classical example
of a shallow method,

which I have to say I
see distressingly often.

There is essentially
no information hiding

in this method.

In order to use
it, you pretty much

need to understand the
complete implementation.

And, by the way, there's
almost no implementation there.

In fact, this is so bad that
it takes more keystrokes

to invoke the method
than if you had just did

the body of the
function yourself.

So it's basically
a complete loss,

just adding complexity and
getting nothing back for it.

Another example, actually,
of a relatively shallow class

I see all the time is a
class for list manipulation.

This is very shallow.

I mean, lists are really
easy to manipulate.

It's two pointers.

We know the pointers are
hiding underneath there

someplace anyhow.

And so that's a
very shallow class.

Now, you can't always
eliminate shallow classes.

You know, sometimes
you end up the best

you can do is a shallow class.

And so I wouldn't say you
should never, ever have them.

But a shallow class
doesn't buy you

much from a design standpoint.

It doesn't help you in the
fight against complexity.



AUDIENCE: [INAUDIBLE]

AUDIENCE: So I think one thing
that is perhaps a bit subtle

is that the size of the class
is not the amount of code that

is in it right now.

It might be the amount of code
that you eventually have to add

or if you have to have multiple
implementations of it, right?

So maybe this doesn't
make sense in isolation,

but perhaps there
is something else,

there is another
implementation of it

maybe right now or in the future
which is going and storing

stuff in a database or
something like that.

And so I kind of
wonder if you disagree

with that
characterization that you

need to keep track of the
evolution of the class in mind

when deciding on its depth.

JOHN OUTSERHOUT: Well,
I agree with that.

In fact, the whole idea
behind software design

is we're doing things
for the future.

It's we're doing things today
to make it easier for us

to develop in the future.

And you have to think
a little bit ahead.

Although, of course, you
know the classic problem

with software is we can't
visualize the future very well.

So it's dangerous to try
and think too far ahead.

But I agree with your
concept in general.

In this particular case,
though, the problem

is that the interface is
already so specialized

that there's just
probably not a lot of room

for wiggle room under there.

Almost certainly anything you
change to the implementation

is probably also going
to change the interface.

And so, again, it's probably
not going to help you.

But, you know, if you
have reason to believe

it will, well, yeah, sure.



So the problem that leads
to this-- and by the way,

I think this is one of the
biggest mistakes people make,

too many, too small,
too shallow classes.

And the reason people do
that is because they've

been taught classes and
methods should be small.

How many of you at
sometime in some course

were taught your
method should be small?

And how many of you have been
given a number, like any method

larger than n lines,
you should chop it up?

How many of you have heard
something like that said?

OK.

Tell me a small value
of n you've heard.

AUDIENCE: 20.

JOHN OUTSERHOUT: 20?

[INTERPOSING VOICES]

JOHN OUTSERHOUT: Has
anybody heard 10?

[LAUGHTER]

I've heard 10 sometimes.

So if you take this
to the extreme,

this results in what
I call classitis.

Classitis is when somebody
says classes are good

and somebody else
thought what they heard

was more classes are better.

[LAUGHTER]

And so under
classitis, your goal

is to have as many small
classes as possible

where each class
adds the tiniest

possible amount of
new functionality

to the previous classes.

If you want more
functionality than that,

make another class for it.

Probably the best example
of this in the world

today is the Java Class Library.

There's nothing in the Java
language that requires this.

But somehow this has
just become the culture

in the Java world, these tons of
little tiny shallow interfaces.

Like, for example, the thing
that just bugged me about Java

when I started programming,
if I want to open a file

and read serialized
objects from it,

I have to create three
objects for that.

First, I have to create
this file stream.

But for some reason,
I don't get buffering.

If I want buffering--

it's like, do you
want it eat today?

[LAUGHTER]

If I want buffering, I have
to create another object.

And then if I want read
serialized objects,

you add another
object on top of that.

And each of these
can throw exceptions

that I have to catch.

And then exceptions can
come halfway through,

and I have to do clean up--

enormous amount of
complexity for something

that's really, really simple.

So I think they lost sight of
the idea that, first of all,

in managing complexity, the
common case matters a lot.

You want to make the common
case really, really simple.

I shouldn't have
to do all of this.

OK.

Maybe I want to be able
to not have buffering,

but that should be an
option that-- you know,

if I don't want buffering, that
should be where things get more

complicated, not to have to
remember to ask especially

for buffering.

So to me, it's not about length.

Length is really not
the fundamental issues.

I don't have
problems with methods

that are hundreds of lines long
if they're relatively clean

and if they have a
deep interface to them.

It's abstraction.

That's the most important thing.

So rather than
striving for length,

you should first try and
get these deep abstractions.

And then if you end
up with something

that's really big and long,
then see if you can chop it up.

But depth is more important.

So what's an example
of a deep interface?

My favorite in the
world, probably one

of the most beautiful
interfaces ever invented

is that Unix file
I/O interface--

five functions, falling
over easy interfaces

to every function.

The only complexity is the flags
and the permissions for open

are a little bit funky,
but everything else

is very, very simple.

And then think
about what's hidden

behind this simple interface.

There's typically hundreds
of thousands of lines of code

behind that that do everything
from managing disk space

to file caching to, you
know, device drivers--

enormous amount of code and, of
course, many other lower level

interfaces behind this, but
just this amazingly beautiful

five functions.

Now, today, people look at
this and think, well, duh,

of course, that's the
way you design things.

But it was not like this.

Has anybody in this
room actually programmed

at around the time
Unix came out?

Only a few of us are old
enough to have done that.

Things were pretty
horrible before then.

Like, for example, in
pre-Unix file systems,

there would be a totally
different set of kernel calls

if you wanted to open a file for
random access versus sequential

access--

two different sets kernel
calls, different kinds of files.

You'd have to declare your file
random access or sequential.

And Unix just had this
amazing the simple interface.

So anyhow-- a beautiful example.

OK.

Let me go to my second
design principle, which is

define errors out of existence.

So we all know that exceptions
are a huge source of complexity

in systems.

For example, in the
RAMCloud storage system,

we thought we were building
a low latency storage system

and figured out we'd be spending
all of our time making things

really fast and low latency.

But, in fact, 90% of our time
went into doing crash recovery.

So they're a huge
source of complexity.

And, again, the common wisdom
kind of leads people astray.

You're taught to program
defensively, which is good.

But people then
think, ah, I should

be throwing lots of exceptions.

The more exceptions
I'm throwing,

the better defense I'm doing.

And as long as I, building my
module, catch all the errors

and heave them up in
the air as exceptions,

I don't have to worry
about where they land

or who's going to
deal with them.

I've done my job.

In fact, the more of them I
throw, the better programmer

I am.

But then that just
results in this explosion

of exceptions that have
to be caught and handled.

And then the exceptions
themselves create more bugs.

And you have secondary
exceptions and so on.

So I would argue,
in general, overall,

we should try to minimize
the number of places

where you have to
handle exceptions.

You can't completely eliminate
it, but try to minimize that.

And the best case of all--

which I found you can
do surprisingly often--

is simply to redefine
the semantics,

so that there is no error.

There is no exception at all.

That's the best.

It's just gone completely.

So let me give you
three examples of that.

First one-- when I was designing
the Tcl scripting language

many years ago, I introduced
an unset command, which

deletes one and more variables.

When I was doing
this, I thought--

by the way, this is a
classic mistake, people--

I thought why in
their right mind

would anybody ever delete a
variable that doesn't exist?

That makes no sense.

So I'm going to throw
an exception for that.

Well, turns out people
do that all the time.

For example, you're halfway
through a computation.

You decide you
just want to bail.

So you want to clean up all
the mess you might have made.

So you go through and
delete every variable

that you might have
created, but you

don't know which
ones you actually

got around to creating yet.

And so some of them don't exist.

So in practice, people complain
about this all the time.

And in fact, if you
look at Tcl code,

I bet virtually every
invocation of the unset command

is wrapped in a catch command
that will catch the exception

and throw it away
when it happens.

So what I should have done--

in fact, I don't know
why I didn't fix it

once I found the problem.

That was my second mistake.

What I should have done
was redefine the semantics,

so that unset makes
a variable not exist.

And if you think
of it that way, ah,

well, if the variable doesn't
exist already, we're done,

clean, no harm, no foul.

So that's what I
should have done,

should not have
thrown that exception.

Another example
is file deletion.



In Windows, at least
in the early days,

if you tried to
delete a file when

some process had the file
open, that was not allowed.

Anybody experienced this?

Anybody that have used
Windows experience this?

It's this horrible thing.

And then now you figure,
OK, who's got it open?

You start going around killing
programs to try and make it

so you delete the file.

And you can't find which
program has it open.

So finally, you just
give up, and you reboot.

And then it turns out--

[LAUGHTER]

And then it turns out
that it's a system

daemon that has the file open.

So when you reboot,
it's still in use.

You can't delete.

So Unix has a beautiful
really lovely solution

that makes this error go away.

In Unix, if you delete
a file while it's open,

what happens is it deletes
the file from the directory

and from the namespace.

It no longer appears
anywhere in the file system.

But the actual
contents of the file

still hang around, so that any
process that's using the file

can continue to access the file.

And then when the last
open instance of the file

is closed, then finally it
cleans up and throws away

everything else.

It's a lovely solution.

Because you could have
made the other mistake,

which is that I'm going
to delete the file.

And now, anybody doing I/O
on the file gets an error.

That would probably
be even worse,

because now every
program would have

to be written to
handle the case where

the file goes away in the
middle of your accessing it.

So Unix had this beautiful
solution where there's

no errors on either side.

It just does the right thing.

So Windows, they eventually
realized this was a problem.

And I don't know where they are
in the evolution of fixing it.

But I know that the
first stage they did

is they had some
special flag you

could set that would say, delete
the file even if it's open.

Or you can maybe when you
open the file-- so then

you can allow it to be
deleted while it's open.

But they didn't get rid
of the directory entry.

They kept the
directory entry around.

And so you couldn't recreate
the file while it was open.

So if you were, for
example, trying to rebuild

and, you know, the
binary was in use,

you couldn't create a new
version of the binary file,

because the directory
entry was locked down.

So they still
didn't get it right.

So, again-- examples of why you
just want to make these errors

go away.

A third example,
which people often

consider more controversial when
I say this one, is substrings.

So in Java, there's
various methods

that will extract a
substring out of a string.

And these methods are
very exception happy.

If either of indices is outside
the range of the substring

and throws an exception-- and I
believe if they're kind of out

of order, it throws
an exception--

I find this a huge pain.

I end up, typically,
having to write my own code

to effectively clip my indices
to the range of the string

before I invoke the
Java substring command,

so I won't get these exceptions.

I consider this just a bad idea.

Instead, it'd be so
much simpler just

to find substring,
so that it returns

the overlap between the
indices you've specified

and the available
contents of the string.

So if both of the indices
are outside the range

of the string, it
returns an empty string.

You know, if they
are in reverse order,

clearly there can't be
anything in the right order.

It doesn't return and just does
the clipping automatically.

This would eliminate so much
extra code people have to write

and also, I suspect, a lot of
runtime exceptions that occur,

because people forgot
to clip their indices

to the range of the string
before they invoke the command.

So, again, the overall idea
here is to try and reduce

the number of
places where people

have to deal with exceptions.

The book talks about a few
other ways of doing this.

But the best case of all is just
to define the exceptions away.

Just make the normal behavior
always do the right thing.

And nobody's objecting
on the Java substring.

Usually somebody raises their
hand and objects to that.

Yeah.



AUDIENCE: Yeah.

So not objecting, but defining
[INAUDIBLE] the semantics,

perhaps, is a more
complete definition.

I mean, you could
simply say, OK,

whatever set of
parameters you pass,

you have random behavior that
are difficult to explain.

But the examples you gave
were very, very intuitive,

like when you defined
overlap between the indexes

and the available space
or the Tcl, et cetera.

JOHN OUTSERHOUT: Somebody want
to argue that Java substrings

should throw exceptions?

AUDIENCE: Yeah.

[INAUDIBLE]

JOHN OUTSERHOUT: Let's bring
the microphone over here.

AUDIENCE: [INAUDIBLE]

JOHN OUTSERHOUT: I know some
of you thinking it, so yeah.



AUDIENCE: I think it should
throw a runtime exception,

because, like, you can--

sometimes it could be
just the wrong assumptions

on client side.

Like, they've just
done something wrong.

And they're assuming that's
correct range, but it's not.

I think it should be
a runtime exception.

JOHN OUTSERHOUT: This is
part of the philosophy

about we're going to
try and keep people

from making mistakes, which
it's kind of a noble thought.

But the problem is that it's
really hard to keep people

from making mistakes.

And so typically what
happens when we try and do

this is we introduce lots of
complexity, which makes it hard

to even do the right thing.

And so I'd argue, in general,
we want to make it really,

really easy to do the common
case and the right thing.

You still have to do
testing to catch mistakes.

And so this isn't
going to replace

the need for unit tests.

But, in general, I think
when you try and build

systems that can keep
people from making mistakes,

you usually create a whole lot
of complexity for everybody.

AUDIENCE: So how
do you distinguish

between Java substring versus
java.string.character@index?

Should that throw an exception
if the index is out of range?

JOHN OUTSERHOUT: Good question.

That one probably should,
because it can't really

return a character.

You know, what do you--

you know, you could redefine
it kind of like IEEE

Floating-Point did,
where there were

special values that
represented arithmetic errors

and things like that.

So if you have some
sort of a null character

that you could return,
that might make sense.

But we really have that
in our character sets.

So in that case,
you really can't.

I'm not sure what you
would return if you're

going to return something.

So, yeah, so in that
case, you probably

do have to throw an exception.

AUDIENCE: [INAUDIBLE]

AUDIENCE: -optional character.

AUDIENCE: So one
question-- so when

is it a good idea to
actually throw exceptions?

So the intuitive case is you
want to eliminate exceptions

as much as possible, then
how do you decide, no,

there's nothing that I can do?

My changing semantics
doesn't work.

And I really have to
throw an exception now.

JOHN OUTSERHOUT: Well, if you
fundamentally can't carry out

your contract with
your caller and if you

can't implement your
interface, then sort of

have to throw an exception.

You know, like,
if you're reading

[INAUDIBLE] you're
doing a read operation

and the read can't succeed,
because you got an I/O error,

you have to.

That's information that you
do have to reflect that back

to the caller.

So you can't eliminate
all exceptions.

You know, some of the
students in the class

thought this was
really a great idea.

And so they basically
wrote no exception handlers

in their code--

[LAUGHTER]

--and said, I'm just defining
them out of existence.

I said, no, no, some of
them actually matter.

You have to-- and a lot of
software design, I think,

is figuring out what matters
and what doesn't matter.

And, ideally, you'd like to make
as little matter as possible.

You know, you'd like to be as--

to not depend on
very many things.

But you have to recognize
the things that really

are important and do matter.

And those you do have to
reflect in the system.

Yeah.

AUDIENCE: Do you have
thoughts on exceptions

versus extra status code
or extra error code return?

JOHN OUTSERHOUT: Boy, that's
a classic argument, exceptions

versus return values.

Now, there are times
when each make sense.

I believe exceptions actually
provide the most value when

you throw them farthest.

If they're going a
long way up the stack,

that's where they provide
the biggest benefit.

Because you've
made it unnecessary

for a whole bunch of
intermediate layers

to deal with the situation.

You can take it all the way back
to the source and deal with it

at the source.

If you are catching exceptions
in methods you call,

you know, there's not as
much value for that compared

to just getting a return value.

It's not a whole lot different.

One of the problems
with exceptions

is, also, they all
have clunky syntax.

And, actually,
checking a return value

is actually simpler
syntactically

than declaring an
exception handler.

But, you know, a lot of times,
some of these exceptions

you really will want them
to propagate a long ways.

And so then even if the
caller is going to look at it,

you probably want to manifest
it as an exception rather than

a return value.

AUDIENCE: Any
thought on crashing

as a way of, like,
avoiding [INAUDIBLE],, like,

passing [INAUDIBLE]?

JOHN OUTSERHOUT: Any thoughts
on crashing as a way?

AUDIENCE: Yes.

JOHN OUTSERHOUT: Yeah, yeah.

Actually, crashing
is a fine thing

to do in certain situations.

Like, for example,
in most programs,

I would argue you should not
be trying to [AUDIO OUT] out

of memory exceptions.

It's just hopelessly
complicate to try and do that,

because it depends
so much on memory.

That for most applications,
if you run out of memory,

just crash.

I mean, print a
message and crash.

It almost never happens.

Machines today they have
tons of memory anyhow.

You know, again,
use with caution.

But I think there are
situations where just crashing

is a fine thing, a
fine way to do it.

The alternative would
create so much complexity

that you probably wouldn't get
it right in the first place

and it'd end up crashing anyway.

SPEAKER 1: Hey, John, there's
17 questions on the Dory.

So I'll just ask
the top ranked one,

so that we don't
run out of time.

The question is
from [INAUDIBLE]..

And in real life, development is
often under these constraints--

for example, tight
schedule, need

to experiment and be
flexible about design,

lack of mature tools,
library, et cetera.

Does your approach to software
design philosophy change

based on the real
world constraints?

JOHN OUTSERHOUT: Yes.

And actually, that's
a good lead-in.

Let me move on to the
next part of the talk,

which I'm going to
talking about that.

And I think I want
to get moving, too,

because we're starting to
run a little tight on time.

[AUDIO OUT] about a couple
of specific techniques

or philosophies you can use.

But I think one of the biggest
obstacles to good design

is mindset.

If you don't have
the right mindset,

you will just never
produce a good design.

And I think there's two ways
of approaching the programming

or design process, which I
call tactical and strategic.

Unfortunately, most people
take the wrong approach,

which is the tactical approach.

In the tactical
approach, your goal

is to get something working--

you know, your next feature,
fixing a bug, whatever.

But that's your goal, to
get something working.

So you think, how
can that be wrong?

Isn't that the whole goal of,
you know, building systems?

We want them to be working.

Well, the problem
with this approach

is that when you do
it, then you usually

have a mindset that, well, I'll
try and make it mostly clean.

But if I have a little--

if I take a couple of, you
know, short cuts or a little bit

a kluges, as long as I
don't do too many of them,

if I get it working,
that's what really counts.

The problem with that is that
those kluges build up really

fast.

Because not only
are you doing it,

but everybody else on
your team is doing it.

And then after a while you
start saying, well, I probably

shouldn't have made that
decision back there,

but we've got our next
deadline we've got to hit.

You know, I'll try and find
time after that deadline.

But then by the time
the deadline is done,

you've introduced
so many kluges,

you realize it's going to
take weeks to fix all these.

And you don't have
time for that.

And so it just never happens.

So the result of this
inevitably is the system turns

to spaghetti
really, really fast.

And the problem
is that complexity

isn't one mistake you make.

It's not a single big thing that
makes the system complicated.

It's hundreds or
thousands of mistakes

made by many people
over a period of time.

And so that means,
first of all, you

don't notice it as it's
happening, because it's just

a bit at a time.

But then, even worse,
once it's happened,

it's almost impossible to fix.

Because there's no one
thing you can go back

and fix to fix the problem.

It's thousands of things
in hundreds of places.

And so it's just
so overwhelming,

you never get to it.

So, by the way,
there's an extreme

of the tactical programmer,
sort of personality type,

I call the tactical tornado.

This is a person who turns
out enormous amounts of pretty

shoddy code that kind of
80% works at a huge rate

and leaves a wake of
destruction behind them.

[LAUGHTER]

And in many organizations, these
people are considered heroes.

This is who management
goes to when we need

the new feature for tomorrow.

And they'll have
a feature tomorrow

that works for most of
the day tomorrow, anyhow.

In fact, actually, when I gave
this talk, somebody said, oh,

is that what you mean
by the 10x programmers?

[LAUGHTER]

No.

No.

How many of you feel
like you've been

in the presence of one or
more tactical tornadoes

over your career?

Yeah.

Every organization has them.

I'm sure they're here at Google.

And, unfortunately, one
of the things I hope to do

is to provide a
name for this, so we

can start calling them out
and maybe educate management

about them.

How many of you feel like
your management actually

rewards technical tornadoes?

Yeah, that's even
worse, unfortunately.

So, you know, the
tactical approach

is really, really easy to slide
into, very hard not to do that.

But so the first thing
you have to realize,

if you want to do great
design, you have to realize

working code is not enough.

That can't be the only goal.

It's sort of table stakes.

Of course, things have to work.

But that shouldn't
be the real goal.



Instead, you should take what I
call a strategic approach where

the goal is a great design.

That's the most important thing.

Yes, it's got to work today, but
we have to have a great design.

Why do we want a great design?

It's so that we can
develop fast in the future.

So it's really all
about investing.

We'll invest in
good design today,

because most of
the code we develop

is going to be in the future.

And so if we mess
things up today,

we're slowing ourselves
down for the future.

So you have to think
about complexity,

try and find ways to drive
complexity out of the system.

And, fundamentally--
this is the hard part--

you have to sweat
the small stuff.

And you sort of have to have
a zero tolerance approach.

Don't let those little
bits of lint creep in.

Because if they do, then
you're going to slide back

into a tactical mode again.

You know, so if you
program strategically,

you're going to go slower first.

But, presumably, in the end,
you'll end up going faster.

I mean, even with a
strategic approach,

you're development will
still slow down over time,

because complexity
is inevitable.

We can't prevent it.

We can only kind of slow the
growth as much as we can.

But, eventually, you'll end
up [INAUDIBLE] to be faster.

So the issue is
you have to invest.

If you're not willing to take
a little bit of extra time

today, at least a little bit,
you can't do good design.

But in my opinion,
it all pays back.

You always get your
investment back.

Now, the challenge is what are
the parameters of these curves?

Like, how much slower do
I have to go initially?

You know, when do
I get to the point

where the slopes are the same,
so I'm at least now running

as fast as I was tactically?

When do I actually catch up
so I actually have a net gain?

And then how much
faster I go at the end?

Unfortunately, I don't know
of any quantitative answers

to any of those questions.

You know, I have opinions.

Like, my opinion is that
the crossover period

is somewhere in the 6 to
12 month range, roughly

how long it takes you
to forget about why you

wrote that last chunk of code.

But I don't have any data to
back that up, unfortunately.

So that's the challenge.

Because, you know, people
can see the cost today,

but they can't
really estimate when

the benefit's going to come
or how long in the future

it's going to be.

And so it's really easy just
to optimize for this part

down here.



AUDIENCE: Yeah,
just quick question.

Have you thought of analyzing
open source development

and seeing whether or
not you can observe this?

I mean, it would require
some judgment calls, I guess.

But--

JOHN OUTSERHOUT:
I'm not sure how

you do-- you can look
at the rate of commits

from the new lines added.

But the problem is you
don't know how much effort

went into those.

AUDIENCE: Yeah.

JOHN OUTSERHOUT: So--

AUDIENCE: I was thinking like
when a new storage device comes

out and people are writing
new file systems or something.

You know, you could look at
this across different OSs

and see how things happen.

JOHN OUTSERHOUT: Yeah,
that's a thought.

It's hard.

So the question is,
how much do you invest?

Actually, let me charge
for a couple more slides,

because we're starting to
run a little tight on time.

So how much?

What's the right
amount to invest?

And, you know, if you
look at most start-ups,

honestly, they're mostly
completely, 100%, tactical.

They feel a tremendous pressure
to get the products out.

You know, our financing is
going to run out in six months.

Whatever evil we
put in, you know,

when we become famous and
wealthy and do out IPO,

we'll be able to
hire more engineers

to clean up this mess.

And so, you know, they end up
with these horrible spaghetti

code bases.

And, unfortunately, of
course, once you get that,

it's pretty much
impossible to clean it up.

I've never heard
of anybody-- maybe

if you could go back
and completely rewrite,

you could do it.

Maybe there have been
examples of that,

but it almost never happens.

So to me, Facebook is the
poster child for this.

They even built it into
their company motto--

move quickly and break things.

And they did both of those.

[LAUGHTER]

So now, in a sense,
developers kind of like this.

So fresh college
hires could come in.

They're super empowered.

They push their first
commits, and they're changing

the website in one week.

The first week on the job
feels like, you know, really

empowering for them.

But their code base was
just a notorious mess.

One summer, a couple
of my graduate students

went there for internships.

They came back, and
they just couldn't

believe what they'd seen.

And this was interesting,
because my students

had been whining for the
whole previous year about why

do we have to write unit
tests and write documentation.

Linux doesn't have
any unit tests.

And Linux doesn't
have any comments.

Why do we have to do this?

I never heard that again after
they came back from Facebook.

[LAUGHTER]

So Facebook has
eventually realized this.

And so they changed their
motto to "move quickly

with solid infrastructure."

It's like, you know,
no, no, I meant to say

wouldn't, not would.

[LAUGHTER]

So have they been
able to fix it?

I don't know.

Now, people hear this,
they say, well, yeah,

but Mark Zuckerberg is
the fourth wealthiest

person on the planet.

How can this be a bad approach?

And, of course, the
answer is, you know,

you can be successful
with crappy code.

You can be tactical and
build companies that succeed.

Facebook has done it.

But I have two thoughts on this.

One is you can also succeed
with the other approach.

And although, I don't
have personal experience

with either of these
companies, my sense

is that both Google and VMware
took a much more, sort of,

stronger design culture
approach at least

particularly in the early
years, you know, 2000 to 2010.

Those were the two companies
known in Silicon Valley

as this is where the really
great software developers go.

They really care about design.

And they do really good coding.

And the reason this matters is
that if you have that culture,

I think you're in a
much better position

to recruit the best programmers.

And we know about
this 10x phenomenon.

You know, the best way
to get great products out

fast is to get the
best programmers.

And so I think the
strongest argument

in favor of a good
design culture

is that it allows you
to hire top people.

And that will give
you an advantage.

So you can do things the
crappy way if you want,

but there's enough
success stories

to show that you
can make this work.

You can do the
investment approach.

OK.

But then again, OK,
but how much to invest?

I would say how
much can you afford?

You know, just ask
yourself what's

the most we can afford at
this stage in our lifetime

to invest.

I think in terms of maybe 10%
or 20%, something like that.

I bet, almost everybody, you can
afford to go 10% slower today

realizing you're going
to get it all back.

It's not a sunk cost.

It's all coming back to you.

In somewhere, you know,
six months to a few years,

you're going to get
it all back again.

You can afford to do that.

And I think in terms of
small steps, not heroics.

You know, you can't
spend six months

and completely design
the whole system,

you know, from first principles
before you write any code.

That doesn't work.

We know one of the
problems of software

is we can't visualize
the way our systems are

going to turn out.

You have to use a somewhat
iterative approach.

So I'd say, think of it
in terms of small steps.

So when you're
building new modules,

take a little bit of time
to design the interface.

Try to come up
with deep classes.

Write the documentation
as you're going,

unit tests, of course.

And then whenever
you make changes,

you have to realize you can't
get it right the first time.

It's one of the
rules of software.

We just can't.

So assume every time
you're in a system,

you're going to have
to be improving things.

Always look for something
you can make better.

One reason for this is you're
probably making something worse

when you go in also.

So even if you just
want to break even,

you've got to find
something to improve.

So I just think that I'm just
trying to at least break even.

So this is against
the normal philosophy.

I think, oftentimes, when people
are changing existing code,

they go for what's the smallest
number of lines of code

I can possibly
change to do this.

I think sometimes it's
because they're afraid.

I don't understand this.

I'm going to break
something, so I'll

make the fewest lines of change.

So I'll just kind of directly
access a global variable,

another file, rather
than trying to find

a clean interface for it.

So don't do that.

Try and find a clean
way of doing things.

And ideally, in the
best case, you'd

like to end up where
you would have ended up

if you had built the whole
system from scratch knowing

what you know today.

That's what you're like.

Is this the way we would have
done it if we had built it

from scratch?

That's the ideal.

Now, you know, you
can't always do that.

Sometimes that would
be a refactoring

that's way beyond the
scale of what you can do.

So, again, I would just say
ask yourself at any given point

in time, am I doing the
most I possibly can?

Don't just give in
and the boss says

we've got to get a
release out tomorrow,

so I'm just going to
hack this thing in

to make the boss happy.

Ask, is this the best
I can possibly do?

Yeah.

AUDIENCE: John, will
you touch on layering,

which is often considered very
good in software engineering,

but it also has a
challenge of performance

of the code when it executes?

Often, the functionality is
replicated in multiple layers.

And it's not clear
how to distill that

without mucking up the code.



JOHN OUTSERHOUT: So is your
question, are the layers good?

AUDIENCE: Yeah.

So how do [AUDIO OUT]
deal with layers,

the demand for
abstraction layers,

and the demand for
performance both

contradicting each other here?

JOHN OUTSERHOUT: We need
layers for managing complexity.

So in that sense, they're good.

They do have problems
for performance.

I think people do
too many layers.

And so I think that's a
common mistake is just

to throw in lots
of skinny layers,

again, rather than having
a smaller number of meatier

layers.

That's one problem.

The other thing is that
for cases where performance

matters, if you think
a little bit about what

your key performance
metrics are,

I believe you can often define
your layers in a way that

allows you to achieve very high
performance even with layering.

But you have to be thinking a
little bit about sort of this,

the overall, kind of gross
level performance metrics

while you're doing
your system design.



OK.

So anyhow, I think this
investment thing is the biggest

challenge, particularly because
a lot of managers, I think,

don't really get it.

And they're sort of pushing
for the next feature

or the next release.

I don't know how to
combat that except to have

the people that
everybody recognizes

of the great engineers in
the company go to management

and try and get
management buy in.

And I think it'd be
great if companies

can have sort of explicit--
this is in our engineering

philosophy.

We will invest at
10% [INAUDIBLE]..

Roughly, on average,
10% of our resources

are going towards making designs
better, not just cranking out

next features.

Yeah, John.

AUDIENCE: Hi, John.

I haven't looked at
this for 20 years now,

but the quantitative analyzes
that you're describing

were the domain of
the social engineering

community for a while.

I'm wondering if you sort
of poked into that space

to see if they have
experimentation, numbers,

analyzes, that might be useful.

Or have they just
dropped off the map?

JOHN OUTSERHOUT: I haven't
looked very carefully,

partly because I'm sort
of skeptical that it

is possible to measure
it in a meaningful way.

So I haven't-- but I would
[AUDIO OUT] see numbers

if there were [AUDIO OUT]
were believable.

But I haven't looked
enough to know.

OK.

So I just have a
couple more slides,

then I'll open it
up for questions.

So is the course working?

You know, it's hard
to tell for sure.

I mean, you can't become a
great programmer in one quarter.

It'll take, still, lots of
experience for these people.

We'll have to come back
and ask them once they've

been out at industry a while.

This is just sort of the first
step in the process I think.

But the class has a really
fun energy to it, really fun.

The students start off in the
first round of code reviews.

And they're very
tentative, kind of afraid

to criticize each
other, not really sure

what they should be saying.

So the first round's
kind of tentative.

Then they meet with me,
and they get unloaded on.

And then they start-- oh,
OK, I can do that, too.

And so about halfway through the
second code review, typically

the tone of discussions changes
where students are now being

more critical of each other.

We have these interesting
arguments in class

about whether one approach is
more complicated than another.

And it's really clear by
the end of the quarter

that the students are
thinking about programming

in a very different way than
they thought about it before.

So I think that's
really encouraging.

I will have to say, though, even
if the students don't become

better designers, actually,
I'm becoming a better designer

from teaching the class.

It's really interesting for me.

You know, you might
think it's tedious

reading 20,000 lines
of code in a week three

times over a quarter.

And it does take some time.

But, actually, I
learn a lot from that,

because the students are
all doing the same thing

in the same language.

And so I can see
different approaches.

And I can see kind of common
mistakes that they make.

And, actually, what's
ended up happening is

I've changed my view about a
couple of the design issues

as a result of
teaching the course.

And in particular, the one
at the bottom of this slide

was I realized that
making classes just

slightly general purpose,
even though you're only

going to use them in
one place, actually

makes the amazingly
simpler and deeper.

I hadn't realized
that until I saw

some student projects,
actually, the second time I

was teaching the course.

So it's been really
interesting for me to see this.

And I feel like
I'm learning more

about the process
of software design

and getting better ideas
for how to teach it as I go.

Then as I've talked to
people about the course,

people kept saying, well, you
should write a book on this.

And I was on
sabbatical last year,

so I decided, OK,
I would do that.

So I have written this book.

It's a relatively small
book, 170 pages, again,

still fairly philosophical in
nature more than prescriptive.

So the hope is that I can reach
more people, because I can only

teach 20 people a
year in the class.

I can't do more than that.

And ideally, I'm hoping the
book will kind of be a lightning

rod that maybe we can
kick start a discussion.

I hope people write
to me and disagree

with things in the book or
suggest other design ideas

or provide better examples.

I'm also trying to define
terms that people can use.

One of the things I hope
maybe the book can do

is people can use
that in design reviews

to have ideas and
ways of talking

about design and design ideas.

Actually, I have a
question for you.

How many people here
do design reviews?

I assume almost everybody.

And how many of you in your design

reviews it's common for you to discuss

design issues as opposed to coding style and bugs?

How many of you commonly talk about design things?

Good.

Great.

I'd like to see more of that.

So now the book's been out
for a couple of months.

If you read it and have
thoughts or comments,

I'd love to get
your input on it.

My view is this is
just a first stab.

If this actually ends
up being a useful book,

it'll probably be--

it's kind of like software.

At about version
three, you know,

where it really hits
its stride, I'll

need to get feedback and revise
and fix things that are wrong

and add new ideas.

So just to conclude,
I really believe

we can teach software design.

I really believe we can.

My current approach,
unfortunately,

is woefully non-scalable.

I haven't figured that out.

I really need somebody
with a lot of experience

I think reading
the student's code.

I feel like some principles are emerging.

You know, if you read the book
and agree or disagree with me,

I'd be curious to hear
your take on that.

# future of software design
What I hope to do in the future is just to somehow leverage this
out into the community.

I'd love to see just a greater
sense of design awareness

in the software community as a
whole can we have a discussion.

We make an important
part of our community

it's just sad that
we don't really

even have discussion today.
# mana mailing list nya ?
So I created a mailing
list for discussion topics

about the book.

Hasn't been much
traffic on it so far,

but I hope there will
be more in the future.

And, again, I hope to
take ideas from people

and make the book better and
better and the class better

over time.

And the long-term goal is it'd be great if, 5 or 10 years from now, we actually have a relatively robust set of principles that most developers agree are good for software design.

So thanks for your attention, and I'd

be happy to take more questions.

[APPLAUSE]

SPEAKER 1: So let me get a
few questions from the Dory

out here.



Do testing considerations,
like unit testing or marks,

influence interfaces
and abstractions?

JOHN OUTSERHOUT:
Testing considerations--

I'm a huge fan of,
particularly, unit tests--

crucially important.

I have debated whether to try
and teach them in the class.

Actually, I did a little bit
at one time in the class,

but it was just too much of
a distraction for the class.

We only have 10 weeks.

And so I finally
decided, for the class,

I just got to focus on design.

So I don't do unit
testing in the class.

But I'm a complete
advocate of unit tests.

I can't imagine doing
software without unit tests.

AUDIENCE: So I was
intrigued by the first part

of the discussion when you said
in the iterative process you

actually dropped--

you initially had students
build on other students code.

To me, that's a very,
very real world problem.

And I'm just
surprised that you--

I mean, I wish you
would teach that.

JOHN OUTSERHOUT: You
know, I agree with you.

In a perfect world, that would
do one of the things we do.

The problem is
we've got 10 weeks.

How do I use that 10 weeks?

And I decided I want to try and
do the most I can on design.

And so I have to
sacrifice other things.

It's the same reason why
unit testing got thrown out,

because I felt like
it was better for them

to be thinking about more
design issues than unit testing

issues.

But I agree with your
thought completely.

Yeah.

AUDIENCE: Do you have
TAs for the course?

JOHN OUTSERHOUT: Do we have TAs?

Yeah, me.

[LAUGHTER]

Not right now.

Because I just
worry that the TAs

would not be able to give
high enough level of feedback.

I've started wondering if
maybe students who have taken

the course previously could TA.

So far, actually, the demand has
not been more than my capacity.

And so I've been able
to keep it small.

If the demand grows, I
may try an experiment

to see if previous course
participants can TA.

But, again, I worry.

Also, for the first
few offerings,

I wanted to read all
the code myself, too,

because I wanted to
learn from it as well.

AUDIENCE: Have you thought
about using software engineers

as TAs?

We read and write
code every day.

[LAUGHTER]

JOHN OUTSERHOUT: I'm not
opposed to it in principle.

But I'd want to
make sure students

don't get mixed messages.

And so particularly
because the ideas

I'm teaching in
the course are not

ideas that are not necessarily
widely spread in the community.

Like the worst
thing would happened

is if a software engineer comes in and says,

no, this method is longer than 20 lines.

You've got to break it up.



So if I could find people
that are sort of bought

into the philosophy--
and maybe, you know,

the book gets out there
and more people buy in,

maybe we can do more of that.

SPEAKER 1: OK.

One question from the Dory,
the second highest rate one--

are threads still a bad idea?

[LAUGHTER]

JOHN OUTSERHOUT: You know, one
of the interesting things when

the only form in which
you publish something

is a set of slides rather
than a paper-- which that was.

It was just an invited talking
at a [INAUDIBLE] conference

a long time ago.

It's interesting.

People can come
back and interpret

that in whole bunches of
different ways over the years.

So that was done in a very
narrow context of the time

where people were starting to
introduce threads for things

that didn't even need threads.

They were doing threading on
machines that didn't even have

multiple processors on them.

And so that talk was
a reaction to that.

Threads are unavoidable.

I mean, for certain things,
you just have to use them.

But they're still sort
of the next to worst

alternative where the
worst alternative may

be, in some cases,
not using threads--

incredibly hard to program.

So I'm still not
a fan of threads,

but they're kind
of a fact of life.

Yeah.

AUDIENCE: I have a
question on Tcl language.

I think the language is sort
of very simple in itself,

but eventually not gained,
like, larger scope of adoption.

I want to ask, because you
are the language inventor, is

your like high level
issues in the language

of design you saying you got
it wrong, which makes it--

JOHN OUTSERHOUT: What even
happened to Tcl, I think,

would be your question.

I don't want to diverge
too much from that.

I would say two things.

First, one of the
things Tcl was best at

was doing kind of simple
interactive GUIs with Tk.

And when the web came
along, the web basically

took that over and Tcl did not
make the transition to the web.

So a lot of things people would
have used Tcl Tk for, they

end up doing in the web.

The second thing is, is it
really with the right language?

I'm not sure, in retrospect,
that it's the right language.

Actually, I built it for
a very different purpose.

I built it as more of a
textual command language

that you'd be typing
commands to programs,

almost like a shell language.

And then it ended up getting
used as a scripting language.

It has a bunch of
interesting properties.

But I don't know, if
I were doing it again,

I'm not sure I would
design the same language.

But I think that the
biggest thing that

happened is kind of
the web came along

and Tcl did not effectively
make the transition to the web.

# how to hiring people ?
SPEAKER 1: OK.

So there's a lot of really
interesting questions

both on the Dory
and in the room.

In the interest
of time, I'm going

to do two more Dory questions
and two more in the room.

And then John is going to
stay around and hopefully

answer more questions as well.

OK.

So any thoughts on the hiring process

based on what you've observed?

And the question has, how would you change the hiring process
which is so algorithm heavy?

Can you share your experience
when you ran your company?

## john prefer faster learner
JOHN OUTSERHOUT: Hiring process, actually, I'm

not sure it relates
to software design.

But I have a very strong
opinion about hiring process,

which is you should hire
for slope, not y-intercept.

I think people, when they hire,
they do a pattern match of what

this person has
done, try and find

the person who has exactly
done the job we want to do.

I think that's the wrong
way to hire in general.

I think you want to
hire the person who's

the fastest learner, who
has the fastest slope.

I don't particularly
care whether they've

done the job I want to do.

Because particularly
at a startup,

when things change so rapidly,
you know, things change.

So I look for people
who are really smart

fast learners rather.

Also, by the way, the person
who has done this job five times

before, you sort of
wonder, well, you know,

why haven't they moved
on to the next job?

Oftentimes, those people
kind of hit their plateau.

Whereas, the person with the
rapid slope, has the potential.

AUDIENCE: OK.

JOHN OUTSERHOUT:
That's my [INAUDIBLE]..

SPEAKER 1: Last
question from the Dory--

what do you think
about Hyrum's Law?

JOHN OUTSERHOUT: Sorry,
remind what Hyrum's Law is?

SPEAKER 1: It's a--

I googled it and it says with
a sufficient number of uses

of an API, it does
not matter what

you promise in the contract.

All observable
behaviors of your system

will be depended on by somebody.

[LAUGHTER]

JOHN OUTSERHOUT: I
think there's truth

to that, that, yeah, over time
what happens is the, sort of,

application, they
find every crevice

and sink their roots under that.

They will discover.

So unless you're very
careful with your APIs,

I think that's probably true--

sad, but true.

Yeah.

AUDIENCE: Hi.

Have you observed any
change in the simplicity

or the complexity
of a software design

based on the choice of
languages and support ecosystem?

JOHN OUTSERHOUT: Oh, a good question.

There's some languages somehow
lend themselves to better design than other languages.

You know, there probably are--
I think that's mostly a
secondary, sort of second order thing.

But, for example, today, I'd
rather program in C++ than C,

because I liked some of the
object oriented features

in C++.

Now, C++ is sort of a big beast of a language with a horrible learning curve, but I
appreciate the power of it.

But, honestly, I think the design principles are fairly universal.

You can use them
in any language.

You know, that simple file
system interface for Unix

was done in C with no
object oriented stuff.

And then people would
say, oh, no, actually,

you notice it's actually
object oriented,

because there's a
file descriptor that

gets passed around.

And the object oriented
was really crucial to that.

I say, no, they just found a really sweet interface.

So I haven't found one language that somehow was dramatically

better than others for design.

But if people have opinions, I'd be
curious to hear other opinions about that.

SPEAKER 1: So back to hiring, you

mentioned we should hire on
slope, not on y-intercept.

And I radically agree.

How do I estimate the slope?

JOHN OUTSERHOUT:
How do measure that?

SPEAKER 1: Right?

Especially, like--

JOHN OUTSERHOUT: I have no idea.

SPEAKER 1: --you need at least two points, right?

In an interview, I get only one.
And I am terrified of hiring more tactical tornadoes.

[LAUGHTER]

JOHN OUTSERHOUT: I don't know.

You know, so I'll tell you what correlated best for me, but it's sort of crazy is that I found in my experienced, people who worked out best were the ones where I just really enjoyed my conversation with them during the interview. And that's sort of weird. 

I feel kind of funny saying that, because that means somehow somebody sucked up to me. And I liked them and hired them.

I don't think that's it because I have a pretty sensitive meter for suck-upness.

And that really pisses me off.

And people have also pointed,
if you take that edge, that's

kind of a risk that
you're just hiring

more people like yourself.

And so you're not going
to do diversity very well.

So I have no idea
what to make of that

or whether it's
even a good idea.

But that's the one
thing that seemed

to correlate in my experience.

SPEAKER 1: OK.

Yeah.

So let's thank John
once again now.

[APPLAUSE]



>>>>>>> origin/master:software-design/john-talk-io/John Ousterhout_ _A Philosophy of Software Design_ _ Talks at Google .txt
