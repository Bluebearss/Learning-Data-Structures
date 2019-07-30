import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PriorityQueueTestClass {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("priorityqueuequeries.txt");
		Scanner input = new Scanner(file);
		int numQueries = Integer.parseInt(input.nextLine());
		
		PriorityQueue queue = new PriorityQueue(4);
		String[] currQuery;
		
		for (int i = 0; i < numQueries; i++)
		{
			currQuery = input.nextLine().split(" ");
			if (currQuery[0].equals("e"))
			{
				queue.enqueue(Integer.parseInt(currQuery[1]));
			}
			if (currQuery[0].equals("d"))
			{
				queue.dequeue();
			}
			if (currQuery[0].equals("p"))
			{
				queue.display();
			}
		}
		
		input.close();
	}

}
