flipping_matrix.md

it is 2 x 2 and we want to maximize the top left quadrant, a 1x1 matrix. Reverse row 1:
1 2
4 3

and now reverse column 0:
4 2
1 3

maximal_sum is 4

# Function Description
complete the flippingMatrix function in the editor below.
flippingMatrix has the following paramaters:

= int matrix[2n][2n]: a 2-dimensional array of integers

# returns
int: the maximum sum possible

# input format
the first line contains an integer q, the number of queries
the next `q` sets are in the following format:


# constraints
1 <= q <= 16
1 <= n <= 128
0 <= matrix[i][j] <= 4096
where
0 <= i, j <= 2n

# sample input
STDIN           Function
-----           --------
1               q = 1
2               n = 2
112 42 83 119   matrix = [[112, 42, 83, 119], [56, 125, 56, 49], \
56 125 56 49              [15, 78, 101, 43], [62, 98, 114, 108]]
15 78 101 43
62 98 114 108

# sample output
414




= The function is expected to return an INTEGER.
= The function accepts 2D_INTEGER_ARRAY matrix as parameter.
