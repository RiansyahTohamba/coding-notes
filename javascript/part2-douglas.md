# part 2
I should be

able to use everything which is

sometimes useful and this sounds like a

good argument except it turns out that

everything is sometimes useful humans

are so creative we can find a use for

anything there's nothing so awful or

does

gusting or bad that we can't find a use

for so saying that something is

sometimes useful is saying nothing at

all because you can say that about

literally everything so if your only

argument for using a feature is that

it's sometimes useful you do not even

have an argument I have a right to use

every feature so this sounds important

we're gonna be righteous now I have a

right and we're gonna fight for our

rights and that's we're gonna do that

but if you take this argument to the end

do you have the right to right to crap

yes I have the right what are we

fighting about that it doesn't matter if

you have the right what matters is you

have the responsibility to write good

programs that are free of error

I need the freedom to express myself I'm

a poet and I express my poetry by

leaving out my semicolons I need to

reduce my keystrokes this is an

important one we think that we spend

most of our time power typing you know

you think over the day what did i do

today I was typing I got that that I did

that $1.00 right of writing a program

da-da-da-da-da except that's not

actually how we spend our time we spend

most of our time staring into the abyss

saying my god what have I done

so it's not the keystrokes it's that you

know if we could figure out a way to

spend less time doing that we will be

much much more productive the keystrokes

are irrelevant you could take all the

clean finished code that you produce in

a year in a day you know if all you were

doing was typing in the program did it

did it

I'm not saying it'd be a fun day but in

a day you could type all the program

that you write in the year that raises a

question what are you doing with the

other 99% of your time it's a lot of its

that then it's an insult to suggest that

I would ever make a mistake with a

dangerous feature obviously someone

who's less qualified than me would make

mistakes with that but I am so skilled

that I can do stupid things and it's

gonna work that that's not good there's

a good reason those features were added

to the language now I've been part of

the standards process so I can tell you

for a fact that is not true there are

all sorts of reasons for why things can

get into a standard and the if they

don't have to be good in order for that

to happen so Brendan Eich who's the

brilliant man who invented JavaScript

talks about foot guns a foot gun is a

feature that you use to shoot yourself

in the foot and he unintentionally put a

lot of foot guns into JavaScript and

they're people who think that they're

there to be used so watch this I almost

always miss here we go so the purpose of

a programming language is to aid

programmers in producing error free

programs if you're doing anything else

you're doing it wrong you're misusing it

so we used to think it wasn't possible

to write good programs in JavaScript so

now don't even try just write sloppy

because that's the best you can do that

turned out not to be true that it is not

only possible to write good programs in

JavaScript it is necessary

because of all the badness in the

language you have to bring an

extraordinary amount of discipline to

the writing in this language that means

you really have to write everything well

so there's a lot of confusion about

JavaScript for example it's crazy name

it seems to have the same name as

another language called Java it's it can

it's confusing it's similar to the

confusion between Star Trek and Star

Wars right you've got two

science-fiction franchises that you know

got spaceships and people fighting and

stuff and basically the same name but

the fans know they're really different

right you can't confuse them in Star

Trek you have phasers and photon

torpedoes uniforms dam regulations and

in Star Wars you have lightsabers and

blasters proton torpedoes sand chaos I

hate sand by the way so when you're

working in Java so which language is the

Star Wars language right it's JavaScript

right so when you're working in

JavaScript it gives you a choice

you can either go Jedi where you can go

Jar Jar unfortunately a lot of our

brothers have decided to go Jar Jar so

I've observed two things the fantasy of

infallibility and the futility of Follis

'no stew a titude x' i find the first

one the fantasy of infallibility mostly

in younger guys who think they can write

mad crazy code and it'll work and

they'll just take ridiculous risks just

cuz and then I see the futility of

thoughtlessness mostly in the older guys

we're saying it never works it's never

going to work why even try so two very

different perspectives but they both

lead to the same thing danger driven

development

where you take unnecessary risks and the

coding just to keep it interesting so

one of the things that makes programming

so difficult to manage is the difficulty

in scheduling in order to schedule

software we have to ant figure out what

time a is the time it takes to write the

code and that's difficult because we're

perfectionists you know ask a programmer

how long will that take

you know it's about that make you stroke

standard you know forgetting about all

that other time but even harder than

that is time B time B is a time it takes

to make the code work right now ideally

time B should be zero right you write

the code and it works right and you're

done but that's usually not the case

time B can be greater than time a right

and I've seen cases where time B is

infinite that's what happens when a

project is canceled after code complete

because they could never get it to work

so we don't want to do that if you're

doing anything during time a which

increases time B you're doing it wrong

so we should always take the time to

code well because if the code is written

well it's going to be easier to make it

work and it's critical even if you're

doing something cheap and dirty

something that's only going to run once

it still has to run at least once and

that's gonna be easier to do if you

write it well don't be sloppy so there

are new good parts in es6 you've

probably heard of them all the best one

unfortunately is not available

everywhere yet it's proper tail calls if

the last thing a function does is return

the result of calling the function

either itself or any other function the

compiler is required to instead of

creating a call return sequence it

instead generates a jump so it's

essentially a go-to with parameters and

this can cause a lot of programs to go

much much faster it also enables

something called continuation passing

style which is a form of programming

that was discovered in the functional

programming scheme which would be really

really effective in JavaScript if we had

this feature unfortunately Microsoft and

Google have been very very slow to

implement this so I'm I'm hoping if you

know any of those people tell them to

get on it

we need this this is the most important

feature we got in es6 second would be

the ellipsis operator or the dot dot dot

which can be used in calling sequences

in in parameter position or in argument

position in parameter position it says

take all of the remaining arguments and

pack them together into an array is so

it's a very effective way of dealing

with functions that need to take a

variable number of arguments in in

calling position it will spread the

array out so that each element becomes a

separate argument so this is two

versions of the curry function it

modified so that can take any number of

arguments the first one is the way you

can write it in es6 the second one is

the way you write it in es5 which one

would yet rather have to maintain

anybody six yeah obviously

so I like that that's good it modules we

got modules which was really good

because browsers provide linkage in the

form of global variables and we know

that global variables are evil

so modules give us an alternative to

that unfortunately module I don't like

the way modules turned out they're much

too complicated

I think modules should be simple where a

module can import whatever it needs and

will export one thing it's going to

export a function or an object

containing a bunch of functions and

that's it you want to have the simplest

interface possible if you have a

complicated interface then it's not a

good module module should surround what

they do be really clean and fortunately

there is a clean subset of the module

syntax

recommend using just that and avoiding

all the tricks and weird stuff we have

let in constant the language let is the

new var the difference between let and

var is that var ignored block scope and

let enforces block scope it turns out

you don't need block scope to write good

programs but if that's all the Java guys

know so if if you just have var on the

language they get confused and that's

not good that's not good right when the

Java guys get confused that's that's

trouble so if we have lot in the

language they don't get confused as much

and that's good so I recommend using

that only for that reason and we also

have Const and that that's good to

actually like Const better because it

discourages the use of assignment which

gets us away from mutability which gets

us a little closer to purity which is

mostly a good thing we have some new

syntax called destructuring

unfortunately that can get too wild too

but there is a simple form of it which I

like a lot where in this case we're

gonna create two variables that in other

and we've got an object on the other

side and that will be initialized with

some object dot that and other will be

initialized with some object not other

this doesn't allow us to do anything

that we couldn't do before but there are

some idioms which are much cleaner much

more readable in this form so I'm liking

this we have week maps week maps are

really important week maps are the way

that objects should have worked in

JavaScript JavaScript only allows

strings to be used as keys and objects

but there are times when you really want

an object to be a key in an object and

JavaScript doesn't allow that but week

maps do so we didn't fix objects we

added an

other thing and week maps also work well

with the garbage collector so if you

have an object and the only place that

exists is as a key in a week map then it

will automatically be deleted so there

are certain forms of memory leaks which

are avoided if you use week Maps the

problem with week map is it has the

worst name of any feature of programming

language ever nobody wants to use

something that's weak right but it's

really good I really like weak maps it

allows us to write programs that we

could not write in the language before

we have mega string literals which are

big I'll show you them in a minute first

let's look at a regular expression

anyone guess what this matches of course

not these don't these are terrible it's

really really hard to read regular

expressions but what I can do is I can

wrap the regular expression constructor

with something which takes a string and

deletes all the whitespace from it and

using the new literals I can now write

it like this so this one you can read

right so what this is is it batches all

of the number literals that are in es6

so we have binary literals octal

literals we've always had the hex and

the floating-point so which one would

you rather maintain the top one at the

bottom one I'm thinking the bottom one

yeah so but it's still a really weird

and a nasty notation I wish we had

something better but we don't until we

get something better and I'm not

confident that we ever will every time I

write a regular expression every time I

run it through regular x regular x is

something on the web which will take a

regular expression and show to you as a

railroad diagram so you trace the train

around the tracks and that shows you

what the thing matches and it makes a

lot more sense than that does

what else we got so we added a lot of

bad stuff in in es6 and it was all well

intended and people had good reasons for

why they wanted it but we shouldn't have

done any of it

so proxies were intended to be a

solution to the no such method problem

but it turned out to be way way too

complex generators were completely

unnecessary if you know how to write a

function that returns a function you

don't need generators in fact I think

you should have to understand a function

that returns a function in order to get

a JavaScript license it's we added

iterators don't need them symbols we

don't need them because we have week

maps whatever you could do with symbols

you could do with week maps just don't

need it reflection we don't need and the

fat arrow functions so that was highly

requested by a lot of the functional

guys and their argument was that the

problem with the function expression was

there was too much typing you had to

type a few NZT that's too much to type

but can't do that I said well there's

this new thing called keyboard macros

you know see just it's too much to read

so okay so we put this in but I don't

like it because it looks too much like a

relational operator so it's I think easy

when you're scanning a program to miss

the fact that this is a function so it

looks like it might be a comparison but

anyway what this one is is it's a little

function we don't have to say return

I'll just return a thing so it's going

to take a name and return an object that

contains an ID property of that name so

we made a tiny little constructor so

that's pretty neat except that this is

not going to return a new object it's

going to return undefined so if you look

at the code is it obvious why it returns

undefined it looks like it should yeah

yeah it's we keep doing stuff like that

we'd pick stuff that looks like one

thing and accepted it doesn't work and

you don't get any warning that it

doesn't work it's just dad so for that

reason I recommend it's just not worth

it for for the number of keystrokes you

save given this potential syntactic

hazard I would just rather not use them

which is a shame now by far the worst

new feature in es6 is class this one was

strongly recommended by all the Java

guys who are having to write in

JavaScript now who don't want to have to

learn a new language and so this gives

them the illusion of writing in a

language that they think that they

already know except we didn't really add

classes to JavaScript it's just

syntactic sugar on top of the prototype

stuff which kind of works the same but

kind of doesn't and so there are some

places where your people that can get

surprised because it doesn't work the

way they think it does and whenever you

have that kind of confusion bad stuff

happens but worse than that if your

content in writing in this style you

will never understand how to use

JavaScript as a functional language and

it's so much more fun and pleasant to be

writing in JavaScript in that way the

people using class will never learn that

will never experience it they will go to

their graves never knowing how miserable

they were so in in the good parts I

recommended that you not use new it you

should use object.create instead and I

managed to get object.create

added to es 5 just so that I could use

it so I was pretty happy about that

so that's kind of surprised when I

noticed that I have stopped using

object.create and the reason for that is

that I stopped using this that if you're

not using this then object.create

doesn't really do much for you and the

reason

for that about this is that in 2007 I

did an experiment called ad safe there

were a bunch of projects including fbj s

at Facebook and website at Microsoft and

kaha at Google and my own ad safe

project we're all trying to figure out

how can we make JavaScript

safe so that we could allow a third

party to run in a page and not get out

of hand

stealing stuff and doing bad things and

the problem everyone had to deal with

was if you have a method and you call it

as a method everything's fine

this gets bound to the object of

interest but if you take that same

method and call it as a function this

gets bound to the global object which

gives away all of our security how do

you get around that so the approach of

the other projects took was doing code

rewriting so they would read a

JavaScript program and rewrite it adding

lots of indirection and runtime checking

to make sure that this didn't get out of

hand my approach was much simpler I said

let's make this illegal if we see a

program with this in it

we won't let it run we reject it that's

really simple to implement and it

doesn't make debugging harder and it

doesn't slow down the code which was a

problem with the other systems the

problem was that zero percent of all

existing JavaScript programs would go

through and so it just said well if you

take away this it's still a

turing-complete language so we should

still be able to do everything that we

need to do so to test that hypothesis

and to get an understanding of how

painful was going to be to do this

transition I started writing in a

dialect of JavaScript that didn't have

this in it and I was very surprised to

discover that it didn't get harder it

got easier and my programs got better

because I I was having to do function

stuff and not doing class stuff and

everything was great so I now recommend

everybody stop using this

I stopped using null so javascript has

to bottom values null and undefined and

there's an argument in language design

should you have any bottom values but

nobody thinks you should have two of

them and javascript has two of them and

people are confused when you have two

things which are very similar but not

the same that creates confusion some

people think you can use them

interchangeably but you can't because in

some cases they behave differently and

that difference is a source of confusion

that causes bugs so I decided to get rid

of one of them and the one that I can

get rid of is null because the system

itself uses undefined undefined is the

value of an uninitialized variable or a

missing property and so that's the one

the system uses and that's the one that

I use I stopped relying on false eNOS

you know the faulty values everything is

either true or false II Brendan did that

because of C C is an under typed

language so C uses a single value 0 to

represent null false the end of strings

0 and some other stuff and Brendon

wanted to be able to do the same kind of

stuff when writing in JavaScript and I

now think that that was a mistake

I think Java got this one right that in

a in a condition that value should

better be a boolean it shouldn't be

bullish I don't use for anymore because

in es5 we got these wonderful new array

methods like for each and map and reduce

and all those others so most of the time

you use a for statement it's because you

want to visit each element of an array

and it's much much better to use these

things you don't have to ever do the

plus plus stuff all of that happens

automatically all you deal with is what

you want to happen for each element it's

a much better way of writing programs so

I stopped using for

I don't use for in because I managed to

get object keys added in es5 so it now

returns a nice array of the own

properties of an object so you don't

have to worry about what might get

credit up on the prototype of chain and

then you can take that array and pass it

to for each yeah it's just a much nicer

way to deal with the stuff and when es6

is finally implemented everywhere and

will have proper tail calls and I will

stop doing a while so here are two

versions of the repeat function you pass

repeat function a function and it will

call that function over and over again

until it finally returns undefined the

first one is using while to do that the

second one is using tail recursion to do

it it's returning the result of calling

itself the yes v or es6 pecked requires

that these both run at the same speed

with the same memory pressure so there

is no longer a performance penalty for

using tail recursion and when that

finally becomes available I will be done

with loops I'm going to be writing all

of my repetitive stuff this way forever

# after the next language
so it's only only thing at the feature

we need to to use to handle all us in 20

world right yeah okay thank you

thank you very much first of all for

trolling he has six glasses users but I

haven't yet still what's wrong with the

arrow functions I thought I explained it

they are visually confusing they don't

look like functions they look like

conditions or relations and there is

that syntactic error that they cannot

return objects or it looks like a valid

thing which might not produce a syntax

error but doesn't mean anything like

what you think it means so the the

saving of writing a keyword I don't

think is worth the cost the other

benefit that you get is that the binding

of this is better but I recommend not

using this anyway so there's no

advantage to that thank you

I actually have two questions but they

really short you mentioned about jslint

so I will be interesting what do you

think about prettier which is like it

forces you to write in a certain style

that not everyone might like and it's

hardly configurable but it makes at

least code consistent and second thing

you mentioned about like trying to make

less errors in your code do you think

typescript can be a solution to that or

at least to like what do you think about

introducing types in JavaScript now

typescript is not a solution to that so

the theory about types and it's an

interesting theory is that types allow

the compiler to find a large class of

errors at compile time which is great

but you don't actually get much benefit

from them because you still have to test

right there's no type system which is so

good which you know you don't have to

test anymore because the type system is

taking care of it that's not the case

you still have to test and it turns out

the sorts of bugs of the type system can

find your tests fine instantly so the

bugs that are found are the lowest value

bugs the bugs that keep you up at night

the type system does not help with those

and actually helps to cause those that

the type system doesn't want to write

some kinds of programs that you need to

write and so you have to circumvent the

type system or you have to turn it off

by casting or some other mechanism so

when we account for it

we tend to give the type system the

value of all of the bugs that it found

but we don't subtract the value of the

bugs that it missed and we don't

consider the value of the bugs that it

caused and I think when you take a full

accounting of types that they're just

not worth it

Sonic's a lot yeah thank you

[Applause]

