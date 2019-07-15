package com.testing.applewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupportTab {

	public void supportTab(WebDriver driver) throws InterruptedException {
		if(driver!=null) {
		driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[8]/a")).click();
		}else {
			System.out.println("Driver null" + driver);
		}
		
		
		String actualTabTitle ="Official Apple Support";
		String expectedTabTitile = "";
		actualTabTitle = driver.getTitle();
		expectedTabTitile = driver.getTitle();
		
		if(actualTabTitle.contentEquals(expectedTabTitile)) {
			System.out.println("Support Tab link clicked");
		} else {
			System.out.println("Nothing Found");
		}
		
		driver.navigate().back();
	}
}
