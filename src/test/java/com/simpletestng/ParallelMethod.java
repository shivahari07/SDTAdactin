package com.simpletestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelMethod {
	
	public static WebDriver driver;

	@BeforeSuite
	private void property() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	}

	@BeforeTest
	private void browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	private void url() {
		driver.get("https://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("Jivita04");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("123456");
		driver.findElement(By.id("login")).click();
	}

	

}
