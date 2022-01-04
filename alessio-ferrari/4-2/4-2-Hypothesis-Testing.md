-------------------------------------------
hypothesis testing: MAGIC 
1. hypothesis
2. example : experience of the developer -> time to find bugs	
3. example : What if I want to know WHO is QUICKER? This formulation does not say anything about that..
4. () example : one-tailed hypothesis, The average time to find bugs of novices is less than or equal to the one of experts
5. (7:30 - 10:20) test statistic 
6. (10:20 - 15:25) Probability Distribution of the Test Statistic, ada 2 slide judulnya ini, ditambahi tulisan
	If my test statistic falls
	around the tails
	I can REJECT H0 ..and this is my hope!
6.a lalu ada slide ga ada title,lanjutan dari slide di belakang
	• Our final goal is to evaluate whether our test statistic value, obtained from our experiment, is so rare that it justifies rejecting the NULL hypothesis for the entire population based on our sample data
	• How can I do if I do not know the entire distribution of my
	test statistic? This can be inferred based on the statistics
	of the sampled data and the hypothesis I want to test...
	• ...in this context we will assume that some MAGIC
	occurs and we know the distribution of the test statistic

7. (15:25 - 16:46) critical region
8. (16:46 - ) Level of Significance and Confidence
9. Significance and Confidence
10. Risk of Rejecting the NULL Hypothesis when TRUE
11. Type I and Type II Errors

12. Two-tailed Test


13. One-tailed Test (Left)
14. One-tailed Test (Right)
15. p-value
16. p-value and alpha (one-tailed)
17. p-value and alpha (two-tailed)
18. p-value (lagi)
19. effect size
20. effect size
21. cohens d
22. pearson
23. what about type II errors?
24. type II errors
25. hard truth
26. summary of concepts ( - 45:32)
27. Graphical summary (45:32 - 46:18)
-------------------------------------------
my objective?
Contoh kasus yang diberikan
1. Ferarri menguji source code saja kah?
2. menguji human saja? 
------------------------
so let's start the second part about hypothesis testing 
so now we have seen all the principles related to concepts such as dependent independent variable controlled variable treatments etc and now let's go into the tool that allows us to to confirm or to support let's say my theory or to identify whether the evidence that I can gather for the experiment is sufficient to support it in this this is a lesson with a lot of statistics so I will provide you the information 

that is useful to understand the main principle but to really understand the things you need really need to resort to other two other resources so to use other books for example the book that I suggested and other other links that I will point throughout the lecture I will use sometimes where a few timers actually the word 
========
MAGIC
============ 
when something needs to be assumed so I will not explain in depth some aspects and I will I will give them as to you as information if you are interested you can you can do additional research by yourself but so that it is clear I do this so that it is clear that it is not that you didn't understand something but it's just given you as an assumption okay so let's start with some detailed definition of what our hypothesis is let's read the slide a hypothesis is a statistical testable statement derived from a theory and in practice from a research question so I have my theory 
I write down my research question in the way that I explained during the first lecture 

and is a statistical statistically testable statement we will see through this lecture what this really mean a hypothesis is a predictive statement concerning the impact of some independent variable on some dependent we've already understood 

now what is an independent viable independent bible hypothesis is a predictive statement so every time I change in some way the independent variable I expect to have some effect some predictable effect on the dependent variable 

this is a core point when we do i potter this testing our goal is to refute the negation of the theory the reason for this you will understand it throughout this lecture but for now let's take it as as a fact okay normally whenever we do i potter this testing we start from the theory and the first thing that we do is Express the so-called null hypothesis h0 this hypothesis is the negation of the statements that i want to support on the predictive statement that i want support so simply simply 

the theory does not apply this is the typical null hypothesis it is expressed normally like the as a statement like the one written here there is no effort between the independent variable and the dependent variable so the the changes in the independent variable do not affect the dependent variable and these null hypothesis is assumed to be true unless there is evidence from my data from the data of my experiments that allows me to reject the null hypothesis and the statistical test is actually oriented to allow you to reject the null hypothesis of course you have to express both the null hypothesis as I explained now 

and also there are tentative hypotheses which is the thing that you want to support the alternative hypothesis says the theory predicts of course if h0 is rejected so if the null hypothesis is false there is an evidence that h1 can be correct so can be supported so the alternative hypothesis may be true this is an example 

so let's go directly to an example here I have a method M or a tool T for finding bugs a method or a tool doesn't doesn't change anything so something that I want that I want to use to support my strategy for finding bugs and the null hypothesis is this one the experience of the developer does not have that the average time to find bugs in this case I imagined to have two groups so novices and Express so people with different groups with different experience like in the example that we discussed in the previous part of the lecture and this is expressed according to this this is a null hypothesis is expressed with this formula so the devil each time for now this is is equal to over the average time of experts so there is no difference 

what I want to show actually is that the experience of the developer actually affects the average time to find bugs so my alternative hypothesis is the one that you see in this slide so the average time of the analysis is different from the average time of experts in this case we will speak about two-tailed hypothesis to be tested and you will understand why we use this name in the next slide so for now just start start getting some confidence with this type of terminology so we are speaking about two-tailed hypothesis here when you have a name and you another hypothesis that is speaking about no effect 

okay another example 
let's see now because in this case I'm showing I'm looking at differences so there may be the case that the average time of novices is higher than the average time of expert or lower than the average time of experts if I want to know something more a little more so if I want to know who is quicker between novices and expert I need to modify my hypothesis I need to formulate it in a different way the experiment is exactly the same so I am I to group metal groups one of novices and one of experts but the formulation of the null hypothesis is different 

how is it the average time to find bugs of novices is less than or equal to the one of experts so is expressed in this way so this is what I want to reject that I want to reject the fact that novices are faster than experts and of course the other way around for the alternative hypothesis is the average time to find bugs or novices is greater than the one of experts 

this is what I want to show when you have these inequalities we speak about one tael hypothesis to be tested so when you have the equivalence you speak about to say their position here you speak about one tail about this again this will be a clearly explained later on 

# two-tailed test
so let's go back to our test I spoke about 2/3 tests and one taste test this is the two taste tester represented with some of our example with some more information so again alpha the significance is the risk of rejecting the null hypothesis when when true the value of 0.05 in this case for Convention is split between the tails so one of the area is is hard for alpha alpha alpha the population is the one that confirms the null hypothesis so the population is the one in which the other time for novices is equal to the average time of experts while in the two tails in the so-called rejection rejection region I have the alternative hypothesis that the average time of knowledge is different from the average time of aspect and of course I want to fall there one of the areas in the case of the one-tailed test the representation is slightly different because in this case I have another Patris that is the average time to find box oh no this is greater than or equal to the one of experts so my null hypothesis is represented on the right part of this life so the average time of novices is greater or equal than average time of experts because this is my hypothetical population which the null hypothesis is true and 


I want to fall on the left tail in this case as a home vention the value of alpha is the entire entire area entire area on the tails so 0.05 is this whole area right is the the one tailed test right is the opposite case okay so the average time to find bugs of novices is less than or equal the one of experts is my null hypothesis 

so the one that I really want to reject I want to show the experts are our quicker are faster and I want to fall in the in the right area now let's pass so now we have understood what water is the alpha value significance value what is the one tailed test and Tutte test but still we didn't actually perform the real experiment we didn't perform the real test actually the experiment probably was the experiment was already performed but we didn't we just set up the test so the p-value I said that a tester generic the statistical test produced a test statistic value at a statistic value that depends on the type of tests I mean in this example is the so called T value each test always produce also a p-value each single test in general since now you have to remember that low values of peak so low means around 0.001 are good high values like higher than higher than 0.5 0.0 5 we will see our bad ok so the p-value you already understand there is something that needs to be compared with my alpha let's see graphically 

what is the p-value we saw that alpha that was set up before the experiment was is was this area on the on the tail 

after doing my experiment I can derive my test statistic value that is here in the x-axis and I can derive of course another area the p-value is exactly this blue area if this blue area is lower than the alpha 

then the alpha area then it means that my test statistic value is a safe one is such that that I can reject the null hypothesis because it's so rare that I would fall here if the null hypothesis was true that is more likely that the null hypothesis was false is false in the case of two-tailed again as a convention we said that alpha is divided by 2 in the true area and the p-value resulting from from my from my experiment it will be this blue area the some of the blue area actually so alpha and P are the sum of the area in the two tails and alpha P are shared basically between between the between the two tails and mm-hmm the test statistic value 

I ever derive from the data falls just on one of the tail you have just one one single value when you when you do the test but this is to let you understand how the p-value works for both one tailed and two tailed test 

and I think the graphical the graphical explanation is pretty is pretty clear so besides the graphical explanation 

that I think is the most intuitive way to understand the p-value there are also different ways to interpret it and to understand it from other point of view let's read let's read this three possible interpretation the first one says the p-value indicates the believability of the David advocate case that 

the null hypothesis is true given the sample data so how believable is the case that null hypothesis is true given my evidence I want this to be as at least as least believable as possible so as P as lower as possible the second way of explaining the p-value is the p-value is the probability of observing a test statistic that is at least as Extreme as your test statistic when you assume that the null hypothesis is true again this is a similar way of of interpreting the the p-value that let's start from the idea that our null hypothesis is true 

and I am observing a test statistics that is very extreme that is very uncommon in a population when the null hypothesis is true when the null hypothesis is true the p-value at the third interpretation the TV value the p-value indicates to adjust and the results may be de memy due to a random variation within your data which make them different from the actual population so this is another way from another perspective if the actual population is actually true the the p-value may indicate that your data actually full full and there because they are because they are due to some random variation in the data okay so the T value is falling there because it's still possible that very unlikely but still possible that in a population where the null hypothesis is true a certain test would fall there okay the conclusion is the people 

when the p-value is very low the null hypothesis is rejected in favor of the alternative hypothesis otherwise if the p-value is greater than alpha we say that I fail to reject the meaning of very low depends on the on the value of alpha so what I search for is p-value my less or equal than alpha and I search to fall on the and I think this is clear to you I mean I'm saying reject and fail to reject and not accept and not accept because here you have to consider that you are inferring some information about an entire population from a single sample so if your single sample that is your experiment is is different from it is different from the the actual population you know let's let's say it in another way if you are you are comparing basically a single sample with we want to use the information from the simple sample to you want to use the information from the cincone sample to infer some in conclusion some information about the entire population of course this cannot be something that that confirms completely a certain hypothesis 

but it can be say if if your sample is so rare it can be sufficient to reject the assumption so there are some so that the null hypothesis is true so that's why we are using this terminology of rejecting and fail to reject and not accept because it is likely that your hypothesis is true but to actually show that your hypothesis is true you would need to repeat the experiment many more times and show that the actual distribution follow the one order of the test that is to follow the one of of the of your alternative hypothesis last thing is the effect size the effect size is another number that is producing is produced throughout a test not directly but a test but through another to another computation this is useful because something that is statistically significant when is less than or equal than alpha we say that the results are statistically significant but this does not imply that there is a large effect and the effect size measures how large is this effect how big is this effect so how much is the difference for example between novices and experts to compute the the effect size as I stick the data from my experiment and I use a specific approaches for computing the effect size that in this case will be equal to 2 so another number that is produced by the test and that I need to interpret there are several ways of computing this effect size here I will give you some point ok so FX size is a quantitative measure of the magnitude of the treatment so how much better is my tool how much faster are the are the expert I will faster at 

the aspect and the effect size measure either the size of association and relationship between variable for example if I have a question research question like the one that is shown here like how much is experience correlated with development speeds so this is a relationship an association or the size of the differences 

between group means how much is the difference between Thule MB this is more related to to our example there are several ways to measure the effect size and but here I exemplify just to because it's just a matter of of computation Cohen's D is used for differences Pearson R correlation is used for relationship but it can depend also on the type of data categorical or numeric and on the type of sample if they are paired or unpaired you can find the specific effect size measure to use in Wikipedia so take in your case your example your your experimental case you can select in a deterministic way which is the effect size that you should use like for the test and but for the tester we explain you better next 

in the next lecture Cohen's D quantity indicates that the difference between the means device is the difference between the means divided by the standard deviation of the population from which the data were sampled you don't need to understand this in depth basically the watch what you need to remember is that quantity of one in the case that the 

two group differ by 1 star the division the quantity of 2 indicates that they differ by 2 standard deviation and so on and this is how you should interpret them according to this table so this is 0.01 indicates that effect size is very small D equals 2 to 2 indicates that the effect size is very large similarly for Pearson R that indicates differently from Cohen's D indicates the correlation between variable so for example number of bugs in relationship with the length of the of the code sample here I have I have the value that is between minus 1 and 1 the effect size is low if Pearson R is around 0.1 media medium if it's around 0.3 and large if it's more than 0.5 so every time you do an experiment you say okay my results are significant and the effect size is low medium or large of course you are searching for large effect size so in all our evaluations we have assumed that the population was confirming the null hypothesis and so we aimed at avoiding type 1 error so rejecting the null hypothesis when it was when it was true but there is still a possibility that we make it up to error so fail to reject the null hypothesis when the actual population rejects it so I fall closer to the center of my of my of my distribution but the actual population a is actually in favor of the alternative hypothesis in this case is to control for this cases which established a value that is normally called beta and is the probability of accepting the null hypothesis although it is false and is associated beta as we saw at the beginning which are two error if the null hypothesis is false 


this real this means that Maria population follows the alternative hypothesis but I'm not able to show that from my from my data let's see how these are depicted depicted in this in this diagram so we had our distribution if our h0 our null hypothesis would be true and we have the other distribution still for the test statistic that we would have if the alternative hypothesis would be true this would be positioned in different part of my of 

my diamond different part of my x axis okay our alpha is the value associated to the first distribution so the distribution of the null hypothesis to ever-smaller alpha i have somehow to push this bar towards the right to reduce there or my alpha the issue is that if I reduce alpha I tend to increase the other value beta beta which is the probability of accepting the null hypothesis 

when this is false and remember the Alpha is the probability of rejecting the null hypothesis when this is true so every time I try to decrease alpha my test statistic may fall in the may fall on the on the left part of this of the central bar and this may be also associated by the case in which the distribution h1 was representing the actual population but I am not able to reject the null hypothesis 

because if I fall here in this red area I don't reject I am not able to reject the null hypothesis so they they trade off the trade or a trade off must be chosen normally we are oriented to choose a smaller alpha also with the risk of of not being on failing to reject a null hypothesis in general this is what is commonly done but the problem is that whenever we try to minimize type 1 errors 

so reducing my alpha we end up increasing the chance of type 2 errors there's no there's no way that that you can that you can balance in our case we must look at rejecting the null hypothesis so we focus on type 1 error but I guess that from this diagram you have understood what is the difference between the two errors and what is the trade-off consider that this line is the line that comes out after you have selected your alpha okay it's not really a selection of a specific line is a byproduct of the selection of the alpha value so I choose the alpha value 

and I have a line in a certain position and as a consequence I will avoid so beta in another in the India on the opposite side finally at this point I think you have understood why we look at rejecting the null and not at let's say accepting accepting the alternative 

the main reason is that we are always thinking about distribution but our experiment is just one sample and this sample is used to reason on an entire population so I can reject a hypothesis or fail to reject it but never accept it because it's just one single sample 

if I would like to accept the alternative hypothesis this would imply that I need to repeat the experiment many more times and with different sample taken from the actual population and show that my test statistic follows exactly the distribution of the alternative hypothesis and this is very hard 

because I have to repeat the experiment several times so it's easier to show that my experiment shows a t-value a test statistic value that is so rare in a population where the null hypothesis is is true that is more likely that the null hypothesis is incorrect is is false so I can reject it but I'm never sure of course to be sure I would need to repeat my experiments in a population many many more times I think that this makes you understand 

why we speak about this three key thing of rejecting the null hypothesis we and the all statistical test is is based on rejecting the null hypothesis is another more of such an intuitive way to understand it is the one 

that I've put here that is let's say that it is easier to disprove that all swans are white because I I need only to find one black swan than to prove it 

because in this case I need to check all possible Swan and there is always a chance I can hypothesize the chance that there will be one one black black one but less one in in my population okay this is a the additional intuition too to make you understand why with the one sample I cannot 

I cannot say I accept a certain a certain hypothesis a certain eternity by politics okay summary of key concept that you need to remember whenever you perform an experiment keep in mind this four concept level of significance this is alpha and tells me how much risk I can take and every time in software engineering is 0.055 

and if he said at the beginning of the experiment then he said as a value before starting your experiment based on the risk that you are willing to take test statistic this is the value that depends on the test that you make and it serves to understand how much my sample is rare in a population in which the null hypothesis is true okay is the output of your computation is the output of your test and these produce based on your experimental data this number alone doesn't say much we will see some example of T values that do not tell do not tell us much 

what is important to consider instead is another product of the statistical test that is the p value the p value indicates the probability of rejecting the null hypothesis when it is actually true it is produced - based on my experimental data and it needs to be compared with alpha if it is lower than alpha then I am happy because it means that I am able to reject the null hypothesis in favor of the alternative hypothesis finally the effect sides the effect size indicates how large is the difference between the two treatments or 

how much is the correlation between the independent and dependent variable so differences or correlation and we said it depends of the chosen test and there are tables to assess how large is this effect size here you have a graphical summary and 

that I think is quite intuitive you start from the data of your experiment you select a significance level you perform your test this test will produce a test statistic and as a by-product a p-value at this point 

you compare with the p-value with the significance value and if it's lower or while you reject the null hypothesis at the same time you have to perform the effect size computation by taking the data of your experiment and compute the effect size and compare it with the typical value of effect size and decide whether your effect is small or large and this it is easy 