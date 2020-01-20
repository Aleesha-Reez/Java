
public abstract class Employee {
	
	private String Name;
	private int paymentPerHour;
	
	public Employee(String name, int paymentPerHour) {
		
		Name = name;
		this.paymentPerHour = paymentPerHour;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	
	public int getPaymentPerHour() {
		return paymentPerHour;
	}
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
	

}
