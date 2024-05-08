package newadactin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinModel {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("Jivita04");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("123456");
		driver.findElement(By.id("login")).click();
		
		WebElement location=driver.findElement(By.xpath("//select[@id='location']"));
        Select se= new Select(location);
		se.selectByIndex(4);
		
		WebElement hotel=driver.findElement(By.xpath("//select[@name='hotels']"));
        Select sd= new Select(hotel);
        sd.selectByValue("Hotel Cornice");
        
        WebElement room=driver.findElement(By.xpath("//select[@id='room_type']"));
        Select ft= new Select(room);
        ft.selectByVisibleText("Deluxe");
        
        WebElement number=driver.findElement(By.xpath("//select[@name='room_nos']"));
        Select fc= new Select(number);
        fc.selectByValue("8");
        
       WebElement adult=driver.findElement(By.xpath("//select[@name='adult_room']"));
       Select fk= new Select(adult);
        fk.selectByVisibleText("3 - Three");
		
        WebElement child=driver.findElement(By.xpath("//select[@name='child_room']"));
        Select dd= new Select(child);
        dd.selectByValue("2");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
        
       WebElement cont= driver.findElement(By.xpath("//input[@type='submit']"));
		cont.click();
		
		WebElement first= driver.findElement(By.xpath("//input[@class='reg_input']"));
		first.sendKeys("Hari");
		
		WebElement second= driver.findElement(By.xpath("//input[@name='last_name']"));
		second.sendKeys("Haran");
		
		WebElement address= driver.findElement(By.xpath("//textarea[@class='txtarea']"));
		address.sendKeys("Anna Nagar Chennai");
		
		WebElement credit= driver.findElement(By.xpath("//input[@name='cc_num']"));
		credit.sendKeys("1234567890");
		
		WebElement type= driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select cardtype= new Select(type);
		List<WebElement> pp=cardtype.getOptions();
		Thread.sleep(2000);
		System.out.println("Enter total size"+pp.size());
		for (WebElement single : pp) {
			if(single.getText().equals("Master Card")) {
			single.click();
			break;
		}
	}	
		
		
		WebElement sdate= driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select sv= new Select(sdate);
		sv.selectByValue("5");
		
		WebElement year= driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select hh= new Select(year);
		hh.selectByVisibleText("2024");
		
		WebElement cvv= driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("123456");
		
		WebElement book= driver.findElement(By.xpath("//input[@name='book_now']"));
		book.click();
		
		WebElement prin=driver.findElement(By.xpath("//label[@id='cc_num_span']"));
		System.out.println(prin.getText());
		
		Thread.sleep(1000);
		
		WebElement repeat= driver.findElement(By.xpath("//input[@name='cc_num']"));
		repeat.clear();
		repeat.sendKeys("1234567890876543");
		
		
		WebElement button= driver.findElement(By.xpath("//input[@name='book_now']"));	
		button.click();
		
		Thread.sleep(5000);
		
		WebElement my= driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		my.click();
		
	
		

		List<WebElement> cc= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'12')]"));
		System.out.println("How many check box are available"+cc.size());
		for (WebElement join : cc) {
			String ss=join.getAttribute("value");
			if(ss.equals("1218308") ||ss.equals("1228990")) {
				join.click();
			}
			
			Thread.sleep(2000);
		
			JavascriptExecutor js= (JavascriptExecutor)driver;
			
			WebElement rt= driver.findElement(By.xpath("//input[@id='order_id_1229385']"));
			js.executeScript("arguments[0].scrollIntoView();",rt);
			
			
			for (WebElement element : cc) {
				String ww=element.getAttribute("value");
				if(ww.equals("1229582") ||ww.equals("1229611")) {
					element.click();
				}
			}
			
			TakesScreenshot sc= (TakesScreenshot)driver;
			File sct = sc.getScreenshotAs(OutputType.FILE);
			File ff= new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot\\har.png");
			FileUtils.copyFile(sct, ff);
		
	
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//input[@name='logout']")).click();
		
		/*driver.findElement(By.linkText("Click here to login again")).click();
		
		WebElement use=driver.findElement(By.xpath("//input[@id='username']"));
		use.sendKeys("Jivita04");
		WebElement passw=driver.findElement(By.xpath("//input[@id='password']"));
		passw.sendKeys("123456");
		driver.findElement(By.id("login")).click();
			
	*/
		
			  
				
			
				 
	}
		
		

	}

}
