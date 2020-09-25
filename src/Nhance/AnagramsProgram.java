package Nhance;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsProgram {

	
	public static boolean checkAnagrams(String s1,String s2) {
		
		String s3,s4;
		
		s3=s1.replaceAll("\\s", "");
		s4=s2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if (s3.length()!=s4.length()) {
			
			status = false;
			
			System.out.println(s3+" and "+s4+" "+"both not are anagrams");
			
			return status;
			
		}
		else {
			char[] c1 = s3.toLowerCase().toCharArray();
			char[] c2= s4.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			status = Arrays.equals(c1, c2);
		
			System.out.println(s3+" and "+s4+" "+"both are anagrams");
			
			
			return status;
		}
				
		
	}
	
	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		
//		String ss1,ss2;
//		
//		ss1=s.nextLine();
//		
//		ss2 = s.nextLine();
//		
//		AnagramsProgram.checkAnagrams(ss1,ss2);
//		
		
		for (int i = 2; i <= 100; i++) {
			
			for (int j =2 ; j <=i ; j++) {
				
				if (i==j) {
					System.out.println(i);
				}
			    if (i%j==0) {
					break;
				}
				
			}
			
		}
		
		
		
	}
	
	

}
