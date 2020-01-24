package HCL;

public class StringStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("123");
	
		String s1 = "123";
		
		sb.append("abc");
		
		s1 = s1.concat("abc");
		
		System.out.println(sb+" "+s1);
		
		//123abc 123abc
	}

}
