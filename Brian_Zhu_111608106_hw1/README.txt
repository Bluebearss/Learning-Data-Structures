Brian Zhu
Professor Rayana
CSE 214.02
11 September 2017

README

DESCRIPTION OF THE PROBLEMS
This is my first HW. This HW is done in the programming language Java in the IDE Eclipse. The java files are all under one project. 

The TimeComplexity Analysis class showcases how to find a pair of int's or a triple of int's in a given array to produce a given sum. The methods returns boolean values.


The CreditCard class is a Java representation of a Credit Card. There are instance variables creditCardNumber, cardHolderName, bank, limit, and balance. There are methods chargeIt,

which charges your balance, and payment, which subtracts from your balance. If it is paid after the 15th day of the month, a late fee is added to your balance. There is also a precondition

on the payment method that the amount paid can not exceed the balance.


The Card class represents a playing card with a char representation of the suit and a int representation of the card value. The second constructor passes in a String, and the first

index is the suit, while the rest represents the card value. There is also a precondition that the constructor be used if the value of the card is not numeric. The toString() method 

represents the playing card as a string of suit and value.


The Player class represents a player in the game with an id and an array of Cards. SetCards() sets the given Cards to his/her hand of Cards. SortCards() sorts the playing cards in greatest

to least suit and greatest to least value within the same suit. The array of Cards are printed using the toString() method from the Card class.


The Location class represents an (X,Y) coordinate on the map.


The GPS class represents a start Location and a destination Location. The GPS then calculates the shortest distance between the two locations.


The Car class represents a vehicle with a given speed and a GPS. The car can then find the estimated arrival time based on the calculated distance from the GPS and the car's speed.


HOW TO RUN CODE
All the Java files should be made in a project under Eclipse. This way the Java files can correlate and the test class will run.

All of the problems' code is run in a test class. Variables are instantiated for each problem, which hold certain values. The code is then tested by using the methods from the classes and

then printing it out. The values for each variable can be changed to test the different possibilties of each class.

