package NaveenPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

	public static void main(String[] args) {
		
		Vector vct = new Vector<>();
		
		vct.add("Sunkara");
		
		vct.add(125);vct.add(12.56);vct.add('d');vct.add(456.2d);
		
		vct.add("Aunkara");
		
		Enumeration erp = vct.elements();
		
		while (erp.hasMoreElements()) {
			
			Object obj = (Object)erp.nextElement();
			
			System.out.println(obj);
			
		}
	}

}
