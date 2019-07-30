import java.util.Calendar;

public class CreditCard {
	private String creditCardNumber;
	private String cardHolderName;
	private String bank;
	private int limit;
	private double balance;
	
	/*
	 * Constructor
	 */
	public CreditCard(String creditCardNumber, String cardHolderName,
			String bank, int limit, double balance)
	{
		this.creditCardNumber = creditCardNumber;
		this.cardHolderName = cardHolderName;
		this.bank = bank;
		this.limit = limit;
		this.balance = balance;
	}
	/*
	 * Accessor Methods
	 */
	public String getCreditCardNumber()
	{
		return creditCardNumber;
	}
	
	public String getCardHolderName()
	{
		return cardHolderName;
	}
	
	public String getBank()
	{
		return bank;
	}
	
	public int getLimit()
	{
		return limit;
	}
	
	public double getBalance()
	{
		return balance;
	}
	/*
	 * Action Methods
	 */
	public boolean chargeIt(double price)
	{
		if (balance + price > limit)
		{
			return false;
		}
		
		balance += price;
		return true;
	}
	
	//precondition: the payment amount is limited to at most the balance and can not exceed the balance.
	public void payment(double amount, double lateFee)
	{
		Calendar calendar = Calendar.getInstance();
		int dayOfTheMonth = calendar.get(Calendar.DAY_OF_MONTH);
		
		if (dayOfTheMonth > 15)
		{
			balance += lateFee;
		}
		
		balance -= amount;
	}
	
	public String toString()
	{
		return "CreditCard [creditCardNumber=" + creditCardNumber
				+ ", cardHolderName=" + cardHolderName + ", bank=" + bank
				+ ", limit=" + limit + ", balance=" + balance + "]";
	}
	
}
