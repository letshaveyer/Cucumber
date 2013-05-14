package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class OpenPLCWDBacked extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.co.uk/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testOpenPLCWDBacked() throws Exception {
		selenium.open("/#hl=en&sugexp=les%3B&gs_nf=3&cp=11&gs_id=i8&xhr=t&q=practical+law&pf=p&output=search&sclient=psy-ab&oq=practicalla&gs_l=&pbx=1&bav=on.2,or.r_gc.r_pw.r_qf.&fp=77d97114e097c10e&bpcl=38625945&biw=1280&bih=861");
		selenium.click("id=gbqfb");
		selenium.click("link=PLC Home UK - Practical Law Company");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=q", "tax");
		selenium.click("name=btnG");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
