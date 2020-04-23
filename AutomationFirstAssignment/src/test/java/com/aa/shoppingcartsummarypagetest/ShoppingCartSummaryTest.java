package com.aa.shoppingcartsummarypagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.basetest.BaseTest;
import com.aa.shoppingcartsummarypage.ShoppingCartSummary;


public class ShoppingCartSummaryTest extends BaseTest {
	public ShoppingCartSummary scs;
	
	@BeforeClass
	public void beforeClass() {
	scs=new ShoppingCartSummary(driver);
	}
	
	
	@Test
	public void testShoppingCartSummary() {
		scs.shopCartSummary();
		Assert.assertTrue(driver.getPageSource().contains("Addresses"));
	}

}
