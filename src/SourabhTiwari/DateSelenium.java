package SourabhTiwari;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateSelenium {

	public static void main(String[] args) 
	{
	
		Date date = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm a");
		
		String[] allTimeZones = TimeZone.getAvailableIDs();
		
		for (int i = 0; i < allTimeZones.length; i++) {
			
			System.out.println(allTimeZones[i]);
			
		}
		
		formatter.setTimeZone(TimeZone.getTimeZone("BET"));
		
		System.out.println("UnknownData " + formatter.format(date));
		
		formatter.setTimeZone(TimeZone.getTimeZone("VST"));
		
		System.out.println("US/Easter date & Time : "+formatter.format(date));
		
		formatter.setTimeZone(TimeZone.getTimeZone("IST"));
		
		System.out.println("Indian Time " + formatter.format(date));
			
	}

}
