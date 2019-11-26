package SourabhTiwari;

import java.util.HashSet;

public class RepeatAlpha {

	public static void main(String[] args) {
		
		String  name = "Ramsuuuunkara";
		
		HashSet hs = new HashSet();
		
 		for (int i = 0; i < name.length(); i++) {
			 
			for (int j = i+1; j <name.length(); j++) {
				
				if (name.charAt(i)==name.charAt(j)) 
				{
					
					hs.add(name.charAt(i));
				}
				
			}
			
		}
	
 		
 		System.out.println(hs);
		
	}

}
