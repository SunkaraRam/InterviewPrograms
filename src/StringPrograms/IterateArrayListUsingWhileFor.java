/**
 * 
 */
package StringPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author SunkaraRam
 *
 */
public class IterateArrayListUsingWhileFor {
	
	
	public static void main(String[] args) {
		
		
		
		ArrayList al = new ArrayList();
		
		al.add(12);
		al.add(12.3f);
		al.add(true);
		al.add("baba");
		al.add(18.2d);
		
		System.out.println(al);
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			
			Object obj = itr.next();
			
			//System.out.println(obj);
		}
		
		for (int i = 0; i < al.size(); i++) {
			
			System.out.println(al.get(i));
			
		}
		
		}

}
