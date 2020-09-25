import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertIntArrayToList {
	
	
	public static void main(String[] args) {
		
		int[] arr  = {5,6,9,8,45,6};
		
		//System.out.println(arr);
		
		List<Integer> li = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			li.add(arr[i]);
		}
		
	System.out.println(li);
		
	}

}
