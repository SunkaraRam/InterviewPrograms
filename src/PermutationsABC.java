import java.util.Scanner;

public class PermutationsABC {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		
		String str = s.nextLine();
		
		int n=str.length();
		
		permute(str, 0, n-1);
		
	}
	
	static String swap(String a, int i, int j) {
		
		char temp;
		
		char[] charArray = a.toCharArray();
		
		temp = charArray[i];
		
		charArray[i]=charArray[j];
		
		charArray[j] = temp;
	
		System.out.println("String swap "+String.valueOf(charArray));
		
		return String.valueOf(charArray);
	
	}
	
	
	static  void permute(String str,int k,int r){
		
		if (k==r) {
			
			System.out.println(str);
			
		}
		else {
			for (int i = k; i <=r; i++) {
				
				str = swap(str, k, i);
				
				permute(str, k+1, r);
			
				str  =swap(str, k, i);
			}
		}
	

}

}