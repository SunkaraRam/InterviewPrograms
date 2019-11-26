package SourabhTiwari;

import java.util.Iterator;

public class AddMiddleTwoDigits {
	
	public static void main(String[] args) {
		
		String num = "2563";
		
		char[] le = num.toCharArray();
		
		int a =Character.getNumericValue(le[1]);
		
		int b= Character.getNumericValue(le[2]);
		
		System.out.println(a+b);
		
		//System.out.println(b);
		
		//System.out.println(le[1]+le[2]);
		
		
	}
	
	
	

}
