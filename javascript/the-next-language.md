the-next-language.md

so I've been thinking a lot about the next language the language which  replaces JavaScript and I believe that  we have to have a next language because  if it turns out that javascript is the  last language that would be really sad  we shouldn't stop there we should find  something better if only for your  children right you don't want your  children writing in JavaScript so what's  the next language is going to look like  and it's not clear it's not clear  because programmers are as emotional and  irrational as normal people now that may  sound really insulting that I'm  comparing you to normal people but it's  true and why do I think that's true well  let me show you my evidence it took a  generation to agree that high level languages were a good idea it used to be that all programs were written in machine language with where you had to enter every single instruction and it was a lot of work and very easy to get things wrong and then Fortran comes along in in Fortran you just write things that look like equations they called it automatic programming at the time the idea was that the computer would write its own programs you just tell it what to do and so it was so much easier and who would benefit from that more than anybody else the programmers and who refused to use it the programmers had a similar thing happening with the go-to Dijkstra writes his letter to the C ACM in 68 suggesting that goto should be eliminated from all languages replaced with while in if-then-else and that starts a bitter argument that goes on for 20 years and I remember that argument it was loud and noisy and crazy people saying you can't take the go-to away from me it's an essential tool it's how I express myself I'm a go-to guy I have a tradition my grandfather used to go to it took a generation to agree that objects were a good idea objects are first discovered in scheme or and I'm sorry in Simula and being one of the most important breakthroughs in programming the world took don't notice of it at all except for one grad student at the University of Utah who thought that this object idea was so powerful he could use it to create a programming language for children and that eventually leads to object-oriented programming in 1980 the were 85 I think the industry had a choice what was going to be the dominant object right a programming language 

it can either be small talk ad which was the best most carefully designed programming language in history or C++ and we chose C++ and that decision was made by people who fundamentally didn't understand what object-oriented programming and they chose C++ because he didn't need to understand what object-oriented programming programming was in order to use it and we were still paying the price for that all of our languages since then have followed the C++ heredity and not the small talk oddity then it took two generations to agree that lambdas were a good idea lambdas were perfected in the scheme language again in the early 70s and world took no notice of it and it took so long to get to the mainstream that some thought it's never going to go to the mainstream because if it were a good thing it would have happened by now but it is happening now anyone know what the first programming language was that brought lambdas to the mainstream any guesses it was JavaScript JavaScript was the first one followed by Ruby and Python and c-sharp and eventually a PHP got it before Java is that embarrassing or what so the reason each of these things take so long is that we don't change minds we have to wait for a generation of programmers to retire or die before we can get critical mass on the next idea I remember when the go-to thing was going on and it was really loud and hot and people are getting really upset and making ridiculous arguments and then one day it was quiet so I are they gone can we get rid of it now yeah we got rid of it and everything was fine that during the argument there are all these complaints about or predictions about bad things that were going to happen almost threats that if you get rid of go to the consequences are going to be terrible 

and we got rid of go-to
and everything has been fine
and in fact the major benefit of getting rid of go-to is that it is easier to write programs of greater complexity that having go-to complexity became overwhelming much earlier that by going structured we could make programs much bigger more sophisticated before the complexity becomes overwhelm so again who benefited from that it was us and who rejected it again it was us

so that's why I think it's going to be a

problem with the next language because

when the next language appears we will

all say no no none of that we don't want

that so looking at languages I would try

to put them into two classes 

# systems languages

systems languages and application languages the

dominant a systems language is something

you'd use to write a kernel or a memory

manager or a device driver and nothing

else everything else should be written

in application languages and we have a

problem with systems languages because

the dominant systems language today is

still C and C comes from the late 60s we

have lost the ability to innovate in

systems languages right I think that's

shocking but I'm more concerned with

application languages because that's

where we live that's where we spend most

of our time so I would take the

application oh and I think every

language should clearly be on one side

of that line or the other I think the

biggest design error in Java was it

couldn't decide if it was a system

language or an application language and

so it tries to have one foot in each

boat and that's a problem one of the

consequences of that is that it requires

the use of threads in applications which

is a really really bad idea

so you can take application languages

and split them into two classes those

that use classical inheritance and those

that use prototypal inheritance the

classical languages are almost all of

the languages and the prototypal

languages are pretty much just

JavaScript and for a long time I was a

big advocate prototypal inheritance

because one of the problems that you get

with the classical stuff is it comes

with a lot more work first off when

you're designing your system you need to

do a classification you have to identify

all of the different types of objects

you're going to have

and those will become your classes and

then you have to work out the taxonomy

you have to figure out what is going to

inherit from what what's going to

implement what what's going to provide

an interface to what and we're doing

that at the stage of the program when we

have the least understanding of how that

should go together usually at the

beginning you know first we have to

design the hierarchy and then we'll

implement it and because it's such a

difficult problem it's inevitable that

we get it wrong and but we go ahead with

this broken taxonomy and we find that

things aren't quite right that program

or classes don't compose the way we

would want them to and that we find we

wish that we had multiple inheritance

because we just can't get stuff to go

together and that whatever is broken in

the bottom layers starts to work its way

into the higher layers as well that

there's leakage and everything gets

broken and eventually gets so bad that

you think you have to refactor which

means that you have to tear everything

apart and try to put it back together

the right way and that's really scary

because it might not ever go back

together and so we don't want to do that

either and people who live in the

Classical School assume that that's just

inevitable all programs have to live

with that that's just a fact of life and

it's not that's a characteristic of

classical programming and that doesn't

happen in prototypal programming because

you don't have the tight coupling that

classes have with extends and so the

program's just compose much better

so with prototypal inheritance we avoid

all of that stuff and there was another

advantage which is memory conservation

so the major advantage to using

object.create instead of object copy to

make instances is that object.create

uses less memory because we can inherit

properties instead of copying properties

and that may have made a lot of sense in

1995 when the language was design

and doesn't make sense anymore Moore's

law has been so incredibly generous on

memory capacity that the old way of

thinking is completely ridiculous now

you all have at least probably several

gigabytes of RAM in your pocket the way

we should think about memory is

completely different but we're still

programming like memory is a very

constrained resource it's not anymore

it's also a source of confusion because

we have own properties and inherited

properties and sometimes they behave the

same and sometimes they don't

anytime you've got things which are kind

of the same but not you have a source of

confusion which can lead to bugs it also

provides for a retroactive heredity

where we can change what something

inherits after it's been constructed

I've not found any good uses for that

but I've seen some very very bad uses

for that it also tends to inhibit

performance that modern JavaScript

engines get speed by making assumptions

about the shape of objects but they have

to be pessimistic about prototype chains

because the prototype chain can change

without notification so I no longer

recommend prototypal inheritance I'm now

an advocate of class free object related

programming

I think class free object Airy

programming is JavaScript's gift to

humanity so this is block scope you all

know block scope is we've we've got two

blocks each defines a variable a or B

and the inner block can see both

variables but the outer block can only

see its own variable so because a block

hides stuff which is a good thing and

all languages even JavaScript now can do

something like that

and the same thing also works for

functions because a function is just a

block with some extra plumbing on it

which allows the block to be executed

somehow in the future

and we've still got this relationship

where we can diagram the variables so

variable a or the green function has

variable a and the yellow function has

access to a and B and so this concept is

called closure talking about sets that

one set closes over the other set and it

took a long time to figure out how to

implement this because of this case what

happens if the inner function survives

the invocation of the outer function for

example if the outer function returns

the inner function the inner function

wants to have access to a but a

disappears when when the green function

returns it turned out that the solution

to that was trivial we just allocate

everything on on a heap instead of on a

stack and let the garbage collector

clean it all up and so that's what

JavaScript does so having this this is

how I recommend making objects in

JavaScript from now on so I've got a

constructor function which will take a

specification object we could take

individual parameters but I'd like

having them all in one object that means

we can use an object literal and that

allows the arguments to come in any

order and if there any that we don't

need we can simply ignore them and if

there are any that are missing we can

easily provide defaults I once wrote a

constructor which had ten arguments and

it was really hard to use because nobody

could remember what order they were in

and after a while we discovered that

nobody ever used the third parameter but

we couldn't take it out because all the

programs if I instead had a

specification object then we could have

gotten rid of that parameter and it

would have been easy and the

specification object could also be a

JSON payload right we could get

something over the network which tells

us constitute an object with these

properties and it'll make it for us so I

will initialize member variables

from the specification object and then I

can call other constructors and take the

functions that they return and copy them

into my own other variables so these are

the other methods that are going to be

available to us and then I create my own

methods and because of closure my own

methods will have access to all the

member variables all the other methods

all of our other methods and the

specification object and we don't use

this and then I list all of the methods

that need to be public and I export them

in and I freeze the object freezing is

really important here because it allows

us to have a high integrity object it

cannot be confused or corrupted the only

way to get access to the member data is

through the methods that gives us highly

reliable objects it's the only way to

get highly reliable objects in this

silly language so this is the way that I

recommend that we be making objects in

the future we don't need this so thank

you and good night

[Applause]

as a thank you for your speech I have

one question about webassembly what do

you think about webassembly

where are you I died oh there you are

most so the thing that the the only

benefit that I see from webassembly is

that some things will go faster and most

things will not go faster because

they're already fast enough so if you

have something that really has to go

really fast in a browser then I guess

it's a good idea but it comes at a

significant cost in other ways and for

most applications I think it's just a

distraction thank you thanks for your

speech it was really amazing I have a

question and both of your talks you

mentioned that generators are not as

good as you might think a lot of users

might think but you didn't mention

actually the reason because like for my

opinion and not only for my opinion it

represented illustrate how our minds

work because our minds doesn't work in

in terms of a synchronously like it's

streamlined instruction so do that then

do that and etc etc so actually Kyle

Simpson in the offer of you don't know

Jess

Sirius also mentioned that it's really

really good feature of year six so I'd

like to know in curious about why do you

think that it's not as good as we might

think first off it's unnecessary in

anything which is unnecessary I think we

should get rid of it because I think a

smaller language is better than a bigger

one but it makes control flow much more

complex it breaks some things that used

to be invariance in the language because

things can go in and out even being

weird State the syntax is really ugly it

looks like it's going to return a

function and it's not returning a

function so it's deceptive and confusing

and it's unnecessary I don't see any

value in it at all and and your argument

about it's the way we think that's the

thing we need to change that we're

talking about a paradigm shift right so

granted the other side of the paradigm

shift will take some hours of experience

but once you've accomplished that then

you'll see that the how we're used to

thinking about things argument is

holding us back it's not helping us go

forward so if you were creating a new

language you would leave only

higher-order functions as a way to

handle a synchrony world in in

JavaScript or whatever language yeah
