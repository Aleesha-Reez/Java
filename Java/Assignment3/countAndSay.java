
public class countAndSay {
	
	public static String countAndSayS(int n) {
		
		
    if(n == 1)
			return "1";
		
	if (n <= 0)
		return null;
	
	String str = "1";
 
	
	for(int i = 1;i < n; i++) {
		
		
		StringBuilder s = new StringBuilder();
		int count = 1;
		
		for (int j = 1; j < str.length(); j++) {
			
			if (str.charAt(j) == str.charAt(j - 1)) {
				count+= 1;
				
			} else {
				
				s.append(count + "" + str.charAt(j-1));
				count = 1;
			}
		}
 
		s.append(count + "" + str.charAt(str.length() - 1));
        str = s.toString();
	
	}
 
	return str;
}

public static void main(String[] args) {
	
	//	countAndSay c = new countAndSay();
		System.out.println(countAndSayS(6));
		
	
	}
}



