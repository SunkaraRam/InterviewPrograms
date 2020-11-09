package StringPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersFromStringWithSEtoggle {
	 // Method to split the string and find the largest and smallest word 
    static void printLargestAndSmallestWord(String str){
        String[] arr=str.split(" ");
        int i=0;
        int maxlength,minlength;
        maxlength=Integer.MIN_VALUE;
        minlength=Integer.MAX_VALUE;
        
        System.out.println(minlength);
        
        String largest,smallest;
        largest = smallest = "";
        for(i=0;i<arr.length;i++){
            if(arr[i].length() < minlength){
                smallest=arr[i];
                minlength=arr[i].length();
            } 
            if(arr[i].length() > maxlength) {
                largest=arr[i];
                maxlength=arr[i].length();
            }
        }
        System.out.println("The largest and smallest word is \"" + largest +
                                               "\" and \"" + smallest + "\"");
    }
    
    
    static void largeandsmallwordPractice(String str) {
    	
    	String[] s = str.split(" ");
    	
    	int maxlength = Integer.MIN_VALUE;
    	
    	int minlength = Integer.MAX_VALUE;
    	
    	String largeword = "",smallword = "";
    	
    	for (int i = 0; i < s.length; i++) {
			
    		if (s[i].length()<minlength) {
				
    			smallword = s[i];
    			
    			minlength = s[i].length();
    			
			}
    		if (s[i].length()>maxlength) {
				
    			largeword = s[i];
    			
    			maxlength = s[i].length();
			}
		}
    	
    	
    	System.out.println("lar :"+largeword+" smal :"+smallword);
    }
    // Main function to read the string
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the text string");
        String str;
        try{
            str=br.readLine();
        }
        catch(Exception e){
            System.out.println("Error reading input");
            return;
        }
        //printLargestAndSmallestWord(str);
        largeandsmallwordPractice(str);
    
    }
//
//	public static void main(String[] args) {
//		
//		//Logic();
//		
//		//FirstLastSmallmiddleUpper();
//		
//		//addDigitsfromString();
//		
//		//addNumbersFromString();
//		
//		//practice();
//		
//		largestWord();
//		
//		//addNumbersFromString();
//	}

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
		
		String smallestWord="";
		
		for (int i = 0; i < words.length; i++) {
			
			if (a<words[i].length()) {
				
				a = words[i].length();
				
				largestWord = words[i];
			}
			if(a>words[i].length()) {
				smallestWord = words[i];						
			}
		}
		
		System.out.println(largestWord);
		
		System.out.println(smallestWord);
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
