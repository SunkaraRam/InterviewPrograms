package StringPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagrams {
	
	//Two strings are said to be anagrams if they contains same set of characters in different order

	public static void main1(String[] args) {
		
		//isAnagram("k eep2", "p  e 2   ek");
		
		CheckAnagrams("r    a    m s      un   ra   k a  "  ," r a      s      u    n   k      a r   m    a");
		
	}

/*	public static void isAnagram(String str1,String str2) {
		
		String s1 = str1.replaceAll(" ", "");
		String s2 = str2.replaceAll(" ", "");
		
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
	*/
	@Test
	public void checkArraysMethod() {
		
		int[] ram = new int[] {55,89,36,475,1,14,52,63,85,55,55};
		
		Arrays.sort(ram);
		
		System.out.println("LowestNumber "+ram[0]);
		
		System.out.println("HighestNumber "+ram[ram.length-1]);
		
		
		
		
		
		
	}
	
	public static void CheckAnagrams(String a1,String a2) {
		
		String s1 = a1.replaceAll(" ","");
		
		String s2 = a2.replaceAll(" ","");
		
		char[] c1 = s1.toCharArray();
		
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		
		Arrays.sort(c2);
		
		Boolean status = true;
		
		if (s1.length()!=s2.length()) {
			
			status=false;
		}
		
		status = Arrays.equals(c1, c2);
		
		if (status) {
			System.out.println("Both are anagrams");
		}else {
			System.out.println("Both are not anagrams");
		}
		
	}
	
	
}
