package StringPrograms;

import java.util.Scanner;

public class VowelsConsonentsNumbersSpaces {

	public static void main(String[] args) {
		
		String inp;
		
		int vowels=0,consonents=0,numbers= 0, spaces = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		inp = s.nextLine();
		
		String inpf = inp.toLowerCase();
		
		for (int i = 0; i <=inpf.length(); i++) {
			
			char ch = inp.charAt(i);
			
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			
				vowels++;
				
			}
			else if (ch>='a'&& ch<='z') {
				
				consonents++;
			}
			
			else if (ch>=1&&ch<=9) {
				
				numbers++;
			}
			
			else if(ch==' ') {
				
				spaces ++;
			}
			
			
		}
		
	}
	
}
