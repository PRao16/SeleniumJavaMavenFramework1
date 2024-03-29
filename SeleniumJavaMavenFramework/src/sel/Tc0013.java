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


public class Tc0013 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chrome\\chromedriver-win64\\chromedriver.exe");
	
		
		
        
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(options);
		
		
		
		
        
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		 options.addArguments("--remote-allow-origins=*");
		
		
		 
		
		
		//1) open url on the browser
		
		driver.get("http://demo.perscholastraining.com//");
		driver.manage().window().maximize();
		
		boolean Homedisplayed	=driver.findElement(By.xpath("//*[@id='menu-item-5472']/a")).isDisplayed();	
		boolean Aboutdisplayed	=driver.findElement(By.xpath("//*[@id=\'menu-item-5475\']/a")).isDisplayed();	
		boolean Shopdisplayed	=driver.findElement(By.xpath("//*[@id=\'menu-item-5474\']/a")).isDisplayed();	
		boolean TrendingStylesdisplayed	=driver.findElement(By.xpath("//*[@id=\'menu-item-4151\']/a")).isDisplayed();
		boolean Comparedisplayed	=driver.findElement(By.xpath("//*[@id=\'menu-item-5479\']/a")).isDisplayed();	
		boolean Contactusdisplayed	=driver.findElement(By.xpath("//*[@id=\'menu-item-5482\']/a")).isDisplayed();
		boolean Faqdisplayed	=driver.findElement(By.xpath("//*[@id=\'menu-item-5480\']/a")).isDisplayed();	
		boolean Conditionsdisplayed	=driver.findElement(By.xpath("//*[@id=\'menu-item-5483\']/a")).isDisplayed();
		boolean Wishlistdisplayed	=driver.findElement(By.xpath("//*[@id=\'menu-item-5484\']/a")).isDisplayed();	
		
		if (Homedisplayed && Aboutdisplayed && Shopdisplayed && TrendingStylesdisplayed&& Comparedisplayed &&Contactusdisplayed &&Faqdisplayed && Conditionsdisplayed &&Wishlistdisplayed) {
            System.out.println(" Home | About Shop |Trending Styles | Compare | Contact Us | FAQ |Terms and Conditions WishList displayed. ");
        } else {
            System.out.println("All are not displayed as they are supposed to.");
        }
		
		
		//delay
		Thread.sleep(3000);
		
		//2)Click on My Account Button from header@Test
		
		//JavaScript Clicker code to click on a specific product
		//WebElement myAccountButton = driver.findElement(By.xpath("//div[@class='product-loop-header product-item__header']//h2[@class='woocommerce-loop-product__title'][contains(text(),'Tablet Red EliteBook')]"));
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", myAccountButton);
		// Enter 2 items 
		//WebElement quantityInput = driver.findElement(By.name("quantity"));
		//quantityInput.clear();
		//quantityInput.sendKeys("2"); // You can set any desired quantity
		
		//Click after entering n items
		//WebElement myAccountButton2 = driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
		//executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", myAccountButton2);
		
		//JavaScript Clicker code to click on view cart
				//WebElement myAccountButton3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/a"));
				//executor = (JavascriptExecutor) driver;
				//executor.executeScript("arguments[0].click();", myAccountButton3);
				
				
			//	boolean Pimgdisplayed	=driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/table/tbody/tr[1]/td[2]/a/img")).isDisplayed();	
			//	boolean PNamedisplayed	=driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/table/tbody/tr[1]/td[3]/a")).isDisplayed();	
			//	boolean PQtydisplayed	=driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/table/thead/tr/th[5]")).isDisplayed();	
			//	boolean SubTtldisplayed	=driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/table/tbody/tr[1]/td[6]")).isDisplayed();
			//	boolean Totaldisplayed	=driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/div[2]/div/table/tbody/tr[2]/td")).isDisplayed();	
				
				
			//	if (Pimgdisplayed && PNamedisplayed && PQtydisplayed && SubTtldisplayed && Totaldisplayed) {
		            System.out.println("Pimgdisplayed && PNamedisplayed && PQtydisplayed && SubTtldisplayed && Totaldisplayed");
		    //    } else {
		        //    System.out.println("At least one condition is false");
		       // }
				
				
		
	/*	//If the total price n times we know it worked.
		WebElement amount = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/div/div/div[2]/div[3]/a/span[1]"));
 		
 		boolean Enteredquantity = amount.isDisplayed();

        // Print the displayed price
        System.out.println("Displayed items: " +Enteredquantity);
 		if (Enteredquantity )
 		{
            System.out.println("The checkout is correct.");
        } else {
            System.out.println("The checkout is not correct.");
        }
//finding the Items added displayed message element
 	boolean messageDisplayed	=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div")).isDisplayed();
 	//Printing if it truly happened or not
 	if(messageDisplayed) {
 		System.out.println("Product added messag is shown");
 	}
 	else {
 		System.out.println("Product added message is not shown");
 	}
		
 	//checking to see that the cart is enabled
 	
 	boolean isEnabled = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/a")).isEnabled();
 	
 	if(isEnabled) {
 		System.out.println("Checkout Cart is visible");
 	}
 	else {
 		System.out.println("Checkout Cart is not visible");
 	
 	}
	
	//	WebElement updateButton = driver.findElement(By.name("quantity"));
		//updateButton.click();
		
		*/
		
		
		

		

		    


	}

}
