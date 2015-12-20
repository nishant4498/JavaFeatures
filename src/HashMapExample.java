import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		Map<JBT, Integer> m1 = new HashMap<JBT, Integer>();
		//HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "Nishant");
		JBT t1 = new JBT(1, 2);
		JBT t2 = new JBT(1, 3);
		JBT t3 = new JBT(2, 1);

		m1.put(t1, 1);
		m1.put(t2, 2);
		m1.put(t3, 3);
		System.out.println("Addition Done");

		/*
		 * Below you can find 3 different ways to iterate a Map. Uncomment
		 * different section and see the different in Output. Pay attention to
		 * when Hashcode and Equals is called
		 */
		
		Set<Entry<Integer, String>> set = hm.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();
		
		
		while(it.hasNext()){
			
			Map.Entry<Integer,String> me = (Map.Entry<Integer,String>)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		/*
		 * Set s = m1.entrySet(); for (Iterator i = s.iterator(); i.hasNext();)
		 * { Map.Entry me = (Map.Entry) i.next(); System.out.println(me.getKey()
		 * + " : " + me.getValue()); }
		 */
		/*
		 * for (Map.Entry<JBT, Integer> entry : m1.entrySet()) {
		 * System.out.println("Key : " + entry.getKey() + " Value : " +
		 * entry.getValue()); }
		 */
		for (Object key : m1.keySet()) {
			System.out.println("Key : " + key.toString() + " Value : " + m1.get(key));
		}

	}
}

class JBT {
	JBT(int i, int j) {
		this.i = i;
		this.j = j;
	}

	int i, j;

	@Override
	public int hashCode() {
		System.out.println("Inside HashCode Method");
		int k = i + j;
		return k;
	}

	@Override
	public boolean equals(Object obj) {

		System.out.println("Inside Equals Method");
		if (i == ((JBT) obj).i && j == ((JBT) obj).j)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return String.valueOf(i).concat(String.valueOf(j));
	}

}


/*If you're only interested in the keys, you can iterate through the keySet() of the map:

Map<String, Object> map = ...;

for (String key : map.keySet()) {
    // ...
}
If you only need the values, use values():

for (Object value : map.values()) {
    // ...
}
Finally, if you want both the key and value, use entrySet():

for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
}*/