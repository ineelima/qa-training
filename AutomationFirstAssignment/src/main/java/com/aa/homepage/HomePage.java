package com.aa.homepage;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	import com.aa.base.BasePage;
import com.util.Configuration;
import com.util.Locators;

	public class HomePage extends BasePage{
		String loginLink="login";
		
		public HomePage(WebDriver driver) {
			super(driver);
			
		}

		public void openpage() {
//			driver.get("http://automationpractice.com/index.php");
			driver.get(Configuration.URL);
			driver.manage().window().maximize();
		}
		
		public String loginClick() {
			driver.findElement(By.xpath(Locators.HOMEPAGE_LOGIN)).click();
			return driver.getCurrentUrl();
		}
}
	
	