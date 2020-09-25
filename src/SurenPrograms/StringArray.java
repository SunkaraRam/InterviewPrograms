package SurenPrograms;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String inp  = "This is ram Sunkara"; //s.nextLine();
		
		//araknuS mar si siht
		
		String sb="";
		
		String[] words = inp.split(" ");// 0.This 1. is 2.ram  3.Sunkara
		
		String res = "";
		 
	
		int c = 0;
		
		System.out.println("Words length in given string : " + words.length);
		
		for (int i = words.length-1; i >=0; i--) {
						
			
		
			for (int j = words[i].length()-1; j >=0; j--) { //    araknuS mar si sihT  
				
				res = res+words[i].charAt(j);//araknus+" " 
				
				if (j==0) {
					
					res = res+" "; //araknuS 
				}
				
			}
			 
			 
		}
		
		sb =sb+res;
		 
	System.out.println(sb);
	
	//System.out.println("count " + c);
	
	}
	
	// boy bad is he . sunkara ram is this.

}
