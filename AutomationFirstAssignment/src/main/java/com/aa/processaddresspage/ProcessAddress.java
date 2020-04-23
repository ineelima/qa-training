package com.aa.processaddresspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aa.base.BasePage;
import com.util.Locators;

public class ProcessAddress extends BasePage {
	
	public ProcessAddress(WebDriver driver) {
		super(driver);
	}
	public void processRequest() {
		driver.findElement(By.xpath(Locators.PROCESS_ADDRESS)).click();
	}
}
