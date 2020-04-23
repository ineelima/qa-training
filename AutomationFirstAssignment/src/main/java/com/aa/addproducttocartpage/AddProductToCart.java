package com.aa.addproducttocartpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aa.base.BasePage;
import com.util.Locators;

public class AddProductToCart extends BasePage {
	public AddProductToCart(WebDriver driver) {
		super(driver);
	}

public void  addToCart(){ 
	Actions action = new Actions(driver);
	driver.findElement(By.xpath(Locators.ADDPRODUCTTOCART_PLUS_CLICK)).click();
	//click size and select L
	Select drpSize= new Select(driver.findElement(By.xpath(Locators.ADDPRODUCTTOCART_DRPBOX_ELEMENT1)));
	drpSize.selectByVisibleText("L");
	//select blue clolor
	WebElement color=driver.findElement(By.xpath(Locators.ADDPRODUCTTOCART_COLOR));
	action.click(color).build().perform();
	driver.findElement(By.name(Locators.ADDPRODUCTTOCART_SUBMIT)).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath(Locators.ADDPRODUCTTOCART_CHKOUT)).click();
	
}
}