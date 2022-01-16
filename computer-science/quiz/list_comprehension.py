# list_comprehension.py
import itertools


def cuboid():
# input:  x=1,y=1,z=1,n=2
# 
# Each variable x, y and z will have values of 0 or 1. 

# All permutations of lists in the form 
# [i,j,k] = [[0,0,0],[0,0,1],[0,0,0]... [1,1,1]].
# Remove all arrays that sum to 'n = 2'  to leave only the valid permutations.
	x = 1
	y = 1
	z = 2
	n = 3
	x_list = range(x+1)
	y_list = range(y+1)
	z_list = range(z+1)
	permutations = itertools.product(x_list,y_list,z_list)
	newlist = [list(el) for el in permutations if sum(el) != n]
	print(newlist)

def fruits():
	fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
	newlist = [x for x in fruits if "a" in x]
	print(newlist)

def odd_even():
	# create new list, based on existing list
	newlist = [x for x in range(10) if x % 5 == 0]
	print(newlist)


cuboid()
