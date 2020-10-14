# Robust model
## Data driven
Bukan berdasarkan pengalaman

## Deal with High Variance
Bisa prediksi pada populasi yg tdk normal sekalipun(skew and imbalance)

Some statistical tests are robust and some are not. What exactly does robustness mean?

Moreover, sometimes, robustness and powerfulness of a test are discussed together. 
And intuitively, I couldn't differentiate between the two concepts. 
1. What is a powerful test? 
2. How is it different from a robust statistical test?

Answer : 

Robustness has various meanings in statistics, but all imply some resilience to changes in the type of data used. This may sound a bit ambiguous, but that is because robustness can refer to different kinds of insensitivities to changes. For example:

Robustness to outliers
Robustness to non-normality
Robustness to non-constant variance (or heteroscedasticity)

In the case of tests, robustness usually refers to the test still being valid given such a change. 

In other words, whether the outcome is significant or not is only meaningful if the assumptions of the test are met. When such assumptions are relaxed (i.e. not as important), the test is said to be robust.

The power of a test is its ability to detect a significant difference if there is a true difference. 

The reason specific tests and models are used with various assumptions is that these assumptions simplify the problem (e.g. require less parameters to be estimated). The more assumptions a test makes, the less robust it is, because all these assumptions must be met for the test to be valid.

On the other hand, a test with fewer assumptions is more robust. However, robustness generally comes at the cost of power, because either less information from the input is used, or more parameters need to be estimated.

Robust
A 𝑡t-test could be said to be robust, because while it assumes normally distributed groups, it is still a valid test for comparing approximately normally distributed groups.

A Wilcoxon test is less powerful when the assumptions of the 𝑡t-test are met, but it is more robust, because it does not assume an underlying distribution and is thus valid for non-normal data. Its power is generally lower because it uses the ranks of the data, rather than the original numbers and thus essentially discards some information.

Not Robust
An 𝐹F-test is a comparison of variances, but it is very sensitive to non-normality and therefore invalid for approximate normality. In other words, the 𝐹F-test is not robust.

https://stats.stackexchange.com/questions/312552/what-is-a-robust-statistical-test-what-is-a-powerful-statistical-test/312566#312566

## Resilient against outlier
Maksudnya apa?
