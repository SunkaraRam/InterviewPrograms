package SourabhTiwari;

public class MaxNumberFromArrayAndMin {

	public static void main(String[] args) {
		
		int[] arr = {12,56,8,45,26,35};
		
		int small = arr[0];
		int large= arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]<small) {
				
				small=arr[i];
			}
			
			if (large<arr[i]) {
				
				large=arr[i];
			}
			
		}
		
		System.out.println("Large Number From Array : " +large);
		
		System.out.println("Small Number From Array : " +small);
		
		
		
		
		
	}

}
