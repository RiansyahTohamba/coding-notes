interface SWDesignMetric{
	// 	The difference is due to the existence of some metrics, 
	// 1. like TCC, that are defined in terms of normalized ratio with a well-defined semantics, and 
	// 2. other metrics (e.g., LOC) having their values on an interval of the extended real number line (i.e., ℝ or [−∞, +∞]) or of the natural number line (i.e.,ℕ0).
	
}

class NormalizedRatio implements SWDesignMetric {
	// example : TCC
	// desc
	// For the first type of metrics we select thresholds according to common fractions (e.g., 1⁄2), that identify a point in the [0,1] interval with a well-defined semantic, with respect to the rationale that defines the metric. 
	// TCC
	// We use this technique for metrics like Tight Class Cohesion (TCC), that is defined as "the normalized ratio between the number of methods directly connected with other methods through an instance variable and the total number of possible connections between methods" [41]. 

	// When we think at LOW values for this metric, we refer to values lower or equal than 1⁄3 fraction, which, in the case of TCC, means utmost 1⁄3 of the possible method-method connections of the class are present.

}
class MetricReal implements SWDesignMetric {
	// example : LOC
	String examples = ["LOC"]
	String distributions = "skewed"

	// For the second type of metrics, whose distributions are often heavily
	// skewed, we propose an automatic method to derive thresholds. 
	// Starting from metric values computed on a benchmark of software systems, it determines
	// thresholds that 
	// (i) are customized based on the code smell for which we use the metric, 
	// (ii) respects the statistical properties of the metric, such as its distribution, and 
	// (iii) helps focusing on the most interesting metric values.
	// Both the methods allow us to obtain valid thresholds for a wide range of different metrics. 
	// We use these thresholds in Chapter 6, when we define code smells detection strategies and information related to the presence of code smell in the system.
}