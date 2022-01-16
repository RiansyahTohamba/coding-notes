# Language Processing and Python
## 3. Computing with Language: Simple Statistics
### 3.1 FreqDist
Menampilkan array of key-value (di python namanya tuple) yakni 

fdist = [(katatertentu1,frekuensi1),(katatertentu2,frekuensi2),...]

Hitung frekuensi kata-tertentu?

fdist['katatertentu1'] = frekuensi.

### 3.2 Fine-grained selection
Vocabs = set(nltk.text)

//angka 7 belum tau dapat darimana, mereka yang tetapkan wkwk
def filterLength(word):
	return len(word) > 7 and FreqDist(word) > 7

[word for word in Vocabs if filterLength(word)]

At last we have managed to automatically identify the frequently-occurring content-bearing words of the text. It is a modest but important milestone: a tiny piece of code, processing tens of thousands of words, produces some informative output.

### 3.3 Collocations and bigrams

A collocation is a sequence of words that occur together unusually often.
'red wine' == collocation
'the wine' != collocation , sudah biasa dengan sequence ini

### 3.4 Counting Other Things

## 4. Back to Python: Making Decisions and Taking Control

## 5. Automatic Natural Language Understanding
bgmn menjawab pertanyaan user? like
What tourist sites can I visit between Parongpong and Cihanjuang on a limited budget?
kapabilitas existing AI masih kurang untuk sampai kesitu. 

Lebih ke philosophical level, challenge within artificial intelligence adalah membuat intelligent machines dan bagian utama of intelligent behaviour is 'understanding language'. 

prospect of natural language understanding has re-emerged as a plausible goal. 

Berikut adalah challenges dan beberapa language understanding technologies.


### 5.2 Pronoun Resolution
A deeper kind of language understanding is to work out "who did what to whom" 
dengan kata lain
Detecting the 'subjects' and 'objects' of 'verbs'.


### 5.7 Limitation of NLP

reasoning yg mudah belum bisa dilakukan.
"understand language" masih sulit dan semoga anda bisa membantu untuk tugas jangka panjang ini!

memang saya juga sdh prediksi dari awal, tapi at least bisa bantu kita untuk membaca cepat !
