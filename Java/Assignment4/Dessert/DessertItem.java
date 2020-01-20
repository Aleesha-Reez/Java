
public abstract class DessertItem {
	
	String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DessertItem(String name) {
		
		this.name = name;
	}
    public DessertItem() {
		
	}
	
	public abstract int getCost();

}
