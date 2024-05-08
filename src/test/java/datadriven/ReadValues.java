
package datadriven;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadValues {
	
	public static void product() throws IOException {
	
	File ft= new File(".\\Excel\\Products.xlsx");
	FileInputStream fs= new FileInputStream(ft);
	Workbook wb= new XSSFWorkbook(fs);
	Sheet sheet = wb.getSheetAt(0);
	int physicalrow = sheet.getPhysicalNumberOfRows();
	for(int i=0; i<physicalrow ;i++) {  // getting entire Row
		Row row = sheet.getRow(i);
		
		int physicalcell = row.getPhysicalNumberOfCells();
		for(int j=0; j<physicalcell; j++) {  //getting entire cell
			Cell cell = row.getCell(j);
			
		CellType celltype = cell.getCellType();
		
		if(celltype.equals(celltype.STRING)){
			String stringcell = cell.getStringCellValue();
			System.out.println(stringcell);
		}
		
		else if(celltype.equals(celltype.NUMERIC)){
			double numericcell = cell.getNumericCellValue();
			int data=(int) numericcell ;
			System.out.println(data);
		}
		}
		
	}
	wb.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		product();
		


	}

}
