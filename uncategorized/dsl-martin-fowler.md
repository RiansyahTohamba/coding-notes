dsl-martin-fowler.md 

riansyah : 
So is this a repeat of the dream of developing software without programming (or programmers)? 

Martin : 
That was the intent of COBOL, and I don't think there's any reason to think that DSLs will succeed where COBOL (and so many others failed). What I think is important is that DSLs allow business people and developers to collaborate more effectively because they can talk about a common set of precise rules that are the executable code. 

riansyah : 
When should I consider making a DSL?

Martin Fowler : 
When you are looking at an aspect of system with rich business rules or work-flow. A well written DSL should allow customers to understand the rules by which the system works.

# cacophony = campuran suara yg tdk enak 
Riansyah : Isn't this going to lead to a cacophony of languages that people will find hard to learn?

Martin : 
We already have a cacophony of frameworks that programmers have to learn. That's the inevitable consequence of reusable software, which is the only way we can get a handle on all the things software has to do these days. In essence a DSL is nothing more than a fancy facade over a framework. As a result they contribute little complexity over what is already there. Indeed a good DSL should make things better by making these frameworks easier to use. 

riansyah : But won't people create lots of bad DSLs? 
martin : 
Of course, just like people create bad frameworks. But again I'd argue that bad DSLs don't do much additional harm compared to the cost of bad frameworks.

riansyah: Jadi apakah ini pengulangan mimpi mengembangkan perangkat lunak tanpa pemrograman (atau programmer)? Martin: Itulah maksud dari COBOL, dan saya rasa tidak ada alasan untuk berpikir bahwa DSL akan berhasil di mana COBOL (dan banyak lainnya gagal). Apa yang menurut saya penting adalah bahwa DSL memungkinkan para pebisnis dan pengembang untuk berkolaborasi lebih efektif karena mereka dapat berbicara tentang seperangkat aturan umum yang merupakan kode yang dapat dieksekusi. riansyah: Kapan saya harus mempertimbangkan untuk membuat DSL? Martin Fowler: Saat Anda melihat aspek sistem dengan aturan bisnis yang kaya atau alur kerja. DSL yang ditulis dengan baik harus memungkinkan pelanggan untuk memahami aturan yang digunakan sistem tersebut. Riansyah: Bukankah ini akan menyebabkan hiruk pikuk bahasa yang sulit dipelajari orang? Martin: Kami sudah memiliki hiruk pikuk kerangka kerja yang harus dipelajari pemrogram. Itulah konsekuensi tak terelakkan dari perangkat lunak yang dapat digunakan kembali, yang merupakan satu-satunya cara agar kami dapat menangani semua hal yang harus dilakukan perangkat lunak saat ini. Intinya, DSL tidak lebih dari fasad mewah di atas kerangka. Akibatnya, mereka menyumbangkan sedikit kerumitan atas apa yang sudah ada. Memang DSL yang baik harus membuat segalanya lebih baik dengan membuat kerangka kerja ini lebih mudah digunakan. riansyah: Tapi bukankah orang akan membuat banyak DSL yang buruk? Martin: Tentu saja, sama seperti orang membuat kerangka kerja yang buruk. Tetapi sekali lagi saya berpendapat bahwa DSL yang buruk tidak menimbulkan banyak kerugian tambahan dibandingkan dengan biaya kerangka yang buruk.