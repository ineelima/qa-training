package com.aa.shippingpagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.basetest.BaseTest;
import com.aa.productdetailpage.ProductDetail;
import com.aa.shippingpage.Shipping;

public class ShippingTest extends BaseTest {
	public Shipping sh;
	
	@BeforeClass
	public void beforeClass() {
		sh=new Shipping(driver);

	}
	
	@Test
	public void testShipping() {
		sh.shipRequest();
		Assert.assertTrue(driver.getPageSource().contains("Please choose your payment method"));
	}
}
