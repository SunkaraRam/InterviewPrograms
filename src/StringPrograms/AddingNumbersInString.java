package StringPrograms;

public class AddingNumbersInString {

	
	
	public static void main(String[] args) {
		
		String name = "Ram123456789Ram45629789665&4223@!@#$%^&*()_69d8e(rtyuio7856";
		
		String alpha = "";
		
		String numall="";
		
		int sum = 0;
		
		char[] ch = name.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (!Character.isAlphabetic(ch[i])&&!Character.isDigit(ch[i])&&!Character.isSpace(ch[i])) {
			
				System.out.println(i+"------"+ch[i]);
			}
			
		
			if (Character.isDigit(ch[i])) {
				
				numall=numall+ch[i];
			
				int a=Character.getNumericValue(ch[i]);
				
				sum = sum+a;				
				
				//Integer a = a.parseInt(ch[i]);
			}
		
	
	}

		
		System.out.println(alpha+"\n"+numall+"\n"+sum+"\n"+alpha.length()+"\n"+numall.length());

		System.out.println(sum);
		
		
	}
	
   
}