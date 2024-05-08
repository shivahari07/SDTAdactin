package particals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import basemodel.BaseClass;

public class PraticesNode extends BaseClass{
	public static void main(String[] args) throws InterruptedException  {
		driver= Launchinbrowser("Chrome");
		
		driver= geturl("https://www.flipkart.com/");
		
		WebElement pp=driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		mouse(pp);
		 
		
     
	}

}
