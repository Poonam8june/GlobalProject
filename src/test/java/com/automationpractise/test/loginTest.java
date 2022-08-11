package com.automationpractise.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automationpractice.pages.Addsecondfadedshirt;
import com.automationpractice.pages.AddtocartPrinteddress;
import com.automationpractice.pages.Addtocarteveningdress;
import com.automationpractice.pages.Addtocartfaddedshortsleeve;
//import com.automationpractice.pages.AddtocartpageEveningdress;
import com.automationpractice.pages.Checkout;
import com.automationpractice.pages.Loginpage;
import com.automationpractice.pages.RemoveEveningDress;
import com.automationpractice.pages.Totalcount;


public class loginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation Study\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://automationpractice.com/index.php");
	    By locater = By.className("login");
	    WebElement element= driver.findElement(locater);
	    element.click();
	    Loginpage obj= new Loginpage();
	    obj.validatelogin(driver);
	    //AddtocartpageEveningdress obj1 =new AddtocartpageEveningdress();
	    Addtocartfaddedshortsleeve obj1= new Addtocartfaddedshortsleeve();
	   // obj1.Addshrtsleev(driver);
	    obj1.Addshrtsleev(driver);
	    Addtocarteveningdress obj2=new Addtocarteveningdress();
	    obj2.Addevedress(driver);
	    AddtocartPrinteddress obj3= new AddtocartPrinteddress();
	    obj3.Addprinteddress(driver);
	    Checkout obj4= new Checkout();
	    obj4.checkoutjava(driver);
	    RemoveEveningDress obj5= new RemoveEveningDress();
	    obj5.deletebtn(driver);
	    Addsecondfadedshirt obj6= new Addsecondfadedshirt();
	    obj6.clickonicon(driver);
	    Totalcount obj7=new Totalcount();
	    obj7.totlcount(driver);
	
	   
}

}
