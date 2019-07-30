
public class MaxHeap {
	private int[] data; //Storage Array
	private int heapSize; //Current Size
	private int maxSize; //Capacity
	
	public MaxHeap(int maximumSize) //Constructor
	{
		if (maximumSize < 1)
		{
			maxSize = 100;
		}
		else
		{
			maxSize = maximumSize;
		}
		
		data = new int[maximumSize];
		heapSize = 0;
	}
	
	public boolean isEmpty()
	{
		return heapSize == 0;
	}
	
	public boolean isFull()
	{
		return heapSize == maxSize;
	}
	
	private void swap(int position, int i) throws Exception
	{
		if (position < 0 || i < 0)
		{
			throw new Exception();
		}
		
		int temp = data[position];
		data[position] = data[i];
		data[i] = temp;
	}
	
	private void heapify() throws Exception
	{
		int position = 0; //Position of the element
		int childPos; //Position of the child
		
		while (position * 2 + 1 < heapSize) //While there is a left child
		{
			childPos = position * 2 + 1; //Set childPos to the left child
			
			if (childPos < heapSize - 1 && data[childPos + 1] > data[childPos]) /*If childPos not last
				element and right child > left child (swap with the greatest child)*/
			{
				childPos++; //Set childPos to right child
			}
			
			if (data[position] >= data[childPos]) //If element at the position >= child, return
			{
				return;
			}
			
			swap(position, childPos); //Swap the element at position with its child
			
			position = childPos; //Set the new position of the element
		}
	}
	
	public void insert(int item) throws Exception
	{
		int position;
		if (isFull())
		{
			throw new Exception();
		}
		
		heapSize++;
		data[heapSize - 1] = item;
		position = heapSize - 1;
		
		while(position > 0 && data[position] > data[(position - 1) / 2])
		{
			swap(position, (position - 1) / 2);
			position = (position - 1) / 2;
		}
	}
	
	public int delete() throws Exception //Delete Maximum Element
	{
		int answer;
		
		if (isEmpty())
		{
			throw new Exception();
		}
		answer = data[0];
		data[0] = data[heapSize - 1];
		heapSize--;
		heapify();
		
		return answer;
	}
}
