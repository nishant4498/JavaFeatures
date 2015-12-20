
public class StringComparisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rakesh"; // This is stored in string pool // STRING LITERAL
		String s2 = "Rakesh";// Points to the same location in the string pool.
		String s3 = "Rakesh".intern();// Points to the same location.
		String s4 = new String("Rakesh"); // This always creates a new area in the heap location. // STRING OBJECT
		String s5 = new String("Rakesh").intern();// Although new creates a reference in the heap memory , intern forces 
												// it to point to the already existing location in string pool.	
		
		/*
		 * Before JAVA 7 string pool was stores as PermGen Space of Java Heap, which is a very small space
		 * compared to the main heap.JAVA 7 onwards string pool is a part of main heap.
		 * 
		 */
		
		//s1 and s2 are same
		//s1 and s3 are same
		//s1 and s5 are same
		if ( s1 == s2 ){
		    System.out.println("s1 and s2 are same");  // 1.
		}
		if ( s1 == s3 ){
		    System.out.println("s1 and s3 are same" );  // 2.
		}
		if ( s1 == s4 ){
		    System.out.println("s1 and s4 are same" );  // 3.
		}
		if ( s1 == s5 ){
		    System.out.println("s1 and s5 are same" );  // 4.
		}
		
		
		/*
		 *	String is immutable or Final  in JAVA because of String pool.Since many objects share the same string pool location for a particular 
		 * string and if its mutable then one of the objects might change the value stored in the pool.
		 * Another reason of keeping string immutable is security aspects.String is used at lots of places over the network in Database connection
		 *  strings.Also java strings are used for standard java class loading and thus by keeping it immutable no malicious program can
		 *  load some other unwanted class. 
		 *  
		 *  Because of string being FINAL it can be used for hashCode() in HashMaps and Hashtable. Thus we just need to compute the hashCode 
		 *  just once and reuse it again.Improves the performance
		 */

	}

}
