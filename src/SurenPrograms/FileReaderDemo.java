package SurenPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter a Director : ");
		
		Scanner sc = new Scanner(System.in);
		
		String directory = sc.nextLine();
		
		System.out.println("Enter a Filename : ");
		
		String fileName = sc.nextLine();
		
		String FileName = directory+"://"+fileName+".txt";
		
		System.out.println(FileName);
		
		String line = null;
		
		
		
		try {
			
			FileReader fileReader  =  new FileReader(FileName);
			
			BufferedReader br = new BufferedReader(fileReader);
			
			while ((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {

			System.out.println("Unable to fine File " + fileName);
			
		}
		catch (IOException ex) {
			System.out.println("Error readin file "+ fileName);
		}
		

		
		
		
	}

}
