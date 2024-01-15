package sel;


import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNotNull;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class Tc0015 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chrome\\chromedriver-win64\\chromedriver.exe");
	
		
		
        
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(options);
		
		
		
		
        
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		 options.addArguments("--remote-allow-origins=*");
		
		
		 
		
		
		//1) open url on the browser
		
		driver.get("http://demo.perscholastraining.com//");
		driver.manage().window().maximize();
		
		//delay
		Thread.sleep(1000);
		
		//2 Click on the search button without entering anything
		driver.findElement(By.id("search")).sendKeys("NULL");
		
		Thread.sleep(2000);
		
	//	JavaScript Clicker code to click on search button without entering anything
		WebElement myAccountButton = driver.findElement(By.xpath("//*[@id=\'masthead\']/div[1]/div[1]/form/div/div[3]/button/i"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", myAccountButton);
		
		
		Thread.sleep(2000);
		
		//driver.findElement(By.)
		
		
	
	//	WebElement myAccountButton2 = driver.findElement(By.xpath("//*[@id=\'masthead\']/div[1]/div[2]/div/div/form/div/div[3]/button/i"));
	//	executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", myAccountButton2);
		

		

		    
 	}

	}


