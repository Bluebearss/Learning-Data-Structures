import java.util.NoSuchElementException;

public class PriorityQueue {
	
	private int[] queue; //array to represent queue
	private int size; //current size of queue
	private int max; //current max element
	private int first; //index of first element
	private int last; //index of last element
	
	public PriorityQueue(int capacity)
	{
		queue = new int[capacity];
		size = 0;
		first = 0;
		last = 0;
		max = 0;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getFirst()
	{
		return first;
	}
	
	public int getLast()
	{
		return last;
	}
	
	public int getMax()
	{
		return max;
	}
	
	public void setFirst(int firstIndex)
	{
		first = firstIndex;
	}
	
	public void setLast(int lastIndex)
	{
		last = lastIndex;
	}
	
	public void setMax(int newMax)
	{
		max = newMax;
	}
	
	public void enqueue(int item)
	{
		if (size == queue.length)
		{
			throw new IndexOutOfBoundsException();
		}
		
		if (item > max && first <= last)
		{
			for (int i = last; i > 0; i--)
			{
				queue[i] = queue[i - 1];
			}
			
			last++;
			queue[first] = item;
			max = item;
		}
		else
		{
			if (item > max && last < first)
			{
				int index = last;
				for (int i = 0; i < size; i++)
				{
					int index2 = index - 1;
					if (index2 < 0)
					{
						index2 = queue.length - 1;
					}
					queue[index] = queue[index2];
					index--;
					if (index < 0)
					{
						index = queue.length - 1;
					}
				}
				last++;
				queue[index] = item;
				max = item;
			}
			else
			{
				queue[last++] = item;
			}
		}
		
		if(last == queue.length)
		{
			last = 0;
		}
		
		size++;
		
		if (size == 1) //In case the first element enqueued is less than 0
		{
			max = item;
		}
	}
	
	public int dequeue()
	{
		if (isEmpty())
		{
			throw new NoSuchElementException("Queue Underflow");
		}
		
		int item = queue[first];
		queue[first] = -1; //-1 means it is empty at that index
		first++;
		
		if (first == queue.length)
		{
			first = 0;
		}
		
		max = queue[first];
		size--;
		
		
		return item;
	}
	
	public int peek()
	{
		if (isEmpty())
		{
			throw new NoSuchElementException("Queue Underflow");
		}
		
		return queue[first];
	}
	
	public void display()
	{
		int front = first;
		for (int i = 0; i < size; i++)
		{
			System.out.print(queue[front]+ " ");
			front++;
			if (front == queue.length)
			{
				front = 0;
			}
		}
		
		System.out.println();
	}
}
