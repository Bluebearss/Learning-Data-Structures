import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DistinctTriplets {
	
	public static int distinctTriples(int[] elements, int mythicalConstant)
	{
		if (mythicalConstant == 0) //Check if constant is 0
		{
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		
		HashMap<Integer, Integer> modMap = new HashMap<Integer, Integer>();
		int count = 0;
		
		for (int i = 0; i < elements.length; i++) //Populating elements of array into HashMap
		{
			modMap.put(i, elements[i] % mythicalConstant); //Fills with the elements modulus constant
		}
		
		HashMap<Integer, Integer> subsetMap = (HashMap<Integer, Integer>)modMap.clone();
		
		for (int i = 0; i < elements.length - 2; i++)
		{
			subsetMap.remove(i);
			HashMap<Integer, Integer> subsetValuesMap = (HashMap<Integer, Integer>)subsetMap.clone();
			
			for (int j = i + 1; j < elements.length - 1; j++)
			{
				int currNum = modMap.get(i) + modMap.get(j); //Represents sum of the two elements in triplet
				
				if (currNum > mythicalConstant)
				{
					currNum = currNum % mythicalConstant;
				}
				
				if (currNum == 0)
				{
					currNum = mythicalConstant;
				}
				
				subsetValuesMap.remove(j);
				if (subsetValuesMap.containsValue(mythicalConstant - currNum))//Checks for 3rd element to add
					//up to the constant
				{
					int valuesCount = Collections.frequency(subsetValuesMap.values(), 
							mythicalConstant - currNum); //Finds how many occurrences of a value in a HashMap
					count += valuesCount;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("in2.txt");
		Scanner input = new Scanner(file);
		
		int triples;
		int[] elementsArr;
		int numElements;
		int mythicalConstant;
		String numIntAndConstant;
		String elements;
		Scanner input2;
		Scanner input3;
		
		numIntAndConstant = input.nextLine();
		elements = input.nextLine();
		input2 = new Scanner(numIntAndConstant);
		input3 = new Scanner(elements);
		numElements = input2.nextInt();
		mythicalConstant = input2.nextInt();
		elementsArr = new int[numElements];
		
		for (int i = 0; i < numElements; i++)
		{
			elementsArr[i] = input3.nextInt();
		}
		
		triples = distinctTriples(elementsArr, mythicalConstant);
		
		System.out.println(triples);
		
		input3.close();
		input2.close();
		input.close();
	}
}
