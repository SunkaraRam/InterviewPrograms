package SourabhTiwari;

import java.util.Scanner;

public class PolyndromeStrOrNum {

	public static void main(String[] args) {
		
		 
		String exp,res = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String or Number : ");
		
		exp = sc.nextLine();
//		
//		sc.close();
		
		
		int len = exp.length();
		
		for (int i = len-1; i >=0; i--) {
		
			res= res+exp.charAt(i);
		}
		
		System.out.println(res);
		
		if (res.equalsIgnoreCase(exp)) {
			
			System.out.println("Given String or Number Is Polyndrome");
			
		} else {

			System.out.println("Given String or Number Not Is Polyndrome");
			
					
		}
		
	}

}
