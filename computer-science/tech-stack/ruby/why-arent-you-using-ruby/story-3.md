next story I love this picture this is actually at the Breedlove guitar Factory
in Bend Oregon and the gal here is actually working on the fretboard of a guitar she's playing in the grooves and putting in the frets for a guitar that will be made there I have a Breedlove guitar so when I took tour of the factory.

I just took all kinds of pictures.

I love I love this stuff but what I want to concentrate on is that we as developers love to make things love to build things I was working on a project with a friend of mine we were actually pairing and we were working on getting a build script up and running and working and we were doing and we were it was for Java but we were old hat developers back in those days we this ant thing was kind of newfangled for us so we were still using make at the time and we were trying to do make trying to get make to do something that was just a little bit too dynamic for make we were shelling out to Ock and scripting stuff and doing all kinds of weird things I think I look like this by the time I was done I turned around to Ryan I said Ryan wouldn't it be great if make were written in Ruby and Ryan says Jim that's an awesome idea I have no idea what you mean so I turned around to the whiteboard and I scribbled on the whiteboard something that looked approximately like this I said Ryan you would you would have a task command and this task command takes a name of some kind of task you want to perform and then you just give it a block of stuff you wish to execute when this task is performed and somehow you would manage dependencies and do that and and you would just use this like you use make but it'd be all written in Ruby it'd be totally dynamic this problem that we're trying to solve would be trivial to do in Ruby and he says that's brilliant and we talked about it for another five minutes but then we realized no we really really wanted to do this what would we have to do well we would have to reproduce the 
entire functionality of make in Ruby

just so we can get it a little bit more.
dynamic and we laughed at the idea that's silly no one would ever ever want to do that only an idiot so Ryan went back to his desk and he left me sitting there thinking and I began to think well gosh how hard could it really be I mean if I did a really trivial implementation of make in Ruby thought what I have to do he imagine you have this setup let's set up a sample make make like problem you have a task called make mac and cheese and in order to make mac and cheese you need to boil water you need to buy cheese you need to buy the pasta for the macaroni before you can buy either pasta or macaroni you have to go to the store and these tasks have to be all be performed in the proper order

because you don't want to start boiling

the water before you go to the store

that would be silly so you need to have

some kind of dependency structure

between these tasks and you need to be

able to say hey go and do this so you

might create a structure that looks like
this  declare a task give it a list of  dependencies and these dependencies are  exactly the dependencies I've drawn out  here with the green arrows make mac and  cheese boil water buy pasta buy cheese  go to store five different tasks with  all their dependencies declared and if  you're familiar with rate this is very  very very similar to what rake looks  like today just a few syntactical  differences just to make it easy that's  what we're going to do now is we're  going to write rate  you think I'm joking so here there is  our task file I have it all ready to go  so there's all our tasks let's open up  the micro rake file and you can see it's  empty and what I want to be able to do  is be able say Ruby micro rake and give  it the Mac oh no excuse me make mac and  cheese command and run that and we'll 
run all the tasks now you see it does

nothing here because our micro rake file

is empty so let's see what we need to

write to make this to work I'm going to

start with the last thing we do and work

backwards in the file so we need to be

able to grab this command name right
here this make mac and cheese from the
command line and try to invoke the task

to fix that so I'm going to say our V 
each do for each argument in our  argument list we need to find the task  so let's assume we have a global hash  call tasks we look up the task in there  we invoke the task then we end so there  that's that's the end of our program so  what becomes before that what we need I  said I had a global task hash here so  let's create that and let's define a  task method it takes a name a thank you  in  we're just going to turn off Wi-Fi here that is way too tempting for people takes the name it takes dependencies and  it takes a block and in there we're  going to create a task object new and  pass it the name the dependencies and  the block into that that will create a  task object now I need to save it  somewhere so let's take our tasks hash  and save it by its name just like that  but what I wrote you twice oh oh thank  you this is why we pair this is like  super pairing or something okay so let's  create our cask  thing here and I'll need a constructor  takes the name the dependencies and the  action block and just stores them off  I'm going to want to have a method called execute and execute is very simple it just takes the action and calls.   it because action is just a block and it's going to it's an anonymous function I'm just going to call it like that and now I need to write invoke  voc's a little more tricky let's see a  task should never execute twice so if  it's already run lets you know you 
invoke it it's already run we're done we have to can return immediately so we return if already yeah there we go already run so if we get this far that means it hasn't run yet we have to make sure all our dependencies are invoked so depths each do depth and I would like to say DEP invoke but that's not quite right because depth is the dependencies are names so I have to look them first.  so I have to look them up in the
tasks hash like that fortunately I have that available and after all my dependencies are invoked I can go ahead and just execute our current task and mark it as already run cool we're almost done the only thing we need to do is right here we just need to require the tasks file like that 28 lines of code let's see how close I got a hard right i sat down at my desk and I thought about this I said this is easy actually I need a list of dependencies I need to iterate through them I need to evoke them recursively and that's really all there is so I took about half an hour I did this in about three minutes took me about half an hour the first time I did this and I sat down and emailed it to Ryan and then I really over - Ryan's desk I said check your email check your email check your email and he pulled it up and there it was and I think it was I think I had about 50 lines in my first implementation there was 50 lines all of you know the basic core logic of rape right there and and Ryan glowed over it he we were all and sincerely cool and then I go but yeah but it's not really make because make will check timestamps
on the files and only rebuild files if
they're out of date with respect to their dependencies and this was more like ant which just does tasks regularly I thought yeah that file that file testing thing that'd be hard no one would ever do that I went back to my desk and about 20 minutes later a subclass task as a file task added a check in there to see if it was out of date was response with respect to its dependencies and I had a file task of singing there so whizzed in under an hour's worth of coding I had the first version of rake out there and running now of course there's a lot more and rake today there's file lists there's there's all the shell commands that work there's a lot of little things that help you get rake like stuff done. 
but this is the core and this is it and it's all in 28 lines of code right there friend of

mine who was started using Ruby because

of my great enthusiasm for it he said  yeah Jim I was I tried to solve a  problem in Ruby the other day and I just  started writing code and I was done  before I realized it it's kind of how it  works Ruby is so good at expressing what  you as a programmer want to express it  really matches the way I think very  closely okay whoops that's skip I got  the code in there too so 28 lines of  code about half an hour of efforts you  got the basic core engine in there and  what we didn't do was file tasks this  was awesome this just goes to show that Ruby is really good at expressing and capturing ideas very quickly. 
