package com.aa.productdetailpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aa.base.BasePage;
import com.util.Locators;

public class ProductDetail extends BasePage {
	
	public ProductDetail(WebDriver driver) {
		super(driver);
	}

public void  shopProduct(){ 
	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.xpath(Locators.PRODUCT_DETAIL));
	action.moveToElement(we).build().perform();
	//clicking t-shirt
	driver.findElement(By.xpath(Locators.PRODUCT_DETAIL_SELECT_TSHIRT)).click();
	
	driver.findElement(By.xpath(Locators.PRODUCT_DETAIL_SELECT_MORE)).isSelected();
	//click on more
	WebElement we1=driver.findElement(By.xpath(Locators.PRODUCT_DETAIL_MORE));
	action.moveToElement(we1).build().perform();
	driver.findElement(By.xpath(Locators.PRODUCT_DETAIL_MORE_CLICK)).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}