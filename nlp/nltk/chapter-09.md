# chapter 9 Building Feature Based Grammars
NL 
# chapter 8 saja tidak cukup
Natural languages (NL) punya berbagai macam (extensive-range) of 'grammatical constructions' which are hard to handle with the simple methods described in 8.

# change grammatical categories
In order to gain more flexibility, we change our treatment of grammatical categories like S, NP and V. In place of atomic labels, we decompose them into structures like dictionaries, where features can take on a range of values. 

# goal untuk answer RQ 
1. How can we extend the framework of context free grammars with features so as to gain more fine-grained control over grammatical categories and productions? 
2. What are the main formal properties of feature structures and how do we use them computationally? 
3. What kinds of linguistic patterns and grammatical constructions can we now capture with feature based grammars? 

1. Bagaimana kita bisa memperluas kerangka tata bahasa bebas konteks dengan fitur-fitur untuk mendapatkan kontrol yang lebih baik atas kategori tata bahasa dan produksi?
2. Apa sifat formal utama dari struktur fitur dan bagaimana kita menggunakannya secara komputasi?
3. Jenis pola linguistik dan konstruksi gramatikal apa yang sekarang dapat kita tangkap dengan tata bahasa berbasis fitur?

# chapter ini membahas lebih jauh tentang more syntax 
Along the way, we will cover more topics in English syntax, including phenomena such as 
agreement, 
subcategorization, and 
unbounded dependency constructions  .

# tentang classifiers
In chap-data-intensive, we described how to build classifiers that rely on detecting features of text. Such features may be quite simple, such as extracting the last letter of a word, or more complex, such as a part-of-speech tag which has itself been predicted by the classifier. 


# 1 Grammatical Features
In this chapter, we will investigate the role of features in building rule-based grammars. In contrast to feature extractors, which record features that have been automatically detected, we are now going to declare the features of words and phrases. We start off with a very simple example, using dictionaries to store features and their values. 
>>> kim = {'CAT': 'NP', 'ORTH': 'Kim', 'REF': 'k'} 
>>> chase = {'CAT': 'V', 'ORTH': 'chased', 'REL': 'chase'} 

The objects kim and chase both have a couple of shared features, CAT (grammatical category) and ORTH (orthography, i.e., spelling). In addition, each has a more semantically-oriented feature: kim['REF'] is intended to give the referent of kim, while chase['REL'] gives the relation expressed by chase. In the context of rule-based grammars, such pairings of features and values are known as feature structures, and we will shortly see alternative notations for them. Feature structures contain various kinds of information about grammatical entities. The information need not be exhaustive, and we might want to add further properties. For example, in the case of a verb, it is often useful to know what "semantic role" is played by the arguments of the verb. In the case of chase, the subject plays the role of "agent", while the object has the role of "patient". Let's add this information, using 'sbj' and 'obj' as placeholders which will get filled once the verb combines with its grammatical arguments: 
>>> chase['AGT'] = 'sbj' 
>>> chase['PAT'] = 'obj' If we now process a sentence Kim chased 

Lee, we want to "bind" the verb's agent role to the subject and the patient role to the object. 
We do this by linking to the REF feature of the relevant NP. 

In the following example, we make the simpleminded assumption that the NPs immediately to the left and right of the verb are the subject and object respectively. We also add a feature structure for Lee to complete the example.

## 1.1 Syntactic Agreement
## 1.2 Using Attributes and Constraints
## 1.3 Terminology

# 2 Processing Feature Structures
## 2.1 Subsumption and Unification

# 3 Extending a Feature based Grammar
## 3.1 Subcategorization
## 3.2 Heads Revisited
## 3.3 Auxiliary Verbs and Inversion
## 3.4 Unbounded Dependency Constructions
## 3.5 Case and Gender in German

# 4 Summary

# kesimpulan 



# internal organization
Sentences have internal organization that can be represented using a tree. 

Notable features of constituent structure are: recursion, heads, complements and modifiers.

A grammar is a compact characterization of a potentially infinite set of sentences; we say that a tree is wellformed according to a grammar, or that a grammar licenses a tree.

A grammar is a formal model for describing whether a given phrase can be assigned a particular constituent or dependency structure.

Given a set of syntactic categories, a context-free grammar uses a set of productions to say how a phrase of some
category A can be analyzed into a sequence of smaller parts 
α1... αn

A dependency grammar uses productions to specify what the dependents are of a given lexical head.
Syntactic ambiguity arises when one sentence has more than one syntactic analysis (e.g. prepositional phrase
attachment ambiguity).
A parser is a procedure for finding one or more trees corresponding to a grammatically well-formed sentence.

A simple top-down parser is the recursive descent parser, which recursively expands the start symbol (usually S) with the help of the grammar productions, and tries to match the input sentence. This parser cannot handle leftrecursive productions (e.g., productions such as NP -> NP PP). 

It is inefficient in the way it blindly expands
categories without checking whether they are compatible with the input string, and in repeatedly expanding the
same non-terminals and discarding the results.

A simple bottom-up parser is the shift-reduce parser, which shifts input onto a stack and tries to match the items
at the top of the stack with the right hand side of grammar productions. 

This parser is not guaranteed to find a
valid parse for the input even if one exists, and builds substructure without checking whether it is globally
consistent with the grammar.