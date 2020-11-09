package Legato;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoNumbers {
	
	public static void main(String[] args) {
		
//		int n1,n2,flag,temp;
//		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter n1 value : ");
//		n1=s.nextInt();
//		
//		System.out.println("Enter n2 value : ");
//		
//		n2 = s.nextInt();
//		
//		if (n1>n2) {
//			
//			temp=n1;
//			n1=n2;
//			n2=temp;
//		}
//		
//		System.out.println("n1:"+n1+"======="+"n2:"+n2);
//		
//		while(n1<n2) {
//			
//			flag=0;
//			for (int i = 2; i <=n1/2; i++) {
//				
//				if (n1%i==0){
//					flag=1;
//					break;
//				}
//				
//			}
//				
//				if (flag==0) {
//					
//					System.out.println(n1);
//				
//				}
//				n1++;
//				
//			}
		
		int n1=10, n2=520;
		
		int temp;
		
		if(n1>n2) {
			
			temp = n1;
			n1 = n2;
			n2=temp;
		}
		
		while (n1<n2) {
			
			int flag = 0;
			
			for (int i = 2; i <=n1/2; i++) {
				
				if (n1%i==0) {
					
					flag = 1;
					break;
				}	
				
			}	
			
			if (flag==0)
			{	
				System.out.println(n1);
			}
			n1++ ; 
			
		}			
	}
}