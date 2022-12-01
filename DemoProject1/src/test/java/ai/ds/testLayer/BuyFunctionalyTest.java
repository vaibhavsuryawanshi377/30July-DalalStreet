package ai.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.testBase.TestBase;

public class BuyFunctionalyTest extends TestBase{
	
	
	@Test
	public void TC_BF_001() throws InterruptedException
	{
		String expe_status_msg= "Order Created successfully";
		//---------login---------------
		login.enterEmailAdrees();
		login.enterPassword();
		login.clickOnLogin();
		Thread.sleep(3000);
		//---------------------------
		db.enterCompanyName();
		db.selectCompany();
		Thread.sleep(3000);
		//----------------------------
		ep.enterQuantity("5");
		ep.clickOnBuyButton();
		Thread.sleep(2000);
		String actual_text =ep.getStatusText();
		System.out.println(actual_text);
		Assert.assertEquals(actual_text, expe_status_msg);	
	}
	
	@Test
	public void TC_BF_002() throws InterruptedException
	{
		String expe_status_msg= "Order Created Successfully";
		//---------login---------------
		login.enterEmailAdrees();
		login.enterPassword();
		login.clickOnLogin();
		Thread.sleep(3000);
		//---------------------------
		db.enterCompanyName();
		db.selectCompany();
		Thread.sleep(3000);
		//----------------------------
		ep.clickOnIntradayButton();
		ep.enterQuantity("5");
		ep.clickOnBuyButton();
		Thread.sleep(3000);
		String actual_text =ep.getStatusText();
		System.out.println(actual_text);
		Assert.assertEquals(actual_text, expe_status_msg);
		
	}
	
	@Test 
	public void TC_BF_003() throws InterruptedException
	{
		String expe_status_msg= "Limit Order Created Successfully";
		//---------login---------------
		login.enterEmailAdrees();
		login.enterPassword();
		login.clickOnLogin();
		Thread.sleep(3000);
		//---------------------------
		db.enterCompanyName();
		db.selectCompany();
		Thread.sleep(3000);
		//----------------------------
		ep.clickOnCustomeLimitButton();
		ep.enterQuantity("5");
		ep.enterPrice("100");
		ep.clickOnBuyButton();
		Thread.sleep(3000);
		String actual_text =ep.getStatusText();
		System.out.println(actual_text);
		Assert.assertEquals(actual_text, expe_status_msg);
	}
	
	@Test
	public void TC_BF_004() throws InterruptedException
	{
		String expe_status_msg= "Limit Order Created Successfully";
		
		//---------login---------------
		login.enterEmailAdrees();
		login.enterPassword();
		login.clickOnLogin();
		Thread.sleep(3000);
		//---------------------------
		db.enterCompanyName();
		db.selectCompany();
		Thread.sleep(3000);
		//----------------------------
		ep.clickOnIntradayButton();
		ep.clickOnCustomeLimitButton();
		ep.enterQuantity("5");
		ep.enterPrice("100");
		ep.clickOnBuyButton();
		Thread.sleep(3000);
		String actual_text =ep.getStatusText();
		System.out.println(actual_text);
		Assert.assertEquals(actual_text, expe_status_msg);
	}
	
	
}
