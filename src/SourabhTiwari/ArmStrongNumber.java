/**
 * 
 */
package SourabhTiwari;

import java.util.Scanner;

/**
 * @author SunkaraRam
 *
 */
public class ArmStrongNumber {

	public static void main(String[] args) {
		
	int num,cop,con=0,rem;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		num = sc.nextInt();
		
		cop=num;
		
		while (num>0) {
			
			rem = num%10;
			
			con = con+(rem*rem*rem);
			
			num =num/10;
		
		}
		
		if (cop==con) {
			System.out.println("ArmStrong");
		}
		else {
			System.out.println("Not ArmStrong");
		}
		
	}

}
