/**
 * 
 */
package SourabhTiwari;

import java.util.Scanner;

/**
 * @author SunkaraRam
 *
 */
public class Swapping {

	
	public static void main(String[] args) {
		
		Swapping2NumberWithoutUsing3rdVar();
	}
	
	public static void Swapping2NumberWithUsing3rdVar() {
		
		int x,y,temp=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter x and y values :");
	
		x=s.nextInt();
		y=s.nextInt();
		
		System.out.println("Before Swapping "+x +" "+ y);
	
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping "+x +" "+ y);
		
		
	}
	
	public static void Swapping2NumberWithoutUsing3rdVar() {
		
		int x,y;
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter x and y values :");
	
		x=s.nextInt(); 
		
		y=s.nextInt();
		
		System.out.println("Before Swapping "+ x +" "+ y);
		
		x = x+y; //  12 +  15 = 27
		y = x-y; //  27  -15 = 12= y
		x=x-y;  //   27  - 12 = 15 =x
		
		System.out.println("After Swapping "+ x +" "+ y);
		
	}

}
