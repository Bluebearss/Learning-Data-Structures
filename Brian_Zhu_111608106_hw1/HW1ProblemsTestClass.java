
public class HW1ProblemsTestClass {

	public static void main(String[] args) {
		//Complexity Analysis
		ComplexityAnalysis test = new ComplexityAnalysis();
		int[] testArr = {11, 15, 6, 8, 9, 10};
		
		//Credit Card
		CreditCard testCreditCard = new CreditCard("123456789", "Brian",
				"Bank of America", 500, 290.55);
		
		//Card and Player
		Card testCard = new Card('S', 10);
		Card testCard2 = new Card("CJ");
		Player testPlayer = new Player(1);
		String[] cardsForPlayer1 = {"S4", "D8", "C4", "D3", "D5", "DJ",
				"S3", "D4", "DA", "SJ", "D7", "H10", "D6"};
		Card[] cards = new Card[13];
		for(int i = 0; i < cards.length; i++)
		{
			Card mCard = new Card(cardsForPlayer1[i]);
			cards[i] = mCard;
		}
		
		//Location, GPS, and Car
		Location myCurrentLocation = new Location(354, 538);
		Location myDestination = new Location(108,25);
		Car myCar = new Car();
		GPS myGPS = new GPS();
		myGPS.setCurrentLocation(myCurrentLocation);
		myGPS.setDestination(myDestination);
		myCar.setGPS(myGPS);
		myCar.setCurrentSpeed(35.0);
		System.out.println();
		
		//Test for the ComplexityAnalysis class
		System.out.println(test.isPair(testArr, 16));
		System.out.println(test.isPair(testArr, 27));
		System.out.println(test.isTriplet(testArr, 25));
		System.out.println(test.isTriplet(testArr, 39));
		System.out.println();
		
		//Test for the CreditCard class
		System.out.println(testCreditCard.toString());
		System.out.println(testCreditCard.getBalance());
		System.out.println(testCreditCard.chargeIt(100));
		System.out.println(testCreditCard.getBalance());
		System.out.println(testCreditCard.chargeIt(500));
		testCreditCard.payment(150, 25);
		System.out.println(testCreditCard.getBalance());
		System.out.println();
		
		//Test for the Card and Player class
		System.out.println(testCard2.toString());
		System.out.println(testCard.getSuit());
		System.out.println(testCard.getValue());
		System.out.println(testPlayer.getId());
		testPlayer.setCards(cards);
		testPlayer.printCards();
		testPlayer.sortCards();
		testPlayer.printCards();
		System.out.println();
		
		//Test for the Location, GPS, and Car class
		System.out.println(myDestination.toString());
		System.out.print("Distance: ");
		System.out.printf("%.2f",((GPS)myCar.getGPS()).getCalculatedDistance());
		System.out.println();
		System.out.print("Arrival : ");
		System.out.printf("%.2f", myCar.getArrivalTime());
	}

}
