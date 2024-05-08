package com.adactinpomtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	
	WebDriver driver;
	
	@FindBy(id="first_name")
	private static WebElement firstName;
	
	@FindBy(id="last_name")
	private static WebElement lastName;
	
	@FindBy(id="address")
	private static WebElement address;
	
	@FindBy(id="cc_num")
	private static WebElement credit;
	
	@FindBy(id="cc_type")
	private static WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private static WebElement selectMonth;
	
	@FindBy(id="cc_exp_year")
	private static WebElement selectYear;
	
	@FindBy(id="cc_cvv")
	private static WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private static WebElement bookNow;
	
	
	public BookAHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public static WebElement getFirstName() {
		return firstName;
	}


	public static WebElement getLastName() {
		return lastName;
	}


	public static WebElement getAddress() {
		return address;
	}


	public static WebElement getCredit() {
		return credit;
	}


	public static WebElement getCardType() {
		return cardType;
	}


	public static WebElement getSelectMonth() {
		return selectMonth;
	}


	public static WebElement getSelectYear() {
		return selectYear;
	}


	public static WebElement getCvvNumber() {
		return cvvNumber;
	}


	public static WebElement getBookNow() {
		return bookNow;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
