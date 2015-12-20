
public class SampleClassDemo {
	
	private String firstName;
	private String lastName;
	
	/*
	 * A public before a constructor makes it visible outside the package. By default the access specifier is "default"
	 * which means package private or visible only to the package.
	 */
	public SampleClassDemo() { 
		// TODO Auto-generated constructor stub
	}
	
	SampleClassDemo(String fName , String lName) {
		// TODO Auto-generated constructor stub
		this.firstName = fName;
		this.lastName = lName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setFirstName(String fName){
		this.firstName = fName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public void setLastName(String lName){
		this.lastName = lName;
	}
	
	
	@Override
	public String toString() {
		return "Hello " + this.firstName + " " + this.lastName ;
	}

	public static void main(String[] args){
		/*
		 *  For this you must define the default constructor in case there is a parametrized constructor defined.
		 */
		SampleClassDemo scd = new SampleClassDemo();
		scd.setFirstName("Nishant"); 
		scd.setLastName("Kumar");
		System.out.println(scd.toString());
		
		SampleClassDemo scd1 = new SampleClassDemo("Vipin" ,"Tiwari");
		System.out.println(scd1.toString());		
	}
	
}
