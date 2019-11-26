package NaveenPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateStringInStringArray {

	public static void main(String[] args) {
		
		String[] words= {"Java","Ram","Ram","Ram","sunkar","sunkar","Engineer","Dharmavaram","Java","Element"};
	
		Arrays.sort(words);
		
		//Method1   : It is Simple Way
		
				/*
				 * Set<String> set = new HashSet<String>();
				 * 
				 * for (int i = 0; i < words.length; i++) {
				 * 
				 * if (set.add(words[i])==false) { System.out.println(words[i]); }
				 * 
				 * }
				 */
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		//int count =1;
		
		for (int i = 0; i < words.length; i++) {
			
			int count =1;
			
			if (map.containsKey(words[i])) {
				
				map.put(words[i], map.get(words[i])+1);
				
				//count = map.get(words[i]);
			
			}
			else {
				
				map.put(words[i], 1);
			}
			
		}
		
		System.out.println(map);
		
		//Method2 :   It is correct way
		
		/*Set<String> set = new HashSet<String>();
		
		for (int i = 0; i < words.length; i++) {
		
			if (!set.contains(words[i])) {
				
				set.add(words[i]);
			}
			
			else {
				System.out.println(words[i]);
			}
		}
		
		System.out.println("===============================");
	
		System.out.println(set);*/
		
		
		
		// Method3 : 1 . It is not Correct way
		/*for(int i=0;i<words.length;i++) {
			
			for (int j = i+1; j < words.length; j++) {
				
				//System.out.println(words[i]+" "+words[j]+""+words[i].equals(words[j]));
				
				if(words[i].equals(words[j])) {
					
					System.out.println(words[i]);
				}
				
			}
		}
		
		*/
		
	}

}
