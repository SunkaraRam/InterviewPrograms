package capitalOne;

public class ConstructorPreference {

	static int a=322;
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
		
		//a=200;
		
		System.out.println(a);
		
		System.out.println(str);
		
	}
}
