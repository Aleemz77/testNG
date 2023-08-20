package NGFrameWork.TestNGProject1;

import org.testng.annotations.Test;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest extends Baseclass {
		
	
	
	
	@Test
  public void f() throws InterruptedException, IOException {
	  
		System.out.println("This is test");
		HomePOM ob = new HomePOM (driver);
		ob.FbtextClick();
		 Thread.sleep(5000);
ob.Fb_emailClick("abc@yahoo.com");		 
Thread.sleep(5000);
ob.Fb_PassClick("asfdgfh");
Thread.sleep(5000);
shots_date ();
Thread.sleep(5000);

				 
	}

  
	
	/*@Test
  public void f2() throws InterruptedException {
	  
		System.out.println("This is test2");
		HomePOM obj = new HomePOM (driver);
		obj.OfftoCollegeClick();
	     Thread.sleep(5000);*/

	  
  }

 