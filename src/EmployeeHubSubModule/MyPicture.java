package EmployeeHubSubModule;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyPicture {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//On Login page
		driver.get("http://www.mydevsystems.com/dev/gap_v2/index.php/login/login//");
		Thread.sleep(2000);
		
		//Enter Username here
		driver.findElement(By.name("username")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
		
		//Enter Password here 
		driver.findElement(By.name("password")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
		
		//click on Login button
		driver.findElement(By.className("login_submit")).click();
		Thread.sleep(2000);
		
		//Using Action Class 
		Actions action =new Actions(driver);
		
		//Hover on Employee Hub module
		WebElement emp = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/nav[1]/ul[1]/li[5]/a[1]/img[1]"));
		action.moveToElement(emp).build().perform();
		Thread.sleep(2000);
		
		//Click on My Picture sub-module
		driver.findElement(By.xpath("//a[contains(text(),'My Picture')]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Employee Picture
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click on Employee Full Name dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement EFN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[8]"));
		EFN.click();
		Thread.sleep(1000);
		
		//upload file on picture field
        WebElement upload = driver.findElement(By.xpath("//input[@id='userfile']"));
        
        upload.sendKeys("C:\\Users\\ABC\\Pictures\\img 2");
        Thread.sleep(3000);
        
        //I can see the File Name, File Type, Epic File Size, Epic File Width, Epic File Height this field's values are directly displayed.
		
        //Click on Cancel button
        driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}


