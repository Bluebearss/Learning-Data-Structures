import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TwoSum {
	
	public static String twoSum(int[] elements, int target)
	{
		HashMap<Integer, Integer> indicesFirst = new HashMap<Integer, Integer>(); //Indices are the keys
		HashMap<Integer, Integer> valuesFirst = new HashMap<Integer, Integer>(); //Values are the keys
		
		for (int i = 0; i < elements.length; i++) //Populating elements of array into HashMaps
		{
			indicesFirst.put(i, elements[i]); //Indices are keys and elements are the values
			valuesFirst.put(elements[i], i); //Elements are keys and indices are the values(*Duplicate
			//values get overwritten to index of last occurrence of duplicate value*)
		}
		
		for (int i = 0; i < elements.length; i++)
		{
			int index1 = i;
			int index2;
			
			if(valuesFirst.get(target - indicesFirst.get(i)) != null) //Checks if HashMap with values as the
			//keys has the target sum subtract the current element as a valid key
			{
				index2 = valuesFirst.get(target - indicesFirst.get(i)); //If has the number to add up to sum,
				//stores its value, the index, into the 2nd index
				return "[" + index1 + ", " + index2 + "]";
			}
		}
		
		return "[-1, -1]";
	}
	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("in1.txt");
		Scanner input = new Scanner(file);
		
		String indices;
		int[] elementsArr;
		int numElements;
		int target;
		String numAndTarget;
		String elements;
		Scanner input2;
		Scanner input3;
		
		numAndTarget = input.nextLine();
		elements = input.nextLine();
		input2 = new Scanner(numAndTarget);
		input3 = new Scanner(elements);
		numElements = input2.nextInt();
		target = input2.nextInt();
		elementsArr = new int[numElements];
		
		for (int i = 0; i < numElements; i++)
		{
			elementsArr[i] = input3.nextInt();
		}
		
		indices = twoSum(elementsArr, target);
		
		System.out.println(indices);
		
		input3.close();
		input2.close();
		input.close();
	}
}
