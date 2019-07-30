Brian Zhu
Professor Rayana
CSE 214.02
31 October 2017

README
DESCRIPTION OF THE PROBLEMS AND HOW TO RUN THEM
This is my third HW. This HW is done in the programming language Java in the IDE Eclipse. The java files are all under one project.

The first problem is the turning of the binary tree into a binary search tree and determining the minimum amount of swaps in order to do so. I did this problem by making my own Binary Tree
class implementation. I then used my binary tree class to find the minimum amount of swaps in order to convert it into a binary search tree. To run it, I read it off the text file in1.txt.
This text file follows the sample input from the homework. I used Scanner to read the text file. I attached a sample in1.txt to use. NOTE: Each txt file runs one test case. In order to run
a different test case, just change the numbers inside the text file.

The second problem is finding the maximum profit from a ColdPlay concert. To do this problem, I made my own PriorityQueue class, which was implemented with arrays. I used the idea of a
sorted array. I always put the max amount in front of the queue. Therefore enqueue is O(n) and dequeue is O(1). I then used my PriorityQueue class to find the maximum profit. To run it, I
read it off the text file in2.txt. This text file follows the sample input from the homework and used Scanner. I attached a sample in2.txt. This is also for one test case. To run more
test cases, just change the numbers in the text file.

The third problem was extra credit and it was make your implementation of a 2-3-4 Tree. I tried to do as much as I can to implement my 2-3-4 Tree. I completed my 2-3-4 Tree Node class. This
contains the majority of the work to manipulate the 2-3-4 Tree through different operations. I started the actual 2-3-4 Tree class, but I did not get to finish. I did create some methods,
but I did not get time to test them all. The 2-3-4TreeTest Class was used to test the different methods I made for the Node Class. I did not have a chance to test the ones I made from the
2-3-4 Tree class.