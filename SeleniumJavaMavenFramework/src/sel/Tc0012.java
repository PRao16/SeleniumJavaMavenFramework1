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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class Tc0012 {

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
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\'menu-item-5472\']/a"));
		
		//2//JavaScript Clicker code to click on Hom page.
		WebElement myAccountButton = driver.findElement(By.xpath("//*[@id=\'menu-item-5472\']/a"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", myAccountButton);
		
		
		
		//JavaScript Clicker code to click on a specific product
	//	WebElement myAccountButton = driver.findElement(By.xpath("//div[@class='product-loop-header product-item__header']//h2[@class='woocommerce-loop-product__title'][contains(text(),'Tablet Red EliteBook')]"));
	//	JavascriptExecutor executor = (JavascriptExecutor) driver;
	//	executor.executeScript("arguments[0].click();", myAccountButton);
		// Enter 2 items 
	//	WebElement quantityInput = driver.findElement(By.name("quantity"));
	//	quantityInput.clear();
	//	quantityInput.sendKeys("2"); // You can set any desired quantity
		
		//Click after entering n items
	//	WebElement myAccountButton2 = driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
	//	executor = (JavascriptExecutor) driver;
	//	executor.executeScript("arguments[0].click();", myAccountButton2);
		//Thread.sleep(1000);
		//JavaScript Clicker code to click on view cart
			//	WebElement myAccountButton3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/a"));
			//	executor = (JavascriptExecutor) driver;
			//	executor.executeScript("arguments[0].click();", myAccountButton3);
				
				
//click on proceed to checkout button
				
			//	WebElement myAccountButton4 = driver.findElement(By.xpath("//*[@id=\'post-7\']/div/div/form/table/tbody/tr[2]/td/div/a"));
			//	executor = (JavascriptExecutor) driver;
			//executor.executeScript("arguments[0].click();", myAccountButton4);
				
			//	Enter Billing Details
				
				driver.findElement(By.id("billing_first_name")).sendKeys("dummy");
				driver.findElement(By.id("billing_last_name")).sendKeys("dummy");
				driver.findElement(By.id("billing_company")).sendKeys("dummy");
				//driver.findElement(By.id("select2-billing_country-container")).sendKeys("dummy");
				//driver.findElement(By.id("billing_address_1")).sendKeys("US");
				driver.findElement(By.id("billing_address_2")).sendKeys("dummy");
				
				driver.findElement(By.id("billing_city")).sendKeys("dummy");
				
				driver.findElement(By.id("select2-billing_state-container")).sendKeys("dummy");
				driver.findElement(By.id("billing_postcode")).sendKeys("dummy");
				driver.findElement(By.id("billing_phone")).sendKeys("dummy");
				
				driver.findElement(By.id("billing_email")).sendKeys("dummy");
				
			
				
		/*		
				//click on proceed to checkout button
				
				WebElement myAccountButton4 = driver.findElement(By.xpath("//*[@id=\'post-7\']/div/div/form/table/tbody/tr[2]/td/div/a"));
				executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", myAccountButton4);
			
			
			//	Enter Billing Details
			
			driver.findElement(By.id("billing_first_name")).sendKeys("dummy");
			driver.findElement(By.id("billing_last_name")).sendKeys("dummy");
			driver.findElement(By.id("billing_company")).sendKeys("dummy");
			driver.findElement(By.id("select2-billing_country-container")).sendKeys("dummy");
			driver.findElement(By.id("billing_address_1")).sendKeys("US");
			driver.findElement(By.id("billing_address_2")).sendKeys("dummy");
			
			driver.findElement(By.id("billing_city")).sendKeys("dummy");
			
			//driver.findElement(By.id("select2-billing_state-container")).sendKeys("dummy");
			driver.findElement(By.id("billing_postcode")).sendKeys("dummy");
			driver.findElement(By.id("billing_phone")).sendKeys("dummy");
			
			driver.findElement(By.id("billing_email")).sendKeys("dummy");
			
			
			
				
			//	boolean CDcarddisplayed	=driver.findElement(By.xpath("//*[@id=\'payment\']/ul/li/label/img")).isDisplayed();
				
				
			 	//Printing if it truly happened or not
			 //	if(CDcarddisplayed) {
			 	//	System.out.println("Cedit/Debit card option is displayed");
			 //	}
			 //	else {
			 //		System.out.println("Cedit/Debit card option is not displayed");
			 //	}
				
			//	Thread.sleep(3000);
				//JavaScript Clicker code to click on delete items button
				//WebElement myAccountButton4 = driver.findElement(By.xpath("//*[@id='payment']/ul/li/label"));
			//	executor = (JavascriptExecutor) driver;
			//	executor.executeScript("arguments[0].click();", myAccountButton4);
				
				
			//	boolean EmptyCardDisplayed	=driver.findElement(By.xpath("//*[@id='post-7']/div/div/div/div[1]")).isDisplayed();
				
				
			 	//Printing if it truly happened or not
			 //	if(EmptyCardDisplayed) {
			 //		System.out.println("Your Cart is empty displayed");
			 //	}
			 //	else {
			 //		System.out.println("Your Cart is empty is not displayed");
			 //	}
	*/			
			
		
 
 	
		
		
		

		

		    
 	}

	}


