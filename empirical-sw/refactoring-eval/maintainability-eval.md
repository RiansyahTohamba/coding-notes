# Context: 
 Refactoring is a technique for improving the internal structure of software systems. 
 
 Refactoring =  
 	solid theoretical background + 
 	being used in practice. 

 GAP :	
 Lack empirical research results on the 'real effect' of code refactoring. 

# Objective: 
 
This paper presents a manually validated subset of a previously published dataset containing 
1. the refactorings extracted by the RefFinder tool, 
2. code metrics, and 
3. maintainability of 7 open-source systems. 


We found that RefFinder had around 
1. 27% overall average precision on the subject systems, 
2. thus our manually validated subset has substantial added value. 
3. Using the dataset, we studied several aspects of the refactored and non-refactored source code elements (classes and methods), like the differences in their maintainability and source code metrics. 

# Method: 
We divided the source code elements into a group containing the refactored elements and a group with non-refactored elements. We analyzed the elements’ characteristics in these groups using correlation analysis, Mann–Whitney U test and effect size measures. 

# Results: 
Source code elements subjected to refactorings had significantly lower maintainability than elements not affected by refactorings. Moreover, refactored elements had significantly higher size related metrics, complexity, and coupling. Also these metrics changed more significantly in the refactored elements. The results are mostly in line with our previous findings on the not validated dataset, with the difference that clone metrics had no strong connection with refactoring. 

# Conclusions: 
Dataset yang di improve juga jadi challanges.

Compared to the preliminary analysis using a not validated dataset, the manually validated dataset led to more significant results, which suggests that developers find targets for refactorings based on some internal quality properties of the source code, like their size, complexity or coupling, but not clone related metrics as reported in our previous studies. 

They do not just use these properties for identifying targets, but also control them with refactorings.


# Reference 
Péter et al, Empirical evaluation of software maintainability based on a manually validated refactoring dataset, 2017
