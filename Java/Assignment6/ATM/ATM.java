
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;



public class ATM {
	
	private double availableAmountInMachine;
	private double transactionFee;

	
	HashMap<String, ATMUser> atmUserList = new HashMap<String, ATMUser>();
	
	private HashMap<String, ArrayList<String>> transaction = new HashMap<String, ArrayList<String>>() ;
    private ArrayList<String> transactionList = new ArrayList<String>();
    
	Scanner scanner = new Scanner(System.in);
	private ATMUser currentUser;
	
	
	public ATM(double availableAmountInMachine, double transactionFee) {
		

		this.availableAmountInMachine = availableAmountInMachine;
		this.transactionFee = transactionFee;
		
	}
	

	
	public double getAvailableAmountInMachine() {
		
		return availableAmountInMachine;
	}
	public void setAvailableAmountInMachine(double availableAmountInMachine) {
		this.availableAmountInMachine = availableAmountInMachine;
	}
	
	
	
	public double getTransactionFee() {
		return transactionFee;
	}
	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}
	
	
	
	

  public void  ATMOperations(){
	 
    System.out.println("Welcome! Are you a -" +"\n" +"1.New User"  +"\n" + "2.Current User" +"\n" +"3.Exit");
	try{
	    while (true) {
		   String  input = scanner.nextLine();
		   if (input.equals("1")) {
			     createNewUser();
		    }
		    if (input.equals("2")) {
			     currentUserLogin();
		    }
		    if (input.equals("3")) {
			      break;
		    }
		    if (input.equals("4")) {
		    	forgotPassword();
			     
		    }
		    else{
		    	System.out.println("\nInvalid input.Please enter 3 to exit");
		    }
	     }
	}catch(NoSuchElementException ne) {
	      System.out.println("no line was found");
	      ne.printStackTrace();
	} catch (IllegalStateException ie){
	      System.out.println("this scanner is closed");
	      ie.printStackTrace();
	}
 }	
	
  
  public void  transactionMenu(){
	  System.out.println("\n1 - View Available Balance");
      System.out.println("2 - Deposit");
      System.out.println("3 - Withdrawal");
      System.out.println("4 - Recent Transaction");
      System.out.println("5 - Exit");
      
    
      while (true) {
		   String  input = scanner.nextLine();
		   if (input.equals("1")) {
			   viewAvailableBalance();
		    }
		   else if (input.equals("2")) {
			    deposit();
		    }
		   else if (input.equals("3")) {
			      withdrawal();
		    }
		   else if (input.equals("4")) {
		    	viewRecentTransactions();
		    }
		   else if (input.equals("5")) {
			      break;
		    }
		    else{
		    	System.out.println("\nInvalid input.Please try again or enter 5 to exit");
		    }
	     }
  }
      
      
      private void forgotPassword() {
    	  
    	  String choice = null;
    	  System.out.println("Please enter your account Number");
    	  String bankAccountNumber = scanner.nextLine();
    	  ATMUser tempUser = atmUserList.get(bankAccountNumber);
    	  
    	  if (!atmUserList.containsKey(bankAccountNumber)) {
                System.out.println("Sorry, This account number is not available, please try again!");
                currentUserLogin();
                
           }
    	  else{
		
	
    	  System.out.println("Please enter your name: ");
    	  if (scanner.nextLine().equals(tempUser.getName())) {
              System.out.println("Please enter your age ");
              if (scanner.nextLine().equals(tempUser.getAge())) {
                  System.out.println("Please enter your phone number: ");
                  if (scanner.nextLine().equals(tempUser.getPhoneNumber())) {
                      currentUser = tempUser;
                      changePassword();
                      }
              }
          } else {
                  System.out.println("Sorry, wrong security credentials!");
                  System.out.println("1 - Try again   2 - Cancel");
                  choice = scanner.nextLine();
              
          }  
              System.out.println("Sorry, wrong security credentials!");
              System.out.println("1 - Try again   2 - Cancel");
              choice = scanner.nextLine();;
          
          if (choice.equals(1)) {
              forgotPassword();
          } else if (choice.equals(2)) {
              ATMOperations();
          }
    	  }
	
	 
	}
	
	

  private void changePassword() {
		 System.out.println("Please enter your new password");
	     String newPassword1 = scanner.nextLine();
	     System.out.println("Please confirm your new password");
	     String newPassword2 = scanner.nextLine();
	     if(newPassword1.equals(newPassword2)){
	    	 
	    	 System.out.println(" password has changed successfully!");
	         currentUser.setPassword(newPassword1);
	         currentUserLogin(); 
	    	 
	        } else {
	            System.out.println("Sorry, password mismatch!");
	            changePassword();
	        }
	}
		
	



	private void currentUserLogin() {
		System.out.println("Welcome back"); 
		System.out.println("------------");
  
		
		System.out.println("Please enter your account number");
		String bankAccountNumber = scanner.nextLine();
		
		
		if (!atmUserList.containsKey(bankAccountNumber)) {
            System.out.println("Sorry, This account number is not available, please try again!");
            ATMOperations();
            
        } else {
        	
            System.out.println("Please enter your password || Press any key to continue if you forgot your password");
            String  password = scanner.nextLine();
         
             if (atmUserList.get(bankAccountNumber).getPassword().equals(password)) {
            	
                System.out.println("\nLogin Successfully!");
                currentUser = atmUserList.get(bankAccountNumber);
             
                transactionMenu();
            	
            } else {
                System.out.println("Sorry, wrong password!. Press 4 if you forgot your password");
                ATMOperations();
            }
        }
}



	public void createNewUser(){
		System.out.println("Creating new account");
		System.out.println("--------------------");

		
		
		System.out.println("Please enter your name");
		String name = scanner.nextLine();
		
		System.out.println("Please enter your address");
		String address = scanner.nextLine();
		
		System.out.println("Please enter your age");
		String age = scanner.nextLine();
		
		System.out.println("Please enter your phone number");
		String phoneNumber = scanner.nextLine();
		
		System.out.println("Please enter your bank account number");
		String bankAccountNumber = scanner.nextLine();
		
		System.out.println("Please create a new password");
		String password = scanner.nextLine();
		
		
		/*String newAccNo =  createAccountNumber();
		while(atmUserList.containsKey(newAccNo)){
			
			//atmUserList.get(newAccNo);
			newAccNo = createAccountNumber();;
		}
		
		String bankAccountNumber = newAccNo;*/
		
		
		ATMUser atmUser = new ATMUser(name, age, address, phoneNumber,
				 bankAccountNumber, password,0);
		
		atmUserList.put(bankAccountNumber,atmUser);
		
		//currentUser = atmUserList.get(bankAccountNumber);
		//System.out.println(currentUser);
		System.out.println("Congratulations! Successfully Logged in!");
	    System.out.println("Your account number is: "+bankAccountNumber);
	    System.out.println("\n \n");
	    
	    ATMOperations();
	 
		
}
	
	
  private void viewAvailableBalance() {
        try{
        	if(currentUser.getAvailableBalance() == 0)
        		System.out.println("Available balance is zero");
        	
        	}catch(NullPointerException e){
        		System.out.println("Zero balance");
        		
        	}
        
            System.out.println("Your Available Balance is: " + currentUser.getAvailableBalance());
            transactionMenu();
        	
       
    }

  public void viewRecentTransactions(){
	  
	  
	  transactionList = transaction.get(currentUser.getBankAccountNumber());
	  int transactionNumber = transactionList.size();
	  System.out.println(transactionNumber);
	  int recentTransaction = 10;
	  
	  if(transactionNumber == 0){
		  
          System.out.println("You don't have transaction history!");
          
	  }else if (transactionNumber > recentTransaction) {
		  
          for (int index = transactionNumber - 1; index >= transactionNumber - recentTransaction; index--) {
              System.out.println(transactionList.get(index));
          }
      } else {
          for (String eachTransaction : transactionList
                  ) {
              System.out.println(eachTransaction);
          }
      }
	  
	  transactionMenu();
	
  }
  
  
    public void deposit(){
    	

    	System.out.println("Please enter the amount you want to deposit");
    	double depositAmount = scanner.nextInt();
    	double availableBalance;
    	availableBalance = currentUser.getAvailableBalance();
    	System.out.println("Deposit Successfully!");
    	
    	availableAmountInMachine += depositAmount;
        availableBalance += depositAmount;
        availableBalance -= transactionFee;
        System.out.println("Your Available balance is " +availableBalance);
        
        transactionList.add("Deposit: " + depositAmount + " , Available Balance: " + availableBalance);
     
        transaction.put(currentUser.getBankAccountNumber(), transactionList);
        currentUser.setAvailableBalance(availableBalance);
    
        transactionMenu();
    	
    }

    public void withdrawal(){
    	
    	
       double  availableBalance = currentUser.getAvailableBalance();
    	System.out.println("Your available balance is "+availableBalance);
    	System.out.println("Please enter the amount you want to withdraw");
    	double withdrawalAmount = scanner.nextInt();
    	
    	
    	if (withdrawalAmount > availableAmountInMachine) {
            System.out.println("Sorry! There is  no sufficient balance on the machine!");
        
            transactionMenu();
    	}
    	
    	if(availableBalance < withdrawalAmount){
    		System.out.println("You dont have enough balance to withdraw");
    		availableBalance = currentUser.getAvailableBalance();
    		System.out.println("Your Available balance is " +availableBalance);
    		
    		transactionMenu();
    	}
    	else{
    		
    		System.out.println("Successfully withdrawn");
    		
    		availableAmountInMachine -= withdrawalAmount;
            availableBalance -= withdrawalAmount;
            availableBalance -= transactionFee;
            System.out.println("Available balance after recent withdrawal is " +availableBalance);
         
           
            currentUser.setAvailableBalance(availableBalance);
            transactionList.add("Withdrawal Amount: " + withdrawalAmount + " , Available Balance: " + availableBalance);
          
          //  transaction.put(currentUser.getBankAccountNumber(), transactionList);
    		
    	}
    	 transactionMenu();
    	
    }
    
	private String createAccountNumber() {
		
		Random random = new Random();
        String cardNum = "";
        for (int i = 0; i < 6; i++) {
            cardNum += random.nextInt(10);
        }
       
		return cardNum;
	}


	

}


