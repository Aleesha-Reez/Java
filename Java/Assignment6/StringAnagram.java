import java.util.HashMap;


public class StringAnagram {
	
	public boolean isAnagram(String s, String t) {
		
	
       String s1 = s.replaceAll("\\s", "").toLowerCase();
       String s2 = t.replaceAll("\\s", "").toLowerCase();
       boolean flag = true;

       
       if(s1.length() != s2.length())
       {
           flag = false;
       }
       else
       {
           

           HashMap<Character, Integer> map = new HashMap<Character, Integer>();
           for (int i = 0; i < s1.length(); i++)
           {
               char Char = s1.charAt(i);
               int Count = 0;
               if(map.containsKey(Char))
               {
                   
                   Count = map.remove(Char);
               }
               map.put(Char, ++Count);
              

             
                Char = s2.charAt(i);
                Count = 0;
               if(map.containsKey(Char))
               {
                   Count = map.remove(Char);
               }
               map.put(Char, --Count);
               
           }
           
           for (int value : map.values())
           {
               if(value != 0)
               {
                   flag = false;
                   return flag;
               }
           }

       }

       flag = true;
       return flag;
       
   }
       
       
	
	
	public static void main(String[] args) {
		
		
		StringAnagram anag = new StringAnagram();
		//String s = "anagram";
		//String t = "nagaram";
		
		String s = "rat";
		String t = "car";
		boolean res = anag.isAnagram(s, t);
		
		
	
       if(res)
       {
           System.out.println(s+" and "+t+" are anagrams");
       }
       else
       {
           System.out.println(s+" and "+t+" are not anagrams");
       }
   }

	}


