package StringPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class WordsInString {

	public static void main(String[] args) {
		
		//CountwordsinStringusingHashMap();

		HighandSmallWord();
		
	}
	
	public static void CountwordsinString() {
		
		String inp ;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp = s.nextLine();
		
		String[] words = inp.split(" ");
		
		System.out.println(words.length);
		
	}
	public static void HighandSmallWord() {
		
		String inp ;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp = s.nextLine();
		
		String[] words = inp.split(" ");
		
		String largew="",small="";
		
		int maxlength = Integer.MIN_VALUE;
		
		int minlength = Integer.MAX_VALUE;
		
		for (int i = 0; i < words.length; i++) {
		
			if (words[i].length()<minlength) {
				
				small = words[i];
				
				minlength = words[i].length();
						
			}
			if (words[i].length()>maxlength) {
				
				largew = words[i];
				
				maxlength = words[i].length();
						
				
			}
			
			
			
		}
		System.out.println("Largeword  : " + largew+"  smallword "+small);
		
		
		
	}
	
	
	
	
	public static void CountwordsinStringusingHashMap() {
		
		String inp ;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp = s.nextLine();
		
		String[] words = inp.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < words.length; i++) {
			
			if (map.containsKey(words[i])) {
			
				int count = map.get(words[i]);
				
				map.put(words[i], count+1);
			}
			
			else {
				
				map.put(words[i], 1);
			}
			
			
		}
		
		System.out.println(map);
		
		
	
	}
}
