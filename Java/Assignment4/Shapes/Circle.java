
public class Circle  extends Shape{

	double radius;
	
	public Circle()
	{
		radius = 0;
		
	}
	public Circle(double radius){
		 name = "Circle";
		this.radius = radius;
		
	}
	 
	public void getArea()
	{
		area = (Math.PI * radius * radius);
		super.getArea();
		
	}
	
	public void getPerimeter(){
		
		perimeter = (2 * Math.PI * radius);
		super.getPerimeter();
	
	}


}
