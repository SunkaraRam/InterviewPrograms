package HarmanTechnologies;

import java.util.Scanner;

public class PrimeNumberNew {

	public static void main(String[] args) {
		
		Normal(2558137);
		NewPrime(2558137);
		
	}
	
	public static void NewPrime(int value) {
		
		int inp;
		
		inp = value;
		boolean flag = true;
		for (int i = 2; i<inp; i++) {
			
			if (inp%i==0) {
				flag =false;
				break;
			}	
		}
		if (flag) {
			System.out.println("New Given Number is Prime");
		}
		else {
			System.out.println("New Given Number is not Prime");
		}		
	}
	
public static void Normal(int value) {
		
		int inp;
		inp = value;
		boolean flag = true;
		for (int i = 2; i<inp&&i <=10; i++) {
			
			if (inp%i==0) {
				flag =false;
				break;
			}	
		}
		if (flag) {
			System.out.println("Normal Given Number is Prime");
		}
		else {
			System.out.println("Normal Given Number is not Prime");
		}		
	}

}
