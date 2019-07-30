//Order of Tree is a constant 4 To Represent a 2-3-4 Tree (A B-Tree of Order 4)
public class TwoThreeFourTreeNode {
	private static final int ORDER = 4;
	private int numElements; 
	private TwoThreeFourTreeNode parent;
	private TwoThreeFourTreeNode[] children;
	private int[] elements;
	
	public TwoThreeFourTreeNode()
	{
		numElements = 0;
		parent = null;
		children = new TwoThreeFourTreeNode[ORDER];
		elements = new int[ORDER - 1];
	}
	
	public int getNumElements()
	{
		return numElements;
	}
	
	public TwoThreeFourTreeNode getParent()
	{
		return parent;
	}
	
	public TwoThreeFourTreeNode getChild(int childPos)
	{
		return children[childPos];
	}
	
	public int getElement(int i)
	{
		return elements[i];
	}
	
	public void setParent(TwoThreeFourTreeNode newParent)
	{
		parent = newParent;
	}
	
	public boolean isLeafNode()
	{
		return children[0] == null;
	}
	
	public void attachChild(int childPos, TwoThreeFourTreeNode child)
	{
		children[childPos] = child;
		child.setParent(this);
	}
	
	public TwoThreeFourTreeNode detachChild(int childPos)
	{
		TwoThreeFourTreeNode node = children[childPos];
		children[childPos] = null;
		return node;
	}
	
	//Returns index of the element
	public int findElement(int key)
	{
		for (int i = 0; i < elements.length; i++)
		{
			if (elements[i] == key)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public void insertElement(int key)
	{
		for (int i = elements.length - 1; i >= 0; i--)
		{
			if (elements[i] == 0)
			{
				continue;
			}
			else
			{
				if (elements[i] > key)
				{
					elements[i + 1] = elements[i];
				}
				else
				{
					elements[i + 1] = key;
					numElements++;
					return;
				}
			}
		}
		
		elements[0] = key;
		numElements++;
	}
	
	public int deleteElement(int index)
	{
		int item = getElement(index);
		
		for (int i = index; i < numElements - 1; i++)
		{
			elements[i] = elements[i + 1];
		}
		
		elements[numElements - 1] = 0;
		numElements--;
		
		return item;
	}
	
	public void display()
	{
		System.out.print("| ");
		for (int i = 0; i < numElements; i++)
		{
			System.out.print(elements[i] + " | ");
		}
		
		System.out.println();
	}
}
