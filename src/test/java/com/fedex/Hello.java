package com.fedex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000); // Let the user actually see something!  
		
		driver.findElement(By.tagName("input")).sendKeys("rama");
		
        System.out.println("New time");

     
        
		//driver.quit(); 
		
	   
	    
	    
		
		
	}

}
