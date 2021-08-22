package com.AutomationTalks.demoProject1;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	
	  public static WebDriver driver;
	  public static final String USERNAME = "pranaydua3";
	  public static final String AUTOMATE_KEY = "JpsuaBcnGANeykgafJe5";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	@BeforeMethod
	public void launchDriver()  {
		//DesiredCapabilities caps=new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "/Users/pranay.dua/Downloads/chromedriver_92_1");
//		DesiredCapabilities caps = DesiredCapabilities.chrome();
//		caps.setPlatform(Platform.MAC);
//		ChromeOptions options = new ChromeOptions();
//		options.merge(caps);
		//DesiredCapabilities caps=null;
		//caps = DesiredCapabilities.chrome();
//		caps=DesiredCapabilities.chrome();
//		caps.setBrowserName("chrome");
//		caps.setPlatform(Platform.MAC);
		//driver=new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),options);
		//driver=new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),caps);
		
//		caps.setCapability("browser", "Firefox");
//	    caps.setCapability("browser_version", "60.0");
//	    caps.setCapability("os", "Windows");
//	    caps.setCapability("os_version", "7");
//	    caps.setCapability("resolution", "1024x768");
//	    caps.setCapability("project", "AutomationTalksProject");
//	    caps.setCapability("build", "Build1");
//	    caps.setCapability("name", "TestCaseName");
//	    caps.setCapability("name", "Bstack-[Java] Sample Test");

	     //driver = new RemoteWebDriver(new URL(URL), caps);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	@Test
	public void Test1() {
		driver.navigate().to("https://www.AutomationTalks.com");
		System.out.println("Test 1 title is:"+driver.getTitle());
		
	}
	@Test
public void Test2() {
		
	driver.navigate().to("https://www.AutomationTalks.com");
	System.out.println("Test 2 title is:"+driver.getTitle());
	}
	@Test
public void Test3() {
	driver.navigate().to("https://www.AutomationTalks.com");
	System.out.println("Test 3 title is:"+driver.getTitle());
	
}
	
	@AfterMethod
public void quit() {
	driver.quit();
}
}
