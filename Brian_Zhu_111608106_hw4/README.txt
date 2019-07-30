Brian Zhu
Professor Rayana
CSE 214.02
16 November 2017

README
DESCRIPTION OF THE PROBLEMS AND HOW TO RUN THEM
This is my fourth HW. This HW is done in the programming language Java in the IDE Eclipse. The java files are all under one project.

The first problem is taking an array of integers and finding two numbers that add up to a specified sum. The result returned is the set of the two indices of the numbers, with first index
less than second index. The time complexity is in O(n). I used the HashMap Java Class. To run it, I read the input off the text file in1.txt. This text file follows the sample input from 
the homework, with line 1 having 2 ints, number of integers and target sum and line 2 having the given integers. I used Scanner to read the text file. I attached a sample in1.txt for
reference. NOTE: Each txt file runs one test case. In order to run a different test case, just change the numbers inside the text file.

The second problem is taking an array of integers and finding how many distinct triplets have a sum divisible by a given mythical constant. The result returned is the number of distinct
triplets. The time complexity is in O(n^2). I used the HashMap Java Class and the Collections Class to find the frequency of a value in a collection. To run it, I read the input off
the text file in2.txt. This text file follows the sample input from the homework, with line 1 having 2 ints, number of integers and mythical constant and line 2 having the given integers.
I used Scanner to read the text file. I attached a sample in2.txt for reference. NOTE: Each txt file runs one test case. In order to run a different test case, just change the numbers
inside the text file.

NOTE:For both problems, I assumed there are duplicate integers allowed. It was specified in the second problem that there are duplicate integers allowed, but not in the first problem.

