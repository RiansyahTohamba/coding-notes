briand1999

# kenapa ada di folder spec?
ingin mempelajari kaitan coupling dan quality.
# intro
L.C Brand dan temannya menuliskan sebuah makalah tentang Software Measurement untuk peningkatan kualitas software.
Makalah tersebut ditulis pada tahun 1999.
Tulisannya diawali oleh pernyataan :

The market forces of today’s software development industry have begun to place much more emphasis on software quality. 

Kalimat ini ditulis tahun 1999, wkwkw.
Sementara saya dan teman berbagi pengalaman tentang koding di dunia industri software Indonesia pada tahun 2016.
Teman saya menulis kode untuk sistem per-bank-an sementara saya untuk sistem e-government. 
Kami sampai kepada kesimpulan bahwa prioritas proyek adalah "Cepat-Selesai".
Kami bisa lihat kesadaran akan kualitas kode belum populer di tempat kami, sementara di komunitas L.C Brand dan temannya, yakni di Jerman dan HP Skotlandia, pasar sudah memberikan tekanan pada kualitas.
Diskusi mengenai kualitas kode tidak di-elaborasi lebih jauh, setidaknya pada lingkungan tempat kami menulis kode.
Dan benar saja, setelah kami menuliskan kode secara cepat, yang hadir adalah error tiada akhir, menyeramkan.

Kembali ke komunitas LC Briand tadi.
Karena tekanan pasar akan kualitas, dilakukan upaya untuk mengetahui penggunaan Software measurement, untuk evaluasi dan memprediksi kualitas software.
Salah satu measurement yang diusulkan adalah coupling.

In turn, this has led to a large number of new measures being proposed for quality design principles such as coupling. 

*Prinsip kopling rendah*
High quality software design, among many other principles, should obey the principle of low coupling.

Stevens mendefinisikan kopling dalam konteks "structured development" yakni 
"the measure of the strength of association established by a connection from one module to another". 

Maka semakin kuat coupling antar modul-modul maka makin sulit bagi modul-modul ini untuk 
1. dipahami
2. diubah 
3. diperbaiki 

Akhirnya makin susah menuliskan kode program. 

Eviden bahwa kopling tinggi pada structured development itu jelek bisa dilihat di (Selby & Basili,1991) dan (Troy and S.H. Zweben,1981).

Coad and Yourdon menjelaskan kopling dalam konteks OO.
Riset di tahun 1999, sudah mulai tertuju pada definisi kopling.
Terdapat berbagai definisi tentang OO coupling.
Coupling MORE COMPLEX than other software attributes.
Gap: belum ada usaha yang menjelaskan definisi sintesa terstruktur berbagai definisi coupling ini.
Masih ada ambigu pada pendefinisian metrics ini.
As a result, it is difficult to understand how different coupling measures relate to one another. 
Potensi penggunaan metric yang sudah ada belum jelas.
Bagaimana metrik-metrik ini saling melengkapi juga belum jelas.
Fakta bahwa sedikit sekali validasi empiris mengenai OO Coupling metric bermakna bahwa kegunaan metric ini tidak didukung.
Atau dengan kata lain, kegunaan metrik ini masih diragukan.



# Referensi
R.W. Selby and V.R. Basili, “Analyzing Error-Prone Systems Structure,” IEEE Trans. Software Eng., vol. 17, no. 2, pp. 141-152, 1991
P.A. Troy and S.H. Zweben, “Measuring the Quality of Structured Designs,” J. Systems and Software, vol. 2, pp. 113-120, 1981.
[35] 
A Unified Framework for Coupling Measurement in Object-Oriented Systems

file:///home/riansyah/Documents/rian/TESIS/coupling/1999_briand-A%20Unified%20Framework%20for%20Coupling.pdf