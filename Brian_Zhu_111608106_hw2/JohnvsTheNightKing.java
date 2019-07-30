import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class JohnvsTheNightKing {
	
	public static int[] sortPowers(int[] powers, int numWhiteWalkers, int selectAmount)
	{
		int[] walkerIndices = new int[selectAmount];
		Queue whiteWalkers = new Queue(numWhiteWalkers);
		int numTimes = selectAmount;
		int count = 0;
		int indexCount = 0;
		
		if (selectAmount == 0)
		{
			return walkerIndices;
		}
		
		//Enqueue all the white walkers
		while (count < numWhiteWalkers)
		{
			whiteWalkers.enqueue(new WhiteWalker(count, powers[count]));
			count++;
		}
		
		while (numTimes > 0)
		{
			int tempSize = selectAmount;
			
			if (selectAmount > whiteWalkers.getSize())
			{
				tempSize = whiteWalkers.getSize();
			}
			Queue tempWhiteWalkers = new Queue(tempSize);
			
			//Dequeueing elements
			for (int i = 0; i < tempSize; i++)
			{
				tempWhiteWalkers.enqueue(whiteWalkers.dequeue());
			}
			
			//Finding maxPower and index of that White Walker
			int maxPower = tempWhiteWalkers.peek().getPower();
			int maxWalkerIndex = tempWhiteWalkers.peek().getIndex();
			Queue dumpQueue = new Queue(tempSize);
			
			for (int i = 0; i < tempSize; i++)
			{
				WhiteWalker currWalker = tempWhiteWalkers.dequeue();
				
				if (currWalker.getPower() > maxPower)
				{
					maxPower = currWalker.getPower();
					maxWalkerIndex = currWalker.getIndex();
				}
				
				dumpQueue.enqueue(currWalker);
			}
			
			tempWhiteWalkers = dumpQueue;
			
			//Setting the index into the final index array
			walkerIndices[indexCount++] = maxWalkerIndex;
			
			//Enqueueing back the elements
			for(int i = 0; i < tempSize; i++)
			{
				WhiteWalker currWalker = tempWhiteWalkers.dequeue();
				int currPower = currWalker.getPower();
				int currIndex = currWalker.getIndex();
				if (currPower == maxPower && currIndex == maxWalkerIndex)
				{
					continue;
				}
				else
				{
					if (currPower - 1 < 0)
					{
						currWalker.setPower(0);
					}
					else
					{
						currWalker.setPower(currPower - 1);
					}
				}
				
				whiteWalkers.enqueue(currWalker);
			}
			numTimes--;
		}
		
		return walkerIndices;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("in4.txt");
		Scanner input = new Scanner(file);
		int numCases = Integer.parseInt(input.nextLine());
		
		int[] powersArr;
		String numWalkers;
		String powers;
		Scanner input2;
		Scanner input3;
		
		for(int i = 0; i < numCases; i++)
		{
			numWalkers = input.nextLine();
			powers = input.nextLine();
			input2 = new Scanner(numWalkers);
			input3 = new Scanner(powers);
			
			int m = input2.nextInt();
			int n = input2.nextInt();
			powersArr = new int[m];
			
			for (int j = 0; j < m; j++)
			{
				powersArr[j] = input3.nextInt();
			}
			
			int[] walkerIndices = sortPowers(powersArr, m, n);
			
			for (int k: walkerIndices)
			{
				System.out.print(k + " ");
			}
			
			input2.close();
			input3.close();
		}
		
		input.close();
	}
	
}
