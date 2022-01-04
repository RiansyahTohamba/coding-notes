# find_median.py
def findMedian(arr):
	arr.sort()
	size = len(arr)
	idx_med = size/2
	median = arr[int(idx_med)]

	print(arr[idx_med])

	if(size%2==0):
		idx_2 = idx_med - 1 
		# print("size: "+str(size))
		median = (arr[idx_med] + arr[idx_2]) / 2

	return median


arr_odd = [1,2,3,5,10,7,2,4]
arr_even = [0,1,2,4,6,5,3]

# findMedian(arr_odd)
print(findMedian(arr_even))
