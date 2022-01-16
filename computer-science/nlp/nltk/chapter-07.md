chapter7.md 
## Susunan konten
~~~
1. (intro) Information Extraction
1.1 Information Extraction Architecture
2. Chunking
2.1 Noun Phrase Chunking
2.2 Tag Patterns
2.3 Chunking with Regular Expressions
2.4 Exploring Text Corpora
2.5 Chinking
2.6 Representing Chunks: Tags vs Trees
3. Developing and Evaluating Chunkers
3.1 Reading IOB Format and the CoNLL 2000 Corpus
3.2 Simple Evaluation and Baselines
3.3 Training Classifier-Based Chunkers
4 Recursion in Linguistic Structure
4.1 Building Nested Structure with Cascaded Chunkers
4.2 Trees
4.3 Tree Traversal
5. Named Entity Recognition
6. Relation Extraction
7. Summary
~~~
## background 
Filosofi nya adalah bagaimana cara mendapat pengetahuan? 
Mengetahui itu apa?
Pengetahuan merupakan hal yang ingin kita dapatkan, bukankah begitu? 

Pengetahuan diawali oleh pertanyaan atau QUERY. Misal Bagaimana caranya mendapatkan uang yang banyak? dan pertanyaan lain diartikel <a href="https://riansyahtohamba.medium.com/seberapa-murni-ilmu-mu-8e2656ab9754"> ini </a>, hehe.

Contoh yg diberikan oleh tim NLTK adalah dimana lokasi sebuah perusahaan? 

Untuk menjawab pertanyaan tersebut, bisa saja kita melakukan pencarian dengan membaca teks, misalkan dalam bentuk paragraf. 

Tetapi, bukankah lebih sulit mendapatkan informasi dari membaca teks tersebut (unstructered text)? Bandingkan dalam bentuk tabel yakni kolom(nama perusahaan, lokasi) dan baris (nama  perusahaan seperti Microsoft, CT Corp, TSM, etc).

Tabel berisikan relasi antar entitas, untuk contoh NLTK, relasinya adalah organisasi-in-location.


### Tahapan 
Setelah mengetahui tujuan utama dari artikel ini, yakni  bagaimana melakukan konversi unstructered data to SQL, maka tahap pertama yang harus dilakukan adalah mendeteksi entitas.
Setelahnya baru bisa kita buat relasi antar entitas tersebut.

## Chunking
chunking? perlukah diautomasi? bisa dikerjakan manual;?
sudah cukup?
Cara chunking :
rule-based vs statistical
= rule-base menggunakan regex
= statistical menggunakan corpus

## Formalisasi
1. ask questions -> 
2. writing noun phrase in questions -> 
3. cek entities -> 
4. cek relation between entities

## knp questions dulu atau detect entity dulu ?
questions apa yang diharapkan dari artikel ini?
jawabannya question dulu, seperti kasus 
"mencari lokasi organisasi ? "
maka sudah jelas ada kolom nama organisasi dan lokasi organisasi dalam teks tersebut.

##Intro
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

klo datanya text?
One approach to this problem involves building a 'very general representation of meaning' (chapter 10). 

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
3. Finally, we use relation detection to search for likely relations between different entities in the text.

kode dari 3 step tadi.
```
def ie_preprocess(document):
	sentences = nltk.sent_tokenize(document)
	sentences = [nltk.word_tokenize(sent) for sent in sentences]
	sentences = [nltk.pos_tag(sent) for sent in sentences] 
```

### 4. named entity detection
Next, in 'named entity detection', we segment and label the entities that might participate in interesting relations with one another. 

Typically, these will be 'definite noun phrases' such as 
1. 'the knights' who say "ni", or 
2. 'proper names' such as  Monty Python (grup komedi)

In some tasks it is useful to also consider 
'indefinite nouns' or 'noun chunks', such as 'every student' or 'cats', 


## Monty Python instance of class comedy group
Monty Python adalah grup komedi Inggris yang terdiri dari John Cleese, Graham Chapman, Michael Palin, Eric Idle, Terry Jones dan Terry Gilliam. Mereka memiliki acara televisi yang sangat berhasil pada tahun 1969 sampai 1974 Monty Python's Flying Circus.


#### definite vs (indefinite & proper-name)
Dalam beberapa tugas, berguna juga untuk mempertimbangkan kata benda tak tentu atau potongan kata benda, seperti setiap siswa atau kucing, dan ini tidak selalu merujuk ke entitas dengan cara yang sama seperti NP tertentu dan proper name.

#### Common Noun examples	
I can't wait to start college this fall.	
I ordered a new computer online.	

#### Proper Noun/name examples
I got accepted to UCLA. (UCLA vs COLLEGE)
I ordered the laptop from Amazon.

### 4.1 chunking
the basic technique we will use for 'entity detection' is chunking, which 'segments' and labels 'multitoken sequences' yg ada di gambar sequence of boxes


### Terms in chunking
determiner (DT) followed by any number of adjectives (JJ) and then a noun (NN).

DT = determiner
JJ = adjectives
NN = noun

tambah terms dari  http://www.bowdoin.edu/~allen/nlp/nlp1.html
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

## after chunking?
Kalau sudah bisa chunking, lalu?




## RQ deteksi entitas
Q : Apakah sulit auto-deteksi entitasnya?
A : butuh korpus, sebaiknya deteksi manual saja.

Q : bagaimana detilnya deteksi manual itu?
A : awalnya saya harus tetapkan dulu Query dan entitas apa yang saya inginkan, misalkan pada paper Alves, query apa saja yang saya butuhkan.

Q : bagaimana dengan  contoh HRS?
A : ada 2 pihak
mahfud : query 'select no_surat from bukti'
FPI : query 'is tangan hrs diborgol?' 
'select statement from saudi_autority where name="namanya"'

# Reference
sentence segmenter = chapter 3 - 3.8 Segmentation  

