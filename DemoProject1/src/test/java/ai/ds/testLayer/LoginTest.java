package ai.ds.testLayer;

import static org.testng.Assert.assertNotEquals;
import org.testng.annotations.Test;

import ai.ds.testBase.TestBase;

public class LoginTest extends TestBase{
	String expected_url="https://apps.dalalstreet.ai/dashboard";
	@Test
	public void verifyLoginFun() throws InterruptedException
	{
		login.enterEmailAdrees();
		login.enterPassword();
		login.clickOnLogin();
		Thread.sleep(3000);
		String actual_url= login.getCurrentURL();
		assertNotEquals(actual_url, expected_url);
	
	}

}
