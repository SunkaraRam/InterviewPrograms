package NaveenPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("Sunkara");
		
		list.add(125);list.add(12.56);list.add('d');list.add(456.2d);
		
		list.add("Aunkara");
		
		System.out.println("Before remove : "+list);
		
		ListIterator ltr = list.listIterator();
		
		while (ltr.hasNext()) {
			
			String obj = (String)ltr.next();
			
			System.out.println(obj);
			
//			if ("Aunkara".equals(obj)) {
//
//				ltr.remove();
//			}
			
			
		}
		
	
		
		System.out.println("After remove : "+list);
	}

}
