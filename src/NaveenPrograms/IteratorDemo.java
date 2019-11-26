package NaveenPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class IteratorDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Set<String> list = new TreeSet<String>(new myClass());
		
		//List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < 4; i++) {
			
			list.add(sc.nextLine());
		}

		
		//System.out.println(list);
		
		Iterator itr=list.iterator();
		
		while (itr.hasNext()) {
			
			Object  ele = itr.next();
			
			System.out.println(ele);
		}
		
		
		
	}

}

class myClass implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = (String) o1;
		
		String s2 = (String)o2;
		
		return s1.compareTo(s2);
	}
	
	
}