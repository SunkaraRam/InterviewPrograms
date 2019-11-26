package NaveenPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberFromArrayWithHashSetandHashMap {

	public static void main(String[] args) {
		
		//  Duplicate Number from Array
		
		
		/*
		 * int[] nums= {5,8,9,6,4,4,5,7,1};
		 * 
		 * Set<Integer> set = new HashSet<Integer>();
		 * 
		 * for (int i = 0; i < nums.length; i++) {
		 * 
		 * if (set.add(nums[i])==false) { System.out.println(nums[i]); } }
		 */
		
		
		// Duplicate Character from String
		
		String name="SunkaraRamala";
		
		Set<Character> set = new HashSet<Character>();
		
		char[] ch = name.toLowerCase().toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (set.add(ch[i])==false) {
				
				System.out.println(ch[i]);
			}
		}
		
	}

}
