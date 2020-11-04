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

Pada chapter ini , we take a different approach, deciding in advance that we will only look for very specific kinds of information in text, such as the relation between organizations and locations. 


Rather than trying to use text like (1) to answer the question directly, we first convert the unstructured data of natural language sentences into the structured data of 1.1. 

Then we reap the benefits of powerful query tools such as SQL. 

This method of getting meaning from text is called Information Extraction.



