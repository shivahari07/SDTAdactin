package com.simpletestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametermethod {
	
public static WebDriver driver;
	
	@BeforeSuite
	private void setProperty() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
	}
	
	@BeforeTest
	private void browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Parameters({"username", "password"})
	@Test()                  //@Optional("hari")
	private void signup(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys(username);
		System.out.println("print the username - "+username);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(password);
		System.out.println(password);
		driver.findElement(By.id("login")).click();
	}

	
	

}
