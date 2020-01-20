
public class ATMUser extends User  {
	

	private String password;
	private double availableBalance;
	
	
	public ATMUser(String name, String age, String address, String phoneNumber,
			String bankAccountNumber, String password, double availableBalance) {
		super(name, age, address, phoneNumber, bankAccountNumber);
		this.password = password;
		this.availableBalance = availableBalance;
	}
	

	

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public double getAvailableBalance() {
		return availableBalance;
	}


	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	
	
	

}
