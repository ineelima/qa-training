package com.aa.paymentoptionpagetest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.basetest.BaseTest;
import com.aa.paymentoptionpage.PaymentOption;
import com.aa.processaddresspage.ProcessAddress;

public class PaymentOptionTest extends BaseTest {
	public PaymentOption po;
	
	@BeforeClass
	public void beforeClass() {
		po=new PaymentOption(driver);
	}

@Test
public void testPaymentOption() {
	po.PayByBank();
	Assert.assertTrue(driver.getPageSource().contains("Bank-wire payment"));
}
}