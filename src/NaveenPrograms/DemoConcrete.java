package NaveenPrograms;

public class DemoConcrete extends DemoAbstract{

	public int mul(int a,int b) {
		
		return a*b;
		
	}
	
	public int div(int a, int b) {
		
		return a/b;
	}
	
	public static void main(String[] args) {
		
		DemoConcrete dc = new DemoConcrete();
		
		System.out.println(dc.add(10, 20));
		
	}

}
