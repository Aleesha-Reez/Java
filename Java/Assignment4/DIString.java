
public class DIString {
	
	public static int[] DIStringMatch(String str)
	{
		int size = str.length();
		int low = 0;
		int high = size;
		int output[] = new int[size+1];
		
		for(int i = 0;i<size; i++)
		{
			if(str.charAt(i) == 'I')
			{
			        output[i] = low++;
				    if(i == str.length() - 1)
                    {
                       output[++i] = low;
                     }
			  
			}
		
			else{
				
				    output[i] = high--;
				    if(i == str.length() - 1)
                     {
			            output[++i] = high;
                     }
			        		
			}	
		}
		
		output[size] = high;
		
		return output;
	}

	public static void main(String[] args) {
		
		
		int[] input = DIStringMatch("DDI");
		
		for(int i =0;i < input.length;i++)
		{
			System.out.print(input[i]);
		}
		
	}
}
