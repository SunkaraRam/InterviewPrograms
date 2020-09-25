package InterfacePackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		
		int x = 42;

		int y = switcher(x/20);



		System.out.println("X = " + x + " Y = " + y);

		}



		public static int switcher (int x){

		int y = 0;





		switch( x ){



		case 4:

		y = 2;

		break;

		case 2:

		y = 4;

		break;

		default:

		y = 10;



		}



		return y;

		
		/*
		 * // LocalDate ld = LocalDate.now(); // LocalDateTime lt = LocalDateTime.now();
		 * 
		 * // System.out.println("LocalDate ONly"+ld); // //
		 * System.out.println("LocalDate and Time "+lt);
		 * 
		 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
		 * 
		 * String formattedDate = dtf.format(lt);
		 * 
		 * System.out.println(formattedDate );
		 */
		
	}

}
