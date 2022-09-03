package Webdriver_initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webd_init {
	
	public static WebDriver dr;
	
	public static  WebDriver webd()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver_90.4.exe");
		return dr= new ChromeDriver();
		
	}

}
