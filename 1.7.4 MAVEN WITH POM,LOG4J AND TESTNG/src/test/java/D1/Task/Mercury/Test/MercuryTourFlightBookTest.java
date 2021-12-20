package D1.Task.Mercury.Test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import D1.Task.Mercury.Page.MercuryTourFlightBook;



public class MercuryTourFlightBookTest {

		WebDriver driver;
			
			static Logger log=Logger.getLogger(MercuryTourRegTest.class.getName());
			
			@BeforeSuite
			public void OpenBrowser()
			{
				log.info("");
				log.info("FLIGHT BOOKING START");
			
				System.setProperty("webdriver.chrome.driver","D:\\TESTING REQUIRED APPS JARS\\Chrome 95 drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
			}
			
			@BeforeTest
			public void UrlEnter()
			{
				log.info("");
				log.info("ENTER URL");
				driver.get("http://demo.guru99.com/test/newtours/reservation.php");
			}
			
			@BeforeClass
			public void Maximize()
			{
				log.info("");
				log.info("WINDOW MAXIMIZE");
				driver.manage().window().maximize();
			}
			
			@BeforeMethod
			public void ScreenshotBefore() throws IOException
			{
			
				log.info("");
				log.info("TAKE SCREENSHOT");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFileToDirectory(src,new File("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\Demo WebShop Test NG"));
			
				Set<Cookie>s=driver.manage().getCookies();
				for (Cookie cookie : s) {
					System.out.println("COOKIE   : "+cookie.getName());
				}
			}
			@Test
			public void Register() throws IOException
			{
				
				log.info("");
				log.info("GO TO IN REGISTER PAGE");
				MercuryTourFlightBook mtfb=PageFactory.initElements(driver, MercuryTourFlightBook.class);
				mtfb.FlightBook();
				
				}
			
			@AfterMethod
			public void Screenshot() throws IOException
			{
				log.info("");
				log.info("TAKE SCRENSHOT AFTER REGISTER SUCCESS");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFileToDirectory(src,new File("I:\\FULL TIME LEC\\3 TESTING\\Screenshot\\Demo WebShop Test NG"));
				
			}
			
			@AfterClass
			public void CookieDelete()
			{
				log.info("");
				log.info("DELETE COOKIE");
				driver.manage().deleteAllCookies();
			}
			
			@AfterTest
			public void DbconnectionClosed()
			{
				log.info("");
				log.info("DB CONNECTION CLOSED");
			}
			
			@AfterSuite
			public void BrowserClosed()
			{
				log.info("");
				log.warn("BROWSER CLOSED");
				driver.close();
			}
			@AfterSuite
			public void BrowserClosed()
			{
				log.info("");
				log.warn("BROWSER CLOSED");
				driver.close();
			}

		}

