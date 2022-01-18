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


