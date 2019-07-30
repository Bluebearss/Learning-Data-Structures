
public class Node {
	private String name;
	private int data;
	private Node link;
	
	public Node()
	{
		name = null;
		data = 0;
		link = null;
	}
	
	public Node(String nodeName, int nodeData, Node linkValue)
	{
		name = nodeName;
		data = nodeData;
		link = linkValue;
	}
	
	public void setName(String nodeName)
	{
		name = nodeName;
	}
	
	public void setData(int nodeData)
	{
		data = nodeData;
	}
	
	public void setLink(Node nodeLink)
	{
		link = nodeLink;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getData()
	{
		return data;
	}
	
	public Node getLink()
	{
		return link;
	}
}
