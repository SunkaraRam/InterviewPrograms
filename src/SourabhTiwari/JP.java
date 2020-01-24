package SourabhTiwari;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JP {

	public static void main(String[] args) {
		
		
		String inp;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		
		inp = s.nextLine();
		
		char [] ch =inp.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (map.containsKey(ch[i])) {
				
				map.put(ch[i], map.get(ch[i])+1);
				
			}
			
			
			else {
				map.put(ch[i], 1);
			}
			
		}
		
		System.out.println(map);
		                   
		
	}

}
