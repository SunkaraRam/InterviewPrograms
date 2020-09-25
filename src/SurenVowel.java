import java.util.Scanner;

public class SurenVowel {

	
	public static void main(String[] args) {
		
		String inp;
		
		int vowels = 0;
		
		Scanner s =new Scanner(System.in);
		
		inp   = s.nextLine();
		
		String m = inp.toLowerCase();
		
		char[] ch = m.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				
				
					vowels ++;
			}
			
		}
		
		System.out.println("Vowels in String "+ vowels);
		
	}
	
}
