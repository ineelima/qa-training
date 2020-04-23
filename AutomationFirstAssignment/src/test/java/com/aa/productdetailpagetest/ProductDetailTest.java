package com.aa.productdetailpagetest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.basetest.BaseTest;
import com.aa.homepage.HomePage;
import com.aa.productdetailpage.ProductDetail;

public class ProductDetailTest extends BaseTest {
	ProductDetail pd;
	
	@BeforeClass
	public void beforeClass() {
		pd=new ProductDetail(driver);
	}
	@Test
	public void testProductDetail() {
		pd.shopProduct();
		String pdTitle=driver.getTitle();
		System.out.println(pdTitle);
		assertEquals(pdTitle,"Faded Short Sleeve T-shirts - My Store");
		//sh.shopTShirt();
	}
}
