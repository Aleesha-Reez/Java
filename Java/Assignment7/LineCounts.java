import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class LineCounts {
	
	public static void main(String[] args) throws IOException {
		
		
		if(args.length == 0){
			System.out.println("Give atleast 1 file name as argument");
		}
		
		for (int i = 0; i < args.length; i++) {
	         System.out.print(args[i] + ":  ");
	         countNoOfLines(args[i]);
	      }

    }

	private static void countNoOfLines(String fileName) {
		
		
		 BufferedReader in;  
	     int Count = 0;      
	      
	      try {
	          in = new BufferedReader( new FileReader(fileName) );
	      }
	      catch (Exception e) {
	              System.out.println("File does not exist");
	              return;
	      }
	      
	   
	      
	      try {
	         String line = in.readLine();   
	         while (line != null) {
	             Count++;              
	             line = in.readLine();     
	         }
	      }
	      catch (Exception e) {
	         System.out.println(" ERROR in reading from file.");
	         return;
	      }
	      
	      System.out.println(Count + " lines");
	   
		
	}
}