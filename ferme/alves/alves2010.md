# Title : Deriving Metric Thresholds from Benchmark Data
# Author : 2010 - SIG - Alves et al
SIG = Software Improvement Group, mereka juga ikutan publish paper, luar biasa
https://www.softwareimprovementgroup.com/

# Contents
	1. Introduction
	2. Related Work
		A. Thresholds derived from experience
		B. Thresholds from metric analysis
		C. Thresholds using error models
		D. Thresholds using cluster techniques
		E. Methodologies for characterizing metric distribution	
	3. Motivating Example
	4. Benchmark Based Thresholds derivation
	5. Benchmarking 
	6. Analysis of the Methodology Steps
		a. background
		b. weighting by size
		c. using relative size
		d. choosing percentile thresholds	
	7. Variants and Threats
		a. weight by size
		b. use of relative weight
		c. outliers
		d. impact of the tools/scoping
	8. Thresholds SIG'S quality models metrics
	9. Conclusion

# Abstract
4 paragraf
ide paragraf 1 = meaningless threshold
Sudah banyak proposal ttg software metric dan juga tools untuk mengukurnya.
Apakah penggunaan metrik sdh efektif? 
Threshold untuk menyatakan kode kita beramasalah masih 'meaningless'.
Threshold yg dibuat hanya untuk beberapa metrik saja, itupun kebanyakan berdasarkan pada 
1. opini expert
2. jumlah observasi yang masih sedikit. 
==
ide paragraf 2 = scope validity of existing proposed thresholds masih sempit
Sebelumnya, sudah ada upaya for deriving thresholds.
Previous method for deriving thresholds for metric use asumsi yg tidak dapat dibenarkan(unjustified asumption) mengenai statistical properties of source code metric.
akhirnya general validity of the derivation method menyempit dan became dangerous when it will be generally applied.
==
ide paragraf 3 = usulan alves
Alves et al try to solve those problems by presenting :
"how to derive thresholds empirically from measurement data".
tahapan derive threshold
1. karakter derivated selected threshold : 
(i) memunculkan variabilitas metrik antara sistem dan
(ii) membantu fokus pada persentase yang wajar (reasonable percentage) dari volume kode sumber. 
2. The measurement data for different software systems  dikumpulkan dan digabungkan (are pooled and aggregated)
===
ide paragraf 4 = diuji ke 100 OO source code

# 1. Introduction
5 paragraf
ide paragraf 1 = Kemunculan metric dan Manfaatnya
ide paragraf 2 = Metric masih belum efektif digunakan untuk decision making
ide paragraf 3 = Agar efektif, metric diberikan thresholds. Validitas thresholds yg ada masih pada jenis software tertentu
ide paragraf 4 = requirement dari method yg dibuat
ide paragraf 5 = struktur paper
==
Opiniku
Meaningless Threshold
Scope of validity existing thresholds sempit, dikarenakan experience, cuman software yang tuliskan oleh sang pembobot thresholds.

# 2. Related Work
Beberapa methodology for derivating thresholds

## A. Thresholds derived from experience

### Definition
McCabe experience

### Dis-advantage
Scope of validity, bisa jadi untuk software jenis tersebut (CRUD), memang CDISP tidak boleh lebih dari 20 (CDISP < 20), tapi untuk software jenis lain tidak apa-apa CDISP lebih dari 20
1. difficult to reproduce or generalize these results. 
2. the lack of scientific support can lead to perselisihan mengenai nilai thresholds yang disepakati

### Against Alves Method
apa ya?

## B. Thresholds from metric analysis

### Erni Method
Karin Erni from ABB, using mean and std deviasi to derivate T.
T = µ + σ  atau  T = µ − σ 
Baik nilai T yang tinggi atau rendah mengindikasikan bahwa ada masalah.

This methodology is a common statistical technique which, when data is normally distributed, identifies 16% of the observations.


#### Dis-advantage
1. Not analyze the underlying distribution, and 
2. only apply it to one system (albeit using three releases). 


1. distribusi metric tidaklah normal 
Beberapa software punya metric yang berbeda, misal
10 % code (CBO < 20)
10 %
10 % code  (CBO > 20 < 40)
10 % 
jadi sebaran metric tidak merata,skew.

Metode erni akan salah mengira sebuah kode bermasalah dikarenakan masuk 16 % observations, padahal kode itu baik-baik saja.

For metrics with high values and high variability, this methodology will identify less
than 16% of code, while for metrics with low values or low variability, this methodology will identify more than 16% of code. 

#### Against Alves Method
In contrast, our approach does not make assumption about data normality. Moreover, we apply our methodology to 100 projects, both proprietary and open-source.

### French Method
French use (mean and std deviasi ) + Chebyshev’s inequality
Penggunaan Chebyshev’s inequality tak terbatas untuk distribution normal saja.
Rumus French : 
T = µ + k × σ, 
where k = number of standard deviations. 
According to Chebyshev’s theorem, for any distribution 1/k^2 is the maximal portion of observations outside k standard deviations.

#### Dis-advantage
However, French proposes to divide the Chebyshev formula by two which is only valid for two-tailed symmetric distributions. 
asumsi two-tailed symmetric distributions is not justified. 

For one tailed distributions, the Cantelli’s formula, 1/(1+k2), should have been used instead.

This methodology is sensitive to large numbers or outliers. 
For metrics with high range or high variation, this technique will identify a smaller percentage of observations than its theoretical maximum. 

#### Against Alves Method
1. alves derive thresholds from benchmark data and 
2. such is resilient to high variation of data our outliers.
3. French 'only' use 8 software (C++ dan ADA), alves use 100 software

## C. Thresholds using error models

### Shatnawi method
#### Dis-advantage
apa ya?
#### Against Alves Method
apa ya?

### Benlarbi method
#### Dis-advantage
apa ya?
#### Against Alves Method
apa ya?

### El Eman method
#### Dis-advantage
apa ya?
#### Against Alves Method
apa ya?

## D. Thresholds using cluster techniques
### Definition
Proposed by Yoon et al. 

They investigate the use of the K-means Cluster algorithm to identify outliers in the data measurements.

Outliers can be identified by observations that appear either 2 kind of outliers including : 
1. external outliers : in isolated clusters , or 
2. internal outliers : by observations that appear far away from other observations within the same cluster.

### Dis-advantage
However, this algorithm suffers from several shortcomings: 
1. accuracy affected by input parameter
it requires an input parameter that affects both the performance and the accuracy of the results,
2. manually identifying outlier
the process of identifying the outliers is manual, after identifying outliers the algorithm should be executed again, and 
3. unstable
if new systems are added to the sample the thresholds might change significantly.

### Against Alves Method
In contrast, our methodology  
1. accuracy is not influenced by input parameters, 
2. it is automatic, and 
3. stable (the addition of more systems results only in small variation). 


## E. Methodologies for characterizing metric distribution	
### Chidamber and Kemerer - CK metric

### Spinellis 
For each metric, box plots of the four kernels (of OS) are put side-by side showing the smallest observation, lower quantile, median, mean, higher quantile, highest observation and identify outliers. 
The box-plots are then analyzed by the author and used to give ranks, + or −, to each kernel. 
However, as the author states, ranks are given subjectively.

### Vasa
Propose gini coeficients

### Against alves method
However all the studies fall short in concluding how to use these distributions, and the coefficients of the distributions, to establish baseline values to judge systems. 

Moreover, even if such baseline values were established it would not be possible
to identify the code responsible for deviations (there is no
traceability of results). In contrast, our research is focused
on defining thresholds with direct applicability to differentiate
software systems, judge quality and pinpoint problems

# 3. Motivating Example
komparasi 4 P2P software
quality berbasis SIG quality model.

One of the used metrics is the McCabe metric


# 4. Benchmark based thresholds derivation
### Figure of Methodology Step 
1. metrics extraction
	1 sistem punya banyak entitas
	1 entitas punya banyak metric=bobot
	System ⇀ (Entity ⇀ Metric x Weight)
2. weight ratio calculation
	1 sistem punya banyak entitas
	1 entitas punya banyak metric=weightratio
	System ⇀ (Entity ⇀ Metric x WeightRatio)
3. entity aggregation
	1 sistem punya banyak metric
	1 metric punya banyak WeightRatio
	System ⇀ (Metric ⇀ WeightRatio)
4. system aggregation
	Metric ⇀ WeightRatio
5. weight ratio aggregation
	Metric Metric Metric
	WeightRatio ⇀ Metric
6. thresholds derivation
	70% 80% 90%
Legend
⇀ map relation (one-to-many relationship)
x product (pair of columns or elements)
System = Represents individual systems (e.g. Vuze)
Entity = Represents a measurable entity (e.g java method)
Metric = Represents a metric value (e.g. McCabe of 5)
Weight = Represents the weight value (e.g. LOC of 10)
WeightRatio = Represents the weight percentage inside of the system (e.g. entity LOC divided by system LOC)

# 5. Benchmarking 

# 6. Analysis of the methodology steps

## A. Background
## B. Weighting by size
## C. Using relative size
## D. Choosing percentile thresholds	

# 7. Variants and threats

## A. Weight by size
## B. Use of relative weight
## C. Outliers

## D. Impact of the tools/scoping

# 8. Thresholds SIG'S quality models metrics

# 9. Conclusion
##	A. Contributions
We proposed a novel methodology for deriving software metric thresholds and a calibration of previously introduced metrics. 
Our methodology improves over others by fulfilling three fundamental requirements: 
i) it respects the statistical properties of the metric, such as metric scale and distribution;
ii) it is based on data analysis from a representative set of systems (benchmark); 
iii) it is repeatable, transparent and straightforward to carry out. These requirements were achieved by aggregating measurements from different systems using relative size weighting. Our methodology was applied to a large set of systems and thresholds were derived by choosing specific percentages of overall code of the benchmark.
##	b. Discussion
##	c. Industrial applications

##	d. Future work

#  Software Clasification 
Calsified Software by its Functionality
alves et al menggunakan 100 software untuk menurunkan nilai metric nya

This Table characterizes the used software systems according to their
functionality using the taxonomy defined by ISBSG in [18].

C. Lokan, "The Benchmark Release 10 - project planning edition,"
International Software Benchmarcking Standards Groups Ltd., Tech.
Rep., February 2008.

Table Number of systems per functionality

Functionality type | Total
Catalogue or register of things or events | 8
Customer billing or relationship management 5
Document management 5
Electronic data interchange 3
Financial transaction processing and accounting 12
Geographic or spatial information systems 2
Graphics and publishing tools or system 2
Embedded software for machine control 3
Job, case, incident or project management 6
Logistic or supply planning and control 8
Management or performance reporting 2
Mathematical modeling (finance or engineering) 1
Online analysis and reporting 6
Operating systems or software utility 14
Software development tool 3
Stock control and order processing 1
Trading 1
Workflow support and management 10
Other 8
Total 100
