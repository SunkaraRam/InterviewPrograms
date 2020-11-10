package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OrangeUtils {
	
	 
	
	Workbook wb;
	
	public OrangeUtils() throws Throwable{
		FileInputStream fi  = new FileInputStream("./TestInputs/Orange.xlsx");
		wb = WorkbookFactory.create(fi);
	}
	
	public  int rowCount(String sheet) throws Throwable {
		
		return wb.getSheet(sheet).getLastRowNum();
	
	}
	
	public int colCount(String sheet,int rownum) {
		
		return wb.getSheet(sheet).getRow(rownum).getLastCellNum();
	}
	
	public String getData(String sheet, int rownum,int colnum) {
		
		
		
		String data="";
		
		if (wb.getSheet(sheet).getRow(rownum).getCell(colnum).getCellType()==Cell.CELL_TYPE_NUMERIC) {
			
				long value = (long)wb.getSheet(sheet).getRow(rownum).getCell(colnum).getNumericCellValue();
			
				 data = String.valueOf(value);
			
		} else {

			data = wb.getSheet(sheet).getRow(rownum).getCell(colnum).getStringCellValue();			
		}
		return data;
		
	}
	
	public void setData(String sheet, int rownum,int colnum,String res) throws IOException {
		
		Sheet sh =wb.getSheet(sheet);
		
		 Row row = sh.getRow(rownum);
		
		Cell cell = row.createCell(colnum);
		
		cell.setCellValue(res);
		
		FileOutputStream fo = new FileOutputStream("./TestOutput/orangeResults.xlsx");
		
		wb.write(fo);
		
	}
	
	
	public static void main(String[] args) throws Throwable {
		
		OrangeUtils or = new OrangeUtils();
		
		int rno = or.colCount("Orange", 1);
		System.out.println(rno);
	}
	
}
