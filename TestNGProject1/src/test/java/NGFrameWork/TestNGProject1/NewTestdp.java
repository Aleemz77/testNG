package NGFrameWork.TestNGProject1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTestdp extends Baseclass {
  @Test(dataProvider = "dp")
  public void f(String email, String pass) throws InterruptedException {
	  
	  HomePOM ob = new HomePOM (driver);
	  ob.Fb_emailClick(email);		 
	  Thread.sleep(5000);
	  ob.Fb_PassClick(pass);
	  Thread.sleep(5000);

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaa" },
      new Object[] { "def@yahoo.com", "bbbb" },
    };
  }
}
