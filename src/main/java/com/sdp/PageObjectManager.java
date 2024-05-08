package com.sdp;

import org.openqa.selenium.WebDriver;

import com.adactinpomtestcase.BookAHotel;
import com.adactinpomtestcase.BookedItinerary;
import com.adactinpomtestcase.BookingConfirmation;
import com.adactinpomtestcase.LoginTestCase;
import com.adactinpomtestcase.SearchHotel;
import com.adactinpomtestcase.SelectHotel;

public class PageObjectManager {
	
	//private LoginPTestCase Ip;
	
	public static WebDriver driver;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public LoginTestCase getInstancesLp() {
		LoginTestCase lt=new LoginTestCase(driver);
		return lt;
	}
	
	public SearchHotel getInstancesSH() {
		SearchHotel sh= new SearchHotel(driver);
		return sh;
		
	}
	
	public SelectHotel getInstancesSHotel() {
		SelectHotel shl= new SelectHotel(driver);
		return shl;
	}
	
	public BookAHotel getInstancesBook() {
		BookAHotel bookahotel= new BookAHotel(driver);
		return bookahotel;
	}
	
	public BookingConfirmation getInstancesconfirm() {
		BookingConfirmation conf = new BookingConfirmation(driver);
		return conf;
	}
	
	public BookedItinerary getInstancesitinarary() {
		BookedItinerary iti= new BookedItinerary(driver);
		return iti;
	}
	

}
