package HarmanTechnologies;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInteger {

	//private static final Random generator = new Random();
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			
			int rd1to100 = ThreadLocalRandom.current().nextInt(1,100);
			
			System.out.println(rd1to100+" ");
			
		}

	}
	
}
