package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;



public class ExchangePage extends TestBase {

	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}
	//---------Ripository-----------
	
	@FindBy(xpath="//*[text()='Intraday'][1]")
	private WebElement intraday_butt;
	
	@FindBy(xpath="//*[text()='Custom Limit']")
	private WebElement customeLimit_butt;
	
	@FindBy(xpath="//*[@name='input-Qunatity']")
	private WebElement quntity_text;
	
	@FindBy(xpath="//*[@id=\"buy-tab\"]/div/div[2]/div[2]/input")
	private WebElement price_text;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_butt ;

	@FindBy(xpath="//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[2]/div[1]/div")
	private WebElement status_msg;
	
	//------Action Methods------------
	
	public void enterQuantity(String quantity)
	{
		quntity_text.click();
		quntity_text.sendKeys(quantity);
	}
	
	public void clickOnBuyButton()
	{
		buy_butt.click();
	}
	
	public String getStatusText()
	{
		String text = status_msg.getText();
		return text;
	}
	
	public void clickOnIntradayButton()
	{
		intraday_butt.click();
	}
	
	public void clickOnCustomeLimitButton()
	{
		customeLimit_butt.click();
	}
	
	public void enterPrice(String price)
	{
		price_text.clear();
		price_text.sendKeys(price);
	}
}
