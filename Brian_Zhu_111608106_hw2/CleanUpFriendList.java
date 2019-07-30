
public class CleanUpFriendList {
	
	public static int getMinimum(LinkedList friends)
	{
		int min = friends.getHead().getData();
		Node x = friends.getHead();
		
		for (int i = 1; i < friends.getSize(); i++)
		{
			x = x.getLink();
			
			if(x.getData() < min)
			{
				min = x.getData();
			}
		}
		
		return min;
	}
	
	public static int getMaximum(LinkedList friends)
	{
		int max = friends.getHead().getData();
		Node x = friends.getHead();
		
		for (int i = 1; i < friends.getSize(); i++)
		{
			x = x.getLink();
			
			if(x.getData() > max)
			{
				max = x.getData();
			}
		}
		
		return max;
	}
	
	public static int getBucketRange(LinkedList friends, int buckets)
	{
		return (getMaximum(friends) - getMinimum(friends)) / buckets;
	}
	
	public static String[] bucketize(LinkedList friends, int buckets)
	{
		String [] friendNames = new String[buckets];
		int count = 0;
		int num = buckets;
		int currentMinRange = getMinimum(friends);
		int currentMaxRange = currentMinRange + getBucketRange(friends, buckets) - 1;
		
		while (num > 1)
		{
			Node x = friends.getHead();
			LinkedList rangeList = new LinkedList();
			for (int i = 0; i < friends.getSize(); i++)
			{
				if(x.getData() >= currentMinRange && x.getData() <= currentMaxRange)
				{
					rangeList.addToEnd(x);
				}
				
				x = x.getLink();
			}
			
			while (!(rangeList.getSize() <= 1))
			{
				rangeList.delete(buckets - 1);
			}
			
			friendNames[count] = rangeList.getHead().getName();
			
			count++;
			num--;
			currentMinRange += buckets;
			currentMaxRange += buckets;
		}
		
		Node x = friends.getHead();
		LinkedList rangeList = new LinkedList();
		for (int i = 0; i < friends.getSize(); i++)
		{
			if(x.getData() >= currentMinRange && x.getData() <= getMaximum(friends))
			{
				rangeList.addToEnd(x);
			}
			
			x = x.getLink();
		}
		
		while (!(rangeList.getSize() <= 1))
		{
			rangeList.delete(buckets - 1);
		}
		
		friendNames[count] = rangeList.getHead().getName();
		num--;
		
		return friendNames;
	}
	
	public static void main(String[] args) {
		LinkedList friends = new LinkedList(new Node("a", 10, null));
		friends.addToEnd(new Node("b", 2, null));
		friends.addToEnd(new Node("c", 4, null));
		friends.addToEnd(new Node("d", 5, null));
		friends.addToEnd(new Node("e", 7, null));
		friends.addToEnd(new Node("f", 3, null));
		friends.addToEnd(new Node("g", 2, null));
		friends.addToEnd(new Node("h", 9, null));
		friends.addToEnd(new Node("i", 11, null));
		friends.addToEnd(new Node("j", 6, null));
		
		String[] friendNames = bucketize(friends, 3);
		
		for(String s: friendNames)
		{
			System.out.print(s + " ");
		}
	}
}
