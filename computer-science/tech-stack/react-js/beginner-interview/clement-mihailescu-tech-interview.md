clement-mihailescu-tech-interview.md


welcome clement to the been a wad

incorporated interview

this is going to be a react interview to

test out your skills

but before we begin on the coding

portion i would just like to quickly ask

you

why you're interested in working have

been incorporated that way we just you

know do a little vibe to see

what kind of person you are so the truth

is that

i was bullied into doing this interview

because uh this person by the name of uh

benjamin a wod wanted to put a washed-up

front-end developer to the test

in front of millions of users on youtube

but so that's why i am here uh i don't

know that sounded kind of like you don't

have any backbone climate we want

employees here to be

strong and independent but let's

hopefully your react skills make up for

this

but uh we're about to find out so what

i'd like you to do first for me here

is i want to start off real easy get you

warmed up here

could you make just a counter for me i

want to see like the number

zero on the right and i want a button

and i can press that button

and it increments the two and then

increments of three and so on

sure okay and the button

for as far as like css goes is it fine

if i'm if i'm just like putting the

stuff on the page without

yep default html elements all good no

styling required whatsoever

the uglier the better yeah okay the

uglier the better

this is my exam this interview just got

like really fun

all right so since they're importing

react

uh like this here i'm just gonna grab

use

state from react like this

and we're gonna keep track of our

counter in a state variable

so we'll say const counter

set counter equals use state and you

said you want the counter to be

initialized to what

zero okay surprise me

okay and then here we are gonna have i

guess we want this to be really ugly

right so

we'll just put this in a p tag p tag

and we'll have our counter uh

perfect you see that zero i do open it

already

and then we'll put a button

um there's no autocomplete here a button

which is going to say i guess like

increase counter

and we'll have an on flick

function and the on click

will be um

will be like i guess i'll make it like

this set counter

to counter plus equal or plus one

let's see so when you when you press the

counter

you set the counter to whatever the

current counter is plus one

so if you increase it it goes up are you

seeing by the way if i'm pressing the

button

are you seeing it go up right now like

i'm at 17

i i think it's we have independent

webview so i can't but i believe you

because i'm pressing it and that's

working great

fantastic okay you have

so you're getting much closer but i've

got to make sure that you know

have some real life skills here and so

what i want to

test out next is hitting an api what i

have here

is a random user api i don't even know

what data it gives back to us because i

haven't used this recently

but what i'd like you to do just so we

can see what data it gives us

is could you fetch this api and then

maybe just display as a string

and react so we can just you know see

what the api gives us here

so let me see yeah is this like a

legitimate website no yeah it's legit if

you if you

if you do a get request it'll give you

json back so i'll tell you that much

for sure okay i mean what the shape of

that json is i didn't bother to look

slash i forgot what it is i see i just i

just went on it and

it looks like it's a json object so i

think for this

the i'm going to use a library called

axios can we import

axios in this we can't yes so i believe

if you just

you know just to import there you you

can it'll just prompt us to import it

and by

other i forgot to mention this but like

feel free to google things

stack overflow if you need to do

anything

yeah so let's see axios

yeah and if it doesn't auto add it i

believe it should auto add it do not

auto add it but uh prompt us on the

right in a second

yeah so axios let's see how we use it

npm install sure so you

you uh require axios and then it says

you do axios.get so like i'm going to

copy paste just

something that i'm seeing on the npm

page

so this is what they do on npm as an

example

um so let's see if we could just do that

uh we would have i'll put a function at

the bottom of my component

but this would probably be like in a

separate file right it would be like in

an api file

but it's fine if i put it here ooh bonus

points for best practices

okay okay i like it but you want me to

actually create another file or

no no stick it here stick it here that's

fine okay cool so we'll we'll create a

function so we'll call it like fetch

random

data and uh we're just gonna hard code

in that it'll be like return

axio so i guess let's copy this

put it at the bottom here

uh should not be commented out

ah let's uncomment this

okay so return axios.get

and this is um we're gonna grab

this i think we can just pass in this

this uh website right i think

just make the gut request like this um

why are they not using es6 functions

here

that's a great question uh for here i

guess

for now we'll just have like um

error do they have the types they don't

have the like function

response any is it fine if i'm just

typing these as

any for now uh in typescript it's

leave it totally up to you whatever you

prefer all right it looks like they're

they're allowing me to do this

um whoops whoa what did i just click

you'll you my eyes were bleeding having

to look at the word function there

glad to see arrows are back

um okay so let's see right now we're

just console logging so this by the way

would return i guess the type isn't is

inferred but it returns like

promise dot any um

and here we would probably want to

return was

um let me just remove this type because

it's infrared

okay so let's have a button that calls

this api let's see if this actually

oh what did i just type i can't i don't

have

default vs code key bindings in here

okay so let me do another button this

will be

that's random data

do i have a place where i can see logs

by the way in here or no

yes if you it should be at the very

bottom of the like uh website on the

right should have console on the left

side

okay cool so let me see if i were to

console.log

in the counter console.log foo

and then i press okay cool but you can't

see my my

logs right nope okay

so on click for fetch random data we're

going to call

that random data let's hope that this

axios thing

actually works thanks brandon

random data

data why is this not why is it squiggly

saturated data was used uh

okay i put this at the top this is why

you would want to

have this in another file um

actually that was weird okay so fetch

random data

let's uh click fetch random data and see

if it actually works

it did work so i've returned data

results

and it's in zero gender female name

objects so i'm getting basically a bunch

of information from some random user it

seems like

and it's not the same info that i was

getting in the other website when i went

on it so i'm assuming it's

generating it every time you set yeah

the actual

the contents the shape should be the

same but the contents are random

yeah and what do you want me to do with

this

uh could you just start by just like

dumping it to this to the screen as like

a string like i want to see the json

just like

spewed all over the browser on the right

just like completely speed

all right so we'll have another state

variable which is gonna be

i suppose uh random user

data json and by the way i am a big fan

of java variable names okay

like very descriptive variable names so

i hope that

i mean we're in typescript so you know

it's it's understandable i suppose

exactly okay so i'll declare this state

variable

as an empty string and here i suppose

that then

um this will return

i guess we can destruct destructure this

res

to the data and we'll return like

json.stringify

data and i'll comment

i guess i'll console.log

the data still and um

then here effects random data

so fetch random data uh this

is a promise ooh should i use should i

use async

await that's a great question

should you and actually do you mind if

instead of instead of

actually should we make it in a button

or should we fetch this on page load

um i'll let you choose either we're

gonna we're gonna do

we're gonna do one of those in a second

but yeah for for now pick whichever one

you want to try out with

okay let's let's do on-page load so i'll

add a use effect

here and we will do a use effect

that only gets called

on the first time so this is very

intuitive

if you pass in an empty array here this

will mimic

like component mount right

um and then what's fired

shots fired man we will call fetch

random

data in here and um

i guess yeah we'll make this async await

so const

random uh data

random data random

yeah let's just call this random data

equals await that's random data

then we will set this here i'll have to

make the function

async in a second um and then

here we will when we don't need this

button anymore so i guess we'll remove

this button

and we'll just have another p tag let's

put another p

tag that has um in it

the random user data or json

i suppose this should be more of a

string and so this is going to be uh

cons

is async does anything go here let's see

what's going on here

uh argument of type uh

unexpected token really the token

unexpected token expected

colon is my weight let me see

uh you know what ben my async await is

feeling a little bit washed up right now

so instead of

doing that i'm going to do

effects uh random data dot

then and then i'm going to set to this

in here and okay it works

we're not gonna catch any errors because

uh

we don't do that here oh our code

doesn't have errors right

yeah exactly uh by the way you're gonna

have to forgive

my typings i feel like maybe we're just

better off like going with like a

scuffed

type script here um yep i love scuff

type script

string void so i guess yeah here we can

put like

or this we're hearing like if you want

if you want to be really fancy

we could put like an error message that

says like

no user data don't get too fancy for us

we're in react here

okay so does this does this look good

yep this looks great and i'm just gonna

just

just make this a pre tag that way we can

see the data all pretty

okay maybe i'll just say like uh null 2

here and does that

yep i don't know if it made it that much

prettier actually

oh fancy if i uh it's like it's a little

bit of an

ugly json but it's it just

i don't i think it's because it's trying

to center it or something i think the

styles thought

i think it's the styles there let me

just kill that

yeah that's what it was all right now

our json's a little bit prettier

all right i just i just wanted to do

that also so i could see what the json

json shape actually was

i will say i'm actually having like kind

of fun doing just like

normal react not like algorithms

not a real product where you're

stressing about building like the best

user experience you're just like

coding this is fun you're just code

react reacts fun you know

this is great and you're doing great so

far we

actually have you've passed 100 so far

my next thing that i'd like you to do

with this data

is you know to actually display the

results as like some ui components

so nothing fancy here i just want to see

like the name of the user

and then also let's do like i believe a

picture is in here yeah if you could

just display like the name of the user

in their picture

okay so let me see so the results

actually was kind of nice to put them

like this that way i don't even need to

look at the

logs um we have the results

and do we have multiple users no we only

have

we only have one looks like right now we

have one but assume for this that

we may possibly have more than one user

in this like results array

okay okay and so you want me to

effectively display

every user name and every user image on

this page

okay so let me think about this

i think we're we're going to want to

store i think our our results

um in a in a state variable for

simplicity

i'll have const uh i'll put just

like user infos set user infos equals

use state this will be an empty array

uh i guess i'll put the type as like any

for now but

this would be like whatever the results

type is

and so then here this random data

uh we will do set

user infos to be

the random data dot results

right let's see why this is squiggly

probably um doesn't oh because we're

json.stringifying so you know what

you know what i'll do instead of

stringifying this data here

i'll put data um and then here

we'll put random data based on that

stringify random data

and then um remove the semicolon

and yeah you don't need to display the

the json anymore if you don't want to

i'm keeping it now just for a second but

then i'll remove it after

okay so we've got our uh results and so

or user infos rather um for now is it

fine if i don't like modularize this or

do you want me to make like another

component to modularize like these

results now don't worry about like

a component thing and all that jazz just

do it though like you find the easiest

way

okay so then under under this button

here

we'll do something like um you know uh

user infos dot uh map

right because we've got an array dot map

we'll have a user info and an idx

and this will return um i guess we can

put yet another

p tag and here this will be something

like

get full user

user name passing in user info

i'll have this get full username

function

here that takes in a user info

and it returns um so we have names it

returns

return user info

actually let's remove this

we'll do const um i hate that it

re-renders automatically as i type

because i can't see so

name then you can't see the json yeah

yeah name

first last okay so we'll do

const name first last

equals user info return

first and last

name and here by the way i'm i'm

i'm assuming that i have creative agency

um

to display this as i want but if you

want me to display this in a different

way

without like the first name first or

whatever we can say no that's chill

okay so get full username user info

um why is this implicitly has any that's

fine

um and then i guess we will put

an image and i i'll wrap this in

these empty uh tags

uh image let me remove the image for a

second actually

so is this actually showing up right now

or no

get full doesn't look like it's showing

up

why is it not showing up give me one

second

dude um

let me add just a key here for semantic

react um

[Music]

oh because i have i have an arrow

function and i don't have a

return

we need another parenthesis does this

look good yeah there

writer cody that is an interesting name

writer koti

writer is a french word

it means side okay so we've got the full

usernames

um yes i don't care that this is

any

in theory in theory uh because this is

an interview i should

be a behave and do this well interface

user info this would have uh we said

what does it have it has

at least a name property and here in

theory we could do interface

user name and this is going to have a

first

a last and a title

whoops okay this is gonna be

a user name and here

i'll just put this here even though this

should be inferred from somewhere higher

up like we should probably

have the random data um define

you know the what the random data looks

like

um okay so why is this

complaining reid cannot read property

results of undefined

why is that undefined

did i mess up something

we're going to tell you there's an error

here on line 44.

so for me it actually has a squiggly on

line 32.

yes i have also the squiggly on on okay

you're both

oh this is this is username user

info oh there okay so this wiggly line

on line 44 was a bug on their part i

think

uh but the bug was that user info is

user info not username

okay so uh we've got this you want me to

put the image tag now

yes okay so the image where do you find

it it's under picture

okay so then here we'll put picture

and user info interface and at the top

here um

oh my god i hate how it recompiles

okay picture large medium thumbnail is

it fine if i go with

thumbnail yeah whatever okay

um so picture we'll put you know

interface user picture this is gonna be

like we'll just put thumbnail for now

string

user picture and so here

it'll be image uh

forgive me if i don't know how to render

an image and react i think this is how

you do it

we'll do user info user info

dot pixel dot

thumbnail right yes it's showing up

i see excellent a picture of someone

all right i'm thinking we do one last

thing

so we have the results and what i'd like

to do

is add a button here to load more

results

kind of like paginate through the list

of users

now i actually don't even know what the

uh the thing for this is so i'm going to

check the api

and then i'll tell you what the actual

url parameters pass in is

so the api if you put this url param

page one page two page three it'll give

you the

next page for the results so if you

could add a new button that's like uh

load more and we can press that button

and what it'll do is it will

you know grab another user and it will

display them

okay and do we want to display all the

can like do we want to just append to

the users that we're displaying or do we

want to just display the next one okay a

pen

yep okay so then

fetch random data will likely take in a

page

so it'll take in a page number which is

going to be a number

and um we could probably default this to

zero it does it start at page zero or

page one um i think it starts at page

one

classic classic non-zero index

i'm just taking a guess though but uh

yeah

okay so uh what i'm doing here and by

the way i'm kind of

you know working off the cuff here so

maybe maybe there would be a prettier

way of doing this but i'm just going to

add a pagination

token or number here to this method

we'll default it to one

so right now our initial call is still

calling the first page right

but if we pass in another and it would

pass in we can still call this with

another number

so we're gonna have um

our get method here that adds in

the query param so this is going to be

page equals

um whoops what am i doing

api slash page equals

page number right

okay so this seems to still be working

with page number one

and so you want us to

append stuff on this

new button that is going to call the

next page so that means that we need to

know what the next page token

i'm assuming this returns a next page

token does it yeah it returns

info page one so we can

presume that the next page is page two

and we can presume that there are like

an infinite amount of pages

yes okay

so um

we had user info uh

user infos where it was here i guess

i'll have like another

state variable whoops another state

variable that's going to be like

next page um so

const use or sorry next page

token i'm so used to google apis where

we always do next base token we'll do

next page number set next page

number equals use state uh the next page

number is going to be

one at the beginning and we can actually

uh if we want to be more explicit here

we can always do fetch random data with

the next page number

so we don't even need to make this

default to one

and then set next page number

so here we'll set pit next page number

to

random data and

i can't type random data dot

info dot page plus one

right um that's looking good so far

but it is erroring out random data not

date

okay and here again i sort of defined

the interface of random data somewhere

but

let's just go with this for now okay so

uh set next page number and so here we

will have

a button under increase counter maybe by

the way let me

let me comment out the json um so button

under

increase counter i don't have my vs go

to keybinding that's totally fine

because i am an adaptive software

engineer who can adapt to a new id

on the spot um okay

so what you're gonna do this button is

gonna be

uh fetch next user let's call it that

and it'll set i'm sorry it'll set

um so let's see here we're going to want

to clean this

up a little bit so

at the very beginning we

are going to have a function here um

i'll write it here which is

const fetch new fetch

next users okay um

and what it'll do is it'll do what we

call here in this use effect

and we'll we'll call it in the use

effect so here i'll have like

that's next but instead of

instead of setting the results it'll say

const new results

new results equals

your new user infos new user infos

equals and we'll take in the existing

user infos

right and then we'll take in the

random data dot results

and this

will be then set here

okay so that way we can just reuse this

uh function all the time

let me remove this this thing for now

we'll comment this out

um so fetch next user so here the very

beginning we would be fetching

the next user uh one or sorry we would

fax next page number

here like this right so this would be

um oh we don't even need that okay we

just do this

although we would maybe make it more

functional like i prefer more functional

but

i don't think this matters right now

okay that's next user

um and then whoa why am i getting a

bunch of users right now

um i must have

try it try refreshing the page

if you want to start because it's hot

reloading on you

oh oh it was already adding them okay

yeah i'm seeing only one now

vicente morales okay so then

on our button fastnext user we're gonna

do on click and we can legit just call

that next user and i think it's gonna

work

oh it's beautiful it's working

it is i uh although i i did get

oh i i think i hit the last page oh look

we can be

look look we can be even better we can

say

we can say if random data

if random data equals undefined and we

just return

that way now i can spam this button and

i never break

the page

so this is fantastic i have like

a little bonus for you because on line

59

i don't know if you noticed there's a

little bit of a linting question for you

there

how would you go about uh satisfying the

linter there

so it's funny i just saw it and i was

wondering i hadn't

hovered over it but i was wondering why

is it linting because i've never had a

lint on an empty arena

use effect before react hook use effect

is a missing dependency effects

next user either include it or remove

the dependency array

that's next user okay so

if you're if you're asking me how i

could like remove the

the lint i think you can you know i

could

[Laughter]

that's fun i don't do this

oh wait why is ts ignore this isn't it

oh it's eslint

um so i could do the equivalent for

eslint if there is an equivalent

but i'm not sure what it's telling me

is it that um is it that

yeah what is it i'm not sure what it's

telling me so you want me to look this

up or

no i can't i can give you a hint here so

what it's saying is you're using

fetchnextuser here right and that's a

variable yep

and this variable could change and so

that means the reference could change

you know some things could get messed up

you could have problems with

closures and functions and so what's

asking you to do

is stick everything that you're using

here

and so what will happen is every time

that um

fetch next user is changed it's going to

rerun the effect

right yeah but why would i why would i

want that though

um well okay so why why you want that is

i'd have to think

like where the cases comes up but

basically

fetch next user is is captured basically

on mount and it's never being updated

so in this case it doesn't really matter

because you only want to run on mount

right

yeah yeah but basically fetch next user

could change

and that's what it's called but yeah

because because like look i could

that's weird though because i could do

this like if you wanted if you want to

do something fancy like if you refresh

them

the side thing right we could do like

use effect

and when the counter changes let me grab

this

boom and when the counter when our

counter changes

i still have to refresh when our counter

changes

then if we increase the counter you see

how it fetches and basically we don't

even need the that's next user button

i'm still getting here the same because

it's still gonna want it yeah it's still

gonna want this because it's inside of

here

so it's react wants you to put

everything that you're

that you're using inside of there or as

a dependency but now

now what's it saying on the on the

actual effects next user function

it's it's like linting a ton of stuff so

like if you add

this is this is one way you can do it

it's i guess you'd say slightly jank

but you could create like a ref to the

function so i could create

this like use ref yep

yeah and we have to import that

and then here you could say dot current

is equal to that and then you could you

could call that here

but to be honest with you maybe maybe

someone in the comments can let us know

you could probably just ignore the

linter on this one because i think it i

think it's going to work fine with

without that one

but usually jan always tells me never

ignore it the linter for that so this is

how i would get around it if i was

if i wanted to like listen to the linter

is i just turn into a ref

and then i can do it because like i've

never seen this

length of this winter error before like

we don't i've never

i've never i've never done it this time

in their code base they need their

eslint turned on this is a standard for

hooks

so so you gotta do like uh if if five

right return true

sure that should stop you from doing

that

right because this hook comes after it

you have you gotten this before

well you i think this we get

but this isn't is this yes length as

well

here or is this even just typescript

telling you that you're not called i

think if it's a react

hooks rules of hook uh lint-free there

um

i see yeah that's good to add if it's

not in your

guys's code base because it'll catch

some stuff but i mean as

as you saw some stuff you okay for the

most part you should be you should be

listening to that plant roll usually

that lint rolls

i'll have to talk to to our front-end

dev who's

who watches all your videos anyway so

he'll probably be watching this and

he probably for all i know i gave you

like i told you something incorrect and

we do have it in our code base or

something like sorry my cat

is next to i guess we'll find out

um you're you're not as washed up as i

thought you were going to be you you

you you went you went through it like

very smoothly i thought we were going to

have more bumps

i would i would have i would have made

it harder i would have made it harder

than this if uh

i knew you couldn't do this so smoothly

you impressed me i passed

you i passed the like for sure the like

basic basic ben awad test but maybe not

the like elite

than a one well here's the thing though

like every every website you're gonna

display a list that you fed from an api

and have

pagination so like you showed me you've

done that that's like a you know that's

literally like most of web dev anyway so

yeah but yeah on some websites you have

to actually allow users to like type

their code and run their code and change

like programming languages next time

you're going to implement authentication

for us

okay oh no please please don't make me

work with like

auth apis but okay ben if i can say one

final word to your viewers

first of all i hope that we entertained

you and if you enjoyed this video then

let us know in the comments below

because maybe we should do like

a second version of this we can do a

second version of the video that we did

on my channel

um that might be fun yes so if you have

not already

go check out columbus channel there's a

second half of this video

where he interviews me and let's just

say

i did surprisingly bad or surprisingly

good

on the algo test i'll let you guys see

you guys are

yeah i did though

you

