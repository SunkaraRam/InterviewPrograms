package SourabhTiwari;

class A {

	public void m1() {
	

		System.out.println("I am show A");
		
		
	}

}

public class B extends A{
	
	
	public  void m1() {
		
		System.out.println("I am show B");
		
	}
	
	public void m3() {
		
		System.out.println("I am show B2");
		
	}
	
	
	public static void main(String[] args) {
		
		 
		 A a1 = new A();
		 
		 a1.m1();
		 
		 A a2  = new B();
		 
		 a2.m1();
		 
		 
		 
	}


}

