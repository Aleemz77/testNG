package NGFrameWork.TestNGProject1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class HomePOM {
	
	public static WebDriver driver;
	
	@FindBy (xpath = "//*[text()='Back to School']")
	WebElement BacktoSchool;

	@FindBy (xpath = "//*[text()='Off to College']")
	WebElement OfftoCollege;
	
	@FindBy (xpath = "//*[text()='Connect with friends and the world around you on Facebook.']")
	WebElement Fbtext;

	@FindBy (xpath = "//*[@id='email']")
	WebElement Fb_email;

	@FindBy (xpath = "//*[@id='pass']")
	WebElement Fb_Pass;

	
	public HomePOM(WebDriver driver) {
		HomePOM.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
	public void BacktoSchoolClick() {
		BacktoSchool.click();
	}
	
	public void OfftoCollegeClick() {
		OfftoCollege.click();
	}

	public void FbtextClick() {
		
		String Expected_text = "Connect with friends and the world around you on Facebook.";
		String Actual_text = Fbtext.getText();
		//Assert.assertEquals(Expected_text, Actual_text);
		
		SoftAssert sa = new SoftAssert ();
		sa.assertEquals(Actual_text, Expected_text);
		System.out.println("This is after soft assert");
		sa.assertAll();
		
	}

	public void Fb_emailClick(String Email) {
		Fb_email.sendKeys(Email);
	}
	
	public void Fb_PassClick(String Pass) {
		Fb_Pass.sendKeys(Pass);
	}
}