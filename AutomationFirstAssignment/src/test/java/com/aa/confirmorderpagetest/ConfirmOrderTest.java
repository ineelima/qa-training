package com.aa.confirmorderpagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.basetest.BaseTest;
import com.aa.confirmorderpage.ConfirmOrder;

public class ConfirmOrderTest extends BaseTest {
	public ConfirmOrder co;
	@BeforeClass
	public void beforeClass() {
	co=new ConfirmOrder(driver);
	}
	@Test
	public void testConfirmOrder() {
		co.confirmOrder();
//		Assert.assertTrue(false);
		Assert.assertTrue(driver.getPageSource().contains("Your order on My Store is complete."));
	}
}
