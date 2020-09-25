package SurenPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter a Director : ");
		
		Scanner sc = new Scanner(System.in);
		
		String directory = sc.nextLine();
		
		System.out.println("Enter a Filename : ");
		
		String fileName = sc.nextLine();
		
		String FileName = directory+"://"+fileName+".txt";
		
		System.out.println(FileName);
		
		try {
			
			FileWriter fw = new FileWriter(FileName);
			
			BufferedWriter br = new BufferedWriter(fw);
			
			System.out.println("Enter the size of List");
			
			System.out.println();
			
			int num = sc.nextInt();
			
			while (num>0) {
				
				String name = sc.nextLine();
				
				if ("st".equalsIgnoreCase(name)) {
					
					break;
					
				}
				
				System.out.println("Enter name of the student :");
				
				
				if (name.equals("")) {
				
					br.write("null");
					
				}
				
				br.write(name);
				
				br.newLine();
				
			}
		br.close();
			
		FileReader fr = new FileReader(FileName);
		
		BufferedReader br1 = new BufferedReader(fr);
		
		String line = null;
		
		System.out.println("Entered Details in File : ");
		
		while ((line=br1.readLine())!=null) {
			
			System.out.println(line);
			
		}
		
		} catch (FileNotFoundException e) {
			
			System.out.println("File not available");
			
		}
		catch (IOException e) {
			
			System.out.println("Error while file reading  " + FileName);
		}
		
		
		
		
	}

}
