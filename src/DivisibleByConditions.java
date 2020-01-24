import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleByConditions {

	
	public static ArrayList al = new ArrayList();
	
	static Scanner rs =new Scanner(System.in);
	
	 static int r;
		
	
	public static void main(String[] args) {
		 	
		for (int h = 1; h <= 4; h++) {
						
			System.out.println("Enter " + h + " integer Number: ");
			
			r = rs.nextInt();
			
			al.add(r);
		
			
			
			//System.out.println(j);
		}
		try {
			
		
		for (int i = 0; i <=al.size() ; i++) {
			
			Integer a=(Integer) al.get(i);		
			//System.out.println(a);		

			for (int j = 1; j < 10; j++) {
				
				if (a%j==0) {
				
					System.out.println(a +"      Divisible by      "+ j);
					
					
				}
				else {
					System.out.println(a +"      Not divisible by  " + j);
				}
				
				
			}
			
		}
		
		} catch (Exception e) {
			System.out.println("Thank You");
		}
	
		
	}

}
