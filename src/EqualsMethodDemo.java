
public class EqualsMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Date{
	private int year;
	private int month;
	private int day;
	
	public Date(int day, int year, int month){
		this.day = day;
		this.year = year;
		this.month = month;
	}
	
	@Override
	public boolean equals(Object y){
		//1. Optimization for reference equality.
		if(y == this ) return true;
		
		//2. Check the object against null.
		if(y == null) return false;
		
		//Check that the objects are of the same type. Here we should not use instanceOf() as it will be true for objects of any
		// of the sub classes as well.
		if(y.getClass() != this.getClass()) return false;
		
		//cast the incoming object to the current type.
		Date that = (Date) y;
		
		// compare each significant field. If its primitive use == , otherwise use equals().
		if(this.day != that.day) return false;
		if(this.month != that.month) return false;
		if(this.year != that.year) return false;
		
		return true;
	}
	
	
}
