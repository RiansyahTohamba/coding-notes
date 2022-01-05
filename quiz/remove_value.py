# bag len=6, with values = [1,1,1,2,2,3]
# 1=3 kali, 2 = 2kali, 3=1 kali
values = [1,1,1,2,2,3]
#can remove 2 items, m =2
m = 2
# A. jika dia remove 2 item utk (values=1), dia tetap dapat 
	# [1,2,2,3], 3 jenis item didapatkan
# B. jika dia remove 2 item utk (values=2), dia dapat 
	# [1,1,1,3], 2 jenis saja yg didapatkan
# C. jika dia remove masing-masing 1 item utk (values=2) dan (values=3), dia dapat 	
	# [1,1,1,2], 2 jenis saja yg didapatkan
# cara B dan C hanya sisa 2 item saja
# cara A dapat 3-3 nya

# yang bagus yang mana?
# yang bagus cara B dan C
# cara A tidak bagus karena jenis nya makin banyak!
# cara yang paling baik adalah menghapus value dengan jumlah yg tersedikit!


def deleteList(values, m):
    # Write your code here    

	
    for idx_del in range(m):
	    most_min_occur = min(set(values), key = values.count)    	
        values.remove(most_min_occur)         
    # [list(el) for el in permutations if sum(el) != n]
    # new_values = [el for el in values if el != most_min_occur] 
    # print(new_values)
    total = len(set(new_values))    
    return total

# values = [1,1,1,2,2,3]
#can remove 2 items, m =2
# m = 2

values = [1,2,3,1,2,2]
m = 3

print(deleteProducts(values,m))


# keys = list(set(values))
# total = len(set(values))

# print(values)
# print(keys)
# print(total)


# print "hapusss"
most_min = min(set(values), key = values.count)
# print("count: "+str(values.count))

# print(values)
# print("min: "+str(most_min))
# values.remove(most_min)


# total = len(set(values))

# # nilai yang paling kecil muncul 3
# # berapa kali munculnya?

# print("muncul "+str(set(values))+" kali")

# set menghilangkan duplikasi pada list!


# keys = list(set(values))
# total = len(set(values))
# print(values)
# print(keys)
# print(total)

# # values.remove(3)
# # values.remove(1)
# # values.remove(1)
# # values.remove(1)

# # keys = list(set(values))
# # total = len(set(values))

# # print(values)
# # print(keys)
# # print(total)





