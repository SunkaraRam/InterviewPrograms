import java.util.Scanner;

public class MyPractice {

	
	static boolean isVowel(char c) {
		
		return (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'
				||c=='O'||c=='u'||c=='U');
		
	}
	
	static String reverseVowel(String str) {
		
		int i = 0;
		
		int j = str.length()-1;
		
		char[] str1 = str.toCharArray();//ramejhidsojku.
		
		while (i<j) {
			
			if (!isVowel(str1[i])) {
				i++;
				System.out.println(i);
				continue;
			}
			if (!isVowel(str1[j])) {
				j--;
				System.out.println(j);
				continue;
			}
			
			//swappig
			char t =str1[i];
			str1[i] = str1[j];
			str1[j]=t;
			
			i++;
			j--;

			               
		}
		String str2 = String.copyValueOf(str1);
		return str2;
	}
	
	public static void main(String[] args) {
		
		String str = "ramejhidsojku";
		
		System.out.println(reverseVowel(str));
		
	}
	
}
