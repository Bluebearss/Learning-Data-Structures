
public class Car {
	private GPS carGPS;
	private double speed;
	/*
	 * Constructor
	 */
	public Car()
	{
		carGPS = new GPS();
		speed = 0.0;
	}
	/*
	 * Accessor Methods
	 */
	public GPS getGPS()
	{
		return carGPS;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	/*
	 * Mutator Methods
	 */
	public void setGPS(GPS givenGPS)
	{
		carGPS = givenGPS;
	}
	
	public void setCurrentSpeed(double givenSpeed)
	{
		speed = givenSpeed;
	}
	
	public double getArrivalTime()
	{
		return carGPS.getCalculatedDistance() / speed;
	}
	
}
