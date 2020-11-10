package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataPass {
	public static Workbook wb;
	//to load excel file
	
public DataPass()throws Throwable
	{
		FileInputStream fis=new FileInputStream("./TestInputs/InputSheet.xlsx");
		wb=WorkbookFactory.create(fis);
	}
//count no of rows
public static int rowCount(String sheetname)
{
	return wb.getSheet(sheetname).getLastRowNum();
}
//count no of columns
public static int colCount(String sheetname,int rownum)
{
	return wb.getSheet(sheetname).getRow(rownum).getLastCellNum();
}
//get data from cell
public static String getData(String sheetname,int rownum,int colnum)
{
	String data="";
	if(wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getCellType()==Cell.CELL_TYPE_NUMERIC)
	{
		long celldata=(long)wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getNumericCellValue();
		data=String.valueOf(celldata);
	}
	else
	{
		data=wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();
	}
	return data;
}
//writing data into cells
public static void setData(String sheetname,int row,int colnum,String status) throws IOException
{
	Sheet sh=wb.getSheet(sheetname);
	Row rownum=sh.getRow(row);
	Cell cell=rownum.createCell(colnum);
	cell.setCellValue(status);
	if(status.equalsIgnoreCase("pass"))
	{
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		//Apply color to the text
		font.setColor(IndexedColors.WHITE.getIndex());
		//Apply Bold to the text
		font.setBoldweight(font.BOLDWEIGHT_BOLD);
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setFont(font);
		rownum.getCell(colnum).setCellStyle(style);
	}
	if(status.equalsIgnoreCase("fail"))
	{
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		//Apply color to the text
		font.setColor(IndexedColors.WHITE.getIndex());
		//Apply Bold to the text
		font.setBoldweight(font.BOLDWEIGHT_BOLD);
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setFont(font);
		rownum.getCell(colnum).setCellStyle(style);
	}
	if(status.equalsIgnoreCase("Not Executed"))
	{
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		//Apply color to the text
		font.setColor(IndexedColors.WHITE.getIndex());
		//Apply Bold to the text
		font.setBoldweight(font.BOLDWEIGHT_BOLD);
		style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setFont(font);
		rownum.getCell(colnum).setCellStyle(style);
	}
	FileOutputStream fo=new FileOutputStream("./TestOutput/HybridResults.xlsx");
	wb.write(fo);
	fo.close();
}


}
