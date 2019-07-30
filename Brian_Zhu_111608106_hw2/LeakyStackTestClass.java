import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LeakyStackTestClass {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("in3.txt");
		Scanner input = new Scanner(file);
		int numCases = Integer.parseInt(input.nextLine());
		
		LeakyStack stack;
		int capacity;
		String operations;
		String[] operationsArr;
		
		for(int i = 0; i < numCases; i++)
		{
			capacity = Integer.parseInt(input.nextLine());
			operations = input.nextLine();
			stack = new LeakyStack(capacity);
			operationsArr = operations.split(" ");
			
			for(String s: operationsArr)
			{
				stack.push(s);
			}
			
			stack.display();
		}
		
		input.close();
		
	}
}
