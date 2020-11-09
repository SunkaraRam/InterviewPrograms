package StringPrograms;

import java.util.Scanner;

public class ReverseVowels {
	 static boolean isVowel(char c) { 
	        return (c == 'a' || c == 'A' || c == 'e'
	                || c == 'E' || c == 'i' || c == 'I'
	                || c == 'o' || c == 'O' || c == 'u'
	                || c == 'U'); 
	    } 
	    static String reverseVowel(String str1) { 
	        int j = 0; 
	        char[] str = str1.toCharArray(); 
	        String vowel = ""; 
	        for (int i = 0; i < str.length; i++) { 
	            if (isVowel(str[i])) { 
	                j++; 
	                vowel =vowel+str[i]; 
	            } 
	        } 
	        for (int i = 0; i < str.length; i++) { 
	            if (isVowel(str[i])) { 
	                str[i] = vowel.charAt(--j); 
	            } 
	        } 
	        return String.valueOf(str); 
	    } 
	    
	    static boolean isVowel1(char c){
	    	
	    	return(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U');
	    }
	    
	    static String PracticeLIkeIt(String str) {
	    	
	    	char [] ch = str.toCharArray();
	    	
	    	int j=0;
	    	
	    	String vowel = "";
	    	
	    	for (int i = 0; i < ch.length; i++) {
	    		if (isVowel1(ch[i])) {
					j++;
					vowel = vowel+ch[i];
				}
				
			}
	    	for (int i = 0; i < ch.length; i++) {
				
	    		if (isVowel1(ch[i])) {
					ch[i] = vowel.charAt(--j);
				}
			}
	    	
	    	return String.valueOf(ch);
	    	
	    }
	    public static void main(String[] args) {
	    	
	    	Scanner s = new Scanner(System.in);
	    	
	    	String str = s.nextLine();
	    	
	    	 System.out.println("Reverse Vowel String : " + PracticeLIkeIt(str)); 
	     } 
}