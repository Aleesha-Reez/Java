

public class SpiralOrderMatrix {
	
	
	public void spiralOrder(int arr[][])
    { 
		if(arr.length == 0)
		{
			System.out.println("null");
		}
		
		int rows = arr.length;
	    int col = arr[0].length;
        int i = 0;
        int row_start = 0;
        int col_start = 0; 
        int row_end = rows;
        int col_end = col;
       
        while (row_start < row_end && col_start < col_end) { 
  
      
            for (i = col_start; i < col_end; i++) { 
                System.out.print(arr[row_start][i] + " "); 
            } 
            row_start++; 
          
           
            for (i = row_start; i < row_end; i++) { 
                System.out.print(arr[i][col_end - 1] + " "); 
            } 
            col_end--; 
            
            
       
           
            if (row_start < row_end) { 
                for (i = col_end - 1; i >= col_start; i--) { 
                    System.out.print(arr[row_end - 1][i] + " "); 
                } 
                row_end--; 
            } 
  
          
            if (col_start < col_end) { 
                for (i = row_end - 1; i >= row_start; i--) { 
                    System.out.print(arr[i][col_start] + " "); 
                } 
                col_start++; 
            } 
            
            
        } 
    
    } 
	  
   
    public static void main(String[] args) 
    { 
    	SpiralOrderMatrix s = new SpiralOrderMatrix();
        
        int arr[][] = { {1, 2, 3, 4},
        		        {5, 6, 7, 8},
        		        {9,10,11,12}
                      };

 
        s.spiralOrder(arr); 
    } 
}
  