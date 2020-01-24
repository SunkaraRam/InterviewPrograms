package StringPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersFromStringWithSEtoggle {

	public static void main(String[] args) {
		
		Logic();
		
		//FirstLastSmallmiddleUpper();
		
		//addDigitsfromString();
		
		//addNumbersFromString();
		
		//practice();
		
		//largestWord();
		
		//addNumbersFromString();
	}

	public static void FirstLastUpperLetters() {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = s.nextLine();
		
		//String str = "Ram is Good boy";
		
		String[] words = str.split(" ");
		
		String first  = words[0].substring(0,1).toUpperCase();
		
		String firstrem = words[0].substring(1).toLowerCase();
		
		String firstOk = first+firstrem;
		
		String last = words[words.length-1].substring(0,1).toUpperCase();
		
		String lastrem = words[words.length-1].substring(1).toLowerCase();
		
		String lastOk = last+lastrem;
		
		
		String res = "";
		for (int i = 1; i < words.length-1; i++) {
			
			for (int j = words[i].length()-1; j >=0 ; j--) {
				
				res = res+words[i].charAt(j);
			}
			
			res = res+" ";
		}
		
		System.out.println(firstOk+" "+res+" "+lastOk);
	}
	
	public static void FirstLastSmallmiddleUpper() {
		
		String res="";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = s.nextLine();
		
		//String str = "Ram is Good boy";
		
		String[] words = str.split(" ");
		
		String first  = words[0].substring(0,1).toLowerCase();
		
		String firstrem = words[0].substring(1).toUpperCase();
		
		String firstOk = first+firstrem;
		
		String last =words[words.length-1].substring(0,words[words.length-1].length()-1).toUpperCase();
		
		String lastrem = words[words.length-1].substring(words[words.length-1].length()-1).toLowerCase();
		
		String lastOk = last+lastrem;
		
	for (int i = 1; i < words.length-1; i++) {
			
				res = res+words[i].toUpperCase()+" ";				
			
		}
		
		System.out.println(firstOk+" "+res+" "+lastOk);
		
	}
	
	public static void largestWord() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = s.nextLine();
		
		//String str = "Ram is Good boy";
		
		String[] words = str.split(" ");
		
		int a = 0;
		
		String  largestWord="";
		
		for (int i = 0; i < words.length; i++) {
			
			if (a<words[i].length()) {
				
				a = words[i].length();
				
				largestWord = words[i];
			}
		}
		
		System.out.println(largestWord);
	}
	
	
	public static void addDigitsfromString() {
		

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = s.nextLine();
		
		//String str = "Ram is Good boy";
		
		int total =0;
		
		String strdigit = "";
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (Character.isDigit(ch[i])) {
				
				int digit = Character.getNumericValue(ch[i]);
				
				total = total+digit;
				
				strdigit  = strdigit+ch[i];
			}
			
		}
	
		System.out.println(strdigit);
		
		System.out.println(total);
	
	}
	
	public static void addNumbersFromString() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = s.nextLine();
		
		//Pattern p = Pattern.compile("-?\\d+(,\\d+)*?\\.?\\d+?");
		
	
		Pattern p = Pattern.compile("-?\\d+");
		
		Matcher m = p.matcher(str);
		
		int total=0;
		
		while (m.find()) {
		    
			  System.out.println(m.group());
			  
			  int num = Integer.parseInt(m.group());
			  
			  total+=num;
			  
		  }
		
		System.out.println("Total Numbers Sum from String :"+total);
		
	}
	
	public static void Logic() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int inp = s.nextInt();
		
		for (int i = 1; i <= inp; i++) {
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print(i);	
				
				if (j<i) {		
					System.out.print("*");
				}
				
			
			}
			System.out.println("");
		}
		
		for (int i = inp; i >0; i--) {
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print(i);
				
				if (j<i) {
					
					System.out.print("*");
					
				}
				
				
			}
			System.out.println();
		}
		
	}
	
	public static void practice() {
		
		String name = "rams@ ad1010.s56f8lj%--";
		
		char[] ch =name.toCharArray();
		
		for(int i=0 ;i<ch.length;i++) {
			
//			if (!Character.isLetter(ch[i])&&!Character.isDigit(ch[i])&&!Character.isSpace(ch[i])) {
//				
//				System.out.println(i+" "+ch[i]);
//				
//			}
			
			if (Character.isDigit(ch[i])) {
				
				System.out.println(i+" "+ch[i]);
				
			}
			
		}
		
		
	}
	
	
}
