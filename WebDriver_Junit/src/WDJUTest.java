import static org.junit.Assert.fail;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WDJUTest {
	
		@Test
		public void Test1(){
			WebDriver driver1 = new FirefoxDriver();
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
	        System.out.println("'QTP' tesxt entered into keywords field");
	        driver1.findElement(By.xpath(".//*[@id='btnSearch']")).click();
	        System.out.println("'Search' Clicked");
	        System.out.println("-------------------------------------------------------------------------");
	        System.out.println("END TEST");
	        System.out.println("-------------------------------------------------------------------------");
			System.out.println("Message Test 1");
		}
		@Test
		public void Test2(){
			System.out.println("Message Test 2");
			fail("Fail test");
		}
		@Test
		public void Test3(){
			System.out.println("Message Test 3");
		}
		@Test
		public void Test4(){
			System.out.println("Message Test 4");
		}
}



