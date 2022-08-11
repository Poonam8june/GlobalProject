package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	By Userid= By.xpath("//*[@id=\"email\"]");
	By pass =By.xpath("//*[@id=\"passwd\"]");
	By submit=By.xpath("//*[@id=\"SubmitLogin\"]/span");
	
	public boolean validatelogin(WebDriver driver)
	
	{
		WebElement userName=driver.findElement(Userid);
		userName.sendKeys("Plugint3@gmail.com");
		WebElement passwd=driver.findElement(pass);
		passwd.sendKeys("Pune@123");
		WebElement signin=driver.findElement(submit);
		signin.click();
		
		return false;
	}


}
