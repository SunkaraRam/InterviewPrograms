package SourabhTiwari;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
	
	static String line = null;
	
	public static void main(String[] args) {
		
		String filename="D:\\111\\ram.txt";
		
		try {
			
			FileReader fr= new FileReader(filename);
			
			BufferedReader br = new BufferedReader(fr);
			
			while ((line=br.readLine())!=null) {
				
				//System.out.println(line);

				String[] word = line.split(" ");
				
				//System.out.println(word[0]);
				
				char[] ch = word[0].toCharArray();
				
				if (ch[0]=='a'||ch[0]=='A'||ch[0]=='E'||ch[0]=='e'||ch[0]=='O'||ch[0]=='o'||ch[0]=='i'||ch[0]=='I'||ch[0]=='U'||ch[0]=='u') {
					
					System.out.println(line);
					
				}
				
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Unable to Open " +filename+"  File");
		}
		
		catch (IOException e) {
			
			System.out.println("Error reading file");
		
		}
		
		
		
	}

}
