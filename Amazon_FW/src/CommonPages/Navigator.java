package CommonPages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Navigator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver_90.4.exe");
		  WebDriver dr= new ChromeDriver();
		  dr.get("https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_89%3ARedmi&dc&qid=1624708173&rnid=3837712031&ref=lp_1389401031_nr_p_89_0");
	      dr.manage().window().maximize();
	      Thread.sleep(2000);
		  String s= dr.findElement(By.xpath("//div[@data-index='2']//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
          System.out.println(s);
		  dr.findElement(By.xpath("//div[@data-index='2']//span[@class='a-price-whole']")).click();
         /* TargetLocator dp = dr.switchTo();
          WebElement we= ((RemoteWebDriver) dp).findElement(By.xpath("//input[@name='submit.add-to-cart']"));
          WebDriver ap= dp.frame(we);
          System.out.println(dp);
          System.out.println(we);
          */
          String mainHandle = dr.getWindowHandle();
          System.out.println("Home Page Window ID: " + mainHandle + "\n");
              
          Set <String> allHandles = dr.getWindowHandles();
          System.out.println("Windows Open After Clicking The Docs Link via Home Page: " + allHandles.size() + "\n");
          
          for (String windowHandle : allHandles) {
            if(mainHandle.equals(windowHandle)) {
              System.out.println("\t Window ID 1: \t" + windowHandle +
                              "\n \t URL: \t \t" + dr.getCurrentUrl() +            
                              "\n \t Title: \t \t" + dr.getTitle());        
            }  
            else  {
              dr.switchTo().window(windowHandle);
              
              System.out.println("\t Window ID 2: \t" + windowHandle +
                  "\n \t URL: \t \t" + dr.getCurrentUrl() +            
                  "\n \t Title: \t \t" + dr.getTitle());      
              dr.close();
            }
          }
          //  dr.close();
         // ((RemoteWebDriver) dp).findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
	}

}
