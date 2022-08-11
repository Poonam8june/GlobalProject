package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Totalcount {

	By totalprice=By.id("total_price");
	
	public boolean totlcount(WebDriver driver)
		{
		
		Float F1= (float) 65.53;
		WebElement F2= driver.findElement(totalprice);
		if(F1.equals(F2)) 
		{
			System.out.println("Testcase Pass. TotalPrice is $65.53");
		}
		else 
		{
			System.out.println("Testcase failed.New Discount added in Printed dress ");
			System.out.println("Total price is $64 ");
		}
		
	 return false;	
	}
}
