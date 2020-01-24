package HCL;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorListDemo {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
	list.add(12);
		
		list.add("asra");
		
		
		ListIterator a =list.listIterator();
		
		System.out.println(list.size());
		
		System.out.println("Previous" + a.previousIndex());
		
		if (a.previousIndex()!=-1) {
			
			while (a.hasNext()) {
				System.out.println(a.next()+" ");
//		
//				Object obj = (Object)a.next();
//				
//				System.out.println(obj);
				
			}
				
		}
		
		else {
			System.out.println("Empty");
		}
	}

}
