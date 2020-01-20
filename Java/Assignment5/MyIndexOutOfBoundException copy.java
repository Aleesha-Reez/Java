

public class MyIndexOutOfBoundException extends Exception
{
	private int lowerBound;
	private int upperBound;
	private int index;
	
	public MyIndexOutOfBoundException(int index, int lowerBound, int upperBound)
	{
		this.index = index;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;

	}
	
	public static int getRandom(int number) 
	{
		return (int) (Math.random() * number);
	}

	public String toString()
	{
		return "Error Message: Index: " +index+ ", but Lower bound: "+ lowerBound+ ", Upper bound: " +upperBound;
	}
	public static void main(String[] args)  throws MyIndexOutOfBoundException
	{
		int lowerBound = 0;
		int upperBound = 9;
		try
		{	
			int current;
			current = getRandom(20);
			
			if(current < lowerBound || current > upperBound)
				throw new MyIndexOutOfBoundException(current, lowerBound, upperBound);
		}
		catch(Exception ex)
		{
			System.out.println (ex.toString());
			System.out.println(ex);
		   // ex.printStackTrace();
		}
	}


}
