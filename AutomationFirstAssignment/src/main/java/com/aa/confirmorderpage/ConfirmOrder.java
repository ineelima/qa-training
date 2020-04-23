package com.aa.confirmorderpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aa.base.BasePage;
import com.util.Locators;

public class ConfirmOrder extends BasePage {
	public ConfirmOrder(WebDriver driver) {
		super(driver);
	}
	
	public void confirmOrder() {
		driver.findElement(By.xpath(Locators.CONFIRM_ORDER)).click();
        
	}
}
