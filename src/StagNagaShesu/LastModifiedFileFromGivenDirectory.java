package StagNagaShesu;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import SourabhTiwari.fileReader;

public class LastModifiedFileFromGivenDirectory {

	public static void main(String[] args) {
		
		File f = new File("E:\\GitHubCode\\InterviewPrograms\\src\\XLUtils.java");
		
		long lm = f.lastModified();
		
		System.out.println("Display last modified : " + new Date(lm));
		
		SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yy hh:mm:ss");
		
		String date = sm.format(lm);
		
		System.out.println(date);

	}

}
