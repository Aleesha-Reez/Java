
public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Contractor con = new Contractor("a",400,7);
		System.out.println("Contractor salary:" +con.calculateSalary());
		FullTime ful = new FullTime("b",400);
		System.out.println("Fulltime salary:" +ful.calculateSalary() );
		
	}

}
