package com.aa.shoppingcartsummarypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aa.base.BasePage;
import com.util.Locators;

public class ShoppingCartSummary extends BasePage{
	public ShoppingCartSummary(WebDriver driver) {
		super(driver);
	}
	
	
	public void shopCartSummary() {
	driver.findElement(By.xpath(Locators.SHOPPING_CART_SUMMARY)).click();
	}
}
