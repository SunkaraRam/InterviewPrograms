package HarmanTechnologies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import SourabhTiwari.fileReader;

public class ReverseString {

//	public static void main(String[] args) {
//		
//		String name = "RamuSunkara";
//		
//		String res  = "";
//		
//		char[] ch = name.toLowerCase().toCharArray();
//		
//		for (int i = ch.length-1; i >=0; i--) {
//			
//			res=res+name.charAt(i);
//			
//		}
//		
//		System.out.println(res);
//	}
	
//	public static void main(String[] args) {
//		
//		int num = 48;
//		
//		boolean flag = true;
//		
//		for (int i = 2; i < num; i++) {
//			
//			if (num%i==0) {
//				
//				flag = false;
//			}
//			
//		}
//		
//		if (flag) {
//			System.out.println("Given num is prime");
//		}
//		else {
//			System.out.println("Given not num is prime");
//		}
		
	//}
	
//	public static void main(String[] args) {
//		
//		int num = 50;
//		for (int i = 2; i < num; i++) {
//			
//			for (int j = 2; j < num; j++) {
//				
//				if (i==j) {
//					System.out.println(i);
//				}
//				
//				if (i%j==0) {
//					break;
//				}
//				
//			}
//			
//		}
//		
	//}

	
	/*
	 * public static void main(String[] args) {
	 * 
	 * int n1,n2,temp;
	 * 
	 * Scanner s= new Scanner(System.in);
	 * 
	 * n1 = s.nextInt();
	 * 
	 * n2= s.nextInt(); System.out.println("before sort"); System.out.println(n1 +
	 * "==" + n2);
	 * 
	 * if (n1>n2) { temp = n1; n1 = n2; n2 = temp; }
	 * System.out.println("After sort"); System.out.println(n1 + "==" + n2);
	 * while(n1<n2) {
	 * 
	 * int flag= 0 ;
	 * 
	 * for (int i = 2; i < n1/2; i++) {
	 * 
	 * if (n1%i==0) {
	 * 
	 * flag =1; break;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * if (flag==0) { System.out.println(n1); }
	 * 
	 * n1++; }
	 * 
	 * 
	 * }
	 */
	
	
	 /* public static void main(String[] args) {
	  
	  int num,rem,res=0;
	  
	  num=252; int a=num; while(num>0) { rem = num%10; res=res*10+rem; num =
	  num/10; }
	  
	  if (res==a) { System.out.println("PolyYes"); } else {
	  System.out.println("PolyNo"); } System.out.println(res);
	  
	  }*/

	/*
	 * public static void main(String[] args) {
	 * 
	 * int num,a,rem,res=0;
	 * 
	 * num=153;//1+125+27=153 a=num;
	 * 
	 * while(num>0) {
	 * 
	 * rem = num%10;
	 * 
	 * res = res+rem*rem*rem; num = num/10; }
	 * 
	 * if (res==a) { System.out.println("ArmStrongYes"); } else {
	 * System.out.println("ArmStrongNo"); } }
	 */
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * int f1,f2=0,f3=1;
	 * 
	 * System.out.print(f2);
	 * 
	 * for (int i = 1; i <=100; i++) {
	 * 
	 * f1=f2; f2=f3; f3=f1+f2;
	 * 
	 * System.out.print(f3);
	 * 
	 * } }
	 */
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		al.add(1256);al.add(12.36);al.add(false);al.add('c');al.add(1256);al.add(false);
		
		System.out.println(al);	
		Set set = new HashSet<>();
		
		for (int i = 0; i < al.size(); i++) {
			
			set.add(al.get(i));
			
		}
		
		System.out.println(set);
	}
	
}

