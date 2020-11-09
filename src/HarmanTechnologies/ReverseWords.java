package HarmanTechnologies;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		
		String inp,res="";
		
		Scanner s = new Scanner(System.in);
		
		inp = s.nextLine();
		
		String[] words = inp.split(" ");
		
		for (int i = words.length-1; i>=0; i--) {
			
			String revword= "";
			
			for (int j = words[i].length()-1; j >=0; j--) {
				
				revword = revword+words[i].charAt(j);
				
			}
			
			res =res+revword+" ";
		}
		
		System.out.println(res);
		
	}

}
