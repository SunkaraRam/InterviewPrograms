package StringPrograms;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		
		withoutStringInbuiltMethod();
		
	}
	
	public static void withoutStringInbuiltMethod() {
		
		String inp,rev = "";
//		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter a String : ");
//		
//		inp =s.nextLine();
//		
//		int size = inp.length();
//		
		String s1= "Ramu";
		
		for (int i = s1.length()-1; i >= 0; i--) {
			
			//rev = rev+inp.charAt(i);
			
			rev = rev+s1.charAt(i);
			
			
			
		}
		System.out.println(rev);
		
	}
	
	public static void stringBufferInbuilt() {
		
		

		String inp,rev = "";
		
		Scanner s = new Scanner(System.in);
		
		inp =s.nextLine();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(inp);
		
		StringBuffer s2 = sb.reverse();
		
		System.out.println(s2);
		
	}

}
