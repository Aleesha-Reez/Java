
public class Rectangle extends Shape{
	
	double height;
	double width;
	
	public Rectangle()
	{
		height = 0;
		width =0;
	}
	public Rectangle(double height, double width){
		name = "Rectangle";
		this.height = height;
		this.width = width;
	}
	
	public void getArea()
	{
		area =  height*width;
		super.getArea();
		
	}
	
	public void getPerimeter(){
		
		perimeter = 2*(height +width);
		super.getPerimeter();
		
	}

}
