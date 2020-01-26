

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
/*		HashSet h = new HashSet();
		
		h.add(123);
		h.add("Ram");
		h.add('c');
		h.add(456.36);
		h.add(true);
		
		System.out.println(h.add(123));
		
		System.out.println(h);
		
		System.out.println(h.add("Ram"));
		
		System.out.println(h.add("RamS"));
		
		System.out.println(h);
		
		Iterator itr = h.iterator();
		
		while (itr.hasNext()) {
			
			Object o = itr.next();
			System.out.println(o);
			
	
		}
		
		*/
		
		Set h = new TreeSet();
		
//		h.add(123);
//		h.add(1);
//		h.add(4);
//		h.add(456);
//		h.add(1);
		h.add(null);
		
		System.out.println(h);
		
	}
	
	

}
//class Mycamparator implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		
//		Object obj1 =(String) o1;
//		Object obj2 = (String)o2;
//		
//		return obj1.compareTo(obj2);
//	}
	
	
//}