package NaveenPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class MapWithFile {
	
	public  Workbook wb ;
	
	
	public MapWithFile() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fi = new FileInputStream("D:\\SeleniumProjects\\PrimuBankPrimeDDF\\TestInputs\\InputSheet.xlsx");
		wb = WorkbookFactory.create(fi);
		//UserManagement
	}
	
	public int rowNum(String sheetname) {
		
		return wb.getSheet(sheetname).getLastRowNum();
		
	}
	
	public  String getData(String sheetname,int rownum,int colnum) {
		
		String data="";
		
		if (wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getCellType()==Cell.CELL_TYPE_NUMERIC) {
			
			long l =(long) wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getNumericCellValue();
			
			   data = String.valueOf(l);
			return data;
		}
		else {
		
			data= wb.getSheet("UserManagement").getRow(rownum).getCell(colnum).getStringCellValue();
			return data;
		
		}
				
		
	}
	
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		MapWithFile mp = new MapWithFile();
		
		Map<String, String> map = new HashMap<String, String>();
		
		int row = mp.rowNum("UserManagement");
		
		System.out.println(row);
		
		for (int i = 1; i <=row; i++) {
			
			String username = mp.getData("UserManagement", i, 0);
			String password = mp.getData("UserManagement", i, 1);
			
			//System.out.println(username+"---------- "+password);
			
			map.put(username, password);
			
		}
		
//		System.out.println(map);
		
		Iterator itr =map.entrySet().iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry<String, String> entry =(Map.Entry<String, String>) itr.next();
			
			System.out.println(entry.getKey()+"=========="+entry.getValue());
			
		}
		
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			
			System.out.println(entry.getKey()+"======"+entry.getValue());
			
		}
	}

}
