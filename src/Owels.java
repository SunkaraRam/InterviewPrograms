import java.util.Scanner;

public class Owels {

	public static void main(String[] args) {

		
		Scanner sd = new Scanner(System.in);
		
		int vowels =0 , consonents =0, spaces =0, digits =0, specials=0;
		
		System.out.println("Enter a Line : ");
		
		String line =sd.nextLine().toLowerCase();
		
		for (int i = 0; i < line.length(); i++) {
			
			char ch = line.charAt(i);
			
			if (ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u') {
				
				++vowels;
				
			}
			else if (ch>='a' && ch<='z') {
				
				++consonents;
				
			}
			
			else if( ch >= '0' && ch <= '9')
	            {
	                ++digits;
	            }
			
			else if (ch =='!'|| ch =='@'|| ch =='#'|| ch =='$'|| ch =='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='_'||ch=='+'||ch=='['||ch=='/'||ch=='"'||ch==';'||ch=='=') {
				
				++specials;
				
			}
			
			else if (ch ==' ') {
				
				++spaces;
				
			}
		}
		
		System.out.println("cons "+ consonents );
		
		System.out.println("spaces "+ spaces);
	
		System.out.println("digits "+ digits);
	
		System.out.println("vowels "+ vowels);
	
		
		
		

//		 String line = "This website is aw3som3.";
//	        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
//	        line = line.toLowerCase();
//	        for(int i = 0; i < line.length(); ++i)
//	        {
//	            char ch = line.charAt(i);
//	            if(ch == 'a' || ch == 'e' || ch == 'i'
//	                || ch == 'o' || ch == 'u') {
//	                ++vowels;
//	            }
//	            else if((ch >= 'a'&& ch <= 'z')) {
//	                ++consonants;
//	            }
//	            else if( ch >= '0' && ch <= '9')
//	            {
//	                ++digits;
//	            }
//	            else if (ch ==' ')
//	            {
//	                ++spaces;
//	            }
//	        }
//	        System.out.println("Vowels: " + vowels);
//	        System.out.println("Consonants: " + consonants);
//	        System.out.println("Digits: " + digits);
//	        System.out.println("White spaces: " + spaces);
	    
		
//		int c = 65;
//	
//		for (Character ch = 'A'; ch <='Z'; ch++) {
//			
//		System.out.println(ch+" "+c);
//	
//
//		c++;
	}

}
	
