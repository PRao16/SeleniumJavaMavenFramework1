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


public class Tc11 {

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
		
		//JavaScript Clicker code to click on view cart
				WebElement myAccountButton3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/a"));
				executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", myAccountButton3);
				
				
				//click on proceed to checkout button
				
				WebElement myAccountButton4 = driver.findElement(By.xpath("//*[@id=\'post-7\']/div/div/form/table/tbody/tr[2]/td/div/a"));
				executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", myAccountButton4);
				
				boolean CDcarddisplayed	=driver.findElement(By.xpath("//*[@id=\'payment\']/ul/li/label/img")).isDisplayed();
				
				
			 	//Printing if it truly happened or not
			 	if(CDcarddisplayed) {
			 		System.out.println("Cedit/Debit card option is displayed");
			 	}
			 	else {
			 		System.out.println("Cedit/Debit card option is not displayed");
			 	}
				
				Thread.sleep(1000);

				
				driver.switchTo().frame("__privateStripeFrame7496");
				driver.findElement(By.id("Field-numberInput")).click();
				driver.findElement(By.name("cvc")).sendKeys("222");
				driver.findElement(By.id("Field-numberInput")).sendKeys("2");
				
				
		

		

		    
 	}

	}


