package Assesment.Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyDropdowns {
	WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
        driver.get("https://www.jaguarlandrover.com/");
	}
	@Test
	public void VerifyCompanyDropdown()
	{
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[3]/div[1]/div[1]/div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[3]/div[1]/div[2]/div/div[1]/a")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"block-jlr-corporate-2024-mainpagecontent\"]/div[1]/div/div/div[2]/div/div/div[1]/div/button[1]")).isDisplayed());
	}
	@Test
	public void VerifyNewsDropdown()
	{
		driver.findElement(By.xpath("//*[@class='nav-2024__item-wrap nav-2024__item-wrap--right']/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[4]/div[3]/div[2]/div/div[1]/a")).click();
		//click on latest news
		driver.findElement(By.xpath("//*[@class='flex-row']/div[2]/div/a")).click();
		//scrolldown the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		//verify text
		Assert.assertTrue(driver.findElement(By.xpath("//*[@class='page-title text-center heading h3']")).isDisplayed());
		
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
}
