import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TeamSelection {
	
	public static String[] teamSelect(LinkedList players)
	{
		LinkedList playersList = players;
		Node x = playersList.getHead();
		int index = 0;
		while (x.getLink() != null)
		{
			if (x.getData() < x.getLink().getData())
			{
				x = x.getLink();
				playersList.delete(index);
			}
			else
			{
				x = x.getLink();
				index++;
			}
			
		}
		
		String[] playerJerseys = new String[playersList.getSize()];
		Node y = playersList.getHead();
		for (int i = 0; i < playerJerseys.length; i++)
		{
			playerJerseys[i] = y.getName();
			y = y.getLink();
		}
		
		return playerJerseys;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("in2.txt");
		Scanner input = new Scanner(file);
		int numCases = Integer.parseInt(input.nextLine());
		
		LinkedList players;
		String jerseyNums;
		String heights;
		Scanner input2;
		Scanner input3;
		
		for (int i = 0; i < numCases; i++)
		{
			jerseyNums = input.nextLine();
			heights = input.nextLine();
			input2 = new Scanner(jerseyNums);
			input3 = new Scanner(heights);
			players = new LinkedList(new Node(Integer.toString(input2.nextInt()), input3.nextInt(), null));
			while(input2.hasNextInt())
			{
				players.addToEnd(new Node(Integer.toString(input2.nextInt()), input3.nextInt(), null));
			}
			
			String[] selectedPlayers = teamSelect(players);
			for(String s: selectedPlayers)
			{
				System.out.print(s + " ");
			}
			
			input2.close();
			input3.close();
		}
		
		input.close();
	}
}
