class DeterminingMetricThreshold{
	void introduction(){
		// In this chapter, we discuss the problem of metrics thresholds derivation, and 
		problemStatement()
		// we present the method to derive thresholds for software design metrics in the context of code smells detection. 
		smellThresholdsDerivation()
	}

	class ProblemStatement {
		class ImperfectApproach{
			// Imperfect Deriving Threshold Approach
			String drawback;
			void commonError(){
				return "lack of generality";
			}
		}

		// 5.1
		public problemStatement(){			
			smellChecking(metric)
			ImperfectApproach experience = new ImperfectApproach();
			ImperfectApproach metricAnalysis = new ImperfectApproach();
			ImperfectApproach correlateToBug = new ImperfectApproach();
			experience.drawback = 'difficult to generalize to different software system';	
			metricAnalysis.drawback = 'assume that distribution of metric is normal leads to the use of wrong statistical techniques';	
			correlateToBug.drawback = 'generally are valid only for a specific error prediction model';	
			solution = alvesBaseline();
		}


		/***
		 The thresholds are derived with system  maintainability evaluation in mind. The main characteristics of the method proposed by Alves et al. in [3] are :
			  the method should not be driven by expert opinion but by measurement data from representative set of systems (data-driven);
			  the method should respect the statistical properties of the metric, such as metric scale and distribution and should be resilient against outliers in metric values and system size (robust);
			  the method should be repeatable, transparent, and straightforward to carry out (pragmatic).
		***/
		void alvesBaseline(){
			alvesThresholdCharacteristics = [
				"notDrivenByExpert",
				"respectStatisticalProperties",
				"shouldBeRepeatable",
				"shouldBeTransparent",
				"straightForwardToCarryOut"
			]
		}

		// Setting a threshold allows to correctly interpret the values we compute on a software system, so that we can evaluate its quality. 
		void setThresholds(){
			// Some problems arise when identifying thresholds. 
			if(isProblemIdentThresholdsSolved() == true){

			}else{

			}
		}

		void avoidMeaningless(){			
			meaningless = (CDISP = 10 OR CDISP = 100 OR CDISP = 1000) 
			10.isItTooLowForDisp? OR 1000.isItTooHighForDisp?
		}

		/*
			We must know what is metric too high or too low ?
			Metrics, by themselves, do not mean anything: we need some reference values, to be used as thresholds. 
		*/
		void smellChecking(metric){
			if(avoidMeaningless()==true){
				referenceVal = setThresholds()
				if (metric < referenceVal) {
					return 'too low'
				}else if(metric > referenceVal) {
					return 'too high'
				}else{
					return 'good'
				}				
			}
		}

		

	}
	

	class SmellsMetricsThresholdsDerivation{
		class SmellsMetricsThresholdsDefinition{
		void smellThresholdsDerivation(){
			// We use common fractions (e.g., fraction like 1⁄2) to derive thresholds for metrics defined as ratio of values, and an automated method to empirically derive metrics thresholds from the measurement of a benchmark of software systems, for metrics defined in ℝ or ℕ. 

			// Respect to metrics defined in ℝ or ℕ, we first pool and aggregate the measurement data for different software systems. 
			// Then we derive five different thresholds that 
			// (i) respect the statistical properties of the metric, i.e., its distribution and 
			// (ii) help focusing on the most interesting values. 
			// We aggregate the measurement data in a customized way based on the code smell we derive thresholds for.		
			// Code smells define some properties of software design that should be identified in the system to capture potential problems. 

		}
		
		void 
		// The defined properties are often in the form of "identify classes that have LOW cohesion" or "identify methods that have a VERY-HIGH complexity". 

		// We want to derive thresholds in a way that they can be semantically mapped to these informal requirements, to find out what LOW cohesion or VERY-HIGH complexity means in terms of the metrics we use to measure cohesion and complexityof the software system.


		void fiveThreshold(){
			// With this need in mind, we compute, for each metric, a set of five thresholds that identifies five points on the metrics distribution, for BBTs, and five points among common fractions for CFTs.
			// We define a threshold using three attributes:
			//  a name or label;
			//  a corresponding percentile (for BBT), or a corresponding common fraction (for CFT);
			//  a type.
			// We use the name to refer to a threshold with a semantic meaning. 
			// The names we use for the five thresholds are:  VERY-LOW, LOW, MEAN, HIGH, VERY-HIGH. VERY-LOW represents the lowest threshold, while VERY-HIGH the highest one. 
			// We call VERY-LOW and VERY-HIGH extreme thresholds.		
		}

		// The corresponding percentile, or 𝑇ℎ𝑃𝑜𝑖𝑛𝑡, is the point on the reference set of points (i.e., the percentiles of the metrics distribution) representing where to find the value for the given threshold (i.e., 𝑇ℎ𝑉𝑎𝑙𝑢𝑒).
		// The corresponding common fraction is the 𝑇ℎ𝑃𝑜𝑖𝑛𝑡 on the reference set of
		// common fractions, that represents where to find the value for CFTs (i.e.,
		// 𝑇ℎ𝑉𝑎𝑙𝑢𝑒).
		void mappingThreshold(){
			// Each threshold is mapped to a value by the function 𝑇ℎ𝑉𝑎𝑙𝑢𝑒 = 𝑣𝑎𝑙𝑢𝑒𝑂𝑓(𝑇ℎ𝑃𝑜𝑖𝑛𝑡).  	𝑇ℎ𝑉𝑎𝑙𝑢𝑒  is the threshold used for comparing other values of the metric. As part of our code smells detection approach, described in Chapter 6, we offer to the user the possibility of hardening or softening thresholds values. Hardening or softening threshold values is useful because of the difficulty to generalize the obtained thresholds to all the possible software systems; we offer to the user the possibility of moving thresholds to achieve more or less strict constraints. The type allows us to define different typologies of thresholds for each name/label, based on the selection we do in these sense.  

		}
		void threePossibleTypeOfThreshold(){
			// We define three possible types of thresholds: 
			defaultVal();
			harden();
			soften();
				
			// When we set Harden and Soften, we have to refer to the characteristics of the metric and to the property of the system we want to measure, to understand if they have a direct or inverse correlation. 
			// To select properly the threshold we refer always to the definition we give in Appendix B2, in particularly to the "Worse" attribute, and to the detection strategies we define for each code smell in Chapter 6. 
			// As for example, consider the LOC metric and a generic 𝑇ℎ𝑉𝑎𝑙𝑢𝑒 corresponding to the HIGH threshold. 
			// If we want to capture "class with a HIGH number of lines of code", 
			// we can compare LOC and 𝑇ℎ𝑉𝑎𝑙𝑢𝑒 using: 𝐿𝑂𝐶 ≥ 𝑣𝑎𝑙𝑢𝑒𝑂𝑓(HIGH). 
			// Hardening the threshold in this situation means that we have to select a greater 𝑇ℎ𝑉𝑎𝑙𝑢𝑒 for the HIGH threshold, so that the number of entities that exceeds the threshold can be reduced. 
			// Conversely, if we want to capture "class with a LOW number of lines of code", we can compare LOC to the 𝑇ℎ𝑉𝑎𝑙𝑢𝑒 corresponding to the LOW threshold: 𝐿𝑂𝐶 ≤ 𝑣𝑎𝑙𝑢𝑒𝑂𝑓(𝐿𝑂𝑊). Here hardening the threshold means that we have to select a lower 𝑇ℎ𝑉𝑎𝑙𝑢𝑒 for the LOW threshold, so that the number of entities that exceeds the threshold can be reduced. 

			// In Sections 5.2.2 and 5.2.3, we discuss in details the attributes of the thresholds we defined, based on the way we derive thresholds (i.e., Benchmark - Based Thresholds or Common Fraction Thresholds).
		}

		void defaultVal(){
			//  Default: the default selection we offer to the user; 
		}

		void harden(){
			//  Harden: the set of thresholds we offer to the user when he wants to try to reduce the number of entities evaluated as affected by a code smell  
		}

		void soften(){
			//  Soften: the set of thresholds we offer to the user when he wants to try to raise the number of entities evaluated as affected by a code smell. 
		}
		}
		class CommonFractionThresholds{

		}
		class BenchmarkBasedThresholds{

		}
	}
	
	class Conclusion{

	}
}