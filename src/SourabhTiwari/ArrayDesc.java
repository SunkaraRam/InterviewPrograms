package SourabhTiwari;

public class ArrayDesc {

	public static void main(String[] args){
		
		int[] arr = new int[] {25,6,87,45,96,12,35};
		
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			
		}
		
		
		// This logic for Descending Order
		
		System.out.println("Descending Order of Array : ");
		
		for (int k =arr.length-1; k >=0; k--) {
			
			System.out.println(arr[k]);
			
		}
		
		System.out.println("Ascending Order of Array : ");
		
		for (int k = 0; k < arr.length; k++) {
			
			System.out.println(arr[k]);
			
		}
		
	}

}
