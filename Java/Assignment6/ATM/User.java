
public class User {
	private String name;
	private String age;
	private String address;
	private String phoneNumber;
	private String bankAccountNumber;
	
	
	public User(String name, String age, String address, String phoneNumber,
			String bankAccountNumber) {
	
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.bankAccountNumber = bankAccountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getBankAccountNumber() {
		return bankAccountNumber;
	}


	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	

	
}
