package com.testing.applewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MusicTab {

	public void musicTab(WebDriver driver) throws InterruptedException {
		if(driver!=null) {
		driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[7]/a")).click();
		}else {
			System.out.println("Driver null" + driver);
		}
		
		
		String actualTabTitle ="Music - Apple (IE)";
		String expectedTabTitile = "";
		actualTabTitle = driver.getTitle();
		expectedTabTitile = driver.getTitle();
		
		if(actualTabTitle.contentEquals(expectedTabTitile)) {
			System.out.println("Music Tab link clicked");
		} else {
			System.out.println("Nothing Found");
		}
		
		driver.navigate().back();
	}
}
