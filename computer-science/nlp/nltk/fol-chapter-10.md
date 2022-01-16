FOL-chapter-10.md

# First order logic for NL?
First order logic is a suitable language for representing natural language meaning in a computational setting since it is flexible enough to represent many useful aspects of natural meaning, and there are efficient theorem provers for reasoning with first order logic. (Equally, there are a variety of phenomena in natural language semantics which are believed to require more powerful logical mechanisms.)

suitable_language(FOL,NL_meaning)
represent(FOL,NL_meaning)
flexible(FOL)
represent(FOL,many_aspects_NL)

there are efficient_theorm(FOL)
quantifier = there are vs nothing
-efficient_theorm == not_efficient_theorm
require(phenomena_in_NL,more_powerful_logic_mechanism)  

more_powerful_logic_mechanism meaning there are level of logic_mechanism
1. propositional
2. FOL
3. HOL

# State truth conditions
As well as translating natural language sentences into first order logic, we can state the truth conditions of these sentences by examining models of first order formulas.
In order to build meaning representations compositionally, we supplement first order logic with the λ calculus.
β-reduction in the λ-calculus corresponds semantically to application of a function to an argument. Syntactically, it involves replacing a variable bound by λ in the function expression with the expression that provides the argument in the function application.
A key part of constructing a model lies in building a valuation which assigns interpretations to non-logical constants. These are interpreted as either n-ary predicates or as individual constants.
An open expression is an expression containing one or more free variables. Open expressions only receive an interpretation when their free variables receive values from a variable assignment.
Quantifiers are interpreted by constructing, for a formula φ[x] open in variable x, the set of individuals which make φ[x] true when an assignment g assigns them as the value of x. The quantifier then places constraints on that set.
A closed expression is one that has no free variables; that is, the variables are all bound. A closed sentence is true or false with respect to all variable assignments.
If two formulas differ only in the label of the variable bound by binding operator (i.e, λ or a quantifier) , they are said to be α equivalents. The result of relabeling a bound variable in a formula is called α-conversion.
Given a formula with two nested quantifiers Q1 and Q2, the outermost quantifier Q1 is said to have wide scope (or scope over Q2). English sentences are frequently ambiguous with respect to the scope of the quantifiers they contain.
English sentences can be associated with a semantic representation by treating sem as a feature in a feature-based grammar. The sem value of a complex expressions typically involves functional application of the sem values of the component expressions.