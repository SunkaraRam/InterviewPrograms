package HCL;

public class MultiDimentionalArray {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		arr[0][0]=2;
		arr[0][1]=5;
		arr[0][2]=10;
		
		arr[1][0]=4;
		arr[1][1]=52;
		arr[1][2]=20;
		
		arr[2][0]=6;
		arr[2][1]=2;
		arr[2][2]=63;
		
		System.out.println("Changes Below : ");
		
		int temp = 0;
		
		temp=arr[0][0];
		
		arr[0][0]=arr[2][2];
		
		arr[2][2] = temp;
		
		
		System.out.println(arr[0][0]);

			
	}

}
