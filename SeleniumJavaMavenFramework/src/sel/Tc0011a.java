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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class Tc0011a {

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
		//Thread.sleep(3000);
		
		//2)Click on My Account Button from header@Test
		
		//JavaScript Clicker code to click on a specific product
		WebElement myAccountButton = driver.findElement(By.xpath("//div[@class='product-loop-header product-item__header']//h2[@class='woocommerce-loop-product__title'][contains(text(),'Tablet Red EliteBook')]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", myAccountButton);
		// Enter 2 items 
		WebElement quantityInput = driver.findElement(By.name("quantity"));
		quantityInput.clear();
		quantityInput.sendKeys("2"); // You can set any desired quantity
		
		//Click after entering n items
		WebElement myAccountButton2 = driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", myAccountButton2);
		//Thread.sleep(1000);
		//JavaScript Clicker code to click on view cart
				WebElement myAccountButton3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/a"));
				executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", myAccountButton3);
				
				
//click on proceed to checkout button
				
				WebElement myAccountButton4 = driver.findElement(By.xpath("//*[@id=\'post-7\']/div/div/form/table/tbody/tr[2]/td/div/a"));
				executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", myAccountButton4);
			
			// Reaching credit card details using iframes
			
		/*	// Assuming you have an iframe with id 'firstFrameId' containing another iframe with id 'secondFrameId'
			WebElement firstFrame = driver.findElement(By.name("__privateStripeFrame3466"));
			driver.switchTo().frame(firstFrame);

			WebElement secondFrame = driver.findElement(By.id("__privateStripeController3461"));
			
		*/	
			
			
		//	driver.switchTo().frame("__privateStripeController3461");
		//	driver.switchTo().frame("__privateStripeFrame3466");
			
		//	driver.findElement(By.name("number")).click();
		//	driver.findElement(By.name("number")).sendKeys("12");

			// Perform actions inside the second iframe
			//WebElement elementInsideSecondFrame = driver.findElement(By.id("elementInsideSecondFrameId"));
			
			
			//elementInsideSecondFrame.click();

			// Switch back to the default content
		//	driver.switchTo().defaultContent();

			// Perform additional actions outside the iframes

		
			
				
			//	Enter Billing Details
				
				driver.findElement(By.id("billing_first_name")).sendKeys("dummy");
				driver.findElement(By.id("billing_last_name")).sendKeys("dummy");
				driver.findElement(By.id("billing_company")).sendKeys("dummy");
				WebElement countryelement = driver.findElement(By.id("billing_country"));
				Select countrydropdown = new Select(countryelement);
				countrydropdown.selectByValue("US");
				
				//driver.findElement(By.id("select2-billing_country-container")).sendKeys("dummy");
				//driver.findElement(By.id("billing_address_1")).sendKeys("US");
				driver.findElement(By.id("billing_address_1")).sendKeys("123 wood Lane");
				
				driver.findElement(By.id("billing_city")).sendKeys("North Richland Hills");
				
				WebElement stateelement = driver.findElement(By.id("billing_state"));
				Select statedropdown = new Select(stateelement);
				 statedropdown.selectByVisibleText("Texas");
				//driver.findElement(By.id("select2-billing_state-container")).sendKeys("dummy");
				driver.findElement(By.id("billing_postcode")).sendKeys("76182");
				driver.findElement(By.id("billing_phone")).sendKeys("817 263 7500");
				driver.findElement(By.id("billing_email")).sendKeys("dummy@gmail.com");
				driver.findElement(By.id("order_comments")).sendKeys("order notes");
				//driver.findElement(By.id("billing_email")).sendKeys("dummy");
				
				Thread.sleep(2000);
				//Access iframe credit card order
				
				//driver.switchTo().frame(0);
				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"wc-woocommerce_payments-upe-form\"]/div/div/iframe")));
				//String number =driver.findElement(By.xpath("//*[@id=\"Field-numberInput\"]")).getText();
				//System.out.println(number);
				driver.findElement(By.name("expiry")).sendKeys("05/26");
				driver.findElement(By.name("cvc")).sendKeys("222");
				driver.findElement(By.name("number")).sendKeys("4242424242424242");
				
				driver.switchTo().defaultContent();
				Thread.sleep(1000);
				//click on Terms and conditions
				driver.findElement(By.id("terms")).click();
				driver.findElement(By.id("place_order")).click();
				
			
				//click on proceed to checkout button
				
			//WebElement myAccountButton5 = driver.findElement(By.id("terms"));
			//executor = (JavascriptExecutor) driver;
		//	executor.executeScript("arguments[0].click();", myAccountButton5);
			
			
			//	Enter Billing Details
			
		//	driver.findElement(By.id("billing_first_name")).sendKeys("dummy");
		//	driver.findElement(By.id("billing_last_name")).sendKeys("dummy");
		//	driver.findElement(By.id("billing_company")).sendKeys("dummy");
		//	driver.findElement(By.id("select2-billing_country-container")).sendKeys("dummy");
		//	driver.findElement(By.id("billing_address_1")).sendKeys("US");
		//	driver.findElement(By.id("billing_address_2")).sendKeys("dummy");
			
		//	driver.findElement(By.id("billing_city")).sendKeys("dummy");
			
			//driver.findElement(By.id("select2-billing_state-container")).sendKeys("dummy");
		//	driver.findElement(By.id("billing_postcode")).sendKeys("dummy");
		//	driver.findElement(By.id("billing_phone")).sendKeys("dummy");
			
		//	driver.findElement(By.id("billing_email")).sendKeys("dummy");
			
			
			
				
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
			
			
		
 
 	
		
		
		

		
	}
		    
 	}

	


