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
The majority of the work on coupling measurement in object-oriented systems focuses on usage dependencies between classes, which can be derived from a static analysis of design documents or source code. 

The dynamic aspects of coupling between objects at run-time have barely been investigated and are not yet considered in practice. Even though we address this issue in the survey, we make no attempt to integrate it in our framework and restrict ourselves to the analysis of static usage dependencies in a system.

# referensi 