package com.aa.shippingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aa.base.BasePage;
import com.util.Locators;

public class Shipping extends BasePage {
	
	public Shipping(WebDriver driver) {
		super(driver);
	}
	public void shipRequest() {
		driver.findElement(By.xpath(Locators.SHIPPING_CHKBOX)).click();
		   
        driver.findElement(By.xpath(Locators.SHIPPING_CHKOUT)).click();
	}
}
