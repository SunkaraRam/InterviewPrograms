package HCL;

import java.util.HashMap;

public class MapoutputDemo {

	public static void main(String[] args) {
		
		HashMap map = new HashMap<>();
		
		map.put("A", new Integer(1));
		map.put("B", new Integer(2));
		map.put("C", new Integer(3));
		map.put("D", new Integer(4));
	
		System.out.println(map);
		
	}
	
}
