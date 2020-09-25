package StringPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
		
		//findDuplicatCharWithForLoop();
		
		findDuplicatCharWithForLoopWithHashSet();
		
	}
	
	
	static void findDuplicatCharWithForLoopWithHashSet() {
		
		Scanner sd= new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String ss = sd.nextLine();
		
		HashSet hset = new HashSet();
		
		HashSet duplicates = new  HashSet<>();
		
		char[] inp=ss.toCharArray();
		
		for (int i = 0; i < inp.length; i++) {
			
			if (hset.add(inp[i])) {
				
			}
			else {
				duplicates.add(inp[i]);
			}
			
				
			
			
//			for (int j = i+1; j < inp.length; j++) {
//				
//				
//				if (inp[i]==inp[j]) {
//				
//					hset.add(inp[i]);
//					
//				}
//				
//				
//			}
			
			
		}
		
		System.out.println("INput : - " + ss);
		
		System.out.println(duplicates);
	}
	
	static void findDuplicatCharWithForLoop() {
			
		Scanner sd= new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String ss = sd.nextLine();
		
		char[] inp=ss.toCharArray();
		
		for (int i = 0; i < inp.length; i++) {
			
			for (int j =i+1; j < inp.length; j++) {
				
				if (inp[i]==inp[j]) {
					
					System.out.println(inp[j]);
					
	
					break;
				}
				
			}
			
		}
		
	}

}
