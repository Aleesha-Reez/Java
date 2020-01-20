import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class UniqueOccurences {
	
	 public boolean uniqueOccurrences(int[] arr) {
	 
		 Map<Integer, Integer> map = new HashMap<>();
		    for (int i : arr) {
		    	
		    	if(map.containsKey(i)) 
		    		map.put(i, map.get(i)+1);
		    	
	            else map.put(i, 1);
	        }
		    
	        Set<Integer> set = new HashSet<>();
	        for(int i: map.keySet()) {
	        	
	            if(set.contains(map.get(i))) 
	            	return false;
	            set.add(map.get(i));
	        }
	        
	 return true;

}
	 
	 public static void main(String[] args) {
		
		 UniqueOccurences unique = new UniqueOccurences();
		 int[] arr = {1,2,2,1};
		 
		 boolean res = unique.uniqueOccurrences(arr);
		 if(res)
	     {
	           System.out.println("True");
	     }
	     else
	     {
	           System.out.println("False");
	     }
		 
	}
}