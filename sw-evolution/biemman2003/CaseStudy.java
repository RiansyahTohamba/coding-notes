// bagian 4 biemman
public class CaseStudy{
	public void aboutSourceCode(){
		SourceCode scod = new SourceCode();
		scod.type = "commercial";
		scod.language = "C++";

		scod.desc = "The system is a key part of an embedded real-time storage management system.";
		
		scod.vcs = "The system was developed with the support of a version control system over a period of several years.";
		scod.vcsAllowed = "The version control system allowed us to obtain multiple versions of the system"; 
		scod.dataCollected = "transformations between 39 versions.";

		"This development project took place while the organization was in the process of adopting object-oriented methods.  Experienced objectoriented developers developed the system; they also made use of object-oriented design patterns. ";
	}
	public void versionControlSys(){
		ourFocus = "Our focus has been the transformations between two specific versions of the system:versi A TO B";

		VersionCode versionA = new VersionCode();
		versionA.stage = "first_stable";
		VersionCode versionB = new VersionCode();
		versionB.stage = "final";

		"Version A consists of 199 classes and approximately 24,000 lines of source code. Version B has 227 classes with approximately 32,000 lines of code. Of the 199 classes in Version A, 191 also appear in Version B. The 191 classes that appear in both Version A and Version B and all of the transformations between the versions are the focus of this study."		
	}
	public void voidTheRest(){
		"We extracted the class diagrams of versions A and B from the code and used the diagrams for pattern identification as well as metrics collection. The size and relationship measures were generated only for the classes in version A, since we are trying to identify the properties of the earlier version that can predict the number of changes that will later be applied. We count the number of changes to each class that occur in the transitions from version A to version B, through 37 intermediate versions. This count is a tally of the number of changes that are logged on the version control system for each class during the 39 version transitions. Changes can be corrective, adaptive, perfective, or preventive. As is the case with many industrial systems, the system under study had no maintenance history other than the comments in the code, the version control logs, and the recollection of the few system developers that we could find. Our analysis of different classes of changes did not show any differences between the change type. We used two key criteria to group changes to individual classes as elements of one change: matching comments documenting the changes, and matching check-in time stamps — check-ins within one minute of each other. Version A of the system contained 18 classes that play roles in 16 pattern instances of four pattern types — Singleton, Factory method, Proxy and Iterator patterns. Fig. 2 shows the distribution in the change-proneness values for each measurement as box plots. Most of the values for each of the three change-proneness measures are quite low — the boxes stay very close to the origin. This means that at least 75% of the measurements were at or very close to zero. Change-prone classes are identified through box plot outlier analysis as those with LCP values above 10% of the highest LCP value — 36 out of 191 classes, in class pairs with above 50% of the highest PCC values — 29 out of 924 class pairs, and SPC values above 12% of the highest SPC values — 29 out of 191 classes. The SPC threshold was set at a gap in the outliers. Seventeen classes are beyond the threshold for all three criteria; these are the change-prone classes. This data clearly shows that there are clusters of classes whose changes are related, i. e. are change-coupled. Observe that the outliers for the SPC measure have much higher values than for PCC. That is because several classes are members of many coupled pairs with few changes involving each pair. Fig. 3 depicts the change-prone class diagram. It uses a UML-like notation to show the relationships between the change-prone classes. Of the change-prone classes, five classes play roles in design patterns. Three are Singleton classes, one is an Iterator class, and one plays a role in a Proxy pattern. Thus, five of the seventeen change-prone classes or 29% are pattern classes, while in all of system version A there are 18 pattern classes out of 191 classes or 9%. Another comparison is that the 5 change-prone pattern classes represent 28% of the pattern classes, while the 12 change-prone non-pattern classes represent 7% of the nonpattern classes. Pattern classes are clearly overrepresented in the set of change-prone classes. One of our research questions was how to make these change-prone classes, class clusters, and their change relationships visible. We do this through (1) definition of the three change-proneness measures, (2) setting an appropriate threshoold (through boxplot analysis) to identify the relationships that should be visualized, and (3) graphing the remaining change-prone class clusters and the magnitude of change-relationships in a change-architecture diagram. Fig. 4 shows the change architecture diagram. Except for class C1, the change-prone classes form a connected graph. That is, classes C1 through C17 are linked by chains of pair couplings. Class C1 is not pair coupled with any of the other change-prone classes; it meets the change-prone threshold for PCC and SPC through many pair couplings with classes that are not change-prone. Four of the five change-prone pattern classes are linked directly through pair couplings. Class C7 is directly linked to nine of the other change-prone classes. To answer our third research question, we compare the links in the change architecture shown in Fig. 4 with the logical structure of the implementation shown in Fig. 3. One observation is that the links in the two figures do not match. Several classes, for example C6 and C11, are linked in the change architecture (Fig. 4), but not in the class diagram (Fig. 3). C17, one of the pattern classes, is linked in the change architecture diagram to three other pattern classes — C8, C15, and C16, but C17 is not linked to these classes in the class diagram. These sets of classes may have been changed in response to a non-functional requirement, such as performance. Such a change might not be reflected in the design. The class-level properties of the change-prone classes differ from those of the classes that are not change-prone. Table 1 gives the measurements for the change-prone classes, while Table 2 are the measurements for the remaining ones. First, the change-prone classes are changed far more often than the non change prone ones. The mean total number of changes (Tchanges) for change-prone classes is more than ten times higher than for non-change prone classes, and the median Tchanges is 18 times higher. The change prone classes tend to be larger — they have more attributes and operations. Neither group makes much use of C++ friends. There seems to be little difference in the num ber of methods overridden (MO) for the two groups. The median depth of inheritance (DOI) is two for the changeprone group and one for the non-change prone group. The median values for the number of direct child classes (DCC) and descendents (DCC) are zero for both groups. However, the means are higher for the change-prone classes, especially for DCC. However, the comparatively high value of the mean for change-prone descendants (Desc) can be due to one or two change-prone classes with many descendents in the small sample.";		
	}
}



