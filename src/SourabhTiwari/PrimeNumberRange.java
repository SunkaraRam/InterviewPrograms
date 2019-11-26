package SourabhTiwari;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		num = sc.nextInt();
		
		int count = 0;
		
		for (int i = 2; i <= num; i++) {
			
			for (int j = 2; j <= i; j++) {
				
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