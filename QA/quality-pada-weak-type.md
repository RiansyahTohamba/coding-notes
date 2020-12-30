quality-pada-weak-type.md
baguskan-weak-type

# Weak type mudah di-test ?
Weak type merujuk kepada kode yang membebaskan tipe kelas bagi objeknya.
Nama lain dari Weak Type adalah Strong Type.

Berikut adalah contoh kode strong type

public void sentEmail(User emailAddress){
  sent(emailAddress);
  update(this.status);
}

Berikut adalah contoh kode weak type

function sum(a,b){
	return a + b;
}

Fungsi sum(a,b) ini masih toy. kenapa ?
Karena hanya one-line dan zero-dependency.
Zero-dependency berarti tak punya dependensi dengan kelas lainnya.

Hubungannya dengan fase pengujian adalah kemungkinan yang bisa dihasilkan dari input dan output.
Walaupun toy, path yang harus dieksplorasi banyak sekali.

Apakah tipe yang mungkin dari variabel a ? Integar kah ? String kah ?
Apakah tipe yang mungkin dari variabel b ? Integar kah ? String kah ?

Fungsi toy seperti sum(a,b) saja menghasilkan banyak path yang harus di coverage,
lalu bagaimana dengan real-world function ? 

Walaupun begitu terdapat beberapa programmer yang merekomendasikan weak type
1. Dave Thomas
2. Douglas Crockford

Mereka menyatakan mudarat dari weak type lebih kecil dibanding dengan manfaatnya. 

Referensi 
Trostler, Testable javascript
Dave Thomas, Andy Hunt, Chad Fowler, Ruby pickaxe  
Douglas Crockford, javascript goodparts
