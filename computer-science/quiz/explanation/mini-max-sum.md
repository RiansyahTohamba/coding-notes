mini-max-sum.md
input = "1 2 3 4 5"
output = "10 14"

The numbers are 1, 2, 3, 4, 5. 
Calculate the following sums using four of the five integers:

For number 1: Sum everything except 1, the sum is 2+3+4+5 = '14'
..
For number 3: Sum everything except 3, the sum is 1+2+4+5 = 12
..
For number 5: Sum everything except 5, the sum is 1+2+3+4 = '10'


arr = [1,3,5,7,9]
for num in arr
	total=total+el for el in arr if el!=num