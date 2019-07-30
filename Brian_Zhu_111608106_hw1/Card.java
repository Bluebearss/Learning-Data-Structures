
public class Card {
	private char suit;
	private int value;
	/*
	 * Constructor
	 */
	public Card(char cardSuit, int cardValue)
	{
		suit = cardSuit;
		value = cardValue;
	}
	
	//Used if the cardValue is not 2-10.
	public Card(String card)
	{
		char cardSuit = card.substring(0,1).charAt(0);
		String cardValue = card.substring(1,card.length());
		int cardValueInt;
		if (cardValue.equals("J"))
		{
			cardValueInt = 11;
		}
		else
		{
			if (cardValue.equals("Q"))
			{
				cardValueInt = 12;
			}
			else
			{
				if (cardValue.equals("K"))
				{
					cardValueInt = 13;
				}
				else
				{
					if (cardValue.equals("A"))
					{
						cardValueInt = 14;
					}
					else
					{
						cardValueInt = Integer.parseInt(cardValue);
					}
				}
			}
		}
		
		suit = cardSuit;
		value = cardValueInt;
	}
	/*
	 * Accessor Methods
	 */
	public char getSuit()
	{
		return suit;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String toString()
	{
		String valueString = "";
		if (value == 11)
		{
			valueString = "J";
		}
		else
		{
			if (value == 12)
			{
				valueString = "Q";
			}
			else
			{
				if (value == 13)
				{
					valueString = "K";
				}
				else
				{
					if (value == 14)
					{
						valueString = "A";
					}
					else
					{
						valueString = Integer.toString(value);
					}
				}
			}
			
		}
		
		return suit + valueString;
	}
	
}
