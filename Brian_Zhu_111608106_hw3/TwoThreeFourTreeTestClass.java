
public class TwoThreeFourTreeTestClass {
	
	public static void main(String[] args) {
		TwoThreeFourTreeNode testNode = new TwoThreeFourTreeNode();
		testNode.insertElement(3);
		testNode.insertElement(2);
		testNode.insertElement(6);
		testNode.display();
		testNode.deleteElement(0);
		testNode.display();
		testNode.insertElement(3);
		testNode.display();
		
		System.out.println(testNode.findElement(3));
		System.out.println(testNode.findElement(60));
	}
}
