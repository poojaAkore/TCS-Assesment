package Assesment.Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class VerifyLearnMoreButton {
	WebDriver driver;
	@BeforeClass
    public void setup() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jaguarlandrover.com/");
    }
	
	@Test
	public void VerifyLearnMoreButton() 
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//Click on learn link
		driver.findElement(By.xpath("//*[@id=\"block-jlr-corporate-2024-mainpagecontent\"]/div[1]/div/div/div[3]/div/div/div/div/div/div/a")).click();
		//verify the text on next page
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='hero__wrapper']/p[1]")).isDisplayed());
		
		
		
	}
	@AfterClass
    public void teardown() {
        // Close the browser
       
          driver.quit();
        }

}
