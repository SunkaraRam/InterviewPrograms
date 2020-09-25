import java.util.Scanner;

public class SurenProgram {

	public static void main(String[] args) {
		
		String inp ; 
		
		Scanner s =  new Scanner(System.in);
		
		System.out.println("Enter a Sentance Here : ");
		
		String res = "";
		
		int count = 0 ;
		
		inp = s.nextLine();
		
		String[] str= inp.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			
			if (!str[i].toLowerCase().contains("is".toLowerCase())) {
				
				res = res+str[i]+" ";
			}
			else {
				count++;
			}
				
		}
		
		System.out.println(res);
		
		System.out.println("is repeated in Sentence " +count );
		
	}
	
	
}
