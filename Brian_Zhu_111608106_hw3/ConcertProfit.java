import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ConcertProfit {
	
	public static int maxProfit(PriorityQueue[] rows, int numFans)
	{
		int profit = 0;
		
		for (int i = 0; i < numFans; i++)
		{
			int greatestRow = rows[0].getSize();
			int greatestRowIndex = 0;
			for (int j = 1; j < rows.length; j++)
			{
				if(rows[j].getSize() > greatestRow)
				{
					greatestRow = rows[j].getSize();
					greatestRowIndex = j;
				}
			}
			
			profit += rows[greatestRowIndex].dequeue();
		}
		
		return profit;
	}
	/*Precondition: there is at least 1 and at most 1000 seating rows, num of ColdPlay fans, and initial empty
	seats in the rows*/
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("in2.txt");
		Scanner input = new Scanner(file);
		
		PriorityQueue[] rows;
		int profit;
		String numRowsAndFans;
		String seats;
		Scanner input2;
		Scanner input3;
		
		numRowsAndFans = input.nextLine();
		seats = input.nextLine();
		input2 = new Scanner(numRowsAndFans);
		input3 = new Scanner(seats);
		rows = new PriorityQueue[input2.nextInt()];
		
		for (int i = 0; i < rows.length; i++)
		{
			int numSeats = input3.nextInt();
			PriorityQueue currRow = new PriorityQueue(numSeats);
			for (int j = 0; j < numSeats; j++)
			{
				currRow.enqueue(j + 1);
			}
			
			rows[i] = currRow;
		}
		
		profit = maxProfit(rows, input2.nextInt());
		System.out.println(profit);
		
		input3.close();
		input2.close();
		input.close();
	}

}
