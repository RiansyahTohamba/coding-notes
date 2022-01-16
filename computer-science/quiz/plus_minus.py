#!/bin/python3

import math
import os
import random
import re
import sys

# sample input
# STDIN           Function
# -----           --------
# 6               arr[] size n = 6
# -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]



#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    n_arr = len(arr)
    count_pos = len([el for el in arr if el>0])
    count_neg = len([el for el in arr if el<0])
    count_zero = len([el for el in arr if el==0])

    pos_rat = float(count_pos)/n_arr
    neg_rat = float(count_neg)/n_arr
    zero_rat = float(count_zero)/n_arr

    arr = [pos_rat,neg_rat,zero_rat]

    for el in arr:
        print("{:.6f}".format(el))


# input.strip apa itu?
n_arr_input = "6"
element_input =  "-4 3 -9 0 4 1"

n = int(n_arr_input.strip())
arr = list(map(int, element_input.rstrip().split()))

plusMinus(arr)
