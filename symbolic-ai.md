symbolic-ai crash course
# indikasi kecerdasan pada suatu sistem
intervensi dari programmer yang rendah wkwkw
ditandai dengan tidak banyaknya rule
bisa infer untuk kasus baru

# Background
sy coba pelajari symbolic AI
https://www.youtube.com/watch?v=WHCo4m2VOws
coba pelajari text nya dulu, jadi tau big picture dari kuliah ini
downsub.com
~~~
binary vs nominal vs ordinal 
ini AI juga wkwkw
if(nama = ''){
	doSomething
}
~~~
# olah simbol
hapalan vs cerdas
hapalan 1+1 = 2
sy tanya 1 + 2 = ?, jika sistem bisa jawab 3 maka sistemnya cerdas
addition dilakukan karena dia mengenali simbol '+'

simbol + dikenali oleh parser 
parser ini lah yang cerdas tapi hapalan juga sih wkwk
simbol 1,2 atau \d 
a..z atau [a-z].

## simbol digunakan subtitusi
+ berarti tambah atau addition
> berarti lebih dari
etc



# komparasi language
## In an imperative language
~~~
list procedure cat(list a, list b)
{
	list t = list u = copylist(a);
	while (t.tail != nil) t = t.tail;
	t.tail = b;
	return u;
}
~~~
this style most of used by programmer
we tell the computer what to do by programming the procedure by which program states and variables are modified.

**there are procedures**

## In a functional language 
cat(a,b) ≡
if b = nil then a
else cons(head(a),
cat(tail(a),b))

## In a declarative language
cat([], Z, Z).
cat([H|T], L, [H|Z]) :- cat(T, L, Z).

# content crashcourse
Back in 1959, three AI pioneers set out to
build a computer program that simulated how a human thinks to solve problems.

Allen Newell was a psychologist who was interested in simulating how humans think, and Herbert Simon was an economist, who later won the Nobel prize for showing that humans aren’t all that good at thinking.

They teamed up with Cliff Shaw, who was a programmer at the RAND corporation, to build a program called the General Problem Solver.

To keep things simple, Newell, Simon, and Shaw decided it was best to think about the content of a problem separately from the problem-solving technique.

And that’s a really important insight.

For example, my brain would use the same basic
reasoning strategies to plan the best route

to work, school, or wherever I need to go,
no matter where I start.

Computers are logical machines that use math to do calculations, so logic was an obvious choice for the General Problem Solver’s problem-solving technique.

Representing the problem itself was less straightforward. 

But Newell, Simon, and Shaw wanted to simulate humans, and human brains are really good at recognizing objects in the world around us.

So in a computer program, they represented
real-world objects as symbols.

That’s where the term Symbolic AI comes from, and it’s how certain AI systems make decisions, generate plans, and appear to “think.”

sistem cerdasnya adalah CPU nya
dibantu compiler yang menerjemahkan bahasanya ke level of CPU.
jadi yang cerdas siapa?
kalau imperative yang cerdas adalah programmernya dibantu ingatan dari DB
makanya dikaji lagi kecerdasan itu apa?
kalau cuman hapalan, DB juga bisa.
tapi membuat abstraksi dan relasi antar data juga dibutuhkan kecerdasan, nah progremmer to the rescue.

pada logical programming/declarative, yang cerdas adalah

# symbolic AI 

## caranya?
programmer menuliskan rule propositional logic
nah apakah declarative atau imperative?
jawabannya declarative karena
User provided facts and relationships allow it to derive answers via logical inference.
user cukup menuliskan relasi antar premis
compiler will do inference
-----

If you’ve ever applied for a credit card, purchased auto insurance, or played a computer game newer than something like PacMan, then you’ve interacted with an AI system that uses Symbolic AI.

Modern neural networks train a model on lots of data and predict answers using best guesses and probabilities.

But Symbolic AI, or “good old-fashioned AI” as it’s sometimes called, is hugely different.
# no data driven
rule didapatkan dari kerjasama 
domain expert + programmer/translator

Symbolic AI requires no training, no massive amounts of data, and no guesswork.

It represents problems using symbols and then uses logic to search for solutions, so all we have to do is represent the entire universe we care about as symbols in a computer
...
no big deal.

To recap, logic is our problem-solving technique and symbols are how we’re going to represent the problem in a computer.
# what is Symbols ? 
Symbols can be anything in the universe: numbers, letters, words, bagels, donuts, toasters, John-Green-bots, or Jabrils.

One way we can visualize this is by writing
symbols surrounded by parentheses, like (donut) or (Jabril).

# syntax FOL
## adjective or verbs
A relation can be an adjective that describes a symbol, and we write it in front of the symbol that’s in parentheses.

So, for example, if we wanted to represent
a chocolate donut, we can write that as chocolate(donut).

Relations can also be verbs that describe
how symbols interact with other symbols.

So, for example, I can eat a donut, which
we would write as eat(Jabril, donut) because

the relation describes how one symbol is related to the other.

Or we could represent John-Green-bot’s relation to me, using sidekick(John-Green-bot, Jabril).

A symbol can be part of lots of relations
depending what we want our AI system to do,

so we can write others like is(John-Green-bot, robot) or wears(John-Green-bot, polo).

All of our examples in this video will include a max of two symbols for simplicity, but you can have any number of symbols described by 'one relation'.

# cara mengingat symbols vs relation
A simple way to remember the difference between symbols and relations is to think of symbols as nouns and relations as adjectives or verbs that describe how symbols play nicely together.

This way of thinking about symbols and their
relations lets us capture pieces of our universe in a way that computers can understand.

And then they can use their superior logic
powers to help us solve problems.

The collection of all true things about our
universe is called a knowledge base, and we can use logic to carefully examine our knowledge bases in order to answer questions and discover

new things with AI.

This is basically how Siri works.

Siri maintains a huge knowledge base of symbols, 
so when we ask her a question, she recognizes the nouns and verbs, turns the nouns into symbols and verbs into relations, and then looks for them in the knowledge base.

Let’s try an example of converting a sentence
into symbols and relations, and using logic to solve questions.

Let’s say that “John-Green-bot drives
a smelly, old, car.”

I could represent this statement in a computer
with the symbols John-Green-bot and car, and

the relations drives, smelly, and old.

Using logical connectives like AND and OR,
we can combine these symbols to make sentences called propositions.

And then, we can use a computer to figure
out whether these propositions are true or

not using the rules of propositional logic
and a tool called a truth table.

Propositional logic is basically a fancy name
for Boolean Logic, which we covered in episode

3 of Crash Course Computer Science.

And the truth table helps us decide what’s
true and what’s not.

So, in this example, if the car is actually
smelly, and actually old, and if John-Green-bot actually drives the car... then the proposition,
“Smelly car AND old car AND John-Green-bot drives the car.” is true.

We can understand that sort of logic with
our brains: 
if all three things are true,
then the whole proposition is true.

But for an AI to understand that, it needs
to use some math.

With a computer, we can think of a false relation as 0 and true relations as any number that’s

not 0.

We can also think of ANDs as multiplication
and ORs as addition.

But let’s look at what happens to the math
if the car is not actually old.

Again, our brains might be able to jump to
the conclusion that if one of the three things

isn’t true, then the whole proposition must
be false.

But to do the math like an AI would, we can
translate this proposition as true times false

times true, which is 1 times 0 times 1.

That equals 0, which means the whole proposition is false.

So that’s the basics of how to solve propositions that involve AND.

But what if we want to know if John-Green-bot drives a car and that the car is either smelly

OR old?

Like I mentioned earlier, OR can be translated as addition.

So, using our math rules, we can fill out
this new, bigger truth table.

The proposition we’re dealing with now is
“Smelly car OR old car AND John-Green-bot

drives the car.”

For the first row, this translates as (true
plus true), then that result times true, which

we calculate as (1 plus 1) times 1.

That equals 2 times 1, which is 2, which means
the whole proposition is true!

Remember, any answer that isn’t 0 is true.

The second row translates as (true plus false), then that result times true, which we calculate

as (1 plus 0) times 1.

That equals 1 times 1, which is 1, which means
the whole proposition is true again.

And we can fill out the rest of the truth
table the same way!

Another logical connective besides AND and
OR, is NOT, which switches true things to

false and false things to true.

And there are a handful of other logical connectives
that are based on ANDs, ORs, and NOTs.

One of the most important ones is called implication,
which connects two different propositions.

Basically, what it means is that IF the left
proposition is true, 
THEN the right proposition must also be true.

Implications are also called if/then statements.

We make thousands of tiny if/then decisions
every hour (like, for example, IF tired THEN

take nap or IF hungry THEN eat snacks).

And modern Symbolic AI systems can simulate
billions of if/then statements every second!

To understand implications, how about we use
a new example: IF I’m cold THEN I wear a

jacket.

This is saying that if I’m definitely cold
then I must be wearing my jacket, but if I’m

not cold, I can wear whatever I want.

So if cold is true and jacket is true, both
sides of the implication are true.

Even if I’m not cold and I wear my jacket,
then the statement still holds up.

Same if it I’m not cold and I decide to
not wear my jacket.

I can do whatever since I’m not cold.

BUT if I am cold and I decide not to wear
my jacket, then the statement no longer works.

The implication is false.

Simply put, An implication is true if the
THEN-side is true or the IF-side is false.
TODO langsung loncat ke menit ini,
menit berapa nih?
08:20
# build Knowledge Base
Knowledge Base tidak lain hanyalah kumpulan rules

Using the basic rules of propositional logic,
we can start building a knowledge base of

all of the propositions that are true about our universe.

After that knowledge base is built, we can
use Symbolic AI to answer questions and discover

new things!

So, for example, if I were to help John-Green-bot start building a knowledge base, 

I’d tell him a bunch of true propositions.

Oh John Green Bot?

# uji batas kemampuan BOT
Alright, you ready John Green Bot?

Jabril is a person.

John-Green-bot is a machine.

Car is a machine.

Car is old.

Car is smelly.

John Green Bot is not person.

Jabril isn't machine.

Toaster is a machine.
You getting all this John Green Bot?
# ternyata ...
Clearly, at this pace, John-Green-bot would never be able to build a knowledge base with all the possible relations and symbols that exist in the universe.

There are just too many.

# Computer good at solving logic problems
Fortunately, computers are really good at solving logic problems.

##cara kerjanya
pull with propositions
then programm fit from knowledge base

So if we populate a knowledge base with some
propositions, then a program can find new propositions that fit with the logic of the knowledge base without humans telling it every single one.

# inference
This process of coming up with new propositions
and checking whether they fit with the logic of a knowledge base is called inference.

For example, the knowledge base of a grocery
store might have a proposition that sandwich

implies Between(Meat, Bread), or 
“IF sandwich THEN between(meat, bread)”.

# Noun Phrase == argument == symbol
Meat and Bread are the symbols, and Between
is the relation that defines them.

So basically, this proposition is defining
a sandwich as a symbol with meat between bread.

Simple enough.

There might be other rules in the grocery
knowledge base.

Like, for example, a hotdog also implies 
Between(Meat, Bread), or “IF hotdog THEN between(meat,bread).”

Now, if the grocery store is having a sale
on sandwiches, should the hot dogs also be

on sale?

Well, with inference, the grocery store’s
AI system can apply the following logic: because
# between(meat,bread)
sandwiches and hotdogs are both symbols that
imply meat between bread, then hot dogs are

inferred to be sandwiches, and the discount
applies!

Over the years, we’ve created knowledge
bases for grocery stores, banks, insurance companies, and other industries to make important decisions.

These AI systems are called expert systems,
because they basically replace an expert like an insurance agent or a loan officer.

# NN vs Symbolic
Symbolic AI expert systems have some advantages over other types of AI that we’ve talked about, like neural networks.

## 1. easy define adn re-define
First, a human expert can easily define and redefine the propositional logic in an expert system.

If a bank wants to give out more loans, for example, then they can change propositions involving credit score or account balance rules in their AI’s knowledge base.

If a grocery store decides that they don’t
want to discount hotdogs during the sandwich-sale, then they might redefine what it means to be a sandwich or a hotdog.

Hey Siri, is a hotdog a sandwich?

Siri: Of course not Jabril.

Do not waste my time with foolish questions.

#2. ga ada training, trial and error
Second, expert systems make conclusions based
on logic and reason, not just trial-and-error guesses like a neural network.
#3. bisa ditunjukan kenapa hasilnya demikian
And third, an expert system can explain its
decisions by showing which parts were evaluated as true or false.

A Symbolic AI can show a doctor why it chose
one diagnosis over another or explain why an auto loan was denied.

## blackbox == hidden layers = AI
The hidden layers in a neural networks just
can’t do that… at least, not yet.

This, so-called, “good old-fashioned AI” has been really helpful in situations where the rules are obvious and can be explicitly entered as symbols into a knowledge base.

# drawback of symbols
But this isn’t always as easy as it sounds.
## image recognizes
How would you describe a hand-drawn number
2 as symbols in a number knowledge base?

It’s not that easy.
## data is fuzzy
Plus, lots of scenarios are not just true
or false, the real world is fuzzy and uncertain.

As we grow up, our brains learn intuition
about these fuzzy things, and this kind of human-intuition is difficult or maybe impossible to program with symbols and propositional logic.

Finally, the universe is more than just a
collection of symbols.

The universe has time, and over time, facts
change and actions have consequences.

So, next time we’ll talk about these actions
and consequences, and how robots use Symbolic AI to plan out their jobs and interact with the world.

Until then, I’m gonna finish this sandwich.
[eats hot dog].


# crashcourse - AI - NLP juga ada, kontennya
1. linguistic x AI
2. ambiguitas
3. RNN pada NLP
4. tujuan NLP

