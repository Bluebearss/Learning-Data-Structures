import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PrisonBreak {
	private static int count; //Keeps count of how many paths
	
	public static void setCount(int value) //Sets count to a value (Used to reset count for multiple 
										   //test cases)
	{
		count = value;
	}
	
	public static boolean isValidCell(int i, int j, int[][] cells)
	{
		if (i >= 0 && j >= 0 && i < cells[0].length && j < cells[0].length && cells[i][j] == 0)
			//Checks if indices of cell within matrix boundaries and has no motion sensor
		{
			return true;
		}
		
		return false;
	}
	
	public static void findNumUniquePaths(int[][] cells, int i, int j, boolean[][] markedArr)
	{
		if (cells[0][0] == 1 || cells[cells.length - 1][cells[0].length - 1] == 1) 
			//If first cell has motion sensor or last cell has motion sensor, no paths possible
		{
			return;
		}
		
		if (i == cells[0].length - 1 && j == cells[0].length - 1)
			//Base Case: if indices are (n-1, n-1)
		{
			count++;
		}
		
		markedArr[i][j] = true; //Mark the cell as checked
		
		if (isValidCell(i, j - 1, cells) && !markedArr[i][j - 1]) //Left is valid move
		{
			findNumUniquePaths(cells, i, j - 1, markedArr);
		}
		
		if (isValidCell(i, j + 1, cells) && !markedArr[i][j + 1]) //Right is valid move
		{
			findNumUniquePaths(cells, i, j + 1, markedArr);
		}

		if (isValidCell(i - 1, j, cells) && !markedArr[i - 1][j]) //Up is valid move
		{
			findNumUniquePaths(cells, i - 1, j, markedArr);
		}

		if (isValidCell(i + 1, j, cells) && !markedArr[i + 1][j]) //Down is valid move
		{
			findNumUniquePaths(cells, i + 1, j, markedArr);
		}
		
		markedArr[i][j] = false; //Set cells as unchecked again so when method backtracks, 
							     //checks other paths
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("in1.txt");
		Scanner input = new Scanner(file);
		int numCases = Integer.parseInt(input.nextLine());
		
		int[][] cells;
		boolean[][] marked;
		int size;
		String[] cellRowStrArr;
		int[] cellRowIntArr;
		
		for (int i = 0; i < numCases; i++)
		{
			size = Integer.parseInt(input.nextLine());
			cells = new int[size][size];
			marked = new boolean[size][size];
			
			for (int j = 0; j < size; j++)
			{
				cellRowStrArr = input.nextLine().split(" ");
				cellRowIntArr = new int[cellRowStrArr.length];
				for (int k = 0; k < cellRowIntArr.length; k++)
				{
					String cell = cellRowStrArr[k];
					cellRowIntArr[k] = Integer.parseInt(cell);
				}
				
				cells[j] = cellRowIntArr;
			}
			
			findNumUniquePaths(cells, 0, 0, marked);
			
			System.out.println(count);
			
			setCount(0);
		}
		
		input.close();
	}
}
