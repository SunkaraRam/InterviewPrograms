package NaveenPrograms;

import java.util.Arrays;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		
		int[] arr = new int[]{-5,1,2,3,5,6,7,8,9,};
		
		Arrays.sort(arr);
		
		System.out.println("Smallest Number ::"+arr[0]);

		System.out.println("Larges Number ::"+arr[arr.length-1]);
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				
				//System.out.println(arr[i]+"Missing Numbers"+arr[j]);
				
				for (int j2 = arr[i]+1; j2 < arr[j]; j2++) {
					
					System.out.println(j2);
				}
				
				break;
				
			}
			
		}
	}
	
}
