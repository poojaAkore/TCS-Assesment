package Assesment.Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyLOGO {

	 WebDriver driver;

	    @BeforeClass
	    public void setup() {
	       
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	    
	    @Test
	    public void VerifyLogo()
	    {
	    	Assert.assertTrue(driver.findElement(By.xpath("//*[@class='nav-2024__logo']/img")).isDisplayed());
	    }
	    @AfterClass
	    public void teardown() {
	        // Close the browser
	       
	            driver.quit();
	       
	    }
	
}
