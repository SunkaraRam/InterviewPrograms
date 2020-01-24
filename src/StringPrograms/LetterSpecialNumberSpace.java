package StringPrograms;

public class LetterSpecialNumberSpace {

	public static void main(String[] args) {
		
		All("ram.sunkara01 s@gmail.com");
	}
	
	public static void All(String name) {
		
		char[] ch = name.toCharArray();
		
		int size = ch.length;
		
		int letters=0, spaces = 0,numbers= 0,specials = 0;
		
		
		for (int i = 0; i < size; i++) {
			
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
				specials ++;
			}
			
		}
		
		System.out.println("Letters"+letters);
		System.out.println("Spaces"+spaces);
		System.out.println("Numbers"+numbers);
		System.out.println("Specials"+specials);
	}
	
}
