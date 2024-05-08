package datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoExcel {
	


  public static void testname() throws Exception {
	
	File f= new File(".\\Excel\\state.xlsx");
	FileInputStream ff= new FileInputStream(f);

	Workbook wk= new XSSFWorkbook(ff);
	Sheet sh = wk.getSheetAt(0);
	Row row = sh.getRow(0);
	Cell cell = row.getCell(1);
	
	CellType ct = cell.getCellType();
	
	if(ct.equals(CellType.STRING)) {
		String cv = cell.getStringCellValue();
		System.out.println(cv);
	}
	else if(ct.equals(CellType.NUMERIC)){
		
		double numericCellValue = cell.getNumericCellValue();
		int data = (int) numericCellValue;
	    System.out.println(data);

	}
	wk.close();
}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		testname();
	

}
}