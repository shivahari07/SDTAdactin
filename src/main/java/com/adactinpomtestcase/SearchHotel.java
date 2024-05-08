package com.adactinpomtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private static WebElement Location;
	
	@FindBy(id="hotels")
	private static WebElement hotel;
	
	@FindBy(id="room_type")
	private static WebElement room;
	
	@FindBy(id="room_nos")
	private static WebElement numberroom;
	
	@FindBy(id="adult_room")
	private static WebElement adult;
	
	@FindBy(id="child_room")
	private static WebElement child;
	
	@FindBy(id="Submit")
	private static WebElement search;
	
	public SearchHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getLocation() {
		return Location;
	}

	public static WebElement getHotel() {
		return hotel;
	}

	public static WebElement getRoom() {
		return room;
	}

	public static WebElement getNumberroom() {
		return numberroom;
	}

	public static WebElement getAdult() {
		return adult;
	}

	public static WebElement getChild() {
		return child;
	}

	public static WebElement getSearch() {
		return search;
	}
	
	
	
	
	
	
	

}
