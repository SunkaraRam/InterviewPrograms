package SourabhTiwari;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExperience {

	public static void main(String[] args) throws IOException {
		
		int count =1;
		
		FileReader fr = new FileReader("D:\\SeleniumProjects\\abcd.txt");
		
		BufferedReader br = new BufferedReader(fr);
	
		String str = "";
		
		while ((str=br.readLine())!=null) {
			
			if (str.contains("Experience")) {
				
				System.out.println(count +"="+str);
				count++;
						
			}else {
				//System.out.println(str);
				count++;
			}
			
		}
	
	}

}
