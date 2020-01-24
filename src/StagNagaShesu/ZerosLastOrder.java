package StagNagaShesu;

public class ZerosLastOrder {

	public static void main(String[] args) {
		
		int temp;
		
		int[] nums = {5,0,6,0,7,1,3,8,20};
		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = i+1; j < nums.length; j++) {
				
				if (nums[i]==0) {
					
					temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					
				}
			}
			
			//System.out.println(nums);
		}
		
		for (int i = 0; i < nums.length; i++) {
			
			System.out.print(nums[i]);
		}
		
	}

}
