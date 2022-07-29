package EmployeeHubSubModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emp_Nat {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		
		driver.get("http://www.mydevsystems.com/dev/gap_v2/index.php/login/login//");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("GSPLadmin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GSPLadmin");
		
		Thread.sleep(2000);
		
		//click on login button //
		driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]")).click();
		
		Thread.sleep(2000);
		
		//click on Emphub module//
		
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[5]/a[1]/img[1]")).click();
		
		Thread.sleep(2000);
		
		//click on Nationality submodule//
		
		driver.findElement(By.xpath("//a[contains(text(),'Nationality')]")).click();
		
		Thread.sleep(2000);
		
		//click on Add button//
		
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		
		Thread.sleep(2000);;
		
		//Click on Requested by field//
		 driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		 Thread.sleep(2000);
		 WebElement ab = driver.findElement(By.xpath("//li[contains(text(),'Gates')]"));
		 ab.click();
		 
	
		 
		 //Click on employee Full Name//
		 driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		 
		
		 
		 //Thread.sleep(2000);
		 WebElement cd = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[13]"));
		 
		 Thread.sleep(2000);
		 
		 cd.click();
		 
		
		 //click on Contact Nationality//
		 
		 
		 driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
		 Thread.sleep(2000);
		 WebElement ap =driver.findElement(By.xpath("//li[contains(text(),'Afghanistan')]"));
		 Thread.sleep(2000);
		 
		 ap.click();
		 
		 
		 //click on Save button//
		 
		 driver.findElement(By.xpath("//button[@id='main']")).click();
		 Thread.sleep(3000);
		 //successfully message received after click on save//
		 
		 driver.findElement(By.xpath("//body/div[8]"));
		 Thread.sleep(2000);
		 
	
		
		 
		 driver.quit();
	}




	}


