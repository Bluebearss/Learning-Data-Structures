import java.util.NoSuchElementException;

public class PriorityQueue {
		private int[] queue;
		private int size;
		private int min;
		private int first;
		private int last;
		
		public PriorityQueue(int capacity)
		{
			queue = new int[capacity];
			size = 0;
			first = 0;
			last = 0;
			min = 0;
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
		
		public int getMin()
		{
			return min;
		}
		
		public void setFirst(int firstIndex)
		{
			first = firstIndex;
		}
		
		public void setLast(int lastIndex)
		{
			last = lastIndex;
		}
		
		public void setMin(int newMin)
		{
			min = newMin;
		}
		
		public void enqueue(int item)
		{
			if (size == queue.length)
			{
				throw new IndexOutOfBoundsException();
			}
			
			if (item < min)
			{
				for (int i = last; i > 0; i--)
				{
					queue[i] = queue[i - 1];
				}
				
				last++;
				queue[first] = item;
				min = item;
			}
			else
			{
				queue[last++] = item;
			}
			
			if(last == queue.length)
			{
				last = 0;
			}
			
			size++;
			
			if (size == 1)
			{
				min = item;
			}
		}
		
		public int dequeue()
		{
			if (isEmpty())
			{
				throw new NoSuchElementException("Queue Underflow");
			}
			
			int item = queue[first];
			queue[first] = -1;
			first++;
			min = queue[first];
			size--;
			if (first == queue.length)
			{
				first = 0;
			}
			
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
			for (int i = first; i < queue.length; i++)
			{
				System.out.print(queue[i]+ " ");
			}
			System.out.println();
		}
	}
