package NGFrameWork.TestNGProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DominosNG {
 
	public static WebDriver driver;
	  
	@BeforeTest
	  public void beforeTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\19295\\eclipse-workspace\\MavenTest\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();   
	     
	     driver.get("https://www.dominos.com");
	     driver.manage().window().maximize();
	    Thread.sleep(5000);

	  }

	
	
	@Test
  public void f() throws InterruptedException {

		DominosPOM ob = new DominosPOM (driver);
		ob.order_online(); 
		Thread.sleep(5000);

		DominosPOM ob1 = new DominosPOM (driver);
		ob1.delivery_online();
		Thread.sleep(5000);

		DominosPOM ob2 = new DominosPOM (driver);
		ob2.select_type();
		Thread.sleep(5000);		
		
		DominosPOM ob3 = new DominosPOM (driver);
		ob3.type_address();
		Thread.sleep(5000);		

		DominosPOM ob4 = new DominosPOM (driver);
		ob4.type_zip();
		Thread.sleep(5000);		

		DominosPOM ob5 = new DominosPOM (driver);
		ob5.type_city();
		Thread.sleep(5000);		

		DominosPOM ob6 = new DominosPOM (driver);
		ob6.select_state();
		Thread.sleep(5000);		

		DominosPOM ob7 = new DominosPOM (driver);
		ob7.order_confirmation();
		Thread.sleep(5000);	
  }
 
	
	

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
}
