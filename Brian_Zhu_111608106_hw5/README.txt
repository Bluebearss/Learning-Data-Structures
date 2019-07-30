Brian Zhu
Professor Rayana
CSE 214.02
05 December 2017

README
DESCRIPTION OF THE PROBLEMS AND HOW TO RUN THEM
This is my fifth HW. This HW is done in the programming language Java in the IDE Eclipse. The java files are all under one project.

The problem involves taking an N x N matrix, representing a prison, and finding how many unique paths there are from the first cell at indices (0, 0) to the last cell (N - 1, N - 1). You

can move in four directions (Left, Right, Up, Down) and you must avoid the cells containing motion sensors. The cells with motion sensors have a 1 in the matrix and free cells have a 0 in

the matrix. I solved this problem using DFS on the 2D - array to find a path and then backtracking to find all other paths. The result returned is the total count of how many unique paths

there are. To run the code, I used Scanner to read a text file. The input format is test cases, then N representing the size of the matrix; then the next N lines are N spaced separated 

integers of 0 or 1. I attached a sample text file for reference called "in1.txt". To add a test case, you can just add to the bottom of the text file and increment the number of test cases.