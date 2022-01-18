good morning again okay let's get this

started you excited to be here all right

very good

ah before I start my talk I want to

start off with some fun okay so I want

to show you guys the latest toy that we

have back in the office so if you see

right here this is a flying drone that's

remote-controlled this is a this is

actually Karen's drone that's flying I'm

filming this from my drone so we have

two drones actually flying in the office

right there there's Karen right there at

the edge we're trying to do the thing

where we're practicing flying so she's

going to fly around the room and I'm

going to fly so my camera points at her

all the time

lost in the lights there we go it's

coming out there I tell you this is

great fun it's it's really weird to see

people walking through our hallways at

the office and looking up and seeing

what's going on with us but so far

everybody's been very positive no one's

tried to get us kicked out because we're

flying drones but this is this is this

is awesome stuff and you just have great

fun I'm not going to make you watch the

entire video I'm going to skip ahead

here and I'll show you what happens when

your drone runs out of batteries so

there yeah about right here maybe okay

so I'm I'm filming and going around all

of a sudden I get a little bit wobbly

with my drone and there we go okay

lesson watch the battery meter when

you're flying okay, 

so that's the fun part we'll have more fun too, 
but I thought we just start off with that. 

# introduction
hi I'm Jim Wyrick.
I'm with neo.
and I'm here to talk about 'why you should be using Ruby'

now I think so I'm going to I'm going to

try to convince you that Ruby is a cool
language to use and that you should be
using it then and if you're not already.

how many people are here using Ruby?
already ok quite enough. 

how many people here are curious about Ruby and they
aren't using it yet? 

ok quite a number of you 
you are the guys I want to talk to 

I want to tell you about Ruby and get you excited about (maybe) using it. 

now there's a downside to doing talks like this.

and I think us as programmers fall into this trap a lot.
there's features versus benefits and when I talk about features if I talk about Ruby. 

# open ternyata-ganti-judul.md

# 5 stories about some Ruby code
singkatnya:
1. first story: jim switch ke ruby
2. second story: ?
3. third story: ?
4. fourth story: ?
5. fiveth story: ?


## 1. first story: jim switch ke ruby
open story-1.md

## next story lagi....

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

## 5. fiveth story: ?

## our last story
I'm almost out of time.

but we're going to go real fast flying robots as
our last story this ties into the video. 

I put at the front so this is
the AR Drone that you saw flowing this

is in the outdoor mode where it doesn't

have the bumpers on it it has cameras it

has all kinds of sensors that allow it

to do interesting things and the best

part of it is that it talks to you over

Wi-Fi and the entire API is open and you

can see exactly what's going on and

there's a developer guides in PDF than

the entire API so it looks something

like this there's a command stream that

goes to the drone it sends back

navigation data and video data

navigation data looks something like

this you send a text command so it's

trivial to write this in Ruby you have

to send it a sequence number you send it

things like takeoff flags and emergency

landing flags you give it information

like roll and pitch and altitude and and

yaw you send all that information to it

you can send it configuration commands

like set your lights to be this hour do

some particular video targeting and

here's a program written in a library

called Argos it creates a drone object

starts it takes off turns right for five

seconds turns left for five seconds then

hovers and lands turn right for five

seconds to the left for five seconds

hovers and lands here's another one this

will take off and go through a loop go

left and right two times showing you the

code here just so you believe it's

program hit the return there's a

five-second delay I run over the other

side of the office this is me running

right left right left laying a hover and

land the first time I tried programmatic

control of moving sideways I said go

forward one and went room right into a

wall

okay maybe ones not the best let's do

point two so navigation coming back from

the drone is a lot trickier where the

stuff going to the drone is just simple

text commands coming back is actually

binary data it has a fixed length tenor

that's about four I think it's for 32-bit integers have come back at the  header this got variable length options  navigation data and vision detection  data are the two options that I'm  interested in particular and they're  variable lengths and they're packed and  they look like this  this is actually from the structure of  the C code from the API that means to  decode this stuff I've got to do weird  things like unpack it with weird  commands in the unpack command and then  know exactly which array element  references that particular data and then  they have to do like some floating point  D codes on the floating point data that  comes back and it's just weird so I  don't want to do that so I wrote some  code that looks like this this is Ruby  code that looks a lot like the C code  we're just missing we added a semicolon  at the beginning of the name and removed  the atom out of the colon to be getting  the name remove the semicolon and it is  now Ruby code so I can take the header  paste it in my Ruby do minor text  editing on it and now I have something  that allows me to access that data so  this line says unpack it with a capital  V and the name of that data position in  the array is V V bat flying percentage  the battery percentage left  this one says unpack it was V decoded  with the decode float command and then  call that one theta so I can do this  with all the options there here's I'm 
going to skip over this this is not that

important but here's another program that says when this is a callback and this is called whenever the drone sends me a binary data package and it says okay go through the data options and for each option check to see if it is the nav option vision detection so the drone tells me when it sees a particular target in its camera sights and tells me the position in the camera where that is it's about a thousand pixels wide so if we're at five hundred we're on target if we're above six hundred I want to turn right if it's below 400 I want to turn left so we blinked the lights we take off and I'm going there I am holding the outdoor hall and that orange and yellow pattern is what the camera detects too fast there we go okay move slow it can find it it's not real bright okay so there we go and there we go so it's turning and following the pattern we're doing some more stuff with this we're not done with this what I want to do is be able to have it follow me put a hat with that pattern on it and walk down the hall I just have the drone follow me wherever it goes turns out that's a lot trickier than just having it turn and look at you the first time.  I did it I had a bug in my advance you know advance or back up
logic and it zero difficulty a target  like just attacked me so we're going  slow in that part all right so summary.

this is real-time programming.

I have to send that drone come in I'll come in at every 50 milliseconds or so just so it doesn't lose the data stream otherwise it will shut down and hover and land I'm using threads although I want to switch  around to you celluloid and an actor  pattern in the near future there is a  library called r2 that allows you to  talk to multiple robotic type devices  one of them being the drone the another  being like us have you seen the sparrow  robots the round robots that are colored  and just roll around you can control  those with the r2 library so check that  one out  this library I'm using to control the  drone itself is called Argus yeah so again being able to write expressive 
code I could take that C code put it in my Ruby code and exactly map to the exact data that was in that binary data and doggone it this stuff is fun so features and benefits you saw some of the features but the benefits of Ruby that I see it's easy to learn you can be up and running on Ruby really really quickly it's extremely expressive it says what you want to say in your code it's flexible you can write it you can they'll see data structures with it you can get to a working prototype really really fast with it.

it's easy to change and doggone it I think Ruby is fun I'm out of time but I'm jhamora cat Neil thank.


