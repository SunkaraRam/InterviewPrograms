package SourabhTiwari;

public class StringPole {

	public static void main(String[] args) {
		
		String s1 = new String("ram");
		
		String s2= new String("ram");
		
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s1==s2);//false
		
		String s3 = "ram";
		
		String s4 = "ram";
		
		System.out.println(s3.equals(s4));//true
		
		System.out.println(s3==s4);//true
		
	}

}
