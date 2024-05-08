package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSheet {
	
	private static void election() throws IOException {
		// TODO Auto-generated method stub

	File f = new File(".\\Excel\\Products.xlsx");
	
	FileInputStream fr= new FileInputStream(f);
	Workbook wb= new XSSFWorkbook(fr);
	//wb.createSheet("day").createRow(0).createCell(0).setCellValue("Voter ID");
	wb.getSheet("day").getRow(0).createCell(1).setCellValue("District");
	wb.getSheet("day").createRow(1).createCell(0).setCellValue("Ma 001");
	wb.getSheet("day").getRow(1).createCell(1).setCellValue("Madurai");
	wb.getSheet("day").createRow(2).createCell(0).setCellValue("VIR 002");
	wb.getSheet("day").getRow(2).createCell(1).setCellValue("Virdhunagar");
	wb.getSheet("day").createRow(3).createCell(0).setCellValue("TH 003");
	wb.getSheet("day").getRow(3).createCell(1).setCellValue("Theni");
	wb.getSheet("day").createRow(4).createCell(0).setCellValue("CH 005");
	wb.getSheet("day").getRow(4).createCell(1).setCellValue("Chennai");
	wb.getSheet("day").createRow(5).createCell(0).setCellValue("Thiru 007");
	
	FileOutputStream op= new FileOutputStream(f);
	//System.exit(0);
	wb.write(op);
	System.out.println("Successfully");
	wb.close();
}



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       election();
	}

}
