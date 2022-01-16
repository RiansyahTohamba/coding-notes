# factorial.py
n = 10
total = 1

if(n==0):
	total=1

for x in range(n):	
	x = x+1
	total = total * x

print(total)
