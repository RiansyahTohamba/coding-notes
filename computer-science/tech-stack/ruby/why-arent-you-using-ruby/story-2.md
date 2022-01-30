## story 2: true story
Cerita real ruby saved million dollar from data.


so second story this is a true story
the other one was true too but I just
want to emphasize that this one in particular is true the names have been
changed to protect the innocent guilty those involved.

I was working in a large financial company at the time and this
is soon after I've discovered Ruby.

and I was using Ruby a lot again for my
tooling for the stuff I do every day, 
1. I wrote Ruby scripts to analyze the database 
2. I write Ruby scripts to go into the database and pull out data and show it
to me in a form so I could easily figure
out what was going on in the database

3. I wrote Ruby scripts to talk to their event manager so I could receive events and publish events on their event manager. 


so everything in the environment that we worked with I had Ruby scripts to communicate with.

that and make it easier as my job as a

programmer to do work in that

environment now this particular part of

the company dealt with incoming mail if

you send any kind of mail to this big

multinational financial corporation it

all came through this one room in Hebron

Kentucky and 

they would open up the mail to manage as long as you need a list of items in Perl that's awesome it works great and they would scan it into a scanner

and digitize it that scanner that data

would go into a program that would read

it and it would generate an event for

every item that was

and that event was published and picked

up by the next program in the pipeline

so at this point it's been scanned it's
a form and it's got image data attached
to this event actually the image
restored the database but a reference to the image was put into the event then it would run through a barcode reader that would look at the image and look for barcodes and find data encoded on the form in barcodes and add that to the event and publish it again with this new event then went to the checkbox analyzer and it would look for check boxes on the form and see if this check box was checked or if this check box was not checked and then it would add information about check boxes to the event and it would publish it again and then they would go onto the pipeline there were stages in this pipeline 

that looked for character information did handwriting analysis 
and there was manual verification steps and things but it kept publishing these events on the pipeline till eventually got to the point where it says okay we've collected all the data for this form I'm going to publish this data out to the pension division or to the stock options division or to some other division it was a whole workflow type of thing. 


well for many years how they handled fax data was they would get a fax they would

print out the fax and they would scan it

it that actually worked and surprisingly

but it seemed to be rather inefficient

and scanning a you know a fax is already

scanned and scanning that is just leads

to all kind of dirty images so they

thought they could get better results by

feeding the scan fax data directly into

the feed so the fax data would come into

its own process it would publish an

event and then it would enter the

pipeline just like anything else so

paper email our paper mail was scanned

fax data was scanned and sent in as well

so that's the way that worked I was

sitting at my desk one day 


working hard
on you know kind of heads down on
working of whatever I needed to work on

this was the days before pair programming got popular so I had my own

cubicle right there and I was kind heads

down and I noticed that people were kind

of

wandering around outside my cubicle and

kind of running back and forth and and

the noise levels seem to be a bit little

bit louder and I wondered hmm

something's going on today and I don't

know what that might be but I'm working

here

and finally my manager comes into my

cubicle with another developer he says: 
`Jim you know` 
you know Ruby don't you? 

I said, yeah! 

because I've been kind of evangelizing Ruby to the rest of the group I was the main user of it but there are several other people who saw some of the advantage of Ruby and we're using it as well. 

and they said well this is what happened be part of our process that takes in facts and publishes the event somehow was dropping events I no longer recall the exact technical reason for this failure 



maybe the disk was full or maybe there is a section being thrown.


I don't remember but these faxes were being dropped. 


now you know if I lose a fax you know well how do I use fact I fax order to our restaurant 

if I lose my fax, I don't get my meal that day. 

that's not the case with this company. 

those orders coming in might be changes to pension plans are changes to stocks you know. 

buy the stock, sell that stock. 

and if they don't take action on that order within a certain number of hours 

they are liable for the difference in price 
from the point that they set the fax was sent and the point they actually made the trade this is potentially millions of dollars of data that was falling out of the fax machine and onto the floor. 

this was an emergency so they said.
Jim you know, Ruby can you help us. 

`Jadi ada fitur logging, then what?`
now it turns out that the facts program wrote a pretty complete log of everything it did.

and the log was still being written it
was saying oh except Shinzon we're not  delivering the message but every single  facts element was was recorded in the  log along with the database ID of the  image associated with that fax so what I  had to do was write a ruby script that  would read the log  would reconstruct the event based upon  details in the log pull the database ID  out and put it in an event and republish  that event into the system. 

so essentially I was writing a vacuum sweeper that would sweep up all the broken faxes laying on the floor and put them in.  so this is how I saved the company millions of dollars using Ruby, Ruby hero! 


I asked for a fraction of that million to be included in my bonus and they just laughed.   
I don't, I don't get that. 

and actually truthfully it was a team  effort I was doing the log recovery  someone else was doing some event stuff there were about five or six people all working on this problem. 

the log recovery piece was just a small portion of that. 

but together by using room in it and they knew that Ruby could handle the job.

they knew they could not write this stuff in Java quick enough. 

you know in the half hour that we needed to get this done.

`so here Ruby handles an emergency.`

it's really rapid to get a quick solution up. 
it took me about half an hour to figure out 
	1. how to parse the log file 
	2. and generate those events 

and we saved lots and lots of money with that, all right.

# summary
jim kerja di finansial company.
di kantornya, terdapat sebuah proses, yang terdiri dari:
1. scanner form
2. Bar coder
3. check box

lalu bagaimana ruby dapat membantu?

entah gimana, ruby bisa memberikan solusi secara cepat pada situasi emergensi.

jika diadu, Java tidak akan dapat menyelesaikan masalah fax (pada contoh diatas) secara cepat, secepat ruby dapat menyelesaikan masalah.

dynamic type membantu dalam shot term?
