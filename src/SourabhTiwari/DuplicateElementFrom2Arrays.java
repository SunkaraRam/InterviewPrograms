package SourabhTiwari;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DuplicateElementFrom2Arrays {

	public static void main(String[] args) {
		
		int[] a = {1,2,7,8,1,1,1,12,8,8};
		
		int[] b = {1,3,4,7,2,2,2};
		
//		SortedSet<Integer> si = new TreeSet<Integer>(new Mycomparator());

		Set set = new HashSet();
		
		if (a.length<b.length) {
		
		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j <  a.length; j++) {
				
				if (a[i]==b[j]) {
					
					set.add(a[i]);//
					
				}
				
			}
		}
		}else {
				for (int i = 0; i < a.length; i++) {
					
					for (int j = 0; j <  b.length; j++) {
						
						if (a[i]==b[j]) {
							
							set.add(a[i]);//
							
						}
						
					}
				
			}
		}
		
		System.out.println(set);
		}
		
		
		
	}
	

		
//				
//		for (int i = 0; i < b.length; i++) {
//			
//			for (int j = 0; j < a.length; j++) {
//				
//				if (b[i]==a[j]) {
//					System.out.println(b[i]);
//					break;
//				}
//	
//				si.add(b[i]);
//				
//				si.add(a[j]);
//			}
//			
//		}
//		
//		System.out.println(si);
//		
//	}
//
//}
//
//class Mycomparator implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		
//		Integer i1 = (Integer)o1;
//		
//		Integer i2 = (Integer)o2;
//		
//		return i2.compareTo(i1);
//	}
//	
//}
