
public class $LetterNumberSpace {

	public static void main(String[] args) {
		
		String test = "SunkaraRam1166@gmail.com#unknown%ram^";
		
		count(test);
		
	}
	
	public static void count(String x) {
		
		char[] ch = x.toCharArray();
		
		int letters = 0, spaces = 0, numbers = 0, other= 0;
		
		for (int i = 0; i < x.length(); i++) {
			
			if (Character.isLetter(ch[i])) {
				
				letters ++;
			}
			else if (Character.isDigit(ch[i])) {
				
				numbers ++;
				
			}
			
			else if (Character.isSpace(ch[i])) {
				spaces ++;
			}
			
			else {
				other ++;
			}
			
		}
		System.out.println("The given String is : " + x);
		
		System.out.println("letters : " +letters);
		
		System.out.println("specials : " + other);
		
		System.out.println("Numbers : " + numbers);
		
		System.out.println("Spaces : " + spaces );
	}

}
