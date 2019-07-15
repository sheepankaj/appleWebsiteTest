package com.testing.applewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IpadTab {

	public void iPadTab(WebDriver driver) {
		if(driver!=null) {
		driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[3]/a")).click();
		}else {
			System.out.println("Driver null" + driver);
		}
		
		WebElement macelement = driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div/h2"));
		String ipadText = macelement.getText();
		
		if(ipadText.contains("Welcome to the")) {
			System.out.println("iPad Tab link clicked");
		} else {
			System.out.println("Nothing Found");
		}
		
		driver.navigate().back();
	}


}
