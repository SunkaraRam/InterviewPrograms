package NaveenPrograms;

public class RegularExpressionLogic {

	public static void main(String[] args) {
		
		String s = "LRa@#$mSunkara16465/*/-/-+'alsjdflklk3";
		
		String s1 = s.replaceAll("[^0-9]","");
		
		String s2 = s.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(s1);
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", "*"));
		
		int total = 0;
		
		for(int i=s1.length()-1;i>=0;i--) {
			
			 Character ch =s1.charAt(i);
			
			int a = Character.getNumericValue(ch);
			
			total = total+a;
		}
		
		System.out.println(total);
	
		System.out.println("Only Characters From String :" +s2);
		
		System.out.println("Only Numbers From String :"+s1+"\n Total from String digits: "+total);
	}
	
	

}
