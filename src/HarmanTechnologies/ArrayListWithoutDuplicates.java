package HarmanTechnologies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayListWithoutDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Object> numlist =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,87,8,2,1,"Ram",'c',"Ram",false,false));

		System.out.println(numlist);
		
		LinkedHashSet<Object> hashSet = new LinkedHashSet(numlist);
		
		System.out.println(hashSet);
		
		ArrayList<Object> numwd = new ArrayList<>(hashSet);
		
		System.out.println(numwd);
	}

}
