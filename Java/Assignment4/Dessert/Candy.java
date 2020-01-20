
public class Candy extends DessertItem {

	double weight;
	double pricePerPound;
	
	
	public Double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	public Double getPricePerPound() {
		return pricePerPound;
	}
	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}
	
	public Candy(String name,double weight,double pricePerPound)
	{
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	
	
	public int getCost(){
		
		int cost =0;
		cost = (int)(Math.round(getWeight() * getPricePerPound()));
		return cost;
	}
	
}
