import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DijkstraAlgorithm {
	
	public static void dijkstra (int[][] edgeWeights, int numVertices, int source, int destination)
	{
		int[] path = new int[numVertices]; //Stores the indices for the path
		HashMap<Integer, Integer> S = new HashMap<Integer, Integer>(); //Stores vertex after used
		HashMap<Integer, Integer> remaining = new HashMap<Integer, Integer>(); //Vertices taken out each time
		
		for (int i = 0; i < numVertices; i++)
		{
			remaining.put(i, Integer.MAX_VALUE); //Set each vertex to have value "infinity"
		}
		
		remaining.replace(source, 0); //Initially set source vertex to value 0
		path[source] = -1; //Set source vertex to value -1
		
		for (int i = 0; i < numVertices; i++)
		{
			int min = Collections.min(remaining.values()); //minimum distance of remaining vertices
			int key = 0;
			
			for (Entry<Integer, Integer> e : remaining.entrySet())
			{
				if (e.getValue() == min)
				{
					key = e.getKey(); //gets key associated with minimum distance vertex
				}
			}
			
			S.put(key, min); //puts vertex into S
			remaining.remove(key); //takes out vertex of remaining vertices
			
			for (int j = 0; j < numVertices; j++)
			{
				if (remaining.containsKey(j)) //Check if remaining has the vertex
				{
					if (edgeWeights[key][j] != 0 && S.get(key) + edgeWeights[key][j] < remaining.get(j))
						//Check if path associated between the currVertex and other currVertex and the
						//sum of currVertex and edgeWeight to other vertex < current shortest path to vertex
					{
						path[j] = key; //Set the index as parent of currVertex
						remaining.replace(j, S.get(key) + edgeWeights[key][j]); //Replace with shorter path
					}
				}
			}
		}
		
		System.out.println(S.get(destination)); //Return distance of shortest path
		System.out.print(source);
		printPath(path, destination); //Prints original source and remaining path
	}
	
	public static void printPath(int[] path, int j)
	{
		if (path[j] == -1) //Base Case: If reach source vertex, return
		{
			return;
		}
		
		printPath(path, path[j]); //Backtrack to find source vertex
		
		System.out.print(" -> " + j);
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("in1.txt");
		Scanner input = new Scanner(file);
		int numCases = Integer.parseInt(input.nextLine());
		
		int[][]edgeWeights;
		int numVertices;
		String[] weightRowStrArr;
		int[] weightRowIntArr;
		String sourceDestination;
		Scanner input2;
		
		for (int i = 0; i < numCases; i++)
		{
			numVertices = Integer.parseInt(input.nextLine());
			edgeWeights = new int[numVertices][numVertices];
			
			sourceDestination = input.nextLine();
			input2 = new Scanner(sourceDestination);
			int source = input2.nextInt();
			int destination = input2.nextInt();
			
			for (int j = 0; j < numVertices; j++)
			{
				weightRowStrArr = input.nextLine().split(" ");
				weightRowIntArr = new int[weightRowStrArr.length];
				for (int k = 0; k < weightRowIntArr.length; k++)
				{
					String weight = weightRowStrArr[k];
					weightRowIntArr[k] = Integer.parseInt(weight);
				}
				
				edgeWeights[j] = weightRowIntArr;
			}
			
			dijkstra(edgeWeights, numVertices, source, destination);
			System.out.println();
			
			input2.close();
		}
		
		input.close();
	}
}
