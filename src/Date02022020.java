
public class Date02022020 {

	public static void main(String[] args) {
		
		long a = 02022020;
		
		long b=a;
		long res = 0;
		
		System.out.println("Given Number"+a);
		long rem;
		while(a>0) {
			
			rem = a%10;
			res = res*10+rem;
			a=a/10;
		}
		
		if (b==res) {
			System.out.println("Given Number is polindrom");
		}
		else {
			System.out.println("Given Number is not polindrom");
		}
	}

}
