package com.aa.paymentoptionpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aa.base.BasePage;
import com.util.Locators;

public class PaymentOption extends BasePage {
	public PaymentOption(WebDriver driver) {
		super(driver);
	}
	
	public void PayByBank() {
		
		driver.findElement(By.xpath(Locators.PAYMENTOPTION)).click();
	}
}
