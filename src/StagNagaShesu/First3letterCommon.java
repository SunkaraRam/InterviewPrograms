package StagNagaShesu;

import java.util.Scanner;

public class First3letterCommon {

	public static void main(String[] args) {
		
		String res = "", inp,temp;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp = s.nextLine();
		
		int n = inp.length();
		
		temp = inp.substring(n-3,n);

//		System.out.println(temp);
		
		System.out.println(temp+inp+temp);
	}

}
