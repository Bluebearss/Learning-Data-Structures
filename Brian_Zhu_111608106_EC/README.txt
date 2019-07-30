Brian Zhu
Professor Rayana
CSE 214.02
09 December 2017

README
DESCRIPTION OF THE PROBLEMS AND HOW TO RUN THEM
This is my extra credit HW. This HW is done in the programming language Java in the IDE Eclipse. The java files are all under one project.

The problem involves taking an N x N adjacency matrix representing a weighted directed graph and finding the distance of the shortest path from a source vertex to a destination vertex. Also,

the path itself has to be printed. It is assumed that there is a valid path from the source vertex to the destination vertex. I solved this problem using Dijkstra's Shortest Path Algorithm

using HashMaps and Collections and Entry and arrays. The result returned is the distance of the shortest path and the shortest path. To run the code, I read off a text file using Scanner.

The input format is number of test cases, number of vertices, source vertex and destination vertex, and then the next n lines are n space separated integers representing the edge weights

between two vertices. 0 means there is no edge between the vertices. I attached a sample text file for reference for input format called "in1.txt". To add a test case, you can add to the

bottom of the text file and increment the number of test cases.