
public class LinkedList {
	private int size;
	private Node head;
	
	public LinkedList()
	{
		size = 0;
		head = null;
	}
	
	public LinkedList(Node nodeHead)
	{
		size = 1;
		head = nodeHead;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public Node getHead()
	{
		return head;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addToStart(Node givenNode)
	{
		if (isEmpty())
		{
			head = givenNode;
			size++;
		}
		
		givenNode.setLink(head);
		head = givenNode;
		size++;
	}
	
	public void addToEnd(Node givenNode)
	{
		if (isEmpty())
		{
			addToStart(givenNode);
		}
		
		Node x = head;
		
		while(x.getLink() != null)
		{
			x = x.getLink();
		}
		
		x.setLink(givenNode);
		givenNode.setLink(null);
		size++;
	}
	
	public void add(Node givenNode, int index)
	{
		if (index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		if (index == 0)
		{
			addToStart(givenNode);
		}
		else
		{
			if (index == size - 1)
			{
				addToEnd(givenNode);
			}
			else
			{
				Node x = head;
				for (int i = 0; i < index - 1; i++)
				{
					x = x.getLink();
				}
				
				givenNode.setLink(x.getLink());
				x.setLink(givenNode);
				size++;
			}
		}
	}
	
	public boolean delete(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0)
		{
			Node temp = head;
			head = temp.getLink();
			temp.setLink(null);
		}
		else
		{
			Node x = head;
			for (int i = 0; i < index - 1; i++)
			{
				x = x.getLink();
			}
			
			x.setLink(x.getLink().getLink());
		}
		
		size--;
		
		return true;
	}
	
	public void display()
	{
		Node x = head;
		for (int i = 0; i < size; i++)
		{
			System.out.print(x.getName() + " ");
			x = x.getLink();
		}
	}
}
