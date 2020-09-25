package SurenPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapAnimal {

	public static void main(String[] args) {
		
		//String inp = "Animal dog cat horse dog mouse";
		
		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		String[] words = inp.split(" ");
		
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		
		int count =0;
		
		for (int i = 0; i < words.length; i++) {
			
			if (hmap.containsKey(words[i])) {
				
				count = hmap.get(words[i]);
				
				hmap.put(words[i], count+1);
				
			}
			else {
				hmap.put(words[i], 1);
			}
				
		}
		
		System.out.println("Input   :- "+ inp);
		
		System.out.println(hmap);
		
	}

}
