
public class BinaryTree {
	private int[] data; //nodes in  tree
	private int treeSize; //Current tree size
	private int maxSize; //Capacity
	private int[] traversalArr; //Array storing any traversal
	private int i; //Index for the traversalArr
	
	public BinaryTree(int capacity)
	{
		data = new int[capacity];
		treeSize = 0;
		maxSize = capacity;
	}
	
	public boolean isEmpty()
	{
		return treeSize == 0;
	}
	
	public boolean isFull()
	{
		return treeSize == maxSize;
	}
	
	public int getSize()
	{
		return treeSize;
	}
	
	public void insert(int item)
	{
		if (isFull())
		{
			throw new IllegalStateException();
		}
		
		data[treeSize] = item;
		treeSize++;
		traversalArr = new int[treeSize];
		i = 0;
	}
	
	public int delete()
	{
		int answer;
		if (isEmpty())
		{
			throw new IllegalStateException();
		}
		
		treeSize--;
		answer = data[treeSize];
		traversalArr = new int[treeSize];
		i = 0;
		
		return answer;
	}
	
	public int[] inorder(int pos)
	{
		if (isEmpty())
		{
			throw new IllegalStateException();
		}
		
		if (pos * 2 + 1 < treeSize)
		{
			inorder(pos * 2 + 1);
		}
		
		traversalArr[i++] = data[pos];
		
		if (pos * 2 + 2 < treeSize)
		{
			inorder(pos * 2 + 2);
		}
		
		return traversalArr;
	}
	
	public void display()
	{
		for(int i = 0; i < treeSize; i++)
		{
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
	}
}
