import java.util.Random;



public class SumValue {
	
	
    static void generateRandomArray(int[] arr){
    	
    	
    	 Random rd = new Random(); 
         for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); 
            System.out.println(arr[i]); 
         }
    
    	
    }
    
    static long sum(int[] arr) throws InterruptedException{
    	
    	int sum=0;
    	
    	 sumThread[] thread = new sumThread[4];
    	 
         for(int i= 0;i< 4;i++) {
        	 
         	thread[i] = new sumThread(arr,i*arr.length/4,(i+1)*arr.length/4);
         	thread[i].start();
         	thread[i].join();
         	sum += thread[i].getResult();
         	
         	
         }
       
        return sum;
    }
    static class sumThread extends Thread {
    	
		private int a;
		private int b;
		private int[] arr;

		public sumThread(int[] arr,int a,int b) {
			this.arr = arr;
			this.a = a;
			this.b = b;
		}
		
		
		int res =0;

		public void run() {
			
			for(int i=a;i<b;i++) {
				
				res += arr[i];
			}
		}
		
		
		public long getResult() {
			return res;
		}
    }
    
    
    
    public static void main(String[] args) throws InterruptedException{
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }

}
