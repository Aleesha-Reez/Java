package Assignment2;
import java.util.Arrays;

public class Assignment2 {

	/*
    This method should return the sum of salaries of employees having salary greater than 5000
    Note: Employee array is passed, not employee
 */
public static double salaryGreaterThanFiveThousand(Employee[] employees) {
   
	double sum = 0;
	
	for(int i=0;i< employees.length;i++)
	{
	   if(employees[i].getSalary() > 5000)
      {
    	    sum= sum + employees[i].getSalary();
       }
    
	}
	
	System.out.println("The sum of the salaries of employees greater than 5000 is "+sum);
	return sum;
}


/*
This method should print either "Fizz", "Buzz" or "FizzBuzz"
"Fizz" - if id of employee is divisible by 3
"Buzz" - if id of employee is divisible by 5
"FizzBuzz" - if id of employee is divisible by both 3 and 5
*/
public static void fizzBuzz(Employee employee) {
  
	if (employee.getId() % 3 == 0 && employee.getId() % 5 == 0)
	{
		System.out.println("FizzBuzz");
	}
	
	else if (employee.getId() % 3 == 0)
	{
		System.out.println("Fizz");
	}
	else if (employee.getId() % 5 == 0)
	{
		System.out.println("Buzz");
	}
	else
		System.out.println("Employee id is not divisible by 3 or 5");
}

/*
This method should calculate tax for an employee in dollars
If salary of employee is less than or equal to 2500, tax should be 10%
If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
If salary of employee is greater than 5000, tax should be 35%
*/
public static double calculateTax(Employee employee) {

	double tax = 0;
	if(employee.getSalary() <= 2500)
	{
		tax = 0.10 * employee.getSalary();
		System.out.println("Tax for the employee is " +tax);
		
	}
	if(employee.getSalary() > 2500 && employee.getSalary() <= 5000)
	{
		tax = 0.25 * employee.getSalary();
		System.out.println("Tax for the employee is " +tax);
	}
	if(employee.getSalary() > 5000)
	{
		tax = 0.35 * employee.getSalary();
		System.out.println("Tax for the employee is " +tax);
	}

	return tax;
}



/*
We are given two employee objects.
Implement this method to swap salaries of employees
*/
public static void swap(Employee firstEmployee, Employee secondEmployee) {

	double temp;
	double emp1 = firstEmployee.getSalary();
	double emp2 = secondEmployee.getSalary();
	System.out.println("Before swapping the salaries of first employee and second employee is " +emp1 +" and " + emp2 +" respectively "); 
	temp = emp1;
	emp1 = emp2;
	emp2 = temp;
	System.out.println("After swapping the salaries of first employee and second employee is " +emp1 + " and " + emp2 +" respectively "); 
	
	
}


/*
Return number of employees whose age is greater than 50
Note: Employee array is passed, not employee
*/
public static int employeesAgeGreaterThan50(Employee[] employees) {
  
	int count = 0;
	for(int i =0;i< employees.length;i++){
		
		if(employees[i].getAge() >50)
			count++;
	}
	System.out.println("No of employee whose age is greater than 50 is " +count);
	
return count;
}


/*
Implement this method to reverse firstName of employee.
Ex. Before: employee.getFirstName() -> "John"
After : employee.getFirstName() -> "nhoJ"
*/
public static void reverseFirstName(Employee employee) {

String empName = employee.getFirstName();
System.out.println("Employee's first name is :"+empName);
StringBuilder name = new StringBuilder(); 
name.append(empName); 
name = name.reverse(); 
System.out.println("Employee's reversed name is :"+name); 

}



/*Print "true" if employee's first name contain one or more digits
Print "false" if employee's first name doesn't contain any digit
Ex: employee.getFirstName() -> "ha8l" == true
employee.getFirstName() -> "hail" == false
*/
public static void isContainDigit(Employee employee) {

	
	String empName = employee.getFirstName();
	boolean find_digit = false;
	for (int i=0;i< empName.length();i++)
	{
	   if (!Character.isDigit(empName.charAt(i)))
	   {
			 find_digit = false;
	   }
	   else
			 find_digit = true;
	}
	
	if(find_digit == false)
			 System.out.println("false");
	if(find_digit == true)
		     System.out.println("true");
	
}
	



/*
Write a method to raise an employee's salary to three times of his/her original salary.
Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
DO NOT change the input in this method.
Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
Call this new method.
 
*/

public static void tripleSalary(Employee employee) {
	
	double newSalary = 0;
	//double originalSalary = employee.getRaiseSalary();
	double originalSalary = employee.raiseSalary();
	System.out.println("Original salary is " +originalSalary);
	newSalary = originalSalary * 3;
	System.out.println("Tripled salary is " +newSalary);

}



//Additional question for extra credit
/*
    Implement this method to convert String[] to employees array.
    Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
    This String array of length 2 contains 2 employees in form of string, where
    id = 1
    firstName=John
    age=24
    salary=7500
    convert each string to employee object.
    Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */


public static Employee[] createEmployees(String[] employeesStr) {
	
	Employee[] employees = new Employee[employeesStr.length];
	String[] str = new String[9]; 
	for(int i =0;i < employeesStr.length;i++)
	{
        str = employeesStr[i].split(",");
		for(int j=0;j< str.length;j++)
		{ 
	      	 
			System.out.println(str[j]);
	    }
	}
		 
	System.arraycopy(str, 0, employees, 0, str.length);
	System.out.println(Arrays.toString(employees));
    return employees;
} 
    
   
   
public static void main(String [] args){
	
	Employee emp1 = new Employee(1,"hail",25,2000.5);
	Employee emp2 = new Employee(2,"John",30,4000.7);
	Employee emp3 = new Employee(30,"Smith30",55,7000.25);
	Employee [] emp = {emp1,emp2,emp3};
	salaryGreaterThanFiveThousand(emp);
	fizzBuzz(emp3);
	reverseFirstName(emp3);
	employeesAgeGreaterThan50(emp);
	swap(emp2,emp3);
	calculateTax(emp3);
	isContainDigit(emp2);
	tripleSalary(emp3);
	
   // String[] employees = new String[]{"1,hail,25,2000.5", "2,John,30,4000.7"};
  //  createEmployees(employees); 
	
} 
}

 