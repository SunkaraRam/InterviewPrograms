package XLUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtilsForAll {
	
	static FileInputStream fi;
	
	static Workbook wb;
	public static int getRowCount(String filename,String sheetname) throws Throwable {
		
		fi = new FileInputStream(filename);
		
		wb= new XSSFWorkbook(fi);
		
		Sheet s = wb.getSheet(sheetname);
		
		int rc = s.getLastRowNum();
		
		return rc;	
	}

}
