package SourabhTiwari;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int inp,f1,f2=0,f3=1;
		
//		Scanner s = new Scanner(System.in),l;
//		
//		System.out.println("Enter a String");
		
	//	inp = s.nextInt();
	
		inp = 20;
		
		System.out.println(f2);
		
		for (int i = 0; i < inp; i++) {
			
			System.out.println(f3+ " ");
			
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
		
	}

}
