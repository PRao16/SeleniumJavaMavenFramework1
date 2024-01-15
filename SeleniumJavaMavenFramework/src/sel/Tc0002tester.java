package sel;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Tc0002tester {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chrome\\chromedriver-win64\\chromedriver.exe");
	
		
		
        
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(options);
		
		
		
		
        
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		 options.addArguments("--remote-allow-origins=*");
		
		
		 
		
		
		//1) open url on the browser
		
		driver.get("http://demo.perscholastraining.com");
	driver.manage().window().maximize();
		
		//delay
		Thread.sleep(6000);
		
		//2)Click on My Account Button from header
		driver.findElement(By.xpath("//*[@id=\'menu-item-4100\']/a")).click();
		
		//3)Click on Any Product
		driver.findElement(By.xpath("//*[@id='tab-products-1']/div/ul/li[2]/div/div/div[1]/a/h2")).click();
		
		
		
		
		
		
		
		
		//4)Enter product Quantity. 
		//driver.findElement(By.id("reg_email")).sendKeys("dummy@gmail.com");
		
		//5Enter Password
		//driver.findElement(By.id("reg_password")).sendKeys("dummy");
		
		//Click Login
		//driver.findElement(By.name("register")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("register")).click();
				
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
