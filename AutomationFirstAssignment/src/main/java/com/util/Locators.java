package com.util;

import java.io.*;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static String HOMEPAGE_LOGIN;
	public static String LOGINPAGE_SUBMIT;
	public static String LOGINPAGE_LOGOUT;
	
	public static String PRODUCT_DETAIL;
	public static String PRODUCT_DETAIL_SELECT_TSHIRT;
	public static String PRODUCT_DETAIL_SELECT_MORE;
	public static String PRODUCT_DETAIL_MORE;
	public static String PRODUCT_DETAIL_MORE_CLICK;
	
	public static String ADDPRODUCTTOCART_PLUS_CLICK;
	public static String ADDPRODUCTTOCART_DRPBOX_ELEMENT1;
	public static String ADDPRODUCTTOCART_COLOR;
	public static String ADDPRODUCTTOCART_SUBMIT;
	public static String ADDPRODUCTTOCART_CHKOUT;
	
	public static String SHOPPING_CART_SUMMARY;
	
	public static String PROCESS_ADDRESS;
	
	public static String SHIPPING_CHKBOX;
	public static String SHIPPING_CHKOUT;
	public static String PAYMENTOPTION;
	public static String CONFIRM_ORDER;

	private static final String PROPERTIES_FILE = "src/test/resources/locators.properties";

	static {
		readproperties();
	}

	private static void readproperties() {

		Properties prop = new Properties();
		try {
			FileReader fr = new FileReader(new File(PROPERTIES_FILE));
			prop.load(fr);

			HOMEPAGE_LOGIN = prop.getProperty("home_page.login");
			LOGINPAGE_SUBMIT = prop.getProperty("login_page.submit");
			LOGINPAGE_LOGOUT = prop.getProperty("login_page.logout");
			
			PRODUCT_DETAIL=prop.getProperty("product_detail.mousehoverwomen");
			PRODUCT_DETAIL_SELECT_TSHIRT=prop.getProperty("product_detail.selecttshirt");
			PRODUCT_DETAIL_SELECT_MORE=prop.getProperty("product_detail.selectmore");
			PRODUCT_DETAIL_MORE=prop.getProperty("product_detail.more");
			PRODUCT_DETAIL_MORE_CLICK=prop.getProperty("product_detail.more_click");
			
			ADDPRODUCTTOCART_PLUS_CLICK=prop.getProperty("addproducttocart.plus_click");
			ADDPRODUCTTOCART_DRPBOX_ELEMENT1=prop.getProperty("addproducttocart.drpbox_element1");
			ADDPRODUCTTOCART_COLOR=prop.getProperty("addproducttocart.color");
			ADDPRODUCTTOCART_SUBMIT=prop.getProperty("addproducttocart.submit");
			ADDPRODUCTTOCART_CHKOUT=prop.getProperty("addproducttocart.chkout");
			
			SHOPPING_CART_SUMMARY=prop.getProperty("shoppingcartsummary.chkout");
			
			PROCESS_ADDRESS=prop.getProperty("processaddress.request");
			
			SHIPPING_CHKBOX=prop.getProperty("shipping.checked");
			SHIPPING_CHKOUT=prop.getProperty("shipping.chkout");
			PAYMENTOPTION=prop.getProperty("paymentoption.paybybank");
			CONFIRM_ORDER=prop.getProperty("confirmorder.confirm");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// WebDriver driver;
//
//	static HashMap<String, String > locators;
//	public static void  readLocators()
//	{
//		Properties prop;
//		FileReader fr;
//		locators=new HashMap<String, String >();
//		try {
//			fr=new FileReader(new File("locators.php"));
//			prop.load(fr);
//			for (Map.Entry val:prop.entrySet()) {			
//				String key=(String)val.getKey();
//				String value=(String)val.getValue();
//				locators.put(key, value);
//			    }
//		    }catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e ) 
//		{
//			e.printStackTrace();}	
//		}
//		
//		public String loginClick() {
//			driver.findElement(By.className("loginLink"));
//			return driver.getCurrentUrl();
//		}
//
//
//		public static By get(String loc) {
//			// TODO Auto-generated method stub
//			return null;
//		}

}
