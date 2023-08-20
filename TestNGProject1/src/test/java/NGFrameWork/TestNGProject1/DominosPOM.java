package NGFrameWork.TestNGProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DominosPOM {
	
	public static WebDriver driver;
	
	public DominosPOM(WebDriver driver) {
		DominosPOM.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = ("//*[@data-quid='main-navigation-order-online']"))
	WebElement order_online;
	
	@FindBy (xpath = ("//*[@id='tab-Delivery']"))
	WebElement delivery_online;

	@FindBy (xpath = ("//*[@id='Type']"))
	WebElement select_type;

	@FindBy (xpath = ("//*[@name='Street']"))
	WebElement type_address;
	
	@FindBy (xpath = ("//*[@data-quid='PostalCode']"))
	WebElement type_zip;
	
	@FindBy (xpath = ("//*[@name='City']"))
	WebElement type_city;
	
	@FindBy (xpath = ("//*[@autocomplete='address-level1']"))
	WebElement select_state;

	@FindBy (xpath = ("(//*[@type=\"submit\"])[1]"))
	WebElement order_confirmation;
	
	public void order_online() {
		order_online.click();
	}
	

	
	public void delivery_online() {
		delivery_online.click();
	}


	
	public void select_type() throws InterruptedException {
		select_type.click();
		
		Select ob = new Select(select_type);
	     ob.selectByVisibleText("House");
	     Thread.sleep(5000);

	}


	
	public void type_address() throws InterruptedException {
		type_address.click();
		
		type_address.sendKeys("Highway");
	     Thread.sleep(5000);


	}


	
	public void type_zip() throws InterruptedException {
		type_zip.clear();
		type_zip.click();
		
		type_zip.sendKeys("77590");
	     Thread.sleep(5000);


	}
	
	
	public void type_city() throws InterruptedException {
		type_city.clear();
		type_city.click();
		
		type_city.sendKeys("Texas City");
	     Thread.sleep(5000);


	}

		
	public void select_state() throws InterruptedException {
	
		select_state.click();
		
		Select obj = new Select(select_state);
	     obj.selectByIndex(45);
	     Thread.sleep(5000);


	}

	
	public void order_confirmation() {
		order_confirmation.click();
	}

}
