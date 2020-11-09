/**
 * 
 */
package StringPrograms;

/**
 * @author SunkaraRam
 *
 */
public class StirngReverseRecursive {

	public static void main(String[] args) {

		
		
		
		String mystr= "Guru99";
		
//		String sub = mystr.substring(2);
//		
//		System.out.println(sub);
		
		//System.out.println(mystr.substring(1)+mystr.charAt(0));
		
//		String reversed = reverseString(mystr);
//		
//		System.out.println(reversed);
		
//		System.out.println(mystr.substring(1)+mystr.charAt(0));
//		
//		String res = reverseStringRam(mystr);
//		
//		System.out.println(res);
		
		
		
	}
	
	public static String reverseStringRam(String mystr) {
		
		if (mystr.isEmpty()) {
			System.out.println("String is empty now");
			
			return mystr;
		}
		System.out.println("String to be passed in Recursive Function :" +mystr.substring(1));
		
		return reverseStringRam(mystr.substring(1))+mystr.charAt(0);
	}
	
//	public static String reverseString(String mystr) {//1.uru99G, 2.ru99Gu,3.u99Gur,4.99Guru,5.9Guru9,6.Guru99
//		
//		if (mystr.isEmpty()) {
//			
//			System.out.println("String is empty now");
//		
//			return mystr;
//		}
//		System.out.println("String to be passed in Recursive Function :" +mystr.substring(1));
//	    
//		return reverseString(mystr.substring(1))+mystr.charAt(0);
//		
//	}
//	
	public static String reverseString(String mystr) {
		
		if (mystr.isEmpty()) {
			
			System.out.println("String is empty now");
			return mystr;
		}
		
		System.out.println("String to be passed in Recursive Function :"+mystr.substring(1));
		
		return reverseString(mystr.substring(1))+mystr.charAt(0);
		
		
		
	}
	
	static boolean isVowel(char c) {
		
		return (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U');
		
	}
	
	public static String vowelsReplace(String str1) {
		
		char[] str = str1.toCharArray();
		int j=0;
		
		String vowels="";
		
		for (int i = 0; i < str.length; i++) {
			
			if (isVowel(str[i])) {

				vowels = vowels+str[i];
				j++;
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			
			if (isVowel(str[i])) {

				str[i] = vowels.charAt(--j);
		}
		
	}
		
		return String.valueOf(str);
	}
	
	
	
	
	
	
	

}
