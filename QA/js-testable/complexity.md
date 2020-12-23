complexity.md
<!-- file:///home/riansyah/Documents/rian/RPL%20LANJUT/Testable%20JavaScript%20by%20Mark%20Ethan%20Trostler%20(z-lib.org).pdf -->
chapter 2, membahas complexity of code.

# keywords
code-size, 
jslint, 
cyclomatic complexity, 
reuse, 
fan-out, 
fan-in, 
{content,common,control,stamp,data,no,instantiation}-coupling, 
coupling-metrics, 
coupling-in-the-real world(testing-coupled-code), 
dependency-injection, 
comments(yuidoc,jsdoc,docco/rocco), 
human-test, 
recap



# ramuanku dari berbagai sumber
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

# dari mark ethan trostler
important = [JSLint, cyclomatic complexity, lines of code, and fan-in and fan-out]
showing_to_coworker is more important measure
starting point for testable JavaScript = analysis(complexity of static)

50% of time developer = testing_debugging, (kata trostler)
testing_debugging = non_functional
jadi tidak bisa kerjakan functional(fitur) krn terkendala masalah non_functional
functional dan non_functional punya kaitan

case_a =  complexity is invetabily
case_b = complexity is avoid-able
number_case_b > number_case_a

# coupling-metrics
The point of naming and scoring each type of coupling, besides giving us all a common frame of reference, is to generate metrics based on coupling found in functions, objects, and modules. 

Inti dari penamaan dan penilaian setiap jenis kopling : 
1. common frame : memberi kita semua kerangka acuan yang sama, 
2. generate coupling metric in fungsi, objek, dan modul.
Metric pada awal-awal menghitung the coupling between two modules or objects. 
caranya dengan hanya adding up the number of interconnections between the modules or objects.
Dan masukkan skor maximum coupling.


Ada juga metric yg  try to measure the coupling inherent in a single module.

Matrix bisa digunakan untuk menjadi big-picture of modul.
Matrix berisikan semua modules in an application to view the overall coupling between each of them.


The point here is that a number or set of numbers can be derived to determine how
tightly or loosely coupled a system or set of modules is. This implies that someone
“above” the system is trying to determine its state. For our purposes, we are the pro‐
grammers looking at this stuff every day. Once we know what to look for, we can find
it and refactor if necessary. Again, code inspections and code reviews are an excellent
way to find code coupling, instead of relying on a tool to root out coupling metrics.

# coupling-in-the-real-world
lihat kode di 
coupled-real-world.js

final note
minimize coupling and your testing will be easier.

## recap

Code complexity banyak bentuk dan ukurannya. 
Sebagian besar complexity bisa diukur.
Sebagian pengukuran yg penting tak bisa diukur.
Tahu kan ada hal-hal yang memang un-measurable.

Static code analysis will make large strides in cleaning up your code and make it more testable. Using well-understood patterns from static languages and standards-based JavaScript will help keep your code testable, and therefore maintainable. Dependencies play a large role in code complexity. They must be constructed, destroyed, understood, and maintained. Instantiating dependencies is a dangerous business. If the process can be offloaded to an injector, all the better.  

= Natural lang to support Pro Lang
Untuk JavaScript sudah ada bantuan dari komunitas yakni dengan YUIDoc, JSDoc, or Rocco-style documentation automatically with each build akan menurunkan kompleksitas.

Tapi, menulis komen itu "half the battle". 
Tantangan dengan natural language = "Keeping the comments up to date". 

However, there is no substitute for Fagan inspections and code reviews in terms of finding bugs and ensuring that your code is not overly complex. 

There are no magic bullets reducing the complexity of your code. 

The first step is to understand and realize where the complexity lies. 

There are many industry-standard books about modeling and refactoring code and the various patterns that can be used to factor and refactor your code.

ada 2 kitab-belief di field ini : 

Refactoring: Improving the Design of Existing Code, by Martin Fowler (Addison-Wesley), and 

Code Complete: A Practical Handbook of Software Construction, by Steve McConnell (Microsoft Press). 

*belief = percaya saja*

All of the dirty details are available in these two books, and therefore, both are very highly recommended. 

Gak mungkn bisa eliminate complexity seutuhnya.
Yang bisa kita lakukan, reduksi dia !
reduksi dengan cara comment with NatLang and test code !

# tambahan referensi
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