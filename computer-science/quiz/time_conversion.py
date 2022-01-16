# time_conversion.py
# export OUTPUT_PATH="/home/riansyah/projects/utk_out.txt"
import os
from datetime import datetime
    
def timeConversion(s):
	in_time = datetime.strptime(s, "%I:%M:%S%p")
	out_time = datetime.strftime(in_time, "%H:%M:%S")
    return out_time

os.environ

# fptr = open(os.environ['OUTPUT_PATH'], 'w')

# s = input()
# in = 07:05:45PM
# out = 19:05:45
s = "07:05:45PM"
result = timeConversion(s)

# fptr.write(result + '\n')

# fptr.close()
