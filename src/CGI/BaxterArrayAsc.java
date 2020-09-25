package CGI;

public class BaxterArrayAsc {

	public static void main(String[] args) {
		
		
		
		
		int[] arr = {12,53,65,75,85,45};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for (int j = i+1; j < arr.length; j++) {
			
				if(arr[i]>arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
				
			}
			
			
		}
		for(int k=0;k<arr.length;k++) {
			
			System.out.println(arr[k]);
		}
	
		
		
//		int[] arr = {55,8,9,6,4,75,6};
//		
//		int temp=0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = i+1; j < arr.length; j++) {
//				
//				if (arr[i]>arr[j]) {
//					
//					temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//				
//			}
//			
//			
//			
//		}
//		
//		for (int d = 0; d < arr.length; d++) {
//			
//			System.out.println(arr[d]);
//			
//		}
	}

}
