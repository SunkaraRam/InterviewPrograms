package NaveenPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ParentException {

	public static void main(String[] args){
		
		try {
			m1();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("File not found");
			
			
		}
		
	}

	public static void m1() throws FileNotFoundException {
		
		int a=23;
		int b=0;
		
		FileInputStream fi = new FileInputStream("asdfsadf");
		
		
	}
}
