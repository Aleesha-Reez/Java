
public class ReverseString {
	
public String reverseAString(String str){
	
	if(str.length() == 0)
	{
		System.out.println("null");
	}
	String[] st = str.split(" ");
	String output = "";
	for(int i = st.length-1; i >= 0;i--)
	{
		output= output+ st[i] + " ";
	}
return output;
	
	
}
	
	public static void main(String[] args) {
		
		ReverseString rev = new ReverseString();
		String str = "the sky is blue";
		String outputString = rev.reverseAString(str);
		System.out.println("output string is: "+outputString);
		
	}
}


