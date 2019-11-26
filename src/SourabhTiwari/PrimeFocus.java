package SourabhTiwari;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrimeFocus {

	public static void main(String[] args) throws IOException {
		
		FileReader fi = new FileReader("D:\\111\\ram.txt");
		
		BufferedReader br =  new BufferedReader(fi);
		
		String line = "";
		
		while ((line=br.readLine())!=null) {
			
			String[] words = line.split(" ");
			
			char [] ch =words[0].toCharArray();
			
			if (ch[0]=='a'||ch[0]=='A'||ch[0]=='E'||ch[0]=='e'||ch[0]=='I'||ch[0]=='i'||ch[0]=='o'||ch[0]=='O'||ch[0]=='u'||ch[0]=='U') {
			
				System.out.println(line);
			}
			
		}
	}

}
