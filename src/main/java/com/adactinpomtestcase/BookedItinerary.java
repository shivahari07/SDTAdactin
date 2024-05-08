package com.adactinpomtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {
	
	public static WebDriver driver;

	@FindBy(xpath ="//input[@value='1218305']")
	public static WebElement checkbox;
	
	@FindBy(id="logout")
	public static WebElement logout;
	
	public BookedItinerary(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getCheckbox() {
		return checkbox;
	}

	public static WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
}
