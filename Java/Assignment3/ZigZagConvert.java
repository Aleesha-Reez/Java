
public class ZigZagConvert {
	
	
		 public static String convert(String str, int numRows) {
			 
			 if(str.length() == 0)
			 {
				 return null;
			 }
		        int length = str.length();
		        char[] newStr = new char[length];
		        int count = 0;
		        
		        
		        if (numRows > length || numRows <= 1) {
		            return str;
		        }
		        
		     
		        
		        int interval = 2 * numRows - 2;
		        
		        for (int i = 0; i < numRows; i++) {
		        	
		            int step = interval - 2 * i;
		            
		            for (int j = i; j < length; j += interval) {
		            	
		            	newStr[count] = str.charAt(j);
		                count++;
		                
		                if (step > 0 && step < interval && j + step < length) {
		                	
		                	newStr[count] = str.charAt(j + step);
		                    count++;
		                }                
		            }            
		        }
		        
		        for (int k = 0; k < length ; ++k)  
		        { 
		            System.out.print(newStr[k]); 
		        } 
		     
		        return new String(newStr);
		    }
		
		 public static void main(String[] args) {
			
			String str = "PAYPALISHIRING";
			//int rows = 4;
			convert(str, 3);
			
		}
	}
	
	
	

	
	


