package CGI;

public class FindOut_is {

	public static void main(String[] args) {
		
		
		String sentence = "This is sunkara RAm, He is a good person";
		
		String[] words = sentence.split(" ");
		 
		int j = 0;
		
		for (int i = words.length-1; i >=0; i--) {
			
			if (words[i].contains("is")) {
				
				j++;
			}
			
		}
		
		System.out.println(j);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String inp,res="";
//		
//		int count = 0;
//		
//		inp = "This is ram sunkara";
//		
//		String[] str = inp.split(" ");
//		
//		for (int i = str.length-1; i >=0; i--) {
//		
//			res = res + str[i]+" ";
//			
//			
//			if (str[i].contains("is")) {
//				
//				count++;
//			}
//			
//		}
//		System.out.println(count);
//			
//			System.out.println(res);
	}

}
