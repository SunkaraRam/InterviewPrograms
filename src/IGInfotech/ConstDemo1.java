package IGInfotech;

public class ConstDemo1 {
	
	public ConstDemo1() {
		this(10);
		System.out.println("This is  Const with no org");
	}
	public ConstDemo1(int a) {
		System.out.println("This is constructor with one org");
	}
	public static void main(String[] args) {
		new ConstDemo1();
		System.out.println("This is main method");
	}
}
