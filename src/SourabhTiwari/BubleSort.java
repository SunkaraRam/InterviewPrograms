package SourabhTiwari;

import java.util.Scanner;

public class BubleSort {
	
	public static void main(String[] args) {

		int[] jr = new int[] {45,12,36,45,85,79,96};
		
		int temp;
		
		for (int i = 0; i < jr.length; i++) {
			
			for(int j=i+1;j<jr.length;j++) {
				
				if (jr[i]>jr[j]) {
					
					temp=jr[i];
					jr[i] = jr[j];
					jr[j]=temp;
					
				}
				
				
			}
				
		}
		

		System.out.println("Ascending Order of an array : ");			
		for (int j = 0; j < jr.length; j++) {
			
			System.out.println(jr[j]+" ,");
		}
		
//		Scanner sc  = new Scanner(System.in);
//		
//		System.out.println("Enter length of array :");
//		
//		int inp = sc.nextInt();
//		
//		int[] num = new int[inp];
//		
//		System.out.println("Enter "+inp +"Integers ");
//		
//		for (int i = 0; i < num.length; i++) {
//		
//			 num[i] = sc.nextInt();
//			
//			
//		}
//		
//		//System.out.println(num);
//		
//		SortAr(num);
//	}
//	
//	
//	private static void SortAr(int[] args) {
//		
//		int temp;
//		
//		for (int i = args.length-1; i >=0; i--) {
//			
//			for (int j = 0; j < i; j++) {
//				
//				if (args[j]<args[j+1]) {
//					
//					temp =args[j];
//					
//					args[j] = args[j+1];
//					args[j+1]=temp;
//					
//				}
//			}
//			
//		}
//		
//		System.out.println("The new Sequence :-\n ");
//		
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]+", ");
//		}
//		System.out.println();
	}

}
