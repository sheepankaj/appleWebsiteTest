package com.testing.applewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WatchTab {

	public void watchTab(WebDriver driver) throws InterruptedException {
		if(driver!=null) {
		driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[5]/a")).click();
		}else {
			System.out.println("Driver null" + driver);
		}
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,2000)", "");
		
		Thread.sleep(500);
		WebElement watchelement = driver.findElement(By.xpath("//*[@id=\"main\"]/section[3]/div/div/div[1]/h3[1]"));
		String watchText = watchelement.getText();
		
		if(watchText.equals("watchOS 6")) {
			System.out.println("Watch Tab link clicked");
		} else {
			System.out.println("Nothing Found");
		}
		
		driver.navigate().back();
	}
}
