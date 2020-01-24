package HarmanTechnologies;

import java.io.IOException;

public class TestExceptions {

	public static void main(String[] args) throws Exception {
		
		int a =5;
		int b=0;
		
		try {
			
			int c =a/b;
			
			if (a>0) throw new Exception("First");
				
				if (c==0) throw new IOException("SECOND");
				if(b==0) throw new Exception("THIRD");
				
			
			
		} catch (IOException | ArithmeticException x ){
			
			System.out.println(x.getMessage());
		}
		
	}
	
}
