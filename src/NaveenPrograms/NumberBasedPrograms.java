package NaveenPrograms;

import java.util.Scanner;

public class NumberBasedPrograms {

	public static void main(String[] args) {
		
		
		/*
		 * int a,res=0,c ;
		 * 
		 * Scanner s = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a Number :");
		 * 
		 * a = s.nextInt();
		 * 
		 * c=a;
		 * 
		 * while(a!=0) {
		 * 
		 * res = res*10+a%10;
		 * 
		 * a=a/10; }
		 * 
		 * System.out.println(res);
		 * 
		 * if (c==res) { System.out.println("Given Number is Polindrom"); } else {
		 * System.out.println("Given Number is not polindrom"); }
		 */		 
		
		String name = "ramsunk@ara12122353454 its o---k";
		
		String letters = name.replaceAll("[^a-zA-Z]", "");
		
		System.out.println("Only letters from string "+letters);
		
		String digits = name.replaceAll("[^0-9]", "");
		
		System.out.println("Digits ---- "+ digits);
		
		String spacials = name.replaceAll("[^s]", "");
		
		System.out.println(spacials);
		
		int count = 0;
		
		char[] dig = digits.toCharArray();
		
		
		for (int i = 0; i < dig.length; i++) {
			
				int num = Character.getNumericValue(dig[i]);
			
				count  = count+num;
				
		}
		
		System.out.println(count);
	}
	
	
	
	
}
