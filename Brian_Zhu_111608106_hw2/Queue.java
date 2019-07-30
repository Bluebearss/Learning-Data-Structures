import java.util.NoSuchElementException;

public class Queue {
	private WhiteWalker[] queue;
	private int size;
	private int first;
	private int last;
	
	public Queue(int capacity)
	{
		queue = new WhiteWalker[capacity];
		size = 0;
		first = 0;
		last = 0;
	}
	
	public boolean isEmpty() {
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
	
	public void setFirst(int firstIndex)
	{
		first = firstIndex;
	}
	
	public void setLast(int lastIndex)
	{
		last = lastIndex;
	}
	
	public void enqueue(WhiteWalker item)
	{
		if (size == queue.length)
		{
			throw new IndexOutOfBoundsException();
		}
		
		queue[last++] = item;
		
		if(last == queue.length)
		{
			last = 0;
		}
		
		size++;
	}
	
	public WhiteWalker dequeue()
	{
		if (isEmpty())
		{
			throw new NoSuchElementException("Queue Underflow");
		}
		
		WhiteWalker item = queue[first];
		queue[first] = null;
		first++;
		size--;
		if (first == queue.length)
		{
			first = 0;
		}
		
		return item;
	}
	
	public WhiteWalker peek()
	{
		if (isEmpty())
		{
			throw new NoSuchElementException("Queue Underflow");
		}
		
		return queue[first];
	}
	
	public void display()
	{
		for (int i = first; i < queue.length; i++)
		{
			System.out.print(queue[i].getIndex() + " ");
			System.out.print(queue[i].getPower());
			System.out.println();
		}
	}
}
