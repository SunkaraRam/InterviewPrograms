package StagNagaShesu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatedCharacterIndex {

	public static void main(String[] args) {
		
		String res = "", inp,temp;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp = s.nextLine();
		
		Set<Character> set = new HashSet<>();
		
		char [] ch = inp.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			
			if (set.add(ch[i])) {
				
				System.out.println(i +"===="+ch[i]);
				
			}
		}
	}

}
