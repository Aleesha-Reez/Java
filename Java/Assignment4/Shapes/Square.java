
public class Square extends Shape {
	double side;
	
	
	public Square()
	{
		side = 0;
		
	}
	public Square(double side){
		name = "Square";
		this.side = side;
		
	}
	
	public void getArea()
	{
		area =  side*side;
		super.getArea();
	
	}
	
	public void getPerimeter(){
		
		perimeter = 4*side;
		super.getPerimeter();
		
	}


}
