
public class Location {
	private double x;
	private double y;
	/*
	 * Constructor
	 */
	public Location(double xCoord, double yCoord)
	{
		x = xCoord;
		y = yCoord;
	}
	/*
	 * Accessor Methods
	 */
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
}
