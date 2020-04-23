package com.aa.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aa.base.BasePage;
import com.util.Locators;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public boolean performLogin(String userName, String password) {

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(userName);

		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys(password);

//		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath(Locators.LOGINPAGE_SUBMIT)).click();

		return driver.findElement(By.xpath(Locators.LOGINPAGE_LOGOUT)).isDisplayed();
	}
}
