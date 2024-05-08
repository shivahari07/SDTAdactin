package com.simpletestng;

import org.testng.annotations.Test;

public class GroupMethod {

	@Test(groups = {"even"})
	private void one() {
		System.out.println("First Line is printed");
	}
	
	@Test(groups = {"odd"})
	private void second() {
		System.out.println("Second Line is printed");
	}
	
	@Test(groups = {"even"})
	private void Third() {
		System.out.println("Third Line is printed");
	}
	
	@Test(groups = {"odd"})
	private void fourth() {
		System.out.println("Fourth Line is printed");
	}
	
	@Test(groups = {"even"})
	private void fivth() {
		System.out.println("Fivth Line is printed");
	}
	
	@Test(groups = {"odd"})
	private void sixth() {
		System.out.println("Sixth Line is printed");
	} 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
