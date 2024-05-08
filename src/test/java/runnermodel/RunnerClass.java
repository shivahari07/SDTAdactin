package runnermodel;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sdp.PageObjectManager;

import basemodel.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass extends BaseClass {

	public static WebDriver driver=BaseClass.Launchinbrowser("Chrome");
	
	public static PageObjectManager pom= new PageObjectManager(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		driver=geturl("https://adactinhotelapp.com/");
		
	     driver= current();
		
		//WebElement username=driver.findElement(By.id("username"));
		String read= readdata("C:\\Users\\Admin\\Documents\\Flim.xlsx",1, 7, 0); // Read from EXcel userName
		//write(username,read);
		write(pom.getInstancesLp().getUserName(), read);
		
	//	WebElement password =driver.findElement(By.id("password"));
		String pass=readdata("C:\\Users\\Admin\\Documents\\Flim.xlsx",1, 7, 1);     // Read from EXcel password
		//write(password,pass);
		write(pom.getInstancesLp().getPassword(), pass);
		
		clickElement(pom.getInstancesLp().getClicking());
		//clickElement(password);
		
		
		allselect("value",pom.getInstancesSH().getLocation(),"Brisbane");
		
		allselect("text",pom.getInstancesSH().getHotel(), "Hotel Sunshine");
		
		allselect("value", pom.getInstancesSH().getRoom(), "Double");
		
		allselect("value",pom.getInstancesSH().getAdult(), "4");
		
		allselect("text",pom.getInstancesSH().getChild(), "2 - Two");
		
		clickElement(pom.getInstancesSH().getSearch());
		
		clickElement(pom.getInstancesSHotel().getRadio());
		
		selected(pom.getInstancesSHotel().getRadio());
		
		clickElement(pom.getInstancesSHotel().getContinue());
		
		write(pom.getInstancesBook().getFirstName(), "Hari");
		
		write(pom.getInstancesBook().getLastName(), "Haran");
		
		write(pom.getInstancesBook().getAddress(), "Maduari");
		
		write(pom.getInstancesBook().getCredit(),"1234567890123456");
		
		allselect("text",pom.getInstancesBook().getCardType(),"American Express");
		
		allselect("value",pom.getInstancesBook().getSelectMonth(), "7");
		
		allselect("text",pom.getInstancesBook().getSelectYear(), "2029");
		
		write(pom.getInstancesBook().getCvvNumber(),"1234");
		
		clickElement(pom.getInstancesBook().getBookNow());
		
		Thread.sleep(5000);
		
		scrolldown();
		
		clickElement(pom.getInstancesconfirm().getItinerary());
		
		clickElement(pom.getInstancesitinarary().getCheckbox());
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)"); 
	    
	    clickElement(pom.getInstancesitinarary().getLogout());
	    
	    driver=geturl("https://letcode.in/alert");
	    
	    WebElement dd=driver.findElement(By.id("prompt"));
	    clickElement(dd);
	    prompts("hari");
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*
           driver=geturl("https://letcode.in/dropdowns");
		
		driver=title();

		WebElement ment= driver.findElement(By.id("superheros"));
		allselect("value", ment, "ta");     // multiple dropdown
		allselect("index", ment, "3");
		allselect("text", ment,"Batwoman");
		
		WebElement work= driver.findElement(By.linkText("Work-Space"));     //click
		clickElement(work);
		
		WebElement edit=driver.findElement(By.linkText("Edit"));
		clickElement(edit);
		
		WebElement first=driver.findElement(By.id("fullName"));            //sendkeys
		write(first, "HariHaranp");
		
		WebElement cpp=driver.findElement(By.id("fullName"));
		copy(cpp);
		
		driver=nav("back",null);                            //navigate back
		
		WebElement dp=driver.findElement(By.linkText("Drop-Down"));
		clickElement(dp);
		
		WebElement gg=driver.findElement(By.id("fruits"));
		allselect("text",gg,"Mango"); 
		
		scrolldown();
		Thread.sleep(2000);
		scrollup();
	
	
		
		*/
		
	}

	

}
