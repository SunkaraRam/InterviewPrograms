import java.util.Scanner;

public class DivisibleByEvenNumbers {

	static Scanner rs = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter a Number : ");
		
		n = rs.nextInt();
		
		for (int i =2 ; i < 10; i++) {
		
			//if (i%2==0) {
				
				//System.out.println(i);
				
				if (n%i==0) {
					
					System.out.println(n+"  is Divisible by "+i);
					
				}
				else {
					
					System.out.println(n+"  not is Divisible by "+i);
				
				}
				
			//}
			
		}
		
		
		
	}

}
