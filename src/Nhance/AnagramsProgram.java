package Nhance;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsProgram {

	public static void main(String[] args) {
		
		AnagramsProgram.anagramLogi("ram", "arm");
		
	}
	
	public static void anagramLogi(String s1, String s2) {
	
		String s3=s1.replaceAll("s", "");
		
		String s4=s2.replaceAll("s", "");
		
		boolean status =true;
		
		if (s3.length()!=s2.length()) {
			
			status =false;
			
		}
		
		else {
			
			char[] ch1= s3.toLowerCase().toCharArray();
			
			char[] ch2 = s4.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			
			Arrays.sort(ch2);
			
			status = Arrays.equals(ch1, ch2);
		}
		
		if (status) {
			
			System.out.println("Both are anagrams");
		}
		
		else {
			System.out.println("Both are not Anagrams");
		}
	}

}
