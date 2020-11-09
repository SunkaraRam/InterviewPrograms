package StringPrograms;

public class RegularExpressionLogic {

	public static void main(String[] args) {
		
		String s = "LRa@#$mSunkara16465/*/-/-+'alsjdflklk3";
		
		String s1 = s.replaceAll("[^0-9]","");//164653
		
		String s2 = s.replaceAll("[^a-zA-Z]", "");//LRamSunkaraalsjdflklk
		
		System.out.println(s1);
		
		int total = 0;
		
		for(int i=0;i<s1.length();i++) {
			
			 Character ch =s1.charAt(i);
			
			int a = Character.getNumericValue(ch);
			
			total = total+a;
		}
		
		System.out.println(total);
	
		System.out.println("Only Characters From String :" +s2);
		
		System.out.println("Only Numbers From String :"+s1+" Total from String digits: "+total);
	}
	
	

}
