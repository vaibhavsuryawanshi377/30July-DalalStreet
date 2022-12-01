package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;


public class DashboardPage extends TestBase{
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//================= Ripository  ===============
	
	@FindBy(xpath="//*[@class='form-control'][1]")
	private WebElement searchCopmany_text;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/header/div[2]/div/div[2]/div/div[1]/a")
	private WebElement selectOptions_but;
	
	@FindBy(xpath="//a[text()='Transactions']")
	private WebElement transaction_link;
	
//================= Action Methods =============
	
	public void enterCompanyName()
	{
		searchCopmany_text.sendKeys("tata");
	}
	public void selectCompany()
	{
		selectOptions_but.click();
	}
	public void clickOnTransaction()
	{
		transaction_link.click();
	}
	
	
}
