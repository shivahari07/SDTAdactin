package com.adactinpomtestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCase {
	
	public static WebDriver driver;
	
		
		@FindBy(id="username")
		private static WebElement userName;
		
		@FindBy(id="password")
		private static WebElement password;
		
		@FindBy(id="login")
		private static WebElement clicking;
		
		
		public LoginTestCase(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public static WebElement getUserName() {
			return userName;
		}

		public static WebElement getPassword() {
			return password;
		}

		public static WebElement getClicking() {
			return clicking;
		}


		


		
		
	
	
	

}
