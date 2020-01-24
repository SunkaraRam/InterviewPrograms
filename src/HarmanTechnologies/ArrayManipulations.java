package HarmanTechnologies;

public class ArrayManipulations {

	
	public static void main(String[] args) {
		
		
		int[] Array1= {3,6,2,9,5,8};
		
		int[] Array2 = Array1;
		
		int[] Array3= Array2;
		
		Array1[2]=2;//          {3,6,2,9,5,8}
		Array2[3]=5;//          {3,6,2,5,5,8}    
		Array3[2]=7;//          {3,6,7,5,5,8}
		Array2[4] = Array3[4];//{3,6,7,5,5,8}
		
		//System.out.println(Array1[2]);
		
		
		for (int i = 0; i < Array1.length; i++) {
			
			System.out.println(Array2[i]);
			
		}
		
	}
	
}
