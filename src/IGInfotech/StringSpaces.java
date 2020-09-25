package IGInfotech;

public class StringSpaces {
	
	public static void main(String[] args) {
		
		String s1 = "Ram";
		
		String s2 = "Ram"+"";
		
		String s3= s1+"";
		
		String s4 =s2+"";

		System.out.println(s1.length()+"===="+s2.length()+"===="+s3.length()+"===="+s4.length());		

	System.out.println(s1==s2);
	
		System.out.println(s1==s3);
		
		System.out.println(s2==s4);
//		
//		System.out.println(s1.equals(s2));
//		
//		System.out.println( s1.equals(s3));
//	
//		System.out.println(s2.equals(s4));
	}

}
