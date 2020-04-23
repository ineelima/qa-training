package com.aa.basetest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.addproducttocartpage.AddProductToCart;
import com.aa.confirmorderpage.ConfirmOrder;
import com.aa.homepage.HomePage;
import com.aa.loginPage.LoginPage;
import com.aa.paymentoptionpage.PaymentOption;
import com.aa.processaddresspage.ProcessAddress;
import com.aa.productdetailpage.ProductDetail;
import com.aa.shippingpage.Shipping;
import com.aa.shoppingcartsummarypage.ShoppingCartSummary;
import com.aa.shoppingpage.Shopping;
import com.util.Locators;

public class OneTestForAll extends BaseTest {
	public HomePage hp;
	public LoginPage lp;
	//public Shopping sh;
	public ProductDetail pd;
	public AddProductToCart apc;
	public ShoppingCartSummary scs;
	public ProcessAddress pa;
	public Shipping sh;
	public PaymentOption po;
	public ConfirmOrder co;

	@BeforeClass
	public void beforeClass() {
		hp = new HomePage(driver);
		lp=new LoginPage(driver);
		pd=new ProductDetail(driver);
		apc=new AddProductToCart(driver);
		scs=new ShoppingCartSummary(driver);
		pa=new ProcessAddress(driver);
		sh=new Shipping(driver);
		po=new PaymentOption(driver);
		co=new ConfirmOrder(driver);
	}

	@Test(priority=1)
	public void testLoginClick() {
		hp.openpage();
		hp.loginClick();
		assertEquals(hp.loginClick(), "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@Test(priority=2)
	public void testLogin() {
		assertTrue(lp.performLogin("training.qaprep@gmail.com","Testing123"));
	}
	
	@Test(priority=3)
	public void testAddToCart() {
		pd.shopProduct();
		String pdTitle=driver.getTitle();
		System.out.println(pdTitle);
		assertEquals(pdTitle,"Faded Short Sleeve T-shirts - My Store");
		//sh.shopTShirt();
	}
	@Test(priority=4)
	public void testAddProductToCart() {
		apc.addToCart();
		Assert.assertTrue(driver.getPageSource().contains("Product successfully added to your shopping cart"));	
		
		Assert.assertTrue(driver.getPageSource().contains("Shopping-cart summary"));
	}
	
	@Test(priority=5)
	public void testShoppingCartSummary() {
		scs.shopCartSummary();
		Assert.assertTrue(driver.getPageSource().contains("Addresses"));
	}
	
	@Test(priority=6)
	public void testProcessAddress() {
		pa.processRequest();
		Assert.assertTrue(driver.getPageSource().contains("Shipping"));
	}
	@Test(priority=7)
	public void testShipping() {
		sh.shipRequest();
		Assert.assertTrue(driver.getPageSource().contains("Please choose your payment method"));
	}
	@Test(priority=8)
	public void testPaymentOption() {
		po.PayByBank();
		Assert.assertTrue(driver.getPageSource().contains("Bank-wire payment"));
	}
	@Test(priority=9)
	public void testConfirmOrder() {
		co.confirmOrder();
//		Assert.assertTrue(false);
		Assert.assertTrue(driver.getPageSource().contains("Your order on My Store is complete."));
	}
}
