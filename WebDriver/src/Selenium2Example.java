

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2Example  {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
//    	WebDriver driver = new HtmlUnitDriver();
        WebDriver driver1 = new FirefoxDriver();
//        WebDriver driver2 = new InternetExplorerDriver();
//        WebDriver driver3 = new ChromeDriver();


        // And now use this to visit Google
//        driver1.get("http://www.google.com");
//        driver2.get("http://www.google.com");
        
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
//        WebElement element = driver1.findElement(By.name("q"));
//        element.sendKeys("Cheese!");
//        element.submit();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("START TEST");
        System.out.println("-------------------------------------------------------------------------");
        driver1.get("http://www.jobserve.com");
        System.out.println("Page title is: " + driver1.getTitle());
        driver1.findElement(By.xpath(".//*[@id='ddcl-selInd']/span")).click();
        System.out.println("'Industry's' listbox clicked");
        driver1.findElement(By.xpath(".//*[@id='ddcl-selInd-i0']")).click();
        System.out.println("All industries selected");
        driver1.findElement(By.xpath(".//*[@id='txtKey']")).sendKeys("QTP");
        
        driver1.findElement(By.xpath(".//*[@id='btnSearch']")).click();
        System.out.println("'Search' Clicked");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("END TEST");
        System.out.println("-------------------------------------------------------------------------");
     // Enter something to search for
        
//        element2.sendKeys("QTP");
//        element2.submit();
//        "".//*[@id='btnSearch']"
//        element1.sendKeys("Cheese!");
        
//        WebElement element2 = driver2.findElement(By.name("q"));


//
//       // Now submit the form. WebDriver will find the form for us from the element
//        element.submit();
//        element1.submit();
//
//        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());
//        
//        // Google's search is rendered dynamically with JavaScript.
//        // Wait for the page to load, timeout after 10 seconds
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        });
//
//        // Should see: "cheese! - Google Search"
//        System.out.println("Page title is: " + driver.getTitle());
//        
        //Close the browser
//        driver.quit();
    }
}
