import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VikramPrm {

	public static void main(String[] args) {
		int temp;
		int[] inp ={0,2,4,0,0,7,0,8,0,6};
		for (int i = 0; i < inp.length; i++) {
			for (int j = i+1; j < inp.length; j++) {
				if (inp[i]==0) {	
					temp=inp[i];
					inp[i]=inp[j];
					inp[j]=temp;
				}
			}
		}
		for (int i = 0; i < inp.length; i++) {
			System.out.println(inp[i]);
		}
	}

}
