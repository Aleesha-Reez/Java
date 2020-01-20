import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;


public class DecodeFile {
	
 public static  String decodeString(String s){
		 
		 Stack<Integer> numStack =  new Stack<Integer>();
		 Stack<String> chStack =  new Stack<String>();
		 int index = 0;
		 String res ="" ;
		 while(index < s.length())
		 {	 
			
			 if(Character.isDigit(s.charAt(index))){
				
				 int count = 0;
				 while(Character.isDigit(s.charAt(index))){
					 count = 10 * count + (s.charAt(index)- '0');
					 index++;
					 
				 }
				 numStack.push(count);
						 
			 }
			 else if(s.charAt(index) == '['){
				 chStack.push(res);
				 res ="" ;
				 index++;
					 
			 }else if(s.charAt(index) == ']'){
		    	 StringBuilder sb = new StringBuilder(chStack.pop());
		    	 int count = numStack.pop();
		    	 for(int i =0; i < count;i++){
		    		 sb.append(res);
		    	 }
		    	 res = sb.toString();
		    	 index++;
		    	 
		     } else{
		    	 res += s.charAt(index);
		    	 index++;
		     }

	    }
      return res;
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
		
		
	    File file = new File("EncodedFile.txt");
  		if(file.exists()){
  			
  			  FileInputStream fis = new FileInputStream(file);
  			  String str = readFromStream(fis);
  			  String rverse = decodeString(str);
  	      
  		    File outputFile = new File("DecodedFile.txt");
  			FileOutputStream fos = new FileOutputStream(outputFile);
  			
  			fos.write(rverse.getBytes());
  			fos.close();
  		}else{
			 System.out.println("File does not exists!");
		}

}
}