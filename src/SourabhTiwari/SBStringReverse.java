package SourabhTiwari;

import java.util.Scanner;

public class SBStringReverse {

	public static void main(String[] args) {
		
		Scanner sd = new Scanner(System.in);
		
		String input = sd.nextLine();
		
		String main = input;
		
		System.out.println("Enter a String: ");
		
		StringBuffer sb = new StringBuffer(input);
		
		StringBuffer rev = sb.reverse();
		
		System.out.println(main);
		
		System.out.println(rev);
		
		System.out.println(rev.equals(main));
		
		if (rev.equals(main)) {//In StringBuffer equals method is used for comparing reference of two objects.
			
			System.out.println("given string is polyndrome");
			
		}
		else {
			
			System.out.println("given string is not polyndrome");
			
		}
		
	}

}
