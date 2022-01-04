bieman - visualization change proneness.txt  
During software evolution, adaptive, and corrective maintenance are common reasons for changes. Often such changes cluster around key components. 

It is therefore important to analyze 
1. the frequency of changes to individual classes, but, more importantly, to also 
2. identify and show related changes in multiple classes. 
Frequent changes in clusters of classes may be 
1. due to their importance, 
2. due to the underlying architecture or 
3. due to chronic problems. 

Knowing where those change-prone clusters are can help 1. focus attention, 
2. identify targets for re-engineering and 
2. thus provide product-based information to steer maintenance processes. 

This paper describes a method to identify and visualize classes and class interactions that are the most changeprone. The method was applied to a commercial embedded, real-time software system. It is object-oriented software that was developed using design patterns.  

During software evolution series of changes are made to software. Changes can be due to a variety of reasons such as enhancements, adaptation, perfective maintenance or fixing defects. Some parts of the software may be more prone to changes than others. Knowing which classes are changeprone can be very helpful; change-proneness may indicate specific underlying quality issues. If a maintenance process can identify what parts of the software are change-prone then specific remedial actions can be taken. Thus, knowing where most changes are made over time can identify key change-prone classes, key change-prone interactions, and the evolution process can focus attention on them. Underlying reasons explaining why a class is change-prone can vary widely. There may be specific quality problems due to code decay (if changes are due to defect repair), the underlying architecture may have problems (again, if changes are due to defect repair) or encourage changes in certain classes (to add functionality or adaptations). Regardless, it is useful to know what these key classes and interactions are so that they get proper attention. Actions may range from stepped up quality assurance efforts to refactoring depending on the underlying cause for change-proneness. While changes in individual classes can be counted, this does not reveal important aspects of code changes. Changes in response to a single defect report or change request may be local to a class and involve changes in only that single class, or may involve a whole collection of classes. The latter arguably may be more difficult to understand, take more effort to implement and to implement correctly. In addition, collections of classes that experience frequent changes together should be made visible, since they are prime targets for stepped up comprehension and possibly improvement efforts. We thus are not only interested in identifying and making visible classes that see the most lines of code changed, but, more importantly, identifying and visualizing classes that experience frequent changes together. That is, showing changes in these classes that are related. We call this change-coupling between classes. In addition, it is important to analyze whether changeprone clusters of classes represent design structures and change-related interactions represent logical design interactions or not. Patterns are examples of clusters of classes that represent design structures (although not the only ones). A prior study of a commercial software development project by Bieman et al. [3] found that classes that play roles in design patterns were more, rather than less change prone. However, this analysis only counted number of changes in classes, but did not analyze whether changes in clusters of classes were related to the same change request, i. e. whether classes were change-coupled. Such an analysis can provide further understanding of the nature of the changes and how developers interact with a system.  In this case study, we analyze the data from the prior study, a sizeable C++ system built using patterns, examining ways to visualize and analyze the changes. The research questions we investigate are: 
1. Is there a way to identify and visualize the most change-prone collections of classes in an objectoriented system? 
2. Can change-proneness distinguish between local change-proneness and change-proneness due to change interactions of classes? 
3. Do individual changes made in response to one “change request” affect only classes that are linked in the logical design of a system, or are there implicit connections between system elements that are not part of any design representation? 
4. How do we make this information visible?  

Section 2 gives background on existing work related to
visualing software system evolution and fault-prone and
change-prone behavior. Section 3 defines our analysis
method. Section 4 describes a case study that applies this method to analyze an industrial software system containing patterns. Section 5 draws conclusions and points out limitations of our study.

3. approach
