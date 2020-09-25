package SurenPrograms;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowerToUpperCharInWord {

	public static String startingLetterCapital;
	
	public static void main(String[] args) throws Throwable {
		
		Scanner s = new Scanner(System.in);
		
		//String inp = s.nextLine();

		String s1 = "Ram";
		
		String s2 = "Ram";
		
		if(s1.intern()==s2.intern()) 
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\LatestDrivers\\chromedriver.exe");
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get(
		 * "https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&hl=en-GB&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
		 * );
		 * 
		 * WebElement txtbox =
		 * driver.findElement(By.xpath("//input[@id='identifierId']"));
		 * 
		 * int height = txtbox.getSize().getHeight();
		 * 
		 * int weight = txtbox.getSize().getWidth();
		 * 
		 * System.out.println("Height : " + height);
		 * 
		 * System.out.println("Weight  : " + weight);
		 	
		 * try { driver.findElement(By.className("TquXA")).click(); } catch (Exception
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * Thread.sleep(5000);
		 * 
		 * List<WebElement> options =
		 * driver.findElements(By.xpath("//div[@class='OA0qNb ncFHed']//div//span"));
		 * 
		 * for (WebElement ele : options) {
		 * 
		 * String content = ele.getText();
		 * 
		 * System.out.println(content);
		 * 
		 * if (content.contains("Deutsch")) {
		 * 
		 * ele.click();
		 * 
		 * break; }
		 * 
		 * }
		 * 
		 * driver.close();
		 */	}
} 


		//3.print 1 to 10 odd number: 2.print 1 to 100 Even number:   1.Odd or Even:
		
//		for (int i = 1; i <= 100; i++) {
//			if (i%2==0) {
//				System.out.println(i);
//			}
//		}
		
//		int n = s.nextInt();
//		
//		if (n%2==0) {
//			System.out.println("Given Number is Even Number");
//		}
//		else {
//			System.out.println("Given Number is Odd Number");
//			
//		}
		
		
//		4.Factorial number from 1 to 5:
		
		/*
		 * int n = s.nextInt();
		 * 
		 * int fact = 1;
		 * 
		 * for (int i = 1; i <=5; i++) {
		 * 
		 * fact = fact*i;
		 * 
		 * } System.out.println("Factorial of "+ n + " = "+fact);
		 */
		
//		8.Sum of Odd number from 1 to 100: 7.Sum of Even number from 1 to 100:
	
		/*
		 * int oddsum = 0, evensum=0;
		 * 
		 * for (int i = 1; i <=600; i++) {
		 * 
		 * if (i%2!=0) { //System.out.println(i); oddsum = oddsum +i;
		 * 
		 * } else { evensum =evensum+i; }
		 * 
		 * }
		 * 
		 * System.out.println("OddSum  = "+oddsum);
		 * 
		 * System.out.println("EvenSum  = "+evensum);
		 */		 
		
		
		
		//9.Sum of the number from 1 to 600:
		
		
		
		/*
		 * int count = 0;
		 * 
		 * for (int i = 1; i <=600; i++) { count = count +i; }
		 * 
		 * System.out.println(count);
		 */
		
		
		  //12.Print the palindrome number from 1 to 1000: //11.Palindrome number or
		 /* not: //10.Reverse the number:
		 * 
		 * 
		 * for (int i = 1; i <=1000; i++) {
		 * 
		 * 
		 * int num =i, b = num, res=0;
		 * 
		 * while (num>0) {
		 * 
		 * int rem = num%10;
		 * 
		 * res = res*10+rem;
		 * 
		 * num = num/10; }
		 * 
		 * 
		 * if (res==b) { System.out.println("Given Number is polindrom    " +res); }
		 * 
		 * }
		 */
		
		//	13.Amstrong number or not: 14.Print amstrong number from 1 to 600:
	
		/*
		for (int i = 1; i <=600; i++) {
		
		
		int num = i,b=num,res=0;
		
		while (num>0) {
			
			int rem = num%10;
			
			res = res+(rem*rem*rem);
			
			num = num/10;
			
			
		}
		
		if (res==b) {
		
			System.out.println(res);
			//System.err.println("Y-Armstrong");
		}
//		else {
//			System.err.println("N-Armstrong");
//		}
		
		*/
		
		
		//16.Sum of the digit in a number:  	15.Count the digit:
		
		/*
		 * int number = 64645;
		 * 
		 * int sum = 0,count = 0 ;
		 * 
		 * while(number>0) {
		 * 
		 * int rem = number%10;
		 * 
		 * sum = sum+rem;
		 * 
		 * number = number/10;
		 * 
		 * count++;
		 * 
		 * }
		 * 
		 * System.out.println("Sum of digits in a number :"+sum);
		 * 
		System.out.println("count of Digits in a Number : " + count);
		 */
		
		
		
		//18.Swape the 2 number without using 3rd variable name:  17.Swape the 2 number with using 3rd variable name:
/*
		int a =222, b=33,temp=0;
		
		System.out.println("before Swap  :  a="+a+" b="+b);
		
//		a= a+b;
//		
//		b=a-b;
//		
//		a = a-b;
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("After Swap  :  a="+a+" b="+b);
*/		
		
		
		
		//19.Fibanocii series from 1 to 10:
		/*
		int f1,f2=0,f3=1;
		
		for (int i = 1; i <=10; i++) {
			
			f1=f2;
			f2=f3;
			f3=f1+f2;
			
			System.out.println(f3);
			
		}*/
		
		
		//22 .  Check given String polindrom or not//21.Reverse the string:
		/*
		 * String take = s.nextLine();
		 * 
		 * String inp = take;
		 * 
		 * String res = "";
		 * 
		 * for (int i = inp.length()-1; i >=0; i--) {
		 * 
		 * res = res+inp.charAt(i);
		 * 
		 * }
		 * 
		 * if (res.equals(inp)) { System.out.println("Given String is polyndrome");
		 * }else { System.out.println("Given String is not polyndrome"); }
		 */
		
		//24.Desc Order: 23.Asc order
		
		/*
		 * int[] a = {25,78,9,4,2,53,45,12};
		 * 
		 * int temp=0;
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * for (int j = i+1; j < a.length; j++) {
		 * 
		 * if (a[i]<a[j]) {
		 * 
		 * temp = a[i]; a[i]=a[j]; a[j]=temp;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 */
		
		 //25.Max and Min number in given array:
		/*
		 * int[] a = {10,25,1,6,8,54,45};
		 * 
		 * int temp=0;
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * for (int j = i+1; j < a.length; j++) {
		 * 
		 * if (a[i]>a[j]) {
		 * 
		 * temp = a[i]; a[i]=a[j]; a[j] = temp;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println("Maximum Number in Array + "+a[0]);
		 * 
		 * System.out.println("Minimum Number in Array + " + a[a.length-1]);
		 * 
		 * // for (int i = 0; i < a.length; i++) { // System.out.println(a[i]); // }
		 */	
		//30.Consonants  and vowels count:
		 
		/*
		 * String inp = s.nextLine().toLowerCase();
		 * 
		 * int vowels=0,cons=0;
		 * 
		 * char[] ch = inp.toCharArray();
		 * 
		 * for(int i = 0; i< ch.length;i++) {
		 * 
		 * if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') { vowels++; }
		 * else { cons++; } }
		 * 
		 * System.out.println("Given String -" + inp);
		 * 
		 * System.out.println("Vowels count  -" + vowels);
		 * 
		 * System.out.println("Cons count  -" + cons);
		 */
		
		
		//31.print the vowels and consonants seperately:
		 /*
		 * 
		 * String inp = s.nextLine().toLowerCase();
		 * 
		 * // String vowels="",consonents = "";
		 * 
		 * Set<Character> vowels = new HashSet<>();
		 * 
		 * Set<Character> cons = new HashSet<>();
		 * 
		 * 
		 * char[] ch = inp.toCharArray();
		 * 
		 * for (int i = 0; i < ch.length; i++) {
		 * 
		 * if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
		 * 
		 * // vowels = vowels+","+ch[i]; vowels.add(ch[i]); }
		 * 
		 * else {
		 * 
		 * //consonents = consonents+","+ch[i];
		 * 
		 * cons.add(ch[i]);
		 * 
		 * }
		 * 
		 * 
		 * }
		 * 
		 * System.out.println("vowels in string  "+ vowels );
		 * 
		 * System.out.println("consonents in given string  "+ cons);
		 */
			
		//32.Count of each word how many time repeated in the given String:
		
		/*
		 * String inp = s.nextLine();
		 * 
		 * String[] words = inp.split(" ");
		 * 
		 * Map<String, Integer> map = new LinkedHashMap<String,Integer>();
		 * 
		 * for(int i=0;i<words.length;i++) {
		 * 
		 * if(map.containsKey(words[i])) { int count = map.get(words[i]);
		 * map.put(words[i], count+1); } else { map.put(words[i], 1); } }
		 * 
		 * System.out.println(map);
		 */
		//33.Count of each character how many time repeated in the given String:
		
		/*
		 * String inp = s.nextLine();
		 * 
		 * char[] ch = inp.toCharArray();
		 * 
		 * Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		 * 
		 * for (int i = 0; i < ch.length; i++) {
		 * 
		 * if(map.containsKey(ch[i])) {
		 * 
		 * int count = map.get(ch[i]); map.put(ch[i], count+1); } else { map.put(ch[i],
		 * 1); } }
		 * 
		 * System.out.println(map);
		 */
		
		
		
		//  34.Convert all Small case into caps and reverse:
		
		
		
		/*
		 * String inp = s.nextLine();
		 * 
		 * String out = inp.toUpperCase();
		 * 
		 * System.out.println(out);
		 * 
		 * String res = "";
		 * 
		 * for(int i = inp.length()-1;i>=0; i--) {
		 * 
		 * res = res+out.charAt(i);
		 * 
		 * } System.out.println(res);
		 */
		
		 /*
	
		String inp = "SunkaraRam  1254@#$";
		
		int specials=0 , caps=0 , smalls=0, digit=0 , spaces = 0;
		
		
		char[] ch  = inp.toCharArray();
		
		for(int i=0; i<ch.length ;i++ ) {
			
			if(Character.isLowerCase(ch[i])) {
				
				smalls++;
			}
			else if(Character.isUpperCase(ch[i])) {
				 caps++;
			}
			else if(Character.isSpace(ch[i])) {
				
				spaces++;
			}
			else if(Character.isDigit(ch[i])) {
				
				digit++;
			}
			else {
				
				specials++;
			}
			
		}
		
		System.out.println("Input ----" + inp);
		System.out.println("specials   " + specials);
		
		System.out.println("caps   " +caps );
		
		System.out.println("smalls   " + smalls);
		
		System.out.println("digit   " +digit );
		
		System.out.println("spaces   " + spaces);
		*/
//		String inp = s.nextLine();
//		
//		System.out.println("Input :  " + inp);
//
//		StringBuffer sb = new StringBuffer(inp);
//		
//		for (int i = 0; i < inp.length(); i++) {
//
//			char ch = inp.charAt(i);
//			
//			if (Character.isLowerCase(ch)) {
//				 sb.setCharAt(i, Character.toUpperCase(ch));
//			}
//			
//			else {
//				sb.setCharAt(i,Character.toLowerCase(ch));
//			}
//		}
//		
//		System.out.println(sb.toString());
//		
	


