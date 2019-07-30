
public class Player {
	private int id;
	private Card[] cards;
	/*
	 * Constructor
	 */
	public Player(int playerId)
	{
		id = playerId;
		cards = new Card[13];
	}
	/*
	 * Accessor Methods
	 */
	public int getId()
	{
		return id;
	}
	
	public Card[] getCards()
	{
		return cards;
	}
	/*
	 * Action Methods
	 */
	public void setCards(Card[] playerCards)
	{
		for(int i = 0; i < cards.length; i++)
		{
			cards[i] = playerCards[i];
		}
	}
	
	public void sortCards()
	{
		int key, j;
		for (int i = 1; i < cards.length; i++)
		{
			key = cards[i].getSuit();
			Card keyCard = cards[i];
			j = i - 1;
			
			while (j >= 0 && cards[j].getSuit() <= key)
			{
				if (Character.getNumericValue(cards[j].getSuit()) == 
						Character.getNumericValue(cards[j + 1].getSuit())
						&& cards[j].getValue() < cards[j + 1].getValue() || 
						Character.getNumericValue(cards[j].getSuit()) < 
						Character.getNumericValue(cards[j + 1].getSuit()))
				{
					cards[j + 1] = cards[j];
					j--;
					cards[j + 1] = keyCard;
				}
				else
				{
					j--;
				}
			}
		}
	}
	
	public void printCards()
	{
		String output = "";
		for(int i = 0; i < cards.length; i++)
		{
			output += cards[i].toString() + " ";
		}
		
		System.out.println(output);
	}
	
}
