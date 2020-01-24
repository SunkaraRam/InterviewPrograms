package HCL;

public class IncDec {
	
	public static void main(String[] args) {
		
		int array_variable[] = new int[10];
		
		for (int i = 0; i < 10; ++i) {
			
			System.out.println("In "+ i);
		
			array_variable[i]=i;
			
			//System.out.println(array_variable[i]+" ");
			
			//System.out.println(i);
			
			i++;System.out.println("out"+i);
		}
		
		System.out.println("======================================");
		
		for (int i = 0; i < array_variable.length; i++) {
		
			
			System.out.println(i +"Array"+array_variable[i]);
			
			
		}
		
	}

}
