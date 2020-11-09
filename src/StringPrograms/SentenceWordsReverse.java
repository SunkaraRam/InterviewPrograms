package StringPrograms;

import java.util.Scanner;

public class SentenceWordsReverse {

	public static void main(String[] args) {
		
		String inp,revword = "", revSentence ="",rev;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter a String:");
		
		inp =s.nextLine();
		
		String words[] = inp.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			//System.out.println(words[i]);
			
			String now = words[i];
			
			for (int j = now.length()-1; j >=0; j--) {
				
						revword = revword+now.charAt(j);
				
			}
			
				revword = revword+" ";
		}
		revSentence=revword;
		
		System.out.println(revSentence);
		
	}

}
