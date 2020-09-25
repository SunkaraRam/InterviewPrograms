package HarmanTechnologies;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class ArrayListWithoutDuplicates {

	public static void main(String[] args) {

		
//		ArrayList<Object> numlist =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,87,8,2,1,"Ram",'c',"Ram",false,false));
//		
//		System.out.println(numlist);
//		
//		LinkedHashSet<Object> hashSet = new LinkedHashSet(numlist);
//		
//		System.out.println(hashSet);
//		
//		ArrayList<Object> numwd = new ArrayList<>(hashSet);
//		
//		System.out.println(numwd);
		
		/*TreeSet<String> intNumber1 =  new TreeSet<>();
										 * 
										 * intNumber1.add("ram"); intNumber1.add("durga"); intNumber1.add("sai");
										 * intNumber1.add("jaya"); intNumber1.add("pradeep"); intNumber1.add("chakra");
										 * 
										 * System.out.println("Comparator not implemented");
										 * 
										 * System.out.println(intNumber1);
										 * 
										 * 
										 * 
										 * TreeSet<String> intNumber = new TreeSet<>(new MyComparator());
										 * 
										 * 
										 * intNumber.add("ram"); intNumber.add("durga"); intNumber.add("sai");
										 * intNumber.add("jaya"); intNumber.add("pradeep"); intNumber.add("chakra");
										 * 
										 * 
										 * System.out.println("Comparator IMplemented : ");
										 * 
										 * System.out.println(intNumber);
										 * 
										 * Iterator itr = intNumber.iterator();;
										 * 
										 * while(itr.hasNext()) {
										 * 
										 * Object obj= itr.next();
										 * 
										 * System.out.println(obj);
										 * 
										 * if(obj.equals(false)) {
										 * 
										 * itr.remove(); }
										 * 
										 * }
										 * System.out.println(intNumber);
										 */		
		
		ArrayList<Object> numlist =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,87,8,2,1,"Ram",'c',"Ram",false,false));

		System.out.println(numlist);
		
		LinkedHashSet<Object> hashSet = new LinkedHashSet(numlist);
		
		System.out.println(hashSet);
		
		ArrayList<Object> numwd = new ArrayList<>(hashSet);
		System.out.println(numwd);
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = o1.toString();
		
		String s2 = o2.toString();
		
		return s2.compareTo(s1);
		
		
	}
	
	
}
