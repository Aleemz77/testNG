package NGFrameWork.TestNGProject1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass {

	public WebDriver driver;
	  
	@BeforeMethod
	@Parameters({"brow"})
	  public void beforeTest(String brow) throws InterruptedException, IOException {

		String browser = brow;
		
		if (browser.contains("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\19295\\eclipse-workspace\\MavenTest\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();   
	}
		
		else if (browser.contains("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\19295\\eclipse-workspace\\MavenTest\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();   
		}
		
		else {
	    System.setProperty("webdriver.edge.driver","C:\\Users\\19295\\eclipse-workspace\\MavenTest\\drivers\\msedgedriver.exe");
		  driver = new EdgeDriver();   
		}
	     driver.get("https://www.facebook.com");
	     driver.manage().window().maximize();
	     Thread.sleep(5000);
	     shots_date ();
	     Thread.sleep(5000);


	  }

	 @AfterMethod
	  public void afterTest() {
		  System.out.println("This is after test");
		  driver.close();
	  }

	  public void shots () throws IOException {
		  File cap = ((TakesScreenshot) driver). getScreenshotAs (OutputType.FILE);
		  FileHandler.copy(cap, new File("C:\\Users\\19295\\eclipse-workspace\\TestNGProject1\\Picture\\1.png"));
	  }
	  
	  public void shots_witharg (String name) throws IOException {
		  File cap = ((TakesScreenshot) driver). getScreenshotAs (OutputType.FILE);
		  FileHandler.copy(cap, new File("C:\\Users\\19295\\eclipse-workspace\\TestNGProject1\\"+name+".png"));
	  }
	  
	  public void shots_date () throws IOException {
		  Date dt = new Date();
		  String name_dt = dt.toString().replace(" ", "_").replace(":", "_");
		  File cap = ((TakesScreenshot) driver). getScreenshotAs (OutputType.FILE);
		  FileHandler.copy(cap, new File("C:\\Users\\19295\\eclipse-workspace\\TestNGProject1\\Picture\\"+name_dt+".png"));
	  }
	}


