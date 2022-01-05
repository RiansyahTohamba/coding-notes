sale.md

selesaikan fungsi deleteproduct.
function must return an integer that denotes the 'minimun number' of different IDs the final bag can contain

'minimun number' of different IDs
'minimun number' of different IDs
'minimun number' of different IDs
'minimun number' of different IDs
'minimun number' of different IDs
'minimun number' of different IDs



ids = []
array of n integers that denotes the ID number of all items

m = integer that denotes the maximum number of items that can be deleted from the bag

# TC1
`len(ids) = n = 4 `
ids = [1 1 1 1] 

`yg bisa dihapus=2`
m=2

1 = 4 kali

output = 1
kenapa 1?

awalnya, tas berisi 4 item dari barang yang sama (yaitu id=1).
jadi apapun item yang dihapus, minimum different id = 1

so whatever item the excutive delete, the minimum will be 1



# TC2
n = 6 
ids = [1 2 3 1 2 2]
m = 3

1 = 2 kali
2 = 3 kali

3 = 1 kali

3 items can be deleted and it is optimal to choose items having 
	id =1 and id =3
final bag contains 3 items all with IDS=2 

id=1, 2 kali, dihapus 2
id=3, 1 kali, dihapus 3
maka tasnya hanya punya id=2 berjumlah 3 item
ini solusi paling optimum?

kenapa tidak menghapus id=2?
jadinya ada 2 berbeda item dong
harus cari yg discrete, berbeda
yang paling banyak dipertahankan!





