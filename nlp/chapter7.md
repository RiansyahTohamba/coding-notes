chapter7.md 
Semua pertanyaan (sepertinya) sudah punya jawabannya di internet sana, begitu banyak dokumen(html,pdf,word,etc) yang terus diupload tiap harinya.

Tapi mengambil dari dokumen tersebut tidak mudah.

The state of the art in NLP masih jauh dari pembuatan 'general-purpose representations of meaning' dari text tak terstruktur 

Pertanyaan yg punya "entity relations," such as 
"where are different facilities located," or 
"who is employed by what company," 

maka sudah bisa dijawab.

## goal dari chapter ini
1. extracts structured data from unstructured text?
2. how to identifying the 'entities' and 'relationships' described in a text?
3. dataset(corpora) apa yang cocok untuk training and evaluating our models?
Teknik-teknik yang ada pada 2 chapter terkakhir (5 dan 6) digunakan untuk memecahkan
1. problem of chunking 
2. problem of named-entity recognition


## ML dan NLP
Rule based(Regex) tidak cukup kah?
"Pada sumber data yang sifatnya unstructured, peran NLP menjadi sangat penting sebab jika hanya mengandalkan keywords atau regex rules, maka jumlah rules yang dibuat akan menjadi sangat banyak dan semakin sulit untuk dipelihara (unscalable) jika lingkup yang hendak dipantau mulai melebar." (Jim geovedi)
Maka ML yang merupakan data-driven, akan membuat RULE nya sendiri.


## Inf Ext
diberi 2 contoh data : tabular vs paragraph. 
query : where lokasi kantor liwayway ?
klo datanya tabular pakai query ini
Select lokasi from kantor where pt_name = 'liwayway'

klo datanya paragraph?
One approach to this problem involves building a 'very general representation of meaning' (chapter 10). 



Rather than trying to use text like (1) to answer the question directly, we first convert the unstructured data of natural language sentences into the structured data of 1.1. 

Then we reap the benefits of powerful query tools such as SQL. 

Information Extraction = Metode 'getting meaning' from text
tahapannya adalah
1. convert the 'unstructured data' of natural language 'sentences' into the 'structured data'
2. Klo sdh terstruktur maka query tools such as SQL sudah dapat digunakan.

# Simple Information Extraction Architecture

## processing a document
It begins by processing a document using several of the procedures discussed in chapter 3 and chapter 5: 

### 1. sentence-segmenter then tokenizer
1. first, the raw text of the document is split into sentences using a 'sentence segmenter', and 'each sentence' is further subdivided into words using a tokenizer. 

### 2. part-of-speech tags
2. Next, each sentence is tagged with 'part-of-speech tags', which will prove very helpful in the next step, 'named entity detection'. 
In this step, we search for mentions of potentially interesting entities in each sentence. 

### 3. relation-detection
3. Finally, we use relation detection to search for likely relations
between different entities in the text.

kode dari 3 step tadi.
```
def ie_preprocess(document):
	sentences = nltk.sent_tokenize(document)
	sentences = [nltk.word_tokenize(sent) for sent in sentences]
	sentences = [nltk.pos_tag(sent) for sent in sentences] 
```

### 4. named entity detection
Next, in 'named entity detection', we segment and label the entities that might participate in interesting relations with one another. 

Typically, these will be definite 'noun phrases' such as the knights who say "ni", or proper names such as Monty Python. 

In some tasks it is useful to also consider 
'indefinite nouns' or 'noun chunks', such as 'every student' or 'cats', 

and these do not necessarily refer to 'entities' in the same way as definite NPs and proper names.

### 4.1 chunking
basic technique we will use for entity detection is chunking, which segments and labels multitoken sequences.

### relation-extraction

Finally, in relation extraction, we search for specific patterns between pairs of entities that occur near one another in the text, and use those patterns to build tuples recording the relationships between the entities

### Relation extraction setelah  2.chunking ?

# Reference
sentence segmenter = chapter 3 - 3.8 Segmentation  

# Terms
determiner (DT) followed by any number of adjectives (JJ) and then a noun (NN).

DT = determiner
JJ = adjectives
NN = noun

np - noun phrase
vp - verb phrase
s - sentence
det - determiner (article)
n - noun
tv - transitive verb (takes an object)
iv - intransitive verb
prep - preposition
pp - prepositional phrase
adj - adjective

tambah terms dari  http://www.bowdoin.edu/~allen/nlp/nlp1.html
