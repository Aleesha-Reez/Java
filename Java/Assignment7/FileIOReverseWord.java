import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;


public class FileIOReverseWord {
	
	
		
public static String Reverse(String input)
{
	
	Stack<String> st = new Stack<String>();
	int i =0;
	
	String str = "";
	
	StringBuilder sb = new StringBuilder();
	
    while(i<input.length()){
    	
	       if(input.charAt(i)=='.') {
		   
		        st.push(str);
		        while(!st.isEmpty()) {
		            sb.append(st.pop()).append(" ");
		        }
		      str = "";
		      sb.deleteCharAt(i);
		      sb.append(".");
		      i++;
	      }
	
	     else if(input.charAt(i)!='.' && input.charAt(i)== ' ' ) {
		     st.push(str);
	      }
	       
	     else if(input.charAt(i)==' ') {
	    		
			    st.push(str);
			    str="";
			    i++;
		     }
	   
	    else {
		   str+=input.charAt(i);
	  	   i++;
	    }
	 
    }
    
    
    st.push(str).trim();
    while(!st.isEmpty()) {
    	
		sb.append(st.pop()).append(" ");
      }
     
     
     
return sb.toString();

    
}
		
	
private static String readFromStream(FileInputStream fis) throws IOException {
	  
	String str = "";
	while (true) {
		int x = fis.read();
		if (x == -1)
			break;
		char c = (char) x;
		str+= c;
	
	}
	
	fis.close();
	return str;
	

}

  public static void main(String args[]) throws IOException { 
	
	
	    File file = new File("input.txt");
  		if(file.exists()){
  			
  			  FileInputStream fis = new FileInputStream(file);
  			  String str = readFromStream(fis);
  			  String rverse = Reverse(str);
  	      
  		      File outputFile = new File("output.txt");
  			  FileOutputStream fos = new FileOutputStream(outputFile);
  			
  			  fos.write(rverse.getBytes());
  			  fos.close();
  		}else{
  			
			 System.out.println("File does not exists!");
		}
}



 



}


