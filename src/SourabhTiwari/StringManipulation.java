package SourabhTiwari;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The rain starts september seacon";
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.concat("rain"));
		
		System.out.println("First Occurence of 's' " +str.indexOf("s"));
		
		System.out.println("Second occurence of 's' "+str.indexOf('s',str.indexOf('s')+1));

		System.out.println("Third occurence of 's' "+ str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1));
		
		System.out.println("Fourth occurence of 's' " +str.indexOf('s', str.indexOf('s', str.indexOf('s',str.indexOf('s', str.indexOf('s')+1))+1)+1));
		
		System.out.println(str.lastIndexOf('s',str.lastIndexOf('s')-1));
		
		System.out.println(str.lastIndexOf('s',str.lastIndexOf('s',str.lastIndexOf('s')-1)-1));
		
		System.out.println(str.lastIndexOf('s'));
		
		String date= "12-02-1995";
		
		System.out.println(date.replace("-", "/"));
		
		System.out.println(date.replace("-", ""));
		
		System.out.println(str.equals("ram"));
		
		String s2 = "Ram Sunkara Hyderabad";
		
		String[]  words = s2.split(" ");
		
		System.out.println(words[0]);
		
		System.out.println(words[2]+" "+words[1]+" "+words[0]);
		
		int mn = words[1].length();
		
		String rev="";
		
		for (int i = mn-1; i >= 0; i--) {
			
			rev = rev+words[1].charAt(i);
		}
		
		System.out.println(words[2]+" "+rev+" "+words[0]);
		
		String s4 = new String("ram");
		
		String s5  = new String("ram");
		
		System.out.println(s4.equalsIgnoreCase(s5));
	}

}
