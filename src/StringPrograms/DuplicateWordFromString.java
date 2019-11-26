package StringPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordFromString {

	public static void main(String[] args) {
		
		Scanner sj= new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String ss = sj.nextLine();
		
		DuplicateWord(ss);
		
	}

	private static void DuplicateWord(String sent) {
		
		String[] arr = sent.split(" ");
		
		Set<String> set = new HashSet<String>();
		
		StringBuffer sb= new StringBuffer();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!set.contains(arr[i])) {
				set.add(arr[i]);
				sb.append(arr[i]+" ");
			}
			
		}
		
		System.out.println(sb);
	}
}
