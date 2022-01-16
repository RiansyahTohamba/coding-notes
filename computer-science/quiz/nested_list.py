# nested_list.py

students = [['Harry', 37.21], ['Berry', 37.21], ['Tina', 37.2], ['Akriti', 41], ['Harsh', 39]]
# students.append([[name],[score]])

# for _ in range(int(raw_input())):
#     name = raw_input()
#     score = float(raw_input())        
#     students.append([[name , score]])

# for idx1,num1 in enumerate(arr):
# 	pass        

for idx,st in enumerate(students):    
	
	# for idx2,st2 in enumerate(students):    
	#     if(st[idx][1] > st2[idx][1]):
	#         pass

lowest = "".join(students[0][0])
second_lowest = "".join(students[1][0])
print(lowest)
print(second_lowest)
