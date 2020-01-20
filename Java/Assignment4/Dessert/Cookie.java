
public class Cookie extends DessertItem {
	
	int num;
	double pricePerDozen;
	
	
	public int getNum() {
		return num;
	}
	
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public double getPricePerDozen() {
		return pricePerDozen;
	}
	
	public void setPricePerDozen(double pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}
	
	public Cookie(String name,int num, double pricePerDozen) {
		super(name);
		this.num = num;
		this.pricePerDozen = pricePerDozen;
	}
 
	public int getCost()
	{
		int cost;
		cost = (int)Math.round((getPricePerDozen()/12) * getNum());
		return cost;
	}
	
	
}
