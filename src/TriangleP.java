/**
 * 
 */

/**
 * @author SunkaraRam
 *
 */
public class TriangleP {

	public static void main(String[] args) {
		
		int minstar = 1;
		
		int pheight = 8;
		
		int p_space=pheight-1;
		
		for (int i = 0; i < pheight; i++) {
			
			for (int j = i; j <p_space; j++) {
				
				System.out.print(" ");
			}		
			
			for (int k = 0; k < minstar; k++) {
				
				System.out.print("*");
			}
			minstar+=2;
			System.out.println();
						
			}
			
		}
		
	}


