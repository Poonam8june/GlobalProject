package com.automationpractice.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {

	//for Summary -Procceed to checkout
	public boolean checkoutjava(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	WebElement actionBtn=driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span"));
	actionBtn.click();
	System.out.println("Proceed to Checkout");
	
	
	
	return false;
	
}
}