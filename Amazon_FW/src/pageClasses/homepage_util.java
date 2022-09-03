package pageClasses;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Actionclasses.locator;

public class homepage_util {
	
	public static WebElement ap;

	static locator lc = new locator();
	public static WebElement Bestseller()
	{
	    String xpth = "//*[@id=\"nav-xshop\"]/a[1]";
	    ap =  lc.action(xpth);
		return ap;
		
	}
}
