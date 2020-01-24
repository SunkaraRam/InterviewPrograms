package SourabhTiwari;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) throws IOException {

		String filename = "D://VinayaRam.txt";
		
		try {

			FileWriter fw = new FileWriter(filename);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Hellow vidya");
			
			bw.write("Ram Sunkara");
			
			bw.write("How are You");

			bw.close();
		} catch (IOException e) {
			
			System.out.println("Error Writing to file"+filename);
		}
		
	}

}
