package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterFromString {

	public static void main(String[] args) {
		
		String name= "Ramsunkara aabaaab";
		
		DuplicateChar(name);
		
	}

	public static void DuplicateChar(String enter) {
		
		Set<Character> set = new HashSet<Character>();
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < enter.length(); i++) {
			
				Character ch = enter.charAt(i);
			
				if (!set.contains(ch)) {
					
						set.add(ch);
						
						sb.append(ch);
					
				}
				
				
				
		}
		
		System.out.println(sb);
		
	}
	
}
