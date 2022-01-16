minion_game.md

Both players are given the same string, .
Both players have to make substrings using the letters of the string .
Stuart has to make words 'starting' with consonants.
Kevin has to make words 'starting' with vowels.

jika words nya harus start dari consonant, then Stuart +1
jika words nya harus start dari vowels, then Stuart +1

The game ends when both players have made 'all possible substrings'.

how to create 'all possible substrings'


# setelah diuji di laptop
jika len(str) > 3000, maka process akan di KILLED
untuk mencetak substring nya, cukup sulit juga

# setelah di uji di server hackerrank
TC 4 - 14 , RunTimeError
karena berat juga kali

jadi dibutuhkan teknik yg lebih mudah.
apakah itu?

TC4	punya len sebesar 5010
TC5	punya len sebesar > 5010

# output
BANANA

hasil:
BANANA
ANANA
NANA
ANA
NA
A

ANANA
