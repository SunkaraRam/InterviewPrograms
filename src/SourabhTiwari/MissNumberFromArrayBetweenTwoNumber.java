package SourabhTiwari;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissNumberFromArrayBetweenTwoNumber {

	public static void main(String[] args) {
		
		int[] arr = new int[] {12,56,78,15};
		
		Arrays.sort(arr);
		
		//System.out.println(arr.toString());
		
		for (int i = 0; i < arr.length; i++) {
			
			//System.out.println(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				System.out.println(arr[i] + "Between Strings " +arr[j] + ":");
				
				for (int j2 = arr[i]+1; j2 < arr[j]; j2++) {
					
					System.out.println(j2);
					
				}
				break;
				
				
			}
			
			
		}
	
	
	}

}
