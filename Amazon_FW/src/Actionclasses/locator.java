package Actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Webdriver_initialization.webd_init;

public class locator {
	
	public  static WebDriver lp;
	public WebElement we;
	
	webd_init dp = new webd_init();
	
	public void Launch()
	{
		lp = webd_init.webd();
		lp.get("https://www.amazon.in/ref=nav_logo");
		lp.manage().window().maximize();
	}
	
	public WebElement action(String xpth)
	
	{
		
		we= lp.findElement(By.xpath(xpth));
		return we;
		
	
	}
	
}
