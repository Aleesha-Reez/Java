package PetAnimals;

public class Pet {
	
	private String name, owner, color;
	public static final int MALE = 1;
	public static final int FEMALE = 2; 
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;
	protected String petSex; 

	protected String[] sex = {"MALE","FEMALE","SPAYED","NEUTERED"};
	
	public Pet (String name, String ownerName, String color) {
		this.name = name;
		this.owner = ownerName;
		this.color = color;
	}
	

	String getPetName() {
		return name;
	}


	String getOwnerName() {
		return owner;
	}


	String getColor() {
		return color;
	}
	

	void setSex(int sexid) {
		try {
			switch(sexid) {
			case 0:
				petSex = sex[0];
				break;
			case 1:
				petSex = sex[1];
				break;
			case 2:
				petSex = sex[2];
				break;
			case 3:
				petSex = sex[3];
				break;
			}
		} catch(Exception e){
			throw new IllegalArgumentException("Invalid value");
		}
	}


	String getSex() {
		return petSex;
	}
	
	public String toString(){
		return getPetName() + " owned by " + getOwnerName()+ "\n"+ "Color: " +getColor()
		        +"\n" +"Sex: " +getSex();
	}
	
	
	public static void main(String[] args) {
		
		Pet pet = new Pet("Spot","Mary"," Black and white");
		pet.setSex(0);
		System.out.println(pet.toString());
		
	}
	
}
	
	