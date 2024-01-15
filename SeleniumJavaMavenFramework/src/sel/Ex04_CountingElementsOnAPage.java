package sel;


import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Ex04_CountingElementsOnAPage
{
	//all pages have the same title we need to fix that using label validation
	public static void main(String[] args) throws InterruptedException 
	{
		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        
		
		
		         ChromeOptions options = new ChromeOptions();

		         
		         options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		 		 options.addArguments("--remote-allow-origins=*");
		 		 
		 		 
		 		 WebDriver driver=new ChromeDriver(options);
		 		 
		 		 
	                         /********           core                      ******/	
		 		 
		 		//1 Open app
			 		driver.get("http://automationpractice.pl/index.php");
			 		driver.manage().window().maximize(); // maximize browser window
			 		
			 		//Finding number of sliders on home page	
					List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
					System.out.println("Number of sliders:"+sliders.size());
					
					//Find Total number of images in home page
					
					List<WebElement> images=driver.findElements(By.tagName("img"));
					System.out.println("Total number of images:"+images.size());
					
					//Find total number of links
					List<WebElement> links=driver.findElements(By.tagName("a"));
					System.out.println("Total number of links:"+ links.size());
					
					
					driver.quit();
		 			
		 		
}

}
