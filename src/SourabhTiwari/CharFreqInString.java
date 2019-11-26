package SourabhTiwari;

import java.util.TreeMap;

public class CharFreqInString {

	public static void main(String[] args) {
		
		//This is for Characters
		
		/*String s = "ababcdddd";

		char[] ch = s.toCharArray();
		
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		int count = 1;
		
		for (int i = 0; i < ch.length; i++) {
			
			if (map.containsKey(ch[i])) {
				
				count = map.get(ch[i]);
				map.put(ch[i], count+1);
			}
			else {
				map.put(ch[i], count);
			}
			
			
		}
		
		System.out.println(map);
		
		*/
		
		String str = "This is ram . He is a developer. He is a Smart";
		
		String[] words = str.split(" ");
		
		int count =1;
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		for (int i = 0; i < words.length; i++) {
			
			if (map.containsKey(words[i])) {
				
				count = map.get(words[i]);
				
				map.put(words[i], count+1);
				
			}
			else {
				map.put(words[i], count);
			}
			
		}
		
		System.out.println(map);
	}

		
}

	
