package capitalOne;

public class ReturnDoubleValues {
	
	public static int foo(int a,int b) {
		
			if (a==0)
				return 0;
			else if (a>b)
				return a*2;
			return b;
		
		}
	
	public static void main(String[] args) {
		
	   Object a = 	foo(5, 56);
		
	   System.out.println(a);
	}

}





