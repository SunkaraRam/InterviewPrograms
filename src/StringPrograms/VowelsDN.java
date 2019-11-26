package StringPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;


public class VowelsDN {
	
	public static void main(String[] args) {
		
		String inp,inpL,fin;
		
		StringBuffer res=new StringBuffer("");
		
		int vowels = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp = s.nextLine();
		
		inpL = inp.toLowerCase();
		
		fin = inpL;
		
		List<Integer> m = new ArrayList<Integer>();
		
		
		for (int i = 0; i < inpL.length(); i++) {
			
			char ch = inpL.charAt(i);
			
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
					
					String str = Character.toString(ch);
					
					res  = res.append(str);
					
					m.add(i);
			}
		}
		
		
		//StringBuffer name= res.reverse();
		
		System.out.println(res);
				
		//String resRev = name.toString();
		
		for (int j = 0; j <inpL.length(); j++) {
			
			
			
			char ch2 = inpL.charAt(j);
			
			if (ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u') {
				
				for (int k =res.length()-1 ; k >=0 ; k--) {
					
					char ch1 = res.charAt(k);
					
					//System.out.println("me"+k);
					
					fin =fin.replace(ch2, ch1);
					
					
			
				}
				
			}
			 
			
			
					
		}
		System.out.println(fin);
		
	}
	
	
//	public String addChar(String str, char ch, int position) {
//		
//	    StringBuilder sb = new StringBuilder(str);
//	    
//	    sb.insert(position, ch);
//	   
//	    return sb.toString();
//	}

}
