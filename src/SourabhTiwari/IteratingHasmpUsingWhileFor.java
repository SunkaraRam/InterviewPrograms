package SourabhTiwari;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingHasmpUsingWhileFor {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(12, "Vinay");
		
		map.put(25,"jaya");
		
		map.put(24,"surya");
		
		map.put(12,"lavanya");
		
		map.put(19,"Sunkara");
		
		//System.out.println(map);
		
		Iterator itr = map.entrySet().iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry me = (Map.Entry)itr.next();
			
			System.out.println("Key is  "+me.getKey() +"  Value is  "+me.getValue());
			
		}
		
		for (Map.Entry me: map.entrySet()) {
			
			System.out.println("Key is : "+me.getKey() +"   Value is : "+me.getValue());
			
		}
		
		
		
		}

}
