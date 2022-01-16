# fizz_buzz.py
# bisa dibagi 3? = Fizz
# bisa dibagi 5? = Buzz
# bisa dibagi 3 dan 5?  = FizzBuzz
n = 35
for x in range(n):
	x=x+1
	if (x%3==0) and (x%5==0):
		x = 'FizzBuzz'
	elif (x%3==0):
		x = 'Fizz'
	elif (x%5==0):
		x = 'Buzz'
	print(x)