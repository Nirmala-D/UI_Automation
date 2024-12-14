package testcases_Dashboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;;

public class TC_016 extends BaseClass{
  @Test
  public void TC_016() {
	  
	  Login();
	  
	    // click on profile option
	  driver.findElement(By.xpath("(//p[@class='_1hx0zhz'][normalize-space()='Profile'])[1]")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  // click on Admin mode link
	  driver.findElement(By.xpath("//p[normalize-space()='Admin mode']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	  
	  // click on sort/filer
	  driver.findElement(By.xpath("//div[@class=\"_c77kua\"]")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  // click on Recurrence (YEAR)filter
	  WebElement inputElement = driver.findElement(By.xpath("//input[@placeholder=\"Recurrence\"]"));
    inputElement.sendKeys("YEAR");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	   // click on apply button
	   driver.findElement(By.xpath("//p[@class='_1yanunz'][1]")).click();
	  
	  WebElement RecurrenceYEAR = driver.findElement(By.xpath("//div[@class=\"_13hqe44\"][1]"));
	  Assert.assertEquals(RecurrenceYEAR.isDisplayed(), true);
  }
}