extend from downsub.com
DATA COLLECTION
#summary ku
## See you reality

kamu mungkin saja punya ide yang menarik, kamu punya RQ yang ingin dipecahkan, tapi pertimbangkan juga realita mu! apakah kamu punya akses ke environment yang mendukung Research Question mu?
a. jika kamu ingin mengetahui bagaimana experts bekerja, apakah kamu punya akses ke experts tersebut untuk memulai survey atau questionnaire? Lihatlah bagaimana Victor Basili punya akses ke NASA atau miryung kim yang menjadi Visiting Professor di Microsoft RnD di Readmond.
b. 

## Three degree technique
### first degree technique : involve human
semakin intensive involve human, semakin lower reliability
### second degree technique : 
### Third degree technique :
1. Log/Mining Repository : Change request, 
2. Document Analysis
3. Static and Dynamic Analysis of a System (Software Analytics)


# intro
if we have seen the different types of data and what what you have to remember basically about the different type of data is just that you can have quantitative and qualitative data and you can have different different level let's say of power of the of the measurements that you can make on this data so you can do in the end this power corresponds to different different mathematical operation that you can do on the data that you collect and of course different statistic analyzes that are allowed that are allowed on this data now we see which are the typical data collection techniques in software engineering you would see that there is a long list okay as it's written here before measuring the data you need to collect them okay and you need to collect them in a way that is relevant for your research question that's 

why I am I started in last lecture from research questions okay? 

because anytime you search for some data it has to be linked to the research question okay the data collection technique is of course guided by by the research question but it can also be guided by your specific context because you you may have a curiosity for research for a certain research but you may not be able to access the environment the relevant environment to gather the data that are needed for you so you have to consider also your your context your reality so are you in contact with a company and you can interview people directly in the company so you can take some time from this company from the employees then it is good to interview to interview them so you can select the method the data collection 

method of interview because you know you know that you can ask employees and developers for that time in another case you may be in contact with a company and you are able so to take some time in which you you gather more more subjects or together consider that this is very difficult okay because even if you you are a researcher or a student you get in contact with with some with some industry with some software industry it's very difficult actually difficult that you are able to ask them to meet in a focus group for for one hour or two hour because they have to stop their work okay and but if you are able to do that it is good to have a meeting 

because you can observe data related to the relationship between the people for example but you may also be in a situation while you do not have any direct contact with companies but for for example your professor has some contact with many companies so in this case you may better use the questionnaire okay so send questionnaire or survey I will use these terms a synonym okay in this in this in this class and so you don't have the direct quest that a contact with company by someone else or like 

you can create a network without reaching directly the people okay and or you may be in another situation in which your research question asked you to compare the performance of different tools but for a certain task for example for testing or to facilitate the bugging for example 
but you are to consider also to UM two licenses for this tool to can you buy them do you have the money to invest on them in this case if you can do that probably the data collection technique can be it can be to apply some 


static and dynamic analysis of the system so we will see more about this type of data collection techniques that I here are just words for you like interview focus group questioner 

now we will see them more in detail but the most important thing that I wanted you to notice in this slide is that reaching the right source of information is one of the others part because let's take the days in which you want to do a survey and understanding 

and having a reply survey and you don't know any company you want to do a questioner you don't know any company having a reply from the right people is very very difficult I will give you some numbers also later on 

and also in internally to a company is even more difficult because you need to create a rapport with the people you need to create a good relationship if you want to do interviews with them okay this is a list of data collection techniques the list is from 2005 and you can check in this paper here and the list is very long as you can see 

so there is a large variety of techniques 
and we will see then we will have an idea of most of them and then we will see also in the next lectures in detail something more about 
1. interviews 
2. questionnaires and
3. if there is some times about 'mining software repositories' that is related to static and dynamic analysis of systems 

because this is from 2005 the article is very complete but some name changed 
because some trends in recent literature and technologies have emerged in latest year 

I will point to you to the new let's say term to refer to the same old things okay the data collection techniques are normally distinguished into 'three degrees'


1. the first degree technique are the one that required a direct involvement of software engineers so software engineers have to make some sort of effort or they have to interact directly or indirectly with you for example through surveys and questionnaires to to gather the data the second degree they are the ones that have an indirect involvement so software engineers so you are evaluating somehow the the software engineers but you are not interacting directly with them and in some cases the effort required to them it is not too is not too high the 30 retreat technique are the ones in which I studied just the artifacts okay I don't involve people I don't care I may care about them but the trace did leave people are the only thing that is relevant to me the trace they leave people in the system of course 

and in this case I can 
I can avoid the interaction with the actual with the after subjects that are in general developers okay because software engineering is studying all the subjects that I listed in in the previous lectures but of course most of the time we are dealing with with the data produced by the developers 
because the code is one is one of the most relevant things that are produced in the software process so let's let's see it is this picture that gives us instead of a list a more dynamic view of what this technique entails so the direct the first degree technique are more people in sensible intensive so you need to involve the developers or the people in general and 

since you involve people they are less reliable any measurement made with with people is less reliable then you have to consider that they are 

they are also more flexible in generalist Astaire's data collection techniques so you have less strict less strict way of collecting the data and they are normally oriented to understand things related to cognition 
since you have access to people you want to access things that you cannot get from their code 
so you want to get things that are more 'human oriented' 


so cognition but also 'emotion' for example in recent research there is a trend about emotion in software engineering that you may consider not relevant but for example when if you've been developing code for for some time you understand that there are moments in which you adjust in flow and you're just programming and you don't pay attention to time and times in which you are completely frustrated to get stuck on a bug and spend a lot of time on 

the bug understanding this type of dynamic is as relevant as understanding the bugs in the code so they are studied there there is some experiments made with different devices for example 

this wristband that professionally spent but also eye tracking and electroencephalography so several several studies in this direction so cognition but also emotion so the if you need something that is missed here alright these people intensive technique are like brainstorming questionnaires you need people okay second degree technique you you need people but a little bit more because you you have an indirect intervention and that intensive technique as 



I was exemplifying you need lower resources because the resources are are just the software ok but you have a lot of data okay you have a lot of data if this means that that you are also focusing on you also have to deal with this aspect we will see we will see some some issue related to the large amount of data that you have to deal with later on and this that intensive techniques are more related to behavior than to cognition because you are observing the data so you are either observing the trace that people live in the software or in the interaction or with the system ok so let's see now each technique one by one okay here we start with the first degree techniques first degree techniques as we said require a direct involvement of the software engineers 

software engineers means developers or anyone okay the yellow one is the software engineer the blue one is you is the researcher okay the researcher or another software engineer who wants who is in charge for understanding how things work in the company okay there are two main categories one is inquisitive technique and there are observational techniques in the acquisitive techniques you see you participate in the you actively participate in the in the in the collection of data okay and they can be like interviews questionnaire conceptual modeling and brainstorming and focus group in the other case you you have less participation because you are present but from a distance 

# First Degree Technique

and for example you can be an observer of the of the of the software engineering in the company we will see some example of salvation our techniques are these three think aloud shadowing and participant observation okay let's start with the first ones okay with best storming and focus group these are first degree technique in quiz okay basically what are them based on a simple trigger question people are free to express whatever comes to their mind initially on paper and then takes turns to speak for example let's say I want to want to understand I am in a company and I want to understand what are the problems with with the management for example then I do a focus group in which I involve the developers and the testers 

for example and I ask the simple question what are the problem the main problem with your manager okay and these people are asked for example for five minutes to write down the most relevant problem in a small piece of paper and then they are able each one is able to speak and the one can can can provide their own their own viewpoint 

this is also a way of collecting data okay when we speak about the collection we speak us about these techniques what is the advantage the advantage is when you don't know so much about a domain about the context and you need some ideas some ideas some first fresh information and as in the case that I showed you in my example they allow to you to rapidly identify what is important to what is not for the people okay and it allowed if I ask for example two people what are the problem with the management the feeling for the people is that they feel really involved in the research 

normally you ask and they are very receptive in this type of context because rarely developers are asked about this type of issues okay and they're always eager to to say everyone wants to say their opinion okay we know that the disadvantages is that they can become unfocused because of course a discussion it has limited time can be superficial people can there can be some dynamics that lead someone to speak a lot and someone not to speak so you have to very be very well organized and very careful there are entire books on how to carry out a successful brainstorming 

and there are professional of course of course the key here is that the research or the person that guides the group is someone who know how to talk to people how to organize people and not any not everyone is made for this type of job okay and and on the other hand there is the thing that they are often are to schedule with busy developers as I said before it is very hard that you can gather people 

create a focus group and distract them basically from their daily activities okay here you have an example an example of an actual study that was performed this in the slide I mean and here the goal was to understand the factors leading to success and failure of software process improvement so the this researcher in this real study where 

were involved in 13 companies 
K 13 so quite a lot and implemented 49 focus groups okay and they had four to six participants and each session lasted 90 minutes okay these groups a different type of type of type of people and from this focus group they gathered they moderated the the focus group and they gathered in 90 minutes so quite quite long one hour 

and a half and they gathered all the information to success in failure of the of the Pro software process improvement of course processing all this data this was gathering the data 

but imagine processing what the data would require a lot of time because this recording it implies recording prescribing what was what was what was said knowing who was saying what so it is not it is not an easy an easy an easy strategy to apply and to to analyze okay ? 

so let's pass to the other strategy so in this case you have multiple people meeting the other standstill inquisitive is interviews okay basically interviews is what you know you ask yourself a series of questions to some relevant actor of the software process or in general you ask relevant question to someone and you collect the answer someone that is experts on something okay the advantages of this technique is that people are very familiar with question answering so it is not something like while in focus group a meeting not everyone easy news of ever in this meeting and there can be some saw some different behaviors depending on the attitude of people this is more limited in interviews because a normally are based on dialogue and the question answering is something common okay again also in this case people tend to be happy when someone asks about them so it's it's good also to create good rapport with with the people with the developers and another important thing that you may experience as the most important thing while doing interviews is the possibility to clarify things clarify means clarifying your questions 

but also 

asking clarification about the answer that are given because anytime you start an interview with someone that is doing a different job from yours or that is expert in a different domain from yours a new word opens up in front of you a word of different terminology a word of different rules so you have to consider that a lot of time in the special in the first interviews is spent in clarifying okay the main issue with interviews is that people are not always reliable so they tell you something but in practice they do something different for example the where there was a studying which people that were interviewed and they were saying oh we are spending a lot of time in documenting the cold this is one of the most time-consuming tasks of all my activity 
but then when looking at the time that they were spending and the documentation that were produced it was clear that they didn't dedicate so much time and it was clear that the amount of documentation was very little so if you just trust what they tell 

you may not reflect the reality okay it is also difficult in interviews to do sampling so selecting the right people most of the time you are you are forced to select the people that are available for the interview for example you are you are you consider an organization and you consider an organization 

and just a subset of the people may be allowed to speak to you of course is time-consuming a little bit less than the four group but it's time-consuming for scheduling the interviews doing that the transcription etc and for exactly 

there is an example another study in which this researcher went to various organization to study the software process okay and they involved you see I also here they involved different subjects in the in this study with people is very important that involved you involve different viewpoints so not just the developers but also the designers the project manager and the different level of management that 


you might have in the company because all these people they have different perspective and this very very frequently they are opposite perfect perspective okay and in this case they conducted 97 interviews 97 interviews and 3000 pages of transcripts is a lot like a very large amount of interviews normally and until you study you do 20 to 30 interviews okay this is like a very large very very large study and you need to involve a lot of people and to consider that 3,000 pages 

to analyze is not is not a joke okay the third type is questionnaire and surveys in here I use questioners and services synonyms but actually there are some there are some differences of course because a survey can be performed through a questioner or through an interview because a survey is actually at least basically of predefined question to answer and 

I can ask people to answer through web with a questioner actually or I can ask people to answer to answer directly like the ones that come to you at the airport for example I want to ask you some or the railway station want to ask you some some specific question okay but in our case we speak about questioners and service as synonyms okay for us they are synonyms and they are written predefined questions to be answered by people okay these quick and easy to administer this is the biggest advantage and you can reach a lot of people because if you put a questionnaire on the web you may reach 

you may reach a large amount of people okay the disadvantages with respect especially to interviews is that it is difficult to classify questions and answers okay so your questions has to be very clear seeing the start okay and you need to pilot your question to test your question with a possible audience because the the you you may assume that what you write down is clear but it's never clear the first time okay and I will give you a lecture on how to perform questions answer questions in questioners and how to administer surveys like I will give a lecture now to perform interviews focus group and the focus group are not part you will not speak about them anymore okay but about questioners and surveys and interviews we will speak we speak about them in other in other lecture the other issue the return rates can be low okay if you send a thousand questioners you may you may receive a hundred responses or 200 


see if you are very very very lucky okay so this these are estimates for the software engineering field another field is even lower like around five percent okay but for of course also for giving a questionnaire you need to have clear already what you want to ask why do you interview you can invent question while the interview develops in here you have to establish them so you have to know a little bit more about about your context in this example for example you have this paper-based questionnaire that was given to people to identify factors affecting the the adoption of a certain tool in 52 organization and what did they do they they knew who bought who purchased the tool and service survey the key information system personnel about about their impression so they sent a questionnaire and the paper-based questionnaire in this case was at a time in which it was not common to have questioners 

by web by a web now it is much much easier of course and they they collected information in this way from the people who actually bought the tool you understand that in this case people bought the tool in some cases you may want to understand for example what are the factors affecting the adoption of a certain tool for an open-source store okay so in that case you have to count downloads but how can you know that that person actually used the tool for a long time or not or just or just unload it for another person for example so it's more difficult okay but in general surveys are appropriate for this type of cases and also for doing in general market research because the thing the key thing is that you reach a lot of you may reach a lot of people 

## Conceptual Modelling

concept on modeling is the final type of inquisitive technique 

basically a concept on modeling is normally mixed hold so with with activities like actual interviews okay because you ask participant to create a diagram of some aspect of the work for example the architecture of the system or the process the software process or the process in their organization okay 

the idea is to bring in light bring to light the mental models and also to better understand the the domain for example if you want to understand the process and to better understand the organization how things work how information flow goes okay the advantage is that they are easy to collect because you just need paper and pen and you you can collect the information and graphi graphically graphically collecting graphical data and expressing yourself through diagrams as you know a software developer and engineers can help you to express things that cannot be said in words okay the system architecture can be expressed just with the picture system designed the same and sometimes also relationship they are easier to represent when you when you built up a great diagram and developer are in general quite in use in doing diagram okay but the disadvantage is that you require some domain knowledge to interpret the diagram so you need to have some previous knowledge 

about the process or the system that you're dealing with to understand its architecture okay and it's very hard to to ask people to draw details and even asking them to write to create this diagram through a tool is not always easy okay so you have to gather some information you offer you often have to draw your self and ask confirmation okay for example in this example in which my colleagues actually were involved they wanted to understand the process of the public administration office in terms of tools are chosen tasks okay because they wanted to re-engineer the process okay and they performed some interview with with some people then they did the diagram that did by process diagram by themselves so like okay now we are doing this activity then you produce this document and this document is passed to this other actor etc they showed this diagram to the personnel to validate and then they try to reason on the diagram to modify the process to understand what what was wrong in the process okay as I said conceptual model 

requires interviews or focus groups one one thing is that they are used in in practice in companies but they are not the most frequent thing in research okay 

## Work Diaries 

okay work Diaries work diaries 

are basically they participant to record values events that occurred during the day so basically you have a four you give a form to the people and you ask you ask them when you are doing a certain activity you should you should write down some information about the activity for example you want to understand you want to understand the relationship that these people how many times these people interact with the boss for example okay 

every time you interact with the boss you just open this sheet you open this this form and you write down okay at 12:30 I've told I spoke with the boss okay or you want to understand how long did it take much time did you spend on coding and how much time did you spend on on on the bagging okay so you write in this form okay now in the bagging now encoding and impressions for example okay in some cases you may want to do random random work diaries so basically based on a certain town or random in the sense that you just set a time in which these people have to write down what they are doing okay the advantage is that 

you can report and record record events ask them to record events in the moment in which they occur okay why this because if you interview people the people the people will tell you what they think after an elaboration of the event after discarding what they consider not relevant or not worth saying well the perception of the moment is very different okay so these are good strategies because they allow you to understand really what they are doing in a certain specific moment okay the disadvantages is that you need to convince people to do that and they may not want to do to write down what they are doing 


because this interfere with their work and it may interfere even more if you're asking them to do it at specific time okay and so people may tend to neglect to record the information so you may have unreliable data okay so for example I may want to know which are the communication patterns who do you contact about what in the company so I ask who the developers to record their the communication for one week and in this way what can I do I can understand the interaction between team members and interaction between team members and managers for example so to understand whether the problems that 

I may have in a certain company are related to little communication between members of a certain team or they are related to the fact that there is too much presence or too little presence of the project matter for example project manager pink allowed think aloud are another different technique instead of asking them to write down in a diary while they are not observing you ask them to think out loud while performing the task for example programming tasks so for example you ask them you ask them to - to code and you observe them and you ask them okay tell me what you are doing okay now I'm coding this function okay now that it doesn't work so I want to debug it I'm on the bug in it 

and I understand that it may be related to this the relationship to this other function my bug so I'm opening this other function etc this is very difficult to get okay and sometimes experimental may occasionally remind them to think out loud because people tend to forget to verbalize it they are really involved in their task okay and they are normally not longer than two hours you cannot ask people to do this thing for too long the only advantage is that the one of the few ways to test a cognitive model if I have a cognitive model for 

for debugging for example or I want to understand the strategy that developers used for debugging like in this in this example I give a certain piece of software I can ask them to add some some additional feature and then I asked them to - the bug based on the error that they get so in this case I can understand what is the way their way of thinking the way that you normally approach this type this type of problem okay 

the difficult thing here is is really to convince the people and analyze the output which may be very far from stable cognitive model shadowing it observation basically with observation is it just tells what is that you just do what the name tells you observe people you follow them and you follow them either in in a meeting or individually when they are individual you normally call them shadowing observation is for is more related to one or more one or more subjects okay one more subject or together but you normally use the term observation okay these are easy to implement and you don't need so much special equipment you just stay in a company on in a certain environment or in a meeting and you record you write down diary and you try to understand what's going on okay but this can be very annoying 


for people if so you need to be really well be really well accepted by the people and you also need to know the domain very well because if you go to a working environment that you don't know with a different process that you've never been before you see that there is an infrastructure of the communication links but also of practice of documents etc that you really don't understand so 

it is very important that you spend some time understanding the domain very well so possibly also doing some preliminary interviews and then you do some observation and the acceptance is the key thing here so people have to accept your presence I will give you I will give you some example in the lectures 

because we consider not just observation but participant observation that are in the next slide mmm these are for example to monitor this example tells us one case in which I want to monitor inform a communication in a certain group and I start observing an open development space for a certain amount of day 

so there are people in the open space and I check who is talking to whom what are the dynamics doing for example a week every file or a month okay participant observation is joining the team so you are the researcher and you are observing but you're also participating so you join the development team and perform some activities like the others the main advantage is that 

this is likely to be more accepted by by the participant and you can create more rapport and you can give also contribution to the team for example you want to help them in introducing a noble tool and or in developing tell some tool that supports them for example for facilitating the the review of the code and then in this case you are helping then you are present there ok of course the the the issue here is that it is extremely time-consuming it's an additional job basically you have to stay there you have to do your job a researcher as observer but we have also to participate and since you are inside you may lose your standard perspective so you unavoidably bias the research 


although you get more more meaty information more deep information in this in this example you have the researcher that participated in 23 code inspection meetings so meetings which people were discussing about about the code that was developed and we're reviewing the code and auntie try to elicit information on how far for example familiarity organizational distance and physical distance may be related to how much time is spent on certain discussions and tasks so this is something that you can do only being present there and observing people okay and also participating it is first subject in the inspection activities because familiarity organizational distance physical distance if you are just observing for example the familiarity is something that you may have an intuition about but you don't really know okay and the road plate you don't really know in the day so in this case you need to participate and also know the 

detail of 'what is called reviewing'
'what is called inspection' 

# Second Degree Technique

okay these were first degree techniques oh so direct involvement on the software engineering with the second degree technique basically you have an indirect involvement of the people and the basically 

there are two type of indirect techniques that are instrumenting system and fly-on-the-wall this is a name that basically doesn't tell you so much but they got consistent people record in their own work okay in this case not much effort is required to the participant and you don't need to interact with them during data collection so this is also a good thing because you don't have to let's say be present and by us the data collection with your presence remember what I said before if you are an observer or even a participant observer your data collection is biased and you unavoidably bias also the the person because if you are present there 


they may behave differently from what they would do if you were not there okay so among these secondary techniques you have instrumented system 

so you monitor developer system interaction during a certain task for example you may do 
high tracking cameras 
wristband and I don't - for logging for example as I was telling you before 


I'm a instrument in here is instrument in systems but it could be also instrumenting people actually okay like in this example I can use tool for logging the system so to understand the interaction with them with the with for example with the coding platform or 


I can instrument the person somehow so keep the person with a wristband to understand the variation of emotion during the coding activity okay the advantage is that you have no time commitment for the software engineers so this is quite quite good with all sir because basically you can do this experiment without asking too much and you have accurate information because you have measures okay you don't you don't rely on the impression of course you don't you have no time commitment for software engineers because unless you carry out an experiment 


because if you do an experiment it means that you put these engineers in a lab so you have to ask their time and you often do this not with real professional engineers but with students students are often used as a proxy for professional software engineer in experiments 

if you want real software engineers you often have to go to the company and do something different from an experiment ok the disadvantages is that data are raw and do not have a clear meaning 

so you are collecting precise data but you have to give meaning to this data and there may be several ethical concern if there is time since it is very relevant aspect of ethics over soft Attucks is a relevant aspect of empirical software engineering and especially privacy 

I will 

I will try to include a module on the gdpr which is the European law for the Minar meant of privacy that is extremely important now for any developer okay for anyone who wants to develop a system and there is a lot of confusion a lot of interpretation so it is good to have a model dedicated to that we will try if we have sufficient time to to speak about these across lectures and for example here as we have this example here that that I was giving you just before so I want to understand the degree of engagement of the people and I monitor their engagement with this responder that is monitoring the heartbeat and other other parameters and I check hold so with the log what they are doing in that in that moment and 

then I ask them also to write the degree of engagement every 30 minutes like with a working diary so I'm combining okay in this research I'm already combining this trend data collection technique because for example I want to check to which stands the two measures sensed engagements and report engagement are in agreement and what were the developers doing when they were doing something that was identified as really engaging or not really engaging okay so this means adding on something to people or to the system fly-on-the-wall another method another another second second-degree method 

and in we fly on the wall' participants are required to record or videotape themselves so and they do a specific task and this does not require so much effort by the participant and there's no direct interaction the main problem is that there is large amount of data and consider that you may have video and audio recording video recording especially are multimodal data you have audio you have images 


you have way a lot of information to analyze and there is no systematic strategy to analyze this information and it's not always easy to understand the content of videos especially if you keep the camera fixed if for example now I go there you don't see me anymore but I'm still doing my activity okay and this happens when you do this type of recording unless a person is there monitoring but in that case you make an intervention okay 

you can use the GoPro and have the movement of the person and monitor the things from their point of view but it's not easy okay the dish is that is not easy to do this type of data collection techniques 

and they create a lot of data but they are very informative okay for example here the example and I want as the team to videotape each meeting when they do want to do a certain iteration in a scrum meeting you don't you don't need to know what is it you know in a certain meeting okay and I want to see the recording to see the pattern of the interactions okay I'll people relate to each other 

and which role at a dominant for example 

# Third Degree Technique
okay finally the degree techniques 
which are basically called today- software repositories okay 

these third degree techniques require access only to work activate such a source code or documentation and they are related to the analysis of electronic database of the work performed or analysis of to log document analysis for example stock code documentation and other software related documents that can be also as I said before also up reviews the information related to the user impression about the certain product and static and the dynamic analysis of assist and so this is also called software analytics 

so I am checking the the content of the code and the behavior of the code okay 

in recent year with the development of shared repositories 

as I said there is an emerging field that is called 'mining software repository' 

said that consider all this family of all these different techniques okay ?

//coba cari conference nya?

and there is even a conference that is quite successful that is called 'mining software repositories' 

and if you if you want to check in the internet the content from this conference is really interesting b

ecause actually from the analysis of GITHUB and 
other another open source repositories 

you can gather information about participation of people typical bugs and a lot of information about software engineers that you couldn't access before the existence of this of these things okay so while before we were making a lot of interviews with people and most of the research was really time consuming in terms of data 

collection now you have a lot of data because you have these repositories and the difficulties 

gathering information from all this data 

so instead of reaching the source of information that it was very difficult now we are switching to a moment in which it is difficult to give meaning to a large amount of information is a paradigm shift 

that is occurring has been occurring in the latest years 

okay ! first if these type of techniques are allowed this is over time data based work performed and two logs so I access for example to platform for issue or bug reporting for example bugs real life you don't know what is it 

just checking the internet and or other version control system 

or configuration management system so things that are related to the 

software process and that are lot in some other tool 


the advantage is that I can get a lot of data and again like all the third degree technique are independent of the research 

and do not require any work by the developer so you are not asking them too much 

you're just asking them to show that it okay this is that 

you may have a lot of data too much data 

and you don't know much what is the the work environment 

so work environment my 'vary' from company to company 
and you may not need 
why a certain person as has been doing the 'change request'? 
or why this these people are behaving are living this trace in the ended in the virtual control system 

for example and another issues that the information is often fragmented when they do a commit so when they send a piece of a new piece of code or a modification of a code to the repository they may write 

simple short lines and in short line what they have done but you understand that just if you are really really 

really inside inside the project 

so it's not always easy to gather the information 

for example 
one example can be understand the typical patterns of software evolution 

and I look at it up and I analyze the 'change request' commits of on github and I check when people are typically performing chain requests for example when may mean understanding when the 

when I have several 'download' or when may 

mean the court reaches a certain sides 

and has been used for this this time or may be may mean anything, I don't know ! 

and understanding what a patent means may mean also which are the typical sequence of actions which are which is the chain of action for the software evolution ok document analysis this is another another another strategy and consists in the analysis of documents related to the software process so it can be documents here is I mean natural language document so the arguments that are written either in English in Italian German so the spoken language okay so this includes an ecosystem of information that is very large because code it has comments but there are emails between people there is all the information in Stack Overflow there may be information in Twitter in the apt review in the developers documentation in the users manual so there is a lot of natural language that is surrounding the source code and the language that you use for programming 

okay the good thing is that written information can often answer why questions why if I observe just the data I can find relationship between things but it's very hard to answer why questions but the issue is that to understand you need to you are required again like in the other in the other case to know very well the context today in the latest years latest is like latest now I'd say almost 10 years there is a there's been arising in natural language processing techniques so techniques 

if you look at Google Translate for example is incredible if you if you look at any tool for manipulating natural language they made big step forward but and so this this technique can be applied for for this for this type of data but data are often quite dirty in the sense that as I was saying before like you write you're not for example let's consider developers documentation may be done in a proper way uses one manual may be done in a proper way but the up review can be just a piece of text with several typos and and not so informative emails 

say code comments can be not updated not updated with the attack code so can be a problem an example is that for example I want to understand in the app I want to look at the Apple Store or Google Play and want to understand whether the app reviews in the repository contain potential new requirements for for my my up I developed enough I don't know what the people think the only way to to twelve new requirements is looking at the reviews but in this case I can check it cannot son subjects to check about these reviews identify which ones already are to be speaking about new requirements and check how much they agree why this because of course the opinion opposite and reviewers the opinion of a certain subject can be different from the opinion of another so I have to identify the requirements that are identified by for example by both the subject and then maybe I can even improve the process by try to implement a system that automatically predict whether given a certain review does this include a requirement 

or not okay 

### static and dynamic analysis

static and dynamic analysis of a system and what is this? 

this basically called the 'universe of software analytics' 

that means analyzing the source code or 
the trace is generated by it running the code so dynamic analysis this can help us learn about the design 

and in a very indirect manner how software engineer its think search of the code and work 
ok 

one might compare programming style or 
architecture a style of different software engineers by analyzing for example their use of the constructs 

and values of the virus complexity metric so I can understand by looking at the software this can give me more information about you and your way of working ok what are the advantages again large amount of data and there is a set of emerging tools for analyzing this 

this is why 

also mining software repositories is explored in somehow because you have a lot of open source data and a lot of tools for analyzing this these are links that you can check one important one is gh torrent and but also the other one there or libraries for analyzing get up ok of all other open source repositories 


the disadvantage and is that source code is not always intuitive you know ? 

and is often understood just by the person who wrote it 

and the dynamic behavior behavior is often even more difficult ok and you always need for these type of things you need to resort to automatic support so why for natural language reviews or any type of document you resort 

if the documents are many you may use the support of automated techniques but you can also read the information by yourself in this case in most of the cases since the data are many you need to resort to an automated support for example why I should use this for example because I want to check most frequent dynamic error triggered by software in jitta and get up I download some representative software analyze them with the outside interpretation of the interpretation is a strategy for identifying runtime errors by looking just at the code and just count which other typical errors okay so that 

for example I can know that I have to look better for for developers of open-source software for those type so as a summaries and 


then we conclude here that I took the table from this this paper in which they use this cinnamon between first degree and first order so we have first degree technique second degree technique and third degree technique here you have complete summary and Spanish you know when they are used by by researches and the volume of data that you have to deal with and there is an interesting column okay an increasing interest income that is also used by software engineers for 

so these are data collection techniques for researchers or for software engineers who want to do some research in a company ok but there are also techniques that are used by software engineers for their own tasks for example surveys interviews focus groups 

and these first-order techniques I used very often for requirements elicitation which is requirement gathering and the of course concept on modeling is also used for requirements but also for project planning okay so you have some of these techniques that I used both for understanding software engineering works but I also used by software engineers for better performing their their work okay you can check this paper and see and see the table the basically the thing that 

I said now in this in the second part of the lecture are all included in this paper okay this is for for today is is finished so see you next see you next Tuesday 