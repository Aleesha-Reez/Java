import java.util.InputMismatchException;
import java.util.Scanner;


public class Number {

	public static int count(int a, int b)
	{
		int c = 0;
		try{
		
			 c = (a / b);
		     System.out.println("The quotient is " +c);
		    
		}catch(ArithmeticException e){
			System.out.println("Error:"+e.getMessage());
		
			System.out.println("Divisor can never be zero");
		}finally{
			System.out.println("enter finally");
		}
		
		return c;
	}

	public static void main(String[] args) {
		
        Scanner sc =new Scanner(System.in);
		int a = 0, b = 0;
		
		try{
			
		System.out.print("Enter the numerator : ");
		
		//a = sc.nextInt();
	     a = Integer.parseInt(sc.next());
		
		System.out.print("Enter the denominator : ");
		b = sc.nextInt();
	  //b = Integer.parseInt(sc.next());
		
		
		}catch(InputMismatchException e) { 
            System.out.println("input mismatch  exception");
		
		}catch(NumberFormatException nfe){
	          System.out.print("number format exception:");
		}
		count(a,b);
		
		
	}
}
