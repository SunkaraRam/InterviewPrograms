package SourabhTiwari;

import java.util.Scanner;

public class Raghu {

	public static void main(String[] args) {
		
		int num ,res,rem,res1,rem1;
		
		res  = 0;
		
		res1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");

		num = sc.nextInt();
		
		while(num > 0) {
			
			rem = num%10;
			
			res = res+rem*rem;
			
			num = num/10;
			
		}
	
		System.out.println(res);
		
		while (res!=0) {
			
			rem1 = res%10;
			
			res1 = res1+rem1;
			
			res = res/10;
			
		}
		
		System.out.println(res1*res1);
	}

}
