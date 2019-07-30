
public class WhiteWalker {
	private int index;
	private int power;
	
	public WhiteWalker(int walkerIndex, int walkerPower)
	{
		index = walkerIndex;
		power = walkerPower;
	}
	
	public int getIndex()
	{
		return index;
	}
	
	public int getPower()
	{
		return power;
	}
	
	public void setIndex(int i)
	{
		index = i;
	}
	
	public void setPower(int p)
	{
		power = p;
	}
	
	public void display()
	{
		System.out.println(index + " " + power);
	}
}
