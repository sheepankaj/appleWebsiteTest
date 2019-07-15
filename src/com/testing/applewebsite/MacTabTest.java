package com.testing.applewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MacTabTest {
	
	
	public void macTab(WebDriver driver) {
		if(driver!=null) {
		driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[2]/a")).click();
		//element.click();
		}else {
			System.out.println("Driver null" + driver);
		}
		
		WebElement macelement = driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/h3"));
		String macText = macelement.getText();
		
		if(macText.contains("Lightness strikes again.")) {
			System.out.println("Mac Tab link clicked");
		} else {
			System.out.println("Nothing Found");
		}
		
		driver.navigate().back();
	}


}
