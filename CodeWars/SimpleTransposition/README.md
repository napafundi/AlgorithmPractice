#### Description:
Simple transposition is a basic and simple cryptography technique. We make 2 rows and put first a letter in the Row 1, the second in the Row 2, third in Row 1 and so on until the end. Then we put the text from Row 2 next to the Row 1 text and thats it.

Complete the function that recieves a string and encrypt it with this simple transposition.

#### Breakdown:
Given a string, simple_transposition(string) will iterate through the string and add each odd element to a list, row1, and then add each even element to a list, row2. The function will then return a string containing row1 followed by row2.

#### Link:
[Simple Transposition] (https://www.codewars.com/kata/simple-transposition/train)
