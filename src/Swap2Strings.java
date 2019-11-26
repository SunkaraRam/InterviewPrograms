
public class Swap2Strings {

	public static void main(String[] args) {
		
//		String f = "Ram";
//		
//		String l = "Sunkara";
//		
//		f = f+l; 
//		System.out.println("Before swapping -" + f);
//		
//		l = f.substring(0, f.length()-l.length());
//		
//		f = f.substring(l.length());
//		
//		f=f+l;
//		System.out.println("After swapping -"+f);
//				
				
		String test = "Sunkara Ramu".toUpperCase();
		
		String[] words = test.split("\\s");
		
		int l = words[0].length();
		
		String rev="";
		
		for (int i = l-1; i >=0 ; i--) {
			
			rev = rev+words[0].charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println(rev +" "+ words[1]);
		
	}

}
