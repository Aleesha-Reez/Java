

public class Course {
	
	
	private   int courseId;
	private  String courseName;
	private  int maxCapacity;
	private   int professorId;
	private  int credits;
	static int[] studentIds;
	
	
	Course(int courseId){
		this.courseId = courseId;
	}
	
	Course(int courseId, int professorId){
		this.courseId = courseId;
		this.professorId = professorId;
	}
	
	Course(int courseId, int professorId, int credits){
		this.courseId = courseId;
		this.professorId = professorId;
		this.credits = credits;
		
	}
	
	
	
	public int getCourseId(){
		return courseId;
	}
	
	public void setCourseId(int courseId){
		
		if(courseId > 0){
			this.courseId = courseId;
		}
		else
			System.out.println("Course Id should not be negative or zero");
		
	}
	
	
	public String getCourseName(){
		return courseName;
	}
	
	public void setCourseName(String courseName){
		if(courseName.length() >= 10  && courseName.length() <= 60){
		        this.courseName = courseName;
	     }
		else
			System.out.println("Course name should be minimum length 10 and maximum 60 ");
	}
	
	
	public int getMaxCapacity() {
	    return maxCapacity;
	}
	
	
	public void setMaxCapacity(int maxCapacity) {
		if(maxCapacity > 10 && maxCapacity < 100){
			    this.maxCapacity = maxCapacity;
		}
		else
			System.out.println("Maximum capacity should not be less than 10 and greater than 100");
		if(maxCapacity >= 100 ){
			
			removeDuplicates(studentIds);
		}
	}
	
	

	public int getProfessorId() {
	    return professorId;
	}

	public void setProfessorId(int professorId) {
		
	    int count =0;
		while(professorId > 0)
		{
			professorId = (professorId / 10);
			count++;
			
		}
		if(count != 6)
		     System.out.println("Professor Id should be a six digit number");
		if(count == 6){
	             this.professorId = professorId;
		}
    }
	
	
	
	public int getCredits() {
	    return credits;
	}


    public void setCredits(int credits) {
    	if (credits > 0 && credits < 10){
                  this.credits = credits;
    	}
    	else
    		System.out.println("Credits should be a single digit but greater than 0");
    }
    
    
    
    public  void registerStudent(int[] studentIds)
    {
    	
    	for(int i =0;i < studentIds.length;i++)
    	{
    		System.out.print(studentIds[i]);
    	}
    	
    	
    }
    
    
    public  int[] removeDuplicates(int[] studentIds) {
    	
    
    	
    	 int n = studentIds.length;
     
    	 int j =0;
    	 
    	  for (int i = 0; i < n; i++) 
          {
    		 
            for (j = i+1; j < n; j++)
            {
            	 
            	
                if(studentIds[i] == studentIds[j])
                {
                    
                    studentIds[j] = studentIds[n-1];
                    n--;
                    j--;
                }
            }  
          }
    	  for( j =0;j < n ;j++)
    	  {
    		  System.out.print(studentIds[j]);
    	  }
    	  return studentIds;
    	
                
    }
    	
    	
    
    public int groupsOfStudents(int[] studentIds) {
    	
    	int sum =0;
    	
    	int count =0;
    	
    	for(int i =0;i< studentIds.length;i++)
    	{
    		
    		for(int j =i+1; j< studentIds.length;j++){
    			sum = studentIds[i] + studentIds[j];
    			if(sum % 2 == 0)
    			{
    				count++;
    			}
    		}
         }
    	 
         return count;

    }

    
    public static void main(String[] args){
    	
    	Course c1 = new Course(1);
    //	Course c2 = new Course(courseId,professorId);
    //	Course c3 = new Course(courseId,professorId,credits);
    	int[] studentIds ={1,6,2,3,2,4,5,6};
    	c1.registerStudent(studentIds);
    	System.out.println("\n");
    	
    	
    	c1.removeDuplicates(studentIds);
    	
    	System.out.println("\n");
    	int count = c1.groupsOfStudents(studentIds);
    	System.out.println("The pair count is "+count);
    }
    
}


