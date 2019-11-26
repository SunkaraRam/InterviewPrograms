package StringPrograms;

public class ToggleString {

	public static void main(String[] args) {
		
		System.out.println(firstLetter("This is ram sunkara my village pothukunt"));
		
		
	}

	public static String firstLetter(String mystr) {
		
		
		
		String[] words = mystr.split(" ");
		String toggle="";
		
		
		for (String m: words) {
			
			String first = m.substring(0,1);
			String rem = m.substring(1);
			toggle = toggle+first.toLowerCase()+rem.toUpperCase()+" ";
		}
		
		return toggle;
		
		
	}
	
	
}
