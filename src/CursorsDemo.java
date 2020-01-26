

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {
		
		Vector v= new Vector();
		
		v.add(52);
		
		Enumeration e = v.elements();
		
		Iterator itr = v.iterator();
		
		v.add("ram");
		
		v.add(123);
		
		v.add(12.362);
		
		v.add(false);
		
		v.add('d');
		
		ListIterator litr = v.listIterator();
		
		if (e.hasMoreElements()) {
			
			Object obj = e.nextElement();
			
			System.out.println(obj);
			
//			if (obj == "ram") {
//				
//				litr.set("sunkara");
//				
//			}
			
			if (litr.hasNext()) {
				
				Object obj1 = litr.next();
				
				
				
				System.out.println(obj1);
				
			}
	
		}
	
		System.out.println(v);
		
		//System.out.println(e.getClass().getName());
//		
//		System.out.println(itr.getClass().getName());
//	
//		System.out.println(litr.getClass().getName());
	}

}
