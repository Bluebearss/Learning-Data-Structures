
public class ComplexityAnalysis {
	
	public ComplexityAnalysis()
	{
		
	}
	
	public boolean isPair(int[] inputArr, int sum)
	{
		for (int i = 0; i < inputArr.length - 1; i++) 
		{
			for (int j = i + 1; j < inputArr.length; j++)
			{
				if (inputArr[i] + inputArr[j] == sum)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean isTriplet(int[] inputArr, int sum)
	{
		for (int i = 0; i < inputArr.length - 2; i++)
		{
			for (int j = i + 1; j < inputArr.length - 1; j++)
			{
				for (int k = j + 1; k < inputArr.length; k++)
				{
					if (inputArr[i] + inputArr[j] + inputArr[k] == sum)
					{
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
}
