package com.automationpractice.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Addtocartfaddedshortsleeve {

	
		By serchboxq= By.id("search_query_top");
		By submitclick=By.name("submit_search");
		By productimage=By.className("product_img_link");
		
		/*By serchq =By.id("search_query_top")).sendKeys("Faded Short Sleeve T Shirt");
        driver.findElement(By.name("submit_search")).click();
        
	    driver.findElement(By.className("product_img_link")).click();*/	    
		public boolean Addshrtsleev(WebDriver driver)
		
		{
			WebElement Searchquery=driver.findElement(serchboxq);
			Searchquery.sendKeys("Faded Short Sleeve");
			WebElement Submit=driver.findElement(submitclick);
			Submit.click();
			
			//JavascriptExecutor js = (JavascriptExecutor)driver;
		    //js.executeScript("window.scrollBy(0,600)");
			WebElement ProductImage=driver.findElement(productimage);
			ProductImage.click();
			driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
			WebElement Sizedrpdwn=driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		    Select oSelect=new Select(Sizedrpdwn);
		    oSelect.selectByVisibleText("M");
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    driver.findElement(By.id("color_14")).click();
		    driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();
		    System.out.println("Fadded short sleeve blue color, medium shirt added to cart");
		    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			//driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span")).click();
		    WebElement actionBtn=driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span"));
		    	//	  By.xpath("//span[contains(text(),'Continue shopping ')]"));
		    		  //and contains(text(),'Continue Shopping')])");
		    		actionBtn.click();
		    		
		    return false;
		}
	}


