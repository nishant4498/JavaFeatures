
public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();

	}

}



class SingleObject {
	
	private static SingleObject instance = new SingleObject();
	
	
	//make the constructor private so that this class cannot be
	//instantiated
	private SingleObject(){
		
	}	

	//Get the only object available
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage() {
		// TODO Auto-generated method stub
		
		System.out.println("In Class SingleObject!!");
		
	}
}