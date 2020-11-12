# Meaning of sentences
# Content 
1. NL understanding
2. Propositional Logic
3. FOL
4. The Semantics
5. Discourse Semantics
6. Summary


## opiniku 
meaning didapat dari logic pada sentences.
articles dianggap tidak lain hanyalah kumpulan sentences yang mempunyai hubungan logic.

sentences 1 imply sentences 2 
sentences 2 imply sentences 3 
sentences n imply sentences n+1

makanya adanya jurusan scriptural-reasoning which get reasoning from sentences in script !

# intro
We have seen how useful it is to harness the power of a computer to process text on a large scale. 

kita sudah punya
1. the machinery of parsers and 
2. feature based grammars, 

dengan kedua itu, dapatkah kita  menganalisis 'meaning of sentences'?

Maka tujuan dari chapter ini : 

1. How can we represent natural language meaning so that a computer can process these representations? 

represent dalam graphic?

2. How can we 'associate meaning representations' with an unlimited 'set of sentences'? 

articles = [sentence_1,sentence_2,...,sentence_n]
meaning_ representations = associate_meaning_representations(articles)

3. How can we use programs that connect the meaning representations of sentences to stores of knowledge? 

Sepanjang jalan kita akan mempelajari beberapa teknik formal di bidang semantic-logic, 
dan melihat bagaimana ini dapat digunakan untuk menginterogasi 'database' yang menyimpan fakta tentang dunia.

# 1 NL understanding

## 1.1 Querying a Database

point ini 
NL -> SQL 

point sesudahnya mengkonversi 
NL -> Logic
Logic more abstract so more generic.

One advantage of logical formalisms is that they are more abstract and therefore more generic.

If we wanted to, once we had our translation into logic, we could then translate it into various other special-purpose languages.

In fact, most serious attempts to query databases via natural language have used this methodology.

### goal point 1.1
SQL dikonversi menjadi natural language.

## 1.2 NL, Semantics, and Logic

We started out trying to capture the meaning of (1a) by translating it into a query in another language, SQL, which the computer could interpret and execute. 

But this still begged the question whether the translation was correct. 

Stepping back from database query, we noted that the meaning of and seems to depend on being able to specify when statements are true or not in a particular situation. 


Instead of translating a sentence S from one language to another, we try to say what S is about by relating it to a situation in the world. 


Let's pursue this further. 


Imagine there is a situation s where there are two entities, Margrietje and her favourite doll, Brunoke. 


In addition, there is a relation holding between the two entities, which we will call the love relation. 


If you understand the meaning of (3), then you know that it is true in situation s. In part, you know this because you know that Margrietje refers to Margrietje, Brunoke refers to Brunoke, and houdt van refers to the love relation.

# two fundamental notions
We have introduced two fundamental notions in semantics. 

The first is that declarative sentences are true or false in certain situations. 

The second is that definite noun phrases and proper nouns refer to things in the world. 

So (3) is true in a situation where Margrietje loves the doll Brunoke, here illustrated in 1.1.


# 2 Propositional Logic

# 3 FOL

## 3.1 syntax
## 3.2 First Order Theorem Proving
## 3.3 Summarizing the Language of First Order Logic
## 3.4 Truth in Model

## IT Sepuluh Nov bahas FOL
FOL vs NL
FOL tidak ekspresif
FOL dan NL sama sama mengasumsikan real-world terdiri dari
1. objek = parrent, father, etc.
2. relasi = ayah punya banyak anak.
3. fungsi = father_of(a), best_friend(b), etc.


## FOL vs HOL?
after first order is high order

# 4 The Semantics
From Greek sēmantikos ‘significant’, from sēmainein ‘signify’, from sēma ‘sign’.

apa yg signifikan dari teks tersebut ?
bagaimana mendapatkan signifikansi dari suatu teks ?


# 5 Discourse Semantics

