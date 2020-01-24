/**
 * 
 */

/**
 * @author SunkaraRam
 *
 */
public class TryCatchSolve {
	
	public static void main(String[] args) {
	
		int n =  5;
		
		try {
			
			int i = n/0;
			
			int numbers[] = new int[] {1,2,3,4,5};
			
			numbers[10] = 56;
			
			
			System.out.println(numbers[3]);
			
			
		} catch (ArithmeticException a) {
		
			System.out.println(n + "  Not divisible by zero");
			
		}
		
		catch (ArrayIndexOutOfBoundsException ae) {

			System.out.println("Your exceeded the range of Array, once you create an array . You can't reduce or increase the size of array");
		
		}

	}

}
