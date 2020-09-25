package StringPrograms;

import java.util.ArrayList;

public class ArrayListEqals {

	public static void main(String[] args) {
		
		//StringIndex();
		largeNumber();
		
	}
	
	public static void reverseString() {
		
		/* Program1*/
		
//		ArrayList al = new ArrayList();
//		
//		al.add("A");
//		
//		al.add("B");
//	
//		ArrayList al1 = new ArrayList();
//		
//		al1.add("A");
//		
//		System.out.println(al1.get(0));
//		
//		al1.add(1,"B");
//		
//		System.out.println(al.equals(al1));

		
						//Reverse String
		
	/*String name = "RamSunkara"; //9
	
	System.out.println(name.length());
	
	String res="";
	
	for(int i =name.length()-1;i>=0;i--) {
		
		res = res+name.charAt(i);
		
	}
	
	System.out.println(res);*/
		
		
		
	}
	
	public static void largeNumber() {
		
	// Larges number in int array
		
		int [] arr = new int[] {10,20,56,97,45};// 5
		
		//System.out.println(arr[5]);//AIOBE
		
		System.out.println(arr.length);
		
		System.out.println(arr[4]);//45
		
		int small = arr[0];
		
		int large = arr[0];
		
//		int small = 0;
//											//Mistake in CL	
//		int large = 0;
		
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i]<small){
//				small = arr[i];
//			}			
//			
//			else if(large<arr[i]) {
//				large = arr[i];
//			}
//		}
//		
//		System.out.println("small "+small);
//		
//		System.out.println("large " +large);
		
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		System.out.println("small number   " +arr[0]);
		System.out.println("Large Number " +arr[arr.length-1]);
		
		
	}
	
	public static void StringIndex() {

		//Index of method

		
		String name = "index smlnsd";// 4 , 8
		
		System.out.println(name.indexOf('x')+"--"+name.lastIndexOf('l'));
		
		String name2 ="RamSunkara";
		
		System.out.println(name2.length());//  10 Charcters in a string
		
		//System.out.println(name2.charAt(10));// SIOBE

		
	}
	

}
