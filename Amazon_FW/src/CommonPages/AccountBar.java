package CommonPages;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountBar {
   
  //WebDriver dr= new ChromeDriver();
 
  public static void main(String[] args) throws InterruptedException {
   
	  System.setProperty("webdriver.chrome.driver","chromedriver_90.4.exe");
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_89%3ARedmi&dc&qid=1624708173&rnid=3837712031&ref=lp_1389401031_nr_p_89_0");
      dr.manage().window().maximize();
      Thread.sleep(2000);
	  String s= dr.findElement(By.xpath("//div[@data-index='2']//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
//	  WebElement sp= dr.findElement(By.xpath("//div[@data-index='2']"));
//	  String pp = sp.getAttribute("data-asin");
	//  System.out.println(pp);
	 System.out.println(s);
	 // dr.findElement(By.xpath("//div[@data-index='0']//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
	  
	 // WebElement we = dr.findElement(By.xpath("//div[@data-index='1']//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	  //dr.findElement((By) we).click();
	  System.out.println("code complete");
	  //System.out.println(dr.findElement(By.xpath("//*[text()='Tomorrow, June 29']//ancestor::div[@data-component-type='s-search-result']")).getClass());
	  //System.out.println(ul);
	  
 List<WebElement> Wle= dr.findElements(By.xpath("//*[text()='Tomorrow, July 1']//ancestor::div[@data-component-type='s-search-result']"));
 JavascriptExecutor js = (JavascriptExecutor) dr;
 
 
  int lp=Wle.size();
  for(WebElement wlea : Wle)
  {
	  String i = wlea.getAttribute("data-index");
	  js.executeScript("arguments[0].scrollIntoView();", wlea);
	  js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", wlea);
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//div[@data-index='" + i + "']//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
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
        dr.switchTo().window(mainHandle);
      }
	  /* for(int i=0;i<lp;i++)
  {
	 WebElement PO =Wle.get(i);
	String fg = PO.getText();
	System.out.println(fg);
	 if(PO.isDisplayed())
	  {
	  
		 
	 WebElement wpl= dr.findElement(By.xpath("//*[text()='Tomorrow, July 1']//ancestor::div[@data-component-type='s-search-result']"));
	  
	 String as = PO.getAttribute("data-index");
	System.out.println(as);
	  }*/
  }
   
   System.out.println("Size of webleelemtn is " +  "   " + lp );  
 // String sd = ((WebElement) Wle).getText();
  
   
	 // System.out.println("this is value" + sd);
	  
//	 dr.close();  
  }


}

//div[@data-index='1']//span[@class='a-size-base-plus a-color-base a-text-normal']