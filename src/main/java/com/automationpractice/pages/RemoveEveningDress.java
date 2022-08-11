package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoveEveningDress {

	By deletebtn=By.cssSelector("#product_4_16_0_729633 > td.cart_delete.text-center > div");

    public boolean deletebtn(WebDriver driver)
    {
    	WebElement Clickbtn=driver.findElement(deletebtn);
    	Clickbtn.click();
    	System.out.println("Evening Dress, size small, colour beige removed from cart");
    	
    	return false;
    }

}