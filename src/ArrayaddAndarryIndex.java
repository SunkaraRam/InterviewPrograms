
public class ArrayaddAndarryIndex {
	
public static void main(String[] args) {
		
		int a[]  = new int[] {2,5,7,4,6,9};
		
		int n = a.length;
			
		int small = a[0];
		
		int big = a[0];
		
		//int tot = 0;
		
		int sindex=0,lindex=0 ;
		for (int i = 0; i < a.length; i++) {
		
		//	tot = tot+a[i];
			
			if (a[i]<small) {
				
				small = a[i];
				sindex = i;
			}
			else if (big<a[i]) {
				
				big = a[i-1];
				lindex = i;
			}
		}
		
		//System.out.println(tot);
		
		System.out.println("small :" +small);
		System.out.println("big :" +big);
		System.out.println("Large index :" + lindex);
	
}
	

}
