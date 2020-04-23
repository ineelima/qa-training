package com.aa.processaddresspagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.basetest.BaseTest;
import com.aa.processaddresspage.ProcessAddress;
import com.aa.productdetailpage.ProductDetail;

public class ProcessAddressTest  extends BaseTest {
		public ProcessAddress pa;
		
		@BeforeClass
		public void beforeClass() {
			pa=new ProcessAddress(driver);
		}
	
	@Test
	public void testProcessAddress() {
		pa.processRequest();
		Assert.assertTrue(driver.getPageSource().contains("Shipping"));
	}
}

