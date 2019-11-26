
public class FindSpecialCharacter {

	public static void main(String[] args) {
		
		String Str = "!C@p gem!+in$i_()";
		
		String specialCharacters = "!@#$%^&*()_+-=:'";
		
//		for (int i = 0; i < Str.length(); i++) {
//			
//			if (specialCharacters.contains(Character.toString(Str.charAt(i)))) 
//			{
//	
//				System.out.println(Str.charAt(i)+ ": is a Special Character.  " + "Position (" +i+")");
//				//System.out.println(i);
//			}
//			
//		}	
		
		// Its very Good Logic
		
		char[] ch = Str.toCharArray();
		
		for (int i = 0; i <ch.length; i++) {
			
			if (!Character.isSpace(ch[i])&&!Character.isDigit(ch[i])&&!Character.isLetter(ch[i])) {
				
				System.out.println("Its position : "+i+ " "+ch[i]);
				
			}
			
		}
		
	}

//		int[] a = {5,9,8,6,3};
//		
//		int[] b= {8,9,2,1,7};

//		for (int i = 0; i < b.length; i++) {
//			
//			for (int j = 0; j < a.length; j++) {
//				
//				
//					if (a[j]==b[i]) {
//						
//						System.out.println(b[i]);
//					}
//			}
//		}
}

