package SurenPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringDuplicate {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		String inp = "surenm ram suren ram";//sc.nextLine();
		
		
		String[] words = inp.split(" ");
		
		Set<String> org  = new HashSet<String>();
		
		Set<String> dup  = new HashSet<String>();
	
		for (int i = 0; i < words.length; i++) {
			
			org.add(words[i]);
			
			if (org.contains(words[i])) {
				
				org.add("****");
				
			}
			
			if ("ram".equals(words[i])) {
				org.add("****");
			}
			
		}
		
		
		
		
		System.out.println(org);
		
	}

}
