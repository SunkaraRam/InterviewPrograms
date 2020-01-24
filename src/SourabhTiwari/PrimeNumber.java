package SourabhTiwari;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num,temp=0;
		num=5;
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				temp = temp+1;
			}
			
			for (int j = 2; j < num; j++) {
				
				if (num%i==0) {
					
					temp=temp+1;
				}
				
			}
		}
		if (temp>0) {	
			System.out.println("Given Number is not prime number");
		}
		else {	
			System.out.println("Given Number is prime number");
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();		
//		for (int i = 2; i <=num; i++) {
//			
//			
//			for (int j = 2; j <=i; j++) {
//				
//				if (i==j) {
//					System.out.println(i);
//				}
//				if (i%j==0) {
//					break;
//				}
//				
//				
//				
//			}
//			
//		}
//		

	}

}
