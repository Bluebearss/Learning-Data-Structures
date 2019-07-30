import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BinaryTreeToBinarySearchTree {

	public static int minSwaps(int[] arr)
	{
		int[] finArr = arr;
		int swaps = 0;
		
		for(int i = 0; i < finArr.length - 1; i++)
		{
			int min = finArr[i];
			int minIndex = i;
			for (int j = i + 1; j < finArr.length; j++)
			{
				if (finArr[j] < min)
				{
					min = finArr[j];
					minIndex = j;
				}
			}
			
			if(minIndex == i)
			{
				continue;
			}
			else
			{
				int temp = finArr[i];
				finArr[i] = min;
				finArr[minIndex] = temp;
				swaps++;
			}
		}
		
		return swaps;
	}
	
	//Precondition: numNodes is at least 1 and at most 105 nodes.
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("in1.txt");
		Scanner input = new Scanner(file);
		int numNodes = Integer.parseInt(input.nextLine());
		
		BinaryTree tree;
		int[] inOrderTree;
		int minSwaps;
		String nodes;
		Scanner input2;
		
		nodes = input.nextLine();
		input2 = new Scanner(nodes);
		tree = new BinaryTree(numNodes);
		
		for (int i = 0; i < numNodes; i++)
		{
			tree.insert(input2.nextInt());
		}
		
		inOrderTree = tree.inorder(0);
		minSwaps = minSwaps(inOrderTree);
		System.out.println(minSwaps);
		
		input2.close();
		input.close();
	}

}
