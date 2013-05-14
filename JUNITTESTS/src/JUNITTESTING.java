package com.example.tests;
   
   import com.thoughtworks.selenium.Selenium;
   import org.openqa.selenium.*;
   import org.openqa.selenium.htmlunit.*;
   import org.openqa.selenium.firefox.*;
   import org.openqa.selenium.chrome.*;
   import org.openqa.selenium.ie.*;
   import org.junit.*;
   import static org.junit.Assert.*;
   
   public class Untitled {
    
       WebDriver driver;
       Selenium selenium;
    
       @Before
       public void startSelenium() {
           driver = new FirefoxDriver();
           selenium = new WebDriverBackedSelenium(driver, "http://www.kaz.com.bd/");
       }
    
       @After
       public void stopSelenium() {
           driver.close();
       }
    
       @Test
       public void testUntitled() {
           selenium.open("/");
           selenium.click("link=Home");
           selenium.waitForPageToLoad("30000");
           selenium.click("link=Talents");
           selenium.waitForPageToLoad("30000");
           selenium.click("link=Culture");
           selenium.waitForPageToLoad("30000");
           selenium.click("link=Contact");
           selenium.waitForPageToLoad("30000");
      }
  
   }