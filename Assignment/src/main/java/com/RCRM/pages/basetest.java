package com.RCRM.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class basetest {
	
	static WebDriver driver;
	String pageName = "testPage";
	
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public static void launch() {
		
		System.setProperty("webdriver.chrome.driver","//Users//saurabhchaudhary//Downloads//chromedriver 3");
		driver = new ChromeDriver();
		
		driver.get("http://sanbox.undostres.com.mx");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	
	/**
	 * To use this remove comment and run using testng.xml file.
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
//	@BeforeClass
//	@Parameters("browser")
//	public void setup(String browser) throws Exception{
//		//Check if parameter passed from TestNG is 'firefox'
//		if(browser.equalsIgnoreCase("firefox")){
//			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
//		//Check if parameter passed as 'chrome'
//		else if(browser.equalsIgnoreCase("chrome")){
//			System.setProperty("webdriver.chrome.driver","//Users//saurabhchaudhary//Downloads//chromedriver 3");
//			driver = new ChromeDriver();
//		}
//		//Check if parameter passed as 'Edge'
//				else if(browser.equalsIgnoreCase("Edge")){
//					System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
//					driver = new EdgeDriver();
//				}
//		else{
//			//If no browser passed throw exception
//			throw new Exception("Browser is not correct");
//		}
//		
//	}
	
	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}
	
	

	

}
