def stupid_search(list_int, search_num):
	iterasi=0
	for num in list_int:
		# print num
		iterasi=iterasi+1		
		if(num==search_num):
			return (num,iterasi)
	return None
def binary_search(list_int,search_num):
	low = 0 
	high = len(list_int) - 1
	iterasi=0

	while low <= high:
		iterasi=iterasi+1
		mid = (low+high) / 2
		guess  = list_int[mid]
		if(guess==search_num):
			return (mid,iterasi)
		if(guess>search_num):
			high = mid - 1
			# print(high)
		else:
			low = mid + 1
			# print(low)

	return None

search_num = 25
list_int = range(1000)

print "Binary Search"
val,iterasi = binary_search(list_int, search_num)
print("iterasi ke "+str(iterasi))				
print(str(val)+" ditemukan!")

print "\n=== Stupid Search ===="
val,iterasi = stupid_search(list_int, search_num)
print("iterasi ke "+str(iterasi))				
print(str(val)+" ditemukan!")
