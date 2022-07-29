package PracticeAutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Login on Global HR webpage
		driver.get("https://findusonweb.co.uk/");
		Thread.sleep(2000);
										
		//click on login button using "className" locator 
		driver.findElement(By.className("terciery-bg")).click();
		Thread.sleep(2000);
										
		//Enter username using "name" locator
		driver.findElement(By.name("user_login")).sendKeys("angadgdemo");
		Thread.sleep(2000);
										
		//Enter Pass using "name" locator
		driver.findElement(By.name("user_pass")).sendKeys("Geecon0404");
		Thread.sleep(2000);
				
		//click on Login button
		driver.findElement(By.id("submit_login")).click();
		Thread.sleep(2000);
		
		//click on Request a quote button
		driver.findElement(By.partialLinkText("REQUEST A Q")).click();
		Thread.sleep(2000);

	}

}
