package StringPrograms;

import java.util.Scanner;

public class StringPolyndrome {

	public static void main(String[] args) {
		
		String inp,res = "",rev;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter a String:");
		
		inp =s.nextLine();
		
		rev = inp;
		
		for (int i = inp.length()-1; i >=0; i--) {
			
			res = res+inp.charAt(i);
			
		}
		
		if (res.equalsIgnoreCase(rev)) {
			
			System.out.println("Given String is polyndorm");
		}
		
		else {
			System.out.println("Given String is not polyndorm");
		}
		
	}

}
