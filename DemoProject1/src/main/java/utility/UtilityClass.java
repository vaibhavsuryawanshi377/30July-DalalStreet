package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class UtilityClass  extends TestBase{
	
	UtilityClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void scrollingMethod(String scrollingArgument)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(scrollingArgument);
	}
	public static void screenshotMethod(String filename) 
	{
		try 
		{
		    TakesScreenshot ts =(TakesScreenshot)driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    File dest = new File ("C:\\Users\\DELL\\eclipse-workspace\\30JulyDSPractice\\Screenshot\\"+filename+".png");
		    FileHandler.copy(source, dest);
		}
		 catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
