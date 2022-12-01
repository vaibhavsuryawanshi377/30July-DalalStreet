package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;



public class LoginPage extends TestBase{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
//------------------Repository-------------------------------------
	@FindBy(xpath="//*[@name='email']")
	private WebElement emaillAdress_text;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password_text;
	
	@FindBy (xpath="//*[@class='btn btn-dark btn-block']")
	private WebElement login_but;
	
	
	
//---------------------Action methods-----------------------------------
	
	public void enterEmailAdrees()
	{
		emaillAdress_text.sendKeys("vaibhavtest1@gmail.com");
	}
	public void enterPassword()
	{
		password_text.sendKeys("vaibhavtest1234");
	}
	public void clickOnLogin()
	{
		login_but.click();
	}
	public String getCurrentURL()
	{
		String current_UrL= driver.getCurrentUrl();
		return current_UrL;
	}

}
