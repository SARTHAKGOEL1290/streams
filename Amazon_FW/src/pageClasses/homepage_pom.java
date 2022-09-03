package pageClasses;



import org.openqa.selenium.WebElement;

//import Actionclasses.locator;

public class homepage_pom {
	
	
	public WebElement wc;
	
	//locator ap = new locator();
	homepage_util hu= new homepage_util();

	public void Bestseller_util()
	{
		System.out.println("Pointer is now present on Home page");
		wc = homepage_util.Bestseller();
		System.out.println("now will be clicking on respective page");
		wc.click();
		System.out.println("Pointer is now navigate to bestseller page");
	}
	
}
