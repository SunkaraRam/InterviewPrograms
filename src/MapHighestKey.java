import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapHighestKey {

	public static void main(String[] args) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		String name ="ramsunkaaaarrrrrrrrrams";
		
		char[] ch = name.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			int count=1;
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], count);
			}
		}
		
		System.out.println(map);
		
	}
	
}
