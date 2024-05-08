package com.simpletestng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertMethod {
	
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
	
	//HardAssert
	@Test(priority = 1)
	private void method() {
		driver.get("https://letcode.in/test");
		
		String actual=driver.getTitle();
		System.out.println(actual);
		String Excepted= "LetCode - Testing Hub";
		assertEquals(actual, Excepted, "It is proper URL");
		
	}
     //SoftAssert
	@Test(priority = 2)
	private void amazon() {
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max"+Keys.ENTER);
      WebElement name= driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (256 GB) - Blue']"));
      String mobile = name.getText();
      System.out.println(mobile);
      
      String cell= "Mobile phone";
      
      SoftAssert soft= new SoftAssert();
      soft.assertEquals(mobile, cell, "tell it's correct or not");  // Eventhough Actual and expected are not same if will run program
      soft.assertAll();   //Once Actual and expected are not same then it will throw exception
      System.out.println("whether is correct ?");
	}
	

}
