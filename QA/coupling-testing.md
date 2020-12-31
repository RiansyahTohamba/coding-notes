coupling-testing.md
# Dependencies
## context ?
chapter 4 unit test > Real-World Testing > "Dependencies" > doubles > [mock,stubs,spies]

Dari trostler. 

## content
Sebagian besar fungsi punya external dependencies (coupling).
Unit test tidak men-cover external dependencies.
Unit test dibantu stub dan mock untuk mengatasi external dependencies.
Stub dan mock membuat double untuk external dependencies.
Integration test men-cover external dependencies.
Penguji unit test dapat melakukan 'extract dependencies' dengan memanfaatkan mocks dan stubs.  
Trostler menggunakan istilah code-under-test, tapi istilah sederhananya apa ya ?
code under test vs test code.
Author of the code under test vs unit tester.
Dalam software-engineering role , development vs unit-tester.
Disebutkan bahwa author of code bisa menggunakan tools yang ada di chapter 2 untuk ekstrak dependencies.
Setelah semua jalan yg disebutkan di chapter 2 sudah habis artinya  memang dependensi tak terhindarkan lagi, karena kita ketahui tidak mungkin mencapai zero-coupling maka tugas selanjutnya ada pada unit-tester.
unit-tester mengisolasi code-in-question-for-testing.
Trostler menggunakan istilah yang lain untuk code-under-testing, yakni code-in-question-for-testing (code yg dimaksudkan utk di test).

# dibagian mana ada extract dependensi di chapter 2 ?

Chapter 2 berjudul Complexity. Singkatnya membantu author of code untuk mencari indikasi kode perlu diimprove.
Isinya antara lain : 
Code Size = indikasi pertama dan mostly
JSLint = tools linter
Cyclomatic Complexity = metric
Reuse = menggunakan kode lagi
Fan-Out & Fan-In = Metric Package level
Coupling = Level of Coupling =  [Content Coupling, Common Coupling, Control Coupling, Stamp Coupling, Data Coupling, No Coupling]
Instantiation ?

## after dependencies
Setelahnya mulai dijelaskan tentang berbagai macam doubles.
Penggunaan "command query separation" untuk membedakan mock dan stub.
Mocks are used for commands and stubs are used for queries.
[stubs, mock, spies]

# LC briand
Studi tentang Coupling measurement pada OO berfokus kepada dependencies antar kelas.
Static analysis dapat menghitung dependencies baik untuk kode sumber maupun desain UML.
Aspek dinamis CBO saat run-time hampir tidak diselidiki (have-barely-been-investigated) dan belum dipertimbangkan pada praktik koding.
static (white box) test source code in non-run-time. Bersifat preventive sebelum ditemukan oleh client.
dynamic (black box) test source code in run-time. Bersifat Corrective.
unit-test, integration-test termasuk static.
functional-test termasuk dynamic.

Meskipun kami membahas masalah ini dalam survei, kami tidak berusaha untuk mengintegrasikannya ke dalam framework kami dan membatasi diri kami pada analisis "static-usage-dependencies" dalam suatu sistem.
# 2. motivasi 
OO measurement menjadi tren di tahun 1999, ditandai dengan
1. Pembuatan framework untuk measurement.
2. varian measurement OO seperti kopling,kohesi dan inheritance.

# referensi 
