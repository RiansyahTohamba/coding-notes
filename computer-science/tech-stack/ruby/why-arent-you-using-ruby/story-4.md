
next story we have to have speed up just a little bit beautiful testing or as I like to call this section designed by conference I was at the Ruby hoedown in 2009 do you guys know what a hoedown is do you have hoedowns here in earth way ask kind of a

southern thing in America right it's

kind of a party it's a dance it's a kind

of a you know good time party well the

Ruby hoedown was where we get together

and talk about Ruby and it's a it's a

lightweight conference it was free it's

close to where I live in Ohio and so a

lot of us from edge case we were edge

case of the time we would all pile in about two or three vehicles and we drive down to Nashville Tennessee where the hoedown was being held and we all attend a conference and this is almost kind of like a little mini vacation for us here you can see we're all gab this is at one of the tables there at the hotel it looks like we're in Florida because there's palm this is actually indoors in the hotel is huge huge monsters hotel but during the conference we sat around tables much like this at the back room of the conference area and we kind of talked amongst each other because you know we were kind of laid-back none of us were presenting that year you were just enjoying the conference and someone got up to give a talk on cucumber how many people use cucumber here anybody few I I have a love-hate relationship with cucumber but the thing I love about it is the fact that lays out your testing as given when and then I really really really like that way of specifying my test as these are the things that are given when I do this code then I expect this thing to happen and I would lay out my tests in this format anyways kind of informally but I was really looking for a more formal way of specifying given when then in my tests so I was sit in the back room and I was taking all of all this and I grabbed a notepad and I started writing on the notepad notice how so many ideas this kind of start as scribbling down on a piece of paper 


and I said I started pushing this paper

around the table where we were all

sitting I said does this make sense to

you if I if you saw a test in this

format would you understand what's going

on and the feedback I got was more or

less positive everybody felt that by

looking at something like this you could

kind of tell what was going even knowing

nothing about the given when them

framework you could figure out what was

going on so I would kind of got positive

feedback on this except for my boss

because at that time the test unit

versus many tests versus r-spec versus

something else flame wars were still

going strong and there were so many

testing frameworks for Ruby Joe really

didn't think we needed yet another one

and I assured him no Joe I am NOT going

to actually write this I'm just I'm just
brainstorming on ideas I lied so I wrote
a library called given that was based on

test unit and this is an example from

the github page is still out there don't

go and use it there's something better

than this but this is my first pass at

this and there's a couple things I'd

like to point out about this code first

of all I added the idea of an invariant

and invariant is something that is

always always always true no matter what

you do to this object in this case I'm

saying if you've got a stack object it

is always true that the stack depth is

going to be non-negative it's always true that if the stack depth is zero then empty will be true and if empty is false then the stack depth will be something other than zero these things that are always true about a stack and then I divided up the rest of test into this I said given an empty stack and so given this method so I had initialization or setup procedures by name you had to name that set up procedures in the given statement and then you went through several tests so this is actually three tests right here an empty stack the empty stack you expect the stack to be 0 when you push an item you expect the stack to the depth to be 1 and the top to be that item and when you pop it you should get some kind of failure error now this was ok I kind of liked it but I was a little uncomfortable with it a couple things I didn't like I didn't like this fails with thing this was just pure ugly this exception thing popped up by magic and that was felt weird to me I didn't like the fact I had to say expect expect expect although I was doing this in test unit I didn't have the dot should that our spec uses I might have used that here but I didn't like doing that a whole lot so so it was okay but just not quite what I wanted wanted the next year I was at another conference 

this was Ruby nation this takes place in the in Washington deceived 
the capital of the 


US there and at this conference John Lahr Kowski was giving a talk on pure r-spec now at the time I was a test unit guy I

used test unit to write all my tests and

our spec was okay but I didn't use it

that much but he gave this talk r-spec

pure r-spec

in fact if you want to go see his talk

he's his slides are right there at that

URL and at one point he got to this

slide right here and he says our spec

has this thing called left if you say

let this name be this block left is a

lazy initializer when you call when you

reference that name the first time in a

test it goes out and execute that block

and assigns the value of the block is

the value for that name so here blog

post gets assigned a new blog post every

time it it gets referenced are the first

time it's referenced in a test if you

break this down it's essentially this code that let statement is writing a lazy initializer method that does this well that was kind of cool and I realized also that this really interacts well with our specs block nature you have nested describe and context blocks in our spec and this essentially turns into this where you have a class here the left turns into a method the example is here and so this actually inherits from the outer examples of this version overrides that version so you can internally override decisions you made outside and that works really really nicely with the structure of our spec so I rewrote our spec or we were given to use our spec and it turned out to be something like this and I really really like the way this this reads here we'll go through fairly quickly so given a stack stack new given the initial contents of the sack and I felt Stu being empty the initial contents and we load up the stack with the initial contents here and this given so here these Givens are essentially let's this given here is essentially a before I kept in variant and notice there is no longer and expect or should on that this returns either true or false and our spec given is able to determine what the error is

if it fails and gives you a nice error

message we'll see you in a second here

is an empty stack with initial contents

that the staff does this when you push these things are true when you pop it should have failed so this is much like the test we saw before here's a stack with several items so we override the initial contents to be this the original depth we record and so after you you know you do some pushing you do some popping and these are the things that are true once that's done this reads beautifully this reads like a specification this I love this I love this and just about everyone I showed this to says yeah this is kind of cool they really really really liked it for writing their their specs the nice thing is suppose we change this to be a two so this fails if you do that you get this kind of error message where it tells you we expected one to equal zero and then it breaks down the expression that failed it gives you the stack depth is
one the stack object is this the original depth minus two is zero the original depth itself is two so it breaks down each sub expression in this thing that failed and gives you all the details you need to debug why that thing is failing so beautiful output from a beautiful testing framework so summary sometimes ideas mature slowly there's synergy in things like the nested nature and the given run then of our spec and you get expressive readable tests out of
this. 
