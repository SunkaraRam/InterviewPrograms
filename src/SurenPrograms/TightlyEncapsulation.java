package SurenPrograms;

public class TightlyEncapsulation{

	
	// In a static method we can't call a non static variables. If you want to call non static variable inside a static method you
	// need create an object to the class with that object we can call variables.
	
	private int a=0,b=0;
	
	public static int Add(int c, int d) {
	
		TightlyEncapsulation tg = new TightlyEncapsulation();
		
		tg.a=c;
		tg.b =d;
		return tg.a+tg.b;

	}//In a non static method we can directly call static variables.
	
	private static int x=0,y=0;
	
	public static int sub(int a,int b) {
		
		x=a;
		y=b;
		return x-y;
	}

	public static void main(String[] args) {
		int c = TightlyEncapsulation.sub(55, 55);
		System.out.println(c);
	}
	
}

