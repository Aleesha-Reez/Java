



public class MyIndexOutOfBoundException extends RuntimeException {
	
	private int lowerBound;
	private int upperBound;
	private int index;

	  MyIndexOutOfBoundException() {
	  }

	  MyIndexOutOfBoundException(int current, int lowest, int highest) {
		  
	    this.index = current;
	    this.lowerBound = lowest;
	    this.upperBound = highest;
	  }

	  public String toString() {
		 
	    return "Error Message: Index: " + index + ", but Lower bound: " + this.lowerBound + ", Upper Bound: "
	        + this.upperBound;
	  }

	  public static void main(String[] args)  {
	          int i = 0;
		      char[] ch = new char[10];
              for(i = 0; i <= ch.length; ++i) {
            	
                   try{
                	
                       if(i >= ch.length)
            	           throw new MyIndexOutOfBoundException(i,0,ch.length-1);
                        }
		              catch(MyIndexOutOfBoundException e){
		                  System.out.println (e.toString());
		              //  e.printStackTrace();
		               }

	         }
}
}
	