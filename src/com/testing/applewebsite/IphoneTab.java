package com.testing.applewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IphoneTab {
	
	public void iPhoneTab(WebDriver driver) {
		if(driver!=null) {
		driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[4]/a")).click();
		}else {
			System.out.println("Driver null" + driver);
		}
		
		WebElement iphonelement = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/section[1]/div/div/div[1]/h5"));
		String iphoneText = iphonelement.getText();
		
		if(iphoneText.contains("The longest battery life ever in an iPhone.")) {
			System.out.println("iPhone Tab link clicked");
		} else {
			System.out.println("Nothing Found");
		}
		
		driver.navigate().back();
	}

}
