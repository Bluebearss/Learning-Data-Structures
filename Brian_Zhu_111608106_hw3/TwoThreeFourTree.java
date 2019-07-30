
public class TwoThreeFourTree {
	private TwoThreeFourTreeNode root;
	
	public TwoThreeFourTree()
	{
		root = new TwoThreeFourTreeNode();
	}
	
	public TwoThreeFourTreeNode nextChild(TwoThreeFourTreeNode node, int value)
	{
		for (int i = 0; i < node.getNumElements(); i++)
		{
			if (value < node.getElement(i))
			{
				return node.getChild(i);
			}
		}
		
		return node.getChild(node.getNumElements());
	}
	
	public boolean search(int key)
	{
		TwoThreeFourTreeNode currNode = root;
		
		while (!currNode.isLeafNode())
		{
			if (currNode.findElement(key) != -1)
			{
				return true;
			}
			else
			{
				currNode = nextChild(currNode, key);
			}
		}
		
		return false;
	}
	
	public void preorder(TwoThreeFourTreeNode node)
	{
		if (node == null)
		{
			return;
		}
		
		node.display();
		
		preorder(node.getChild(0));
		
		preorder(node.getChild(node.getNumElements()));
	}
	
	public void inorder(TwoThreeFourTreeNode node)
	{
		if (node == null)
		{
			return;
		}
		
		inorder(node.getChild(0));
		
		node.display();
		
		inorder(node.getChild(node.getNumElements()));
	}
	
	public void postorder(TwoThreeFourTreeNode node)
	{
		if (node == null)
		{
			return;
		}
		
		postorder(node.getChild(0));
		
		postorder(node.getChild(node.getNumElements()));
		
		node.display();
	}
}