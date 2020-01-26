package capitalOne;

public class ConstructorPreference {

	static int a;
	static String str;

	static {

		a=1;
		str = "first";
	}

	static {

		a=2;
		str = "second";
	}
	
	public ConstructorPreference() {
	
		a=10;
		str = "Constructor";
	}
	
	public static void main(String[] args) {
		
		ConstructorPreference c = new ConstructorPreference();
		
		System.out.println(c.a);
		
	}
}
