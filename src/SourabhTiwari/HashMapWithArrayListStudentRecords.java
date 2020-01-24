/**
 * 
 */
package SourabhTiwari;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author SunkaraRam
 *
 */
public class HashMapWithArrayListStudentRecords {

	public static void main(String[] args) throws IOException {
		
	try {
			
		String subjects ="Telugu,English,Maths,Science,Social,Hindi"; 
		
		String [] sgl = subjects.split(",");
		
		System.out.println("How many Student Records you need to Store : ");
		
		Scanner h = new Scanner(System.in);
		
		HashMap<String,ArrayList<Integer>> hm = new HashMap<String, ArrayList<Integer>>();
		
		int ssize = h.nextInt();
		
		for (int k = 0; k < ssize; k++) {//dd
		
		int score;
		String Name;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter a Student Name :");
		
		Name= s.nextLine();
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for (int i = 0; i < 5; i++) {
			
			Scanner d = new Scanner(System.in);
			
			System.out.println("Enter Marks in "+ sgl[i]);
			
			score = d.nextInt();
			
			al.add(score);
		}
		
		hm.put(Name, al);
		
		System.out.println("-----------------------------Please Enter New Record------------------------------------");				
		
		}
		
		System.out.println(hm);
		
		String b = hm.toString();
		
		FileWriter fo = new FileWriter("d://ramhashmap.txt");
		
		BufferedWriter bo = new BufferedWriter(fo);
		
		bo.write(b);
		
		bo.flush();
		
		bo.close();
		
		
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Digits");
		}
	
		
		
		
	}

}
