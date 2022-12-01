package ai.ds.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;



public class TransactionPage extends TestBase {
	
	public TransactionPage()
	{
		PageFactory.initElements(driver,this);
		
	}
	//-----------------------------------------------
	
	@FindBy(xpath="//a[contains(text(),'>')]")
	private WebElement nextpage_but;
	
	
	//------------------------------------------------

	public void abc()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				String text= driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text);
			}   System.out.println();
		}
		
	}
	
	
	
}
