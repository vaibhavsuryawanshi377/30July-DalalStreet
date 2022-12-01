package ai.ds.testBase;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import ai.ds.pageLayer.DashboardPage;
import ai.ds.pageLayer.ExchangePage;
import ai.ds.pageLayer.LoginPage;
import ai.ds.pageLayer.TransactionPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public LoginPage login;
	public DashboardPage db;
	public ExchangePage ep;
	public TransactionPage tp;
	public static Logger logger;
	
	//-------------------------------------
	@BeforeClass
	public void start()
	{
		logger= Logger.getLogger("DalalStreet Auto framework");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Framework execution started");
	}
	
	@AfterClass
	public void end()
	{
		logger.info("Framework execution completed");
	}
	
	//---------------------------------------------
	@Parameters("browser")
	@ BeforeMethod
	public void Launcher(String brouser)
	{
		
		if(brouser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(brouser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(brouser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("provide correct browser name");
		}
		logger.info("browser is launched");
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//---------------object ripository-------------------
		login = new LoginPage();
		db = new DashboardPage();
		ep = new ExchangePage();
		tp = new TransactionPage();
		//--------------------------------------------------------
	}
	
	@AfterMethod
	public void QuiteBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();	
		logger.info("Browser is closed");
	}
	
}
