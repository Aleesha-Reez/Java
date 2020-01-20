package PetAnimals;
import java.util.*;



public class Cat extends Pet implements Boardable{
	
	private String hairLength;
	Date boardingStart;
    Date setBoardEnd;
	
	

	public String getHairLength() {
		return hairLength;
	}

	public void setHairLength(String hairLength) {
		this.hairLength = hairLength;
	}

	public Cat(String petname, String ownerName, String color, String hairLength) {
		super(petname, ownerName, color);
		this.hairLength = hairLength;
	}
	
	public String toString(){
		
		StringBuffer sb = new StringBuffer();
		sb.append(getClass().getSimpleName().toUpperCase()).append(":\n").append(getPetName()).append(" owned by ").append(getOwnerName()).append("\n").append("Color: ").append(getColor()).append("\n").
		append("Sex: ").append(getSex()).append("\n").append("Hair: ").append(getHairLength());
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
	
	Cat cat = new Cat("Tom","Bob","black","short");
	cat.setSex(2);
	cat.setBoardStart(3, 23, 2011);
	cat.setBoardEnd(3, 23, 2012);
	System.out.println(cat.toString());
	System.out.println("\nBoarding Result = "+cat.boarding(3, 23, 2017));
    
  
 }
  
}



