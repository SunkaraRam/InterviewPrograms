package StringPrograms;

import java.util.Arrays;

public class Anagrams {
	
	//Two strings are said to be anagrams if they contains same set of characters in different order

	public static void main(String[] args) {
		
		isAnagram("keep2", "pe2ek");
		
	}

	public static void isAnagram(String str1,String str2) {
		
		String s1 = str1.replaceAll("//s", " ");
		String s2 = str2.replaceAll("//s", " ");
		
		char[] ch1 = s1.toCharArray();
		
		char[] ch2 = s2.toCharArray();
		
		boolean status = true;
		
		if (s1.length()!=s2.length()) {
			
			status = false;
		}
		
		Arrays.sort(ch1);
		
		Arrays.sort(ch2);
		
		status = Arrays.equals(ch1, ch2);
		
		if (status) {
			
			System.out.println(s1+ " and "+s2 + " Are anagrams");
			
		} else {
			System.out.println(s1+ " and "+s2 + " are not anagrams");
			
		}
		
		
	}
	
	
}
