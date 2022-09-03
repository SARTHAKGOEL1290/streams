package RunningTestNgMain;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Actionclasses.locator;
import pageClasses.homepage_pom;

public class Runner {
	
	homepage_pom hp= new homepage_pom();
	locator lc = new locator();
	
  @BeforeTest
  public void b() throws InterruptedException
  {
	lc.Launch();  
	//Thread.sleep(5000);
  }
  @Test
  public void f() {
	  
	  System.out.println("we are inside our test method ");
	  hp.Bestseller_util();
	  System.out.println("thanks");
	  
	  
  }
  @AfterTest
  public void z()
  {
		System.out.println("Test case completed");
  }
}
