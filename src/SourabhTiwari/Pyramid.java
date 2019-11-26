package SourabhTiwari;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
	/*
		for (int i = 1; i <=4; i++) {
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		/*Output
		 
		*
		**
		***
		****
		 
		 
		 
		 
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <=num; i++) {
			
			for (int j = num; j>=i; j--) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
			
		}
		
		/* OutPut :
		 
		******
		*****
		****
		***
		**
		*

		 */
		
		
		for (int i = 1; i < 4; i++) {
			
			for (int j = 4; j>=i; j--) {
				System.out.println("");
			}
			for (int k = 1; k < (i*2); k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	
	}

}
