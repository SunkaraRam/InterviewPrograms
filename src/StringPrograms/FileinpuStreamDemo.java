package StringPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinpuStreamDemo {

	public static void main(String[] args) throws IOException{
		
		try {
	
			FileInputStream fi = new FileInputStream("D:\\111\\FeatureFile.txt");
			
			int i=0;
			
			System.out.println(fi.read());
			
			while ((i=fi.read())!=-1) {
				
				System.out.print((char)i);
				
			}
			
			String str = "RamSunkara I have created 10th class";
			
			FileOutputStream fo = new FileOutputStream("d:\\111\\FeaturDemo.txt");
			
			byte b[]= str.getBytes();
			
			fo.write(b);
			
			System.out.println("Written completed");
			
			fo.close();
			
		} 
		catch (FileNotFoundException f) {

				System.out.println("file not availabe");
			
		}
		
		}

}
