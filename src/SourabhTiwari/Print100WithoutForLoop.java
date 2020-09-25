package SourabhTiwari;

public class Print100WithoutForLoop {

	public static void main(String[] args) {
		
		returnNumber(10);
		
	}

	public static void returnNumber(int number) {
		
		if (number>1) {
			
			returnNumber(number-1);
		}	
		
		System.out.println(number);
	}
	
}
