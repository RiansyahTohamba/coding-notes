complexity.md

chapter 2, membahas complexity of code.

Complexity diawali oleh **size** of code yang membesar.
Dan memang pasti membesar, hehe.
Jika software membesar adalah indikasi bahwa organisasi puas (hukum lehman belady ?).
Jadi size tak bisa dihindari, yang bisa dilakukan adalah mengontrol complexity.

Berbagai usaha dilakukan untuk mengetahui seberapa kompleks kode kita.
Diantarnya dengan mengembangkan metrik tunggal (single metrik) complexity.
Metrik ini diharapkan dapat menggambarkan kompleksitas kode program.


Ada berbagai metrik untuk mengetahui seberapa kompleks kode kita, seperti coupling dan size.
cara yang paling tepat untuk mengetahui seberapa kompleks kode kita dengan menunjukkan ke tim kita.
jika tim kita tidak mengerti bagaimana alur dari kode kita, maka ini menjadi indikasi bahwa kode kita kompleks.
jika kompleks maka kode kita akan sulit di maintain.


recap

referensi
lehman law
https://courses.cs.washington.edu/courses/csep503/97sp/lecture4/sld011.htm

"A large program that is used undergoes continuing change or becomes progressively less useful" (belady & lehman)
Analogies to biological evolution have been made; the rate of change in software is far faster

"Sebuah program besar yang digunakan terus mengalami perubahan atau menjadi semakin tidak berguna" (belady & lehman)
Jika tidak berubah maka jadi tidak berguna (fitur gitu-gitu saja) kan susah di patching wkwk

Berbagai analogi dengan evolusi biologis telah dibuat; laju perubahan perangkat lunak jauh lebih cepat

As a large program is continuously changed,its complexity which reflects deteriorating structure, increases unlness work is done to maintain or reduce it

= complexity, in part is relative to a programmer knowledge of a system
novices vs experts doing maintenance
= cleaning up structure is done relatively infrequently