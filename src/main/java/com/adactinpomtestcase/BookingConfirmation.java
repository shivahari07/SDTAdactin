package com.adactinpomtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	
	WebDriver driver;
	
	@FindBy (id="my_itinerary")
	private static WebElement itinerary;
	
	public BookingConfirmation (WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	public static WebElement getItinerary() {
		return itinerary;
	}
	
	
	
	

}
