# Balasan pertama yosua

Thanks for your blog post! I have a high-level comment. I will start from your statement that 
“learning is guided by two sources of information: (a) data and (b) man-made models of how data are generated. ” 

This makes sense in the kind of setting you have often discussed in your writings, where a scientist has strong structural knowledge and wants to combine it with data in order to arrive at some structural (e.g. causal) conclusions. But there are other settings where this view leaves me wanting more. For example, think about a baby before about 3 years old, before she can gather much formal knowledge of the world (simply because her linguistic abilities are not yet developed or not enough developed, not to mention her ability to consciously reason). Or think about how a chimp develops an intuitive understanding of his environment which includes cause and effect. 

Ini masuk akal dalam jenis pengaturan yang sering Anda diskusikan dalam tulisan Anda, di mana seorang ilmuwan memiliki pengetahuan struktural yang kuat dan ingin menggabungkannya dengan data untuk sampai pada beberapa kesimpulan struktural (misalnya kausal). Tetapi ada pengaturan lain di mana tampilan ini membuat saya menginginkan lebih. Misalnya, pikirkan tentang bayi sebelum berusia sekitar 3 tahun, sebelum ia dapat mengumpulkan banyak pengetahuan formal tentang dunia (hanya karena kemampuan linguistiknya belum berkembang atau belum cukup berkembang, belum lagi kemampuannya untuk bernalar secara sadar). Atau pikirkan tentang bagaimana simpanse mengembangkan pemahaman intuitif tentang lingkungannya yang mencakup sebab dan akibat.

Or about an objective to build a robot which could learn about the world without relying on human-specified theories. Or about an AI which would have as a mission to discover new concepts and theories which go well beyond those which humans provide. In all of these cases we want to study how both statistical and causal knowledge can be (jointly) discovered. Presumably this may be from observations which include changes in distribution due to interventions (our learning agent’s or those of other agents). These observations are still data, just of a richer kind than what current purely statistical models (I mean trying to capture only joint distributions or conditional distribution) are built on.

Atau tentang tujuan untuk membangun robot yang dapat belajar tentang dunia tanpa bergantung pada teori yang ditentukan manusia. Atau tentang AI yang memiliki misi untuk menemukan konsep dan teori baru yang melampaui apa yang disediakan manusia. Dalam semua kasus ini kami ingin mempelajari bagaimana pengetahuan statistik dan kausal dapat (bersama-sama) ditemukan. Agaknya ini mungkin dari pengamatan yang mencakup perubahan distribusi karena intervensi (agen pembelajaran kami atau agen lain). Pengamatan ini masih berupa data, hanya jenis yang lebih kaya daripada model statistik murni saat ini (maksud saya mencoba menangkap hanya distribusi gabungan atau distribusi bersyarat) yang dibangun.

Of course, we *also* need to build learning machines which can interact with humans, understand natural language, explain their decisions (and our decisions), and take advantage of what human culture has to offer. 

Tentu saja, kami * juga * perlu membangun mesin pembelajaran yang dapat berinteraksi dengan manusia, memahami bahasa alami, menjelaskan keputusan mereka (dan keputusan kami), dan memanfaatkan apa yang ditawarkan budaya manusia. 

Not taking advantage of knowledge when we have it may seem silly, but (a) our presumed knowledge is sometimes wrong or incomplete, (b) we still want to understand how pre-linguistic intelligence manages to make sense of the world (including of its causal structure), and (c) forcing us into this more difficult setting could also hasten the discovery of the learning principles required to achieve (a) and (b).

Tidak memanfaatkan pengetahuan ketika kita memilikinya mungkin tampak konyol, tetapi (a) pengetahuan yang kita duga kadang-kadang salah atau tidak lengkap, (b) kita masih ingin memahami bagaimana kecerdasan pra-linguistik berhasil memahami dunia (termasuk kecerdasannya). struktur kausal), dan (c) memaksa kita ke dalam situasi yang lebih sulit ini juga dapat mempercepat penemuan prinsip-prinsip pembelajaran yang diperlukan untuk mencapai (a) dan (b).


Cheers and thanks again for your participation in our recent CIFAR workshop on causality!

— Yoshua


# Judea Pearl reply, August 4 5:53 am

Hi Yoshua,
The situation you are describing: “where a scientist has strong structural knowledge and wants to combine it with data in order to arrive at some structural (e.g. causal) conclusions” motivates only the first part of my post (labeled “expediency”). 

Situasi yang Anda gambarkan: "di mana seorang ilmuwan memiliki pengetahuan struktural yang kuat dan ingin menggabungkannya dengan data untuk sampai pada beberapa kesimpulan struktural (misalnya kausal)" hanya memotivasi bagian pertama dari posting saya (berlabel "kemanfaatan" ). 

But the enterprise of causal modeling brings another resource to the table. In addition to domain specific knowledge, it brings a domain-independent “template” that houses that knowledge and which is useful for precisely the “other settings” you are aiming to handle:

“a baby before about 3 years old, before she can gather much formal knowledge of the world … Or think about how a chimp develops an intuitive understanding of his environment which includes cause and effect. Or about an objective to build a robot which could learn about the world without relying on human-specified theories.”

“Bayi sebelum berusia sekitar 3 tahun, sebelum dia dapat mengumpulkan banyak pengetahuan formal tentang dunia... Atau pikirkan tentang bagaimana simpanse mengembangkan pemahaman intuitif tentang lingkungannya yang mencakup sebab dan akibat. Atau tentang tujuan untuk membangun robot yang bisa belajar tentang dunia tanpa bergantung pada teori yang ditentukan manusia. "

A baby and a chimp exposed to the same stimuli will not develop the same understanding of the world, because the former starts with a richer inborn template that permits it to organize, interpret and encode the stimuli into a more effective representation. This is the role of “compiled representations” mentioned in the second part of my post. (And by “stimuli”, I include “playful manipulations”) .

Halo Yoshua,

Tetapi perusahaan pemodelan kausal membawa sumber daya lain ke meja. Selain pengetahuan khusus domain, ini membawa "template" domain-independen yang menampung pengetahuan itu dan yang berguna untuk "pengaturan lain" yang ingin Anda tangani:


Seorang bayi dan simpanse yang terpapar rangsangan yang sama tidak akan mengembangkan pemahaman yang sama tentang dunia, karena simpanse dimulai dengan pola bawaan yang lebih kaya yang memungkinkannya untuk mengatur, menafsirkan, dan menyandikan rangsangan menjadi representasi yang lebih efektif. Ini adalah peran "representasi terkompilasi" yang disebutkan di bagian kedua posting saya. (Dan dengan "rangsangan", saya memasukkan "manipulasi main-main").

In other words, the baby’s template has a richer set of blanks to be filled than the chimp’s template, which accounts for Alison Gopnik’s finding of a greater reward-neutral curiosity in the former.

Dengan kata lain, templat bayi memiliki kumpulan kosong yang lebih kaya untuk diisi daripada templat simpanse, yang menjelaskan penemuan Alison Gopnik tentang keingintahuan yang lebih besar dan netral pada hadiah.

The science of Causal Modeling proposes a concrete embodiment of that universal “template”. The mathematical properties of the template, its inherent limitations and inferential and algorithmic capabilities should therefore be studied by every machine learning researcher, regardless of whether she obtains it from domain expert or discovers it on her own from invariant features of the data.

Ilmu Pemodelan Kausal mengusulkan perwujudan konkret dari "template" universal itu. Oleh karena itu, properti matematika template, batasan inherennya, serta kemampuan inferensial dan algoritmiknya harus dipelajari oleh setiap peneliti pembelajaran mesin, terlepas dari apakah dia memperolehnya dari pakar domain atau menemukannya sendiri dari fitur invarian data.

Finding a needle in a haystack is difficult, and it’s close to impossible if you haven’t seen a needle before. Most ML researchers today have not seen a needle — an educational gap that needs to be corrected in order to hasten the discovery of those learning principles you aspire to uncover.

Menemukan jarum di tumpukan jerami itu sulit, dan hampir mustahil jika Anda belum pernah melihat jarum sebelumnya. Sebagian besar peneliti ML saat ini belum melihat adanya jarum - kesenjangan pendidikan yang perlu diperbaiki untuk mempercepat penemuan prinsip pembelajaran yang ingin Anda ungkap.

Menemukan jarum di tumpukan jerami itu sulit, dan hampir tidak mungkin jika Anda belum pernah melihat jarum sebelumnya. Kebanyakan peneliti ML saat ini

Cheers and thanks for inviting me to participate in your CIFAR workshop on causality.

— Judea

# Yoshua Bengio comment Aug. 4, 7:00 am

Agreed. What you call the ‘template’ is something I sort in the machine learning category of ‘inductive biases’ which can be fairly general and allow us to efficiently learn (and here discover representations which build a causal understanding of the world).

— Yoshua

Sepakat. Apa yang Anda sebut 'template' adalah sesuatu yang saya urutkan dalam kategori pembelajaran mesin 'bias induktif' yang bisa jadi cukup umum dan memungkinkan kita untuk belajar secara efisien (dan di sini menemukan representasi yang membangun pemahaman kausal tentang dunia).

- Yoshua