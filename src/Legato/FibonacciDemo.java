package Legato;

public class FibonacciDemo {

	public static void main(String[] args) {
		
		int f1,f2=0,f3=1;
		System.out.println(f2);
		for (int i = 0; i <=10; i++) {
			
			f1=f2;
			f2=f3;
			f3=f1+f2;
			System.out.println(f3);
			
		}
	}

}
