package StagNagaShesu;

import java.util.Scanner;

public class FloatComparision {

	public static void main(String[] args) {
		
		float f1,f2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Float Number1 : ");
		
		f1= s.nextFloat();
		
		System.out.println("Enter Float Number : ");
		
		f2=s.nextFloat();
		
		if (f1==f2) {
			
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both are different");
		}
	}

}
