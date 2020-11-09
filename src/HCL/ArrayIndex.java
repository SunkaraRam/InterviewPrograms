package HCL;

import java.util.Arrays;

public class ArrayIndex {

	public static void main(String[] args) {
		
		//int arr[] = new int[5]; //
		int[] arr= {5,9,8,7,2,1};
		
//		for (int i = 5; i > 0; i--) {
//			
//			arr[5-i] = i;//5-5 =0 arr[0]=5 // 5-4=1 //arr[1]=4//arr[2]=3//arr[3]=2//arr[2]=1//
//		}
//		
//		System.out.println("============");
//	
    	Arrays.sort(arr);
    	
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	
	}

}
