package basemodel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static String Value;

	public static WebDriver Launchinbrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firebox")) {  //Launching browser
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void allselect( String types,WebElement ment, String value) {
		Select df= new Select(ment);
		if(types.equalsIgnoreCase("value")) {
			df.selectByValue(value);
		}                                           //multiple selected
		else if(types.equalsIgnoreCase("index")) {
			int data= Integer.parseInt(value);
			df.selectByIndex(data);
		}
		else if(types.equalsIgnoreCase("text")) {
			df.selectByVisibleText(value);
		}

	}
	
	public static WebDriver geturl(String url ) {
		driver.get(url);                     //Get url
		return driver;
	}
	
	public static WebDriver current() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);            //Get currentURL
		return driver;
	}
	
	public static WebDriver title() {
		String tit=driver.getTitle();           //getTitle
		System.out.println("print Title - "+tit);
		return driver;
	}
	public static void clickElement(WebElement element) {
		
		element.click();                       //click
	}	
	public static void write (WebElement clicking, String value) {
	     clicking.sendKeys(value);                  // using Sendkeys
	}
	public static void clean (WebElement clear) {
	     clear.clear();                            //using clear
	}	
	public static void show(WebElement confirm) {
		boolean enabled = confirm.isEnabled();   //checking is Enabled
		System.out.println(enabled);
	}
	
	public static void display(WebElement displayed) {
		boolean displaying = displayed.isDisplayed(); //checking is displayed
		System.out.println(displaying);
	}
	
	public static void selected(WebElement sele) {
		boolean select = sele.isSelected();               //Checking isSelected
		System.out.println("Printing the selected option - "+select);
	}

	public static void select(String type, WebElement option, String value) {
		Select ss= new Select(option);
		if(type.equalsIgnoreCase("text")) {
			ss.selectByVisibleText(value);  //Select by Text
		}

	}	
	
	public static void options( WebElement option) {
		Select ss= new Select(option);
			WebElement firstop = ss.getFirstSelectedOption();  //get First option
			System.out.println(firstop);
	}
	
	public static void allselect( WebElement option) {
		Select ss= new Select(option);
			ss.getAllSelectedOptions();      //get alloption
	}
	
	public static void scrollup() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,-300)");      //scrollup
	}
	
	public static void scrolldown() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");     //scrolldown
	   
	}
	
	public static void implicit(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);      //implicit
	}
	
	public static WebElement text(By locator) {
		WebElement dd=driver.findElement(locator);
	         System.out.println(dd.getText());                 //Get Text
	         return dd;
	}
	
	public static WebDriver cl() {
		driver.close();
		return driver;      //close the window
	}
	
	
	public static WebDriver nav(String type, String values) {
		if(type.equalsIgnoreCase("Back")) {     //navigate to back
		driver.navigate().back();
	    }
		else if(type.equalsIgnoreCase("to")) {
			driver.navigate().to(values);       //navigate to to URL
		}
		else if(type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();       //navigate to forward
		}
		else if(type.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();       //navigate to refresh
		}
         return driver;
	}	
	
	public static void copy(WebElement copying) {
		Actions act= new Actions(driver);       //double click
		act.doubleClick(copying).build().perform();

	}
	
	public static void mouse(WebElement move) {
		Actions act= new Actions(driver);       // mouseover action
		act.moveToElement(move).build().perform();
        
	}
	
	public static void context(WebElement cont) {
		Actions act= new Actions(driver);       //double Context action
		act.moveToElement(cont).build().perform();
        
	}
	
	public static void robot() throws AWTException{
		
		Robot rt= new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);         //Robot class
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static String window() {
		String Handle = driver.getWindowHandle();          //WindowHandle
		return Handle;
	}
	
	public static String readdata(String path, int sheetindex, int rowindex, int cellindex) throws IOException {
		
		File ft=new File(path);
		FileInputStream fs= new FileInputStream(ft);
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sheet=wb.getSheetAt(sheetindex);
		Row row=sheet.getRow(rowindex);         //get data from Excel Sheet
		Cell cell=row.getCell(cellindex);
		CellType celltype=cell.getCellType();
		
		if(celltype.equals(celltype.STRING)) {
			Value=cell.getStringCellValue();
		}
		else if(celltype.equals(celltype.NUMERIC)) {
			double numbercell=cell.getNumericCellValue();
			int data= (int) numbercell;
			Value=String.valueOf(data);
			
			}
		wb.close();
		return Value;
	}
	
	
	public static void alerts() {
		Alert ar=driver.switchTo().alert();
		ar.accept();	
	}
	
	public static void confirm() {
		Alert ar=driver.switchTo().alert();
		ar.dismiss();	
	}
	
	public static void prompts(String word) {
		Alert ar=driver.switchTo().alert();
		ar.sendKeys(word);
		ar.accept();
		
	}
	public static List<String> shift(int num) {
	Set<String> sn=driver.getWindowHandles();
	List<String> li= new ArrayList<String>(sn);   //List Multiple Tap
	driver.switchTo().window(li.get(num));
	return li;
	}
	
	public static Set<String> windows() {
		Set<String> stt=driver.getWindowHandles();   //Get Window Handles
		for (String str : stt) {
			driver.switchTo().window(str);
		
		}
		return stt;
	
	}
	
	
}

        
	
	
	
	
	
	

