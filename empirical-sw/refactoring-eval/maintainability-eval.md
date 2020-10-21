# Context: 
Refactoring is a technique for improving the internal structure of software systems. 
 
Refactoring_advantage =  
 	solid theoretical background + 
 	being used in practice. 

GAP Knowledge :	
Lack empirical research results on the 'real effect' of code refactoring. 

# Objective: 
 
This paper presents a manually validated subset of a previously published dataset containing 
1. the refactorings extracted by the RefFinder tool, 
2. code metrics, and 
3. maintainability of 7 open-source systems. 

RefFinder memiliki 27% average precision on the subject system. (kaga ngerti)

We found that RefFinder had around  27% overall average precision on the subject systems, thus our manually validated subset has substantial added value. (maksudnya?)

Several aspects of the refactored and non-refactored source code elements (classes and methods) dengan dataset, like the differences in their 'maintainability' and 'source code metrics'. 

# Method: 
We divided the source code elements into a group containing the refactored elements and a group with non-refactored elements. 
analyzed the elements’ characteristics in these groups using 
1. correlation analysis, 
2. Mann–Whitney U test and 
3. effect size measures. 

# Results: 
Source code elements subjected to refactorings had significantly lower maintainability than elements not affected by refactorings. 
Moreover, refactored elements had significantly higher size related metrics, complexity, and coupling. Also these metrics changed more significantly in the refactored elements. The results are mostly in line with our previous findings on the not validated dataset, with the difference that clone metrics had no strong connection with refactoring. 

# Conclusions: 
Compared to the preliminary analysis using a not validated dataset, the manually validated dataset led to more significant results, which suggests that developers find targets for refactorings based on some internal quality properties of the source code, like their size, complexity or coupling, but not clone related metrics as reported in our previous studies. 

They do not just use these properties for identifying targets, but also control them with refactorings.
# Motivation 
Motivasi riset ini bisa dilihat melalui 2 RQ berikut dan improved dataset :

## RQ1. Apakah kode dengan low maintainability menjadi sasaran 'more' refactoring?
Jadi bukan hanya improving structure tapi memang terdapat asumsi bahwa ditemukannya strukutur kode yg 'poor' menjadi 'primer driver' dilakukannya refactoring.

Diperlukan 'maintainability values' dari 
1. refactored dan
2. non-refactored source code elements 

untuk melihat patterns apakah refactoring
1. support atau
2. kontradiksi 
dengan asumsi 'refactoring is good' ini.

Dengan menerapkan statistical methods kepada 
refactoring data yg ada di dataset, ditemukan bahwa 

low maintainability values of source code entities memang men-trigger banyak code refactorings in practice. 

## RQ2. CHANGE ON metrics refactoring vs non refactoring
Typical value dari metric antara refactored and non-refactored.

Bagaimana metric mengalami perubahan imbas dari refactoring?

RMI relies on metric.
RMI mengkombinasikan sebagian kecil metric (yg di extract dari SourceMeter)

Each metric penyusun RMI dianalisa untuk mendapatkan deeper insight about the 'effect' of refactorings on them. 

Mereka juga tertarik dengan perubahan metric tiap versi software.

Lalu pada RQ2, Mereka examine 
Bagaimana metric terbentuk dan berubah (shape and change) pada refactored and non-refactored source code elements. 

Ditemukan source code elements that were refactored had 'significantly different' (typically higher)
1. size related metrics (e.g. lines of code, number of statements), 
2. complexity (e.g. McCabe’s cyclomatic complexity dan nesting level) 
3. coupling (e.g. coupling between object classes and number of incoming invocations) 
on average DARIPADA source code elements not-refactored at all. 

Moreover, these were the metrics 
'that changed more significantly' in the refactored elements 
than 
in the non-refactored ones. 

Additionally, we found no such metric that would be consistently larger in the nonrefactored classes and/or would grow much slower in non-refactored classes than in the refactored ones. 

We also compared the findings with the previous results obtained on the not validated refactoring dataset and found that most of the metric groups found to be relevant in connection with refactoring was the same for both datasets. 

However, while previous results displayed 2–4 significant cases out of 7, we obtained 3–6 significant cases with much stronger p-values using the manually validated dataset. 

We also identified that clone related metrics had no strong connection with refactoring, even though previous results on the not validated dataset suggested so due to the false positive refactoring instances. The main contributions of the paper can be summarized as follows. 

In the conference version [14] we already presented: 

= A manually validated dataset containing true positive refactoring instances attached to source code elements at method and class level and their source code metrics and maintainability scores. 

= An extension of the RefFinder tool that allows batch-style analysis and result reporting attached to the source code elements. 

= An empirical investigation of the maintainability scores of the source code classes and methods affected by at least one refactoring and those of not. 

On the basis of the achieved positive results so far, in this paper we extend our previous analysis with: 

= An empirical evaluation of the main quality properties (i.e. source code metrics) and their changes due to refactoring (an entirely new research question). 

= A comparison of the findings with the previous results obtained on the not validated refactoring dataset. 

= Detailed information of the existing and new statistical test results and an extended discussion of them. 

= We made our data analysis results available online just like the dataset itself. The rest of the paper is organized as follows. 


Section 3  : outlines the data collection and validation process of creating the dataset. 

Section 4 : Describing the data analysis methodology applied for answering the RQ.

Section 5 : we display the results of our empirical investigation on the maintainability and source code metrics of refactored vs non-refactored source code entities. 

Section 7 : The threats to the validity of our results.


# Dataset construction
# Data analysis methodology
# Results
## Maintainability analysis
## Source Code Metric analysis

# Discussing RQ
Bagaimana mengubah kedua RQ ini menjadi NHST?

RQ1. Are source code elements with lower maintainability subject to more refactorings in practice? 
Cara jawabnya ?
6.1.1 Interpretation of the results for classes and methods
6.1.2. Comparison with the base dataset results


RQ2. What are the typical values of source code metrics of the refactored and non-refactored elements and how do they change upon refactorings? 

Cara jawabnya ?
6.2.1. Interpretation of the results for classes
6.2.2. Interpretation of the results for methods
6.2.3. Comparison with the base dataset results


# PR-KU !!

## Metric yang digunakan

### RMI vs harmfulness 
apakah RMI itu ?
RMI jadi alat ukurnya ?
RMI itu seperti harmfulness ?

RMI = Relative Maintainability Index

### Another metric
Size, complexity, cloning metric, coupling, cohesion

## statistical test yg digunakan ?
Correlation  
Effect Test : Mann Whitney
Effect Size

## p-value 
muncul 29 kali dalam konteks 3 statistical test diatas

## cara improve dataset ?

# Yang saya dapatkan dari makalah ini

## Kontribusi dari papernya
1. improve Dataset juga bisa jadi kontribusi, Dataset Refactoring yang di improve dibanding dengan dataset pada paper empirical yg sebelumnya
2. 

# Reference 
Péter et al, Empirical evaluation of software maintainability based on a manually validated refactoring dataset, 2017
