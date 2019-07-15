package com.testing.applewebsite;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UrlLaunchAndClose {

public void UrlLaunch(WebDriver driver) {
		
		driver.get("https://www.apple.com/ie/");
		
		WebElement launch_page = driver.findElement(By.id("ac-gn-firstfocus"));
			String launch_text = launch_page.getText();
			
			if(launch_text.contains("Apple")) {
				System.out.println("apple website is displayed");
			} else {
				System.out.println("Nothing found");
			}
	}

public void UrlClose(WebDriver driver) {
	driver.close();
}
}
