package com.adactinpomtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private static WebElement radio;
	
	@FindBy(id="continue")
	private static WebElement Continue;
	
	public SelectHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getRadio() {
		return radio;
	}

	public static WebElement getContinue() {
		return Continue;
	}
	
	
	
	
	
	

}
