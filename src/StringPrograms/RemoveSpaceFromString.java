package StringPrograms;

import java.util.Scanner;

public class RemoveSpaceFromString {
	
	public static void main(String[] args) {
		
		withoutUsingReplacemethod();
		
	}

	public static void usingReplaceAllmethod() {
		
		String inp;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp =s.nextLine();
		
		String now = inp.replaceAll("\\s", "");
		
		System.out.println(now);
		
	}
	
	public static void withoutUsingReplacemethod() {
		
		String inp,rev="";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp =s.nextLine();
		
		StringBuffer sb = new StringBuffer();
		
		char[] ch = inp.toCharArray();
		
		for (int i = 0; i <ch.length; i++) {
			
			
			if (ch[i]!=' '&&ch[i]!='\t' ) {
				
				sb.append(ch[i]);
			}
				
		}
		
		System.out.println(sb);
	}
	
	
	
	
}
