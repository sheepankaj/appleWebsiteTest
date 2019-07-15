package com.testing.applewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageTab {
	
public void ScrollHomePage(WebDriver driver) {
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,3250)", "");
		WebElement scroll = driver.findElement(By.className("ac-gf-footer-legal-copyright"));
		String ScrollText = scroll.getText();
		
		if(ScrollText.contains("Copyright © 2019 Apple Inc. All rights reserved.")) {
			System.out.println("Page Scroll down and end text is: "+ScrollText);
		} else {
			System.out.println("Nothing happened");
		}
		
	}
	public void AppleTradeIn(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/a")).click();
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,3250)", "");
		
		
		WebElement appleTrade = driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/div[1]/h2"));
		String appleText = appleTrade.getText();
		
		if(appleText.contains("Turn the device you have into the one you want.")) {
			System.out.println("Apple Trade In page is displayed");
		}else {
			System.out.println("Nothing found");
		}
		driver.navigate().back();
	}

}
