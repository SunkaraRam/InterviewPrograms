import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SplictNumber {
	
	static ArrayList al = new ArrayList();
	
	static Scanner rs =new Scanner(System.in);
	
	static int r;

	public static void main(String[] args) {
		
		for (int h = 1; h <= 5; h++) {
			
			System.out.println("Enter " + h + " integer Number: ");
			
			r = rs.nextInt();
		
			al.add(r);
			
			
		}
		
		System.out.println("Normal ArrayList : ");
		
		System.out.println(al);
		
		System.out.println("Collections class Sort : ");
		
		Collections.sort(al);
		
		System.out.println(al);
		
		System.out.println("Collections class Sort with Comparator ");
		
		Collections.sort(al, new Mycomparator());
		
		System.out.println(al);
		
		
	}

}

class Mycomparator implements Comparator {

	@Override
	public int compare(Object b1, Object b2) {
		
		int n1=(Integer)b1;
		int n2=(Integer)b2;
		
		return n2-n1;
	}

	
	
}