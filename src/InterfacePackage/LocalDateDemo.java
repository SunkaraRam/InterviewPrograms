package InterfacePackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {
		
//		LocalDate ld = LocalDate.now();
//		
		LocalDateTime lt = LocalDateTime.now();
		
//		System.out.println("LocalDate ONly"+ld);
//		
//		System.out.println("LocalDate and Time "+lt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
		
		String formattedDate = dtf.format(lt);
		
		System.out.println(formattedDate     );
		
	}

}
