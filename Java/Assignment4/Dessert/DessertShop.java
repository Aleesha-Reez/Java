
public class DessertShop {
	

	private final double taxRate = 0.065;
	private final String storeName = "M & M Dessert Shop";  
	private final int itemMaxSize = 40;
	private final int costWidth = 8;
	
	
	

	public double getTaxRate() {
		return taxRate;
	}




	public String getStoreName() {
		return storeName;
	}




	public int getItemMaxSize() {
		return itemMaxSize;
	}




	public int getCostWidth() {
		return costWidth;
	}




	public String cents2dollarsAndCents(int cost)
	{
		String costInDollars = Double.toString(cost/100.0);
		return costInDollars;
	}
	
	

}
