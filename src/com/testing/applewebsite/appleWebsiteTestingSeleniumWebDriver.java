package com.testing.applewebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class appleWebsiteTestingSeleniumWebDriver {
	
		public static WebDriver driver;		
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mackbookpankaj/eclipse-workspace/ChromeWebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		UrlLaunchAndClose urlLnC = new UrlLaunchAndClose();
		HomePageTab homeTab = new HomePageTab();
		MacTabTest macTest = new MacTabTest();
		IpadTab iPadTest = new IpadTab();
		IphoneTab iphoneTab = new IphoneTab();
		WatchTab watch = new WatchTab();
		
		
		urlLnC.UrlLaunch(driver);
		homeTab.AppleTradeIn(driver);
		macTest.macTab(driver);
		iPadTest.iPadTab(driver);
		iphoneTab.iPhoneTab(driver);
		watch.watchTab(driver);
		
		homeTab.ScrollHomePage(driver);
		urlLnC.UrlClose(driver);
		Thread.sleep(1000);
		

	}

}
