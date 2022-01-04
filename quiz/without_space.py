# without_space.py

n = 3
# output= '123'
list_int = range(n)
str_num = ''.join(str((integer+1)) for integer in list_int) 
print(str_num)

