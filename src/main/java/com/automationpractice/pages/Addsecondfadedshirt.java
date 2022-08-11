package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addsecondfadedshirt {
	
	By Addshirt= By.cssSelector("#cart_quantity_up_1_4_0_729633 > span");
	
	public boolean clickonicon(WebDriver driver)
	{
		WebElement icon1=driver.findElement(Addshirt);
		icon1.click();
		System.out.println("second Faded Short Sleeve T Shirt of the same size and colour  added to cart");
		
		return false;
	}

}
