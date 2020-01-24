package HCL;

import java.util.Arrays;

public class ArrayIndex {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		for (int i = 5; i > 0; i--) {
			
			arr[5-i] = i;
		}
		
		System.out.println("============");
	
		Arrays.sort(arr);
		
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	
	}

}
