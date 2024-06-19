package Assesment.Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyhomepageloadTitle {

	
	    WebDriver driver;

	    @BeforeClass
	    public void setup() {
	       
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @Test
	    public void testHomePageLoadAndTitle() {
	        // Navigate to the JLR corporate website
	        driver.get("https://www.jaguarlandrover.com/");
	        
	        // Verify the title of the homepage
	        String expectedTitle = "JLR Corporate Website";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Homepage title does not match");
	    }
	    

	    @AfterClass
	    public void teardown() {
	        // Close the browser
	       
	            driver.quit();
	       
	    }
	}


