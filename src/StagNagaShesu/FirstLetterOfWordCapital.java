package StagNagaShesu;

import java.util.Scanner;

public class FirstLetterOfWordCapital {

	public static void main(String[] args) {
		
		String inp,d="",res = "";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		inp = s.nextLine();
		
		String [] words = inp.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			 String f = words[i].substring(0,1).toUpperCase();
			 
			 String l=words[i].substring(1).toLowerCase();
			 
			  d = f+l;
			  res = res+d+" ";
			 
		}
		
		
		System.out.println(res);
	}

}
