package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
	

	public static String geTD(int rowindex,int calindex) throws Throwable{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\frame1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sh.getRow(rowindex).getCell(calindex).getStringCellValue();
		return data;
		}

}
