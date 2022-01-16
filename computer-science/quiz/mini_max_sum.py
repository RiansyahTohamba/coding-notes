# mini_max_sum.py

# Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. 

def miniMaxSum(arr):
	sum_arr = []
	for idx1,num1 in enumerate(arr):
		total=0
		for idx2,num2 in enumerate(arr):			
			# algoritma nya merujuk ke 'jangan sum posisi yang sama'
			# saya malah menguji value nya, ini salah!
			if idx1!=idx2:
				total=total+num2
		sum_arr.append(total)
	
	el_min = min(sum_arr)
	el_max = max(sum_arr)
	print(str(el_min)+" "+str(el_max))

str_input = "5 5 5 5 5"
arr = list(map(int, str_input.rstrip().split()))
miniMaxSum(arr)

# kode ini salah untuk TC 13, semua input disamakan
# input = "5 5 5 5 5"
# output = "20 20"