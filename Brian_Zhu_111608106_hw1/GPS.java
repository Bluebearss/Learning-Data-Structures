
public class GPS {
	private Location currentLocation;
	private Location destination;
	/*
	 * Constructor
	 */
	public GPS()
	{
		currentLocation = new Location(0,0);
		destination = new Location(0,0);
	}
	/*
	 * Accessor Methods
	 */
	public Location getCurrentLocation()
	{
		return currentLocation;
	}
	
	public Location getDestination()
	{
		return destination;
	}
	/*
	 * Mutator Methods
	 */
	public void setCurrentLocation(Location givenLocation)
	{
		currentLocation = givenLocation;
	}
	
	public void setDestination(Location givenLocation)
	{
		destination = givenLocation;
	}
	/*
	 * Action Methods
	 */
	public double getCalculatedDistance()
	{
		double xDiff = destination.getX() - currentLocation.getX();
		double yDiff = destination.getY() - currentLocation.getY();

		return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
	}
	
}
