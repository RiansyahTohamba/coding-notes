To concisely describe our research motivations, we framed the following research questions, which we investigated with the help of the improved dataset: 

Motivasi riset bisa dilihat melalui 2 RQ berikut + improved dataset :

# RQ1. Apakah kode dengan low maintainability menjadi sasaran 'more' refactoring?
Jadi bukan hanya improving structure tapi memang terdapat asumsi bahwa ditemukannya strukutur kode yg 'poor' menjadi 'primer driver' dilakukannya refactoring.

Diperlukan 'maintainability values' dari 
1. refactored dan
2. non-refactored source code elements 
untuk melihat patterns apakah
to see whether there are patterns that support or contradict this assumption. 

By applying statistical methods on the refactoring data contained in our dataset we found that the low maintainability values of source code entities indeed triggered more code refactorings in practice. 

# RQ2. typical values of source code metrics

RQ2. What are the typical values of source code metrics of the refactored and non-refactored elements and how do they change upon refactorings? 

The first research question investigates the maintainability of the refactored and non-refactored source code elements, but we were also interested in the typical source code metric values of these elements and the effects of refactorings on these metrics. 

Although the RMI itself relies on source code metrics, it uses and combines only a small fraction of the available metrics (i.e. those extracted by SourceMeter). 

We wanted to analyze each and every metric by itself to get a deeper insight about the effect of refactorings on them. Moreover, besides the sheer metric values we were also interested in their changes throughout the releases. Therefore, in 

RQ2 we examined how do the well-known source code metrics, like complexity, lines of code, coupling, etc., shape and change for the refactored and non-refactored source code elements. In general, we found that source code elements that were refactored had significantly different (typically higher) size related metrics (e.g. lines of code, number of statements), complexity (e.g. McCabe’s cyclomatic complexity [16], nesting level) and coupling (e.g. coupling between object classes and number of incoming invocations) on average than source code elements not refactored at all. 

Moreover, these were the metrics that changed more significantly in the refactored elements than in the non-refactored ones. 

Additionally, we found no such metric that would be consistently larger in the nonrefactored classes and/or would grow much slower in non-refactored classes than in the refactored ones. We also compared the findings with the previous results obtained on the not validated refactoring dataset and found that most of the metric groups found to be relevant in connection with refactoring was the same for both datasets. 

However, while previous results displayed 2–4 significant cases out of 7, we obtained 3–6 significant cases with much stronger p-values using the manually validated dataset. We also identified that clone related metrics had no strong connection with refactoring, even though previous results on the not validated dataset suggested so due to the false positive refactoring instances. The main contributions of the paper can be summarized as follows. In the conference version [14] we already presented: 

• A manually validated dataset containing true positive refactoring instances attached to source code elements at method and class level and their source code metrics and maintainability scores. 

• An extension of the RefFinder tool that allows batch-style analysis and result reporting attached to the source code elements. 

• An empirical investigation of the maintainability scores of the source code classes and methods affected by at least one refactoring and those of not. 

On the basis of the achieved positive results so far, in this paper we extend our previous analysis with: 

• An empirical evaluation of the main quality properties (i.e. source code metrics) and their changes due to refactoring (an entirely new research question). 

• A comparison of the findings with the previous results obtained on the not validated refactoring dataset. 

• Detailed information of the existing and new statistical test results and an extended discussion of them. 

• We made our data analysis results available online just like the dataset itself. The rest of the paper is organized as follows. 

First, we start with a related literature overview in Section 2. 

Next, Section 3 outlines the data collection and validation process of creating the dataset. 

We describe the data analysis methodology applied for answering the research questions in Section 4. 

In Section 5, we display the results of our empirical investigation on the maintainability and source code metrics of refactored and non-refactored source code entities. The threats to the validity of our results are listed in Section 7. Finally, we conclude the paper in Section 8.

# Answering RQ
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


keyword p-value 29 kali muncul





