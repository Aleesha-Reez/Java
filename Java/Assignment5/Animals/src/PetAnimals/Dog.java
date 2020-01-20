package PetAnimals;

import java.util.Date;


public class Dog extends Pet implements Boardable{
	

	private String size;
	Date boardingStart;
	Date setBoardEnd;
	
    public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	

	public Dog(String petname, String ownerName, String color, String size) {
		super(petname, ownerName, color);
		this.size = size;
	}
	
	public String toString(){
		
		StringBuffer sb = new StringBuffer();
		sb.append(getClass().getSimpleName().toUpperCase()).append(":\n").append(getPetName()).append(" owned by ").append(getOwnerName()).append("\n").append("Color: ").append(getColor()).append("\n").
		append("Sex: ").append(getSex()).append("\n").append("Size: ").append(getSize());
		return sb.toString();
	}

		
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void setBoardStart(int month, int day, int year) {
		
		boardingStart = new Date(year,month,day);
		
	}


	@SuppressWarnings("deprecation")
	@Override
	public void setBoardEnd(int month, int day, int year) {
		setBoardEnd = new Date(year,month, day);
		
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		@SuppressWarnings("deprecation")
		Date date = new Date(year, month, day);
		if(boardingStart != null && setBoardEnd != null)
		{
		if(date.equals(boardingStart) || date.equals(setBoardEnd) ||(date.after(boardingStart) && date.before(setBoardEnd)))
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		
		Dog dog = new Dog("Spot","Susan","white","medium");
		dog.setSex(2);
		dog.setBoardStart(4, 20, 2013);
		dog.setBoardEnd(3, 12, 2014);
		System.out.println(dog.toString());
		System.out.println("\nBoarding Result = "+dog.boarding(5, 20, 2018));
	    
	  
	 }

}
