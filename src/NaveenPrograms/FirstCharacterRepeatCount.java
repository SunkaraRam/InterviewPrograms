package NaveenPrograms;

public class FirstCharacterRepeatCount {

	public static void main(String[] args) {
		
		String name = "amsunkaakdflj";
	
		int count=0;
		for (int i = 0; i < name.length(); i++) {
			
			if (name.charAt(0)==name.charAt(i)) {
				
				count++;
			}
			
		}
	
		System.out.println(count);
	}
	
	
}
