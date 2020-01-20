
public class Shape {
	
	String name;
	double perimeter;
	double area;
	
	public Shape()
	{
		name ="Shape";
		perimeter = 0;
		area = 0;
				
		
	}

	public void draw()
	{
		System.out.println("Drawing " +name);
	}
	
	public void getArea()
	{
		System.out.println("Area is :" +area);
	}
	
	public void getPerimeter()
	{
		System.out.println("Perimeter is :" +perimeter);
	}
	
	
}
