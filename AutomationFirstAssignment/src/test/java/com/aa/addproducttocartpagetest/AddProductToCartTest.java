package com.aa.addproducttocartpagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.addproducttocartpage.AddProductToCart;
import com.aa.basetest.BaseTest;

public class AddProductToCartTest extends BaseTest {
	public AddProductToCart apc;
	
	@BeforeClass
	public void beforeClass() {
		apc=new AddProductToCart(driver);
	}
	@Test
	public void testAddProductToCart() {
		apc.addToCart();
		Assert.assertTrue(driver.getPageSource().contains("Product successfully added to your shopping cart"));	
		
		Assert.assertTrue(driver.getPageSource().contains("Shopping-cart summary"));
	}
}
