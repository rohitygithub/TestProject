package EmployeeHubSubModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Membership {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//On Login page
		driver.get("http://www.geecon.co.uk/dev/gap_v2/index.php/login/login");
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
		WebElement emp = driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[1]/a[1]/img[1]"));
		action.moveToElement(emp).build().perform();
		Thread.sleep(2000);
		
		//Click on Membership sub-module
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]/li[12]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Membership button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//li[contains(text(),'Narkar')]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click on Employee Full Name dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement EFN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
		EFN.click();
		Thread.sleep(1000);
		
		//Click on Membership dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Mship =driver.findElement(By.xpath("//li[contains(text(),'Gym Membership')]"));
		Mship.click();
		Thread.sleep(1000);
		
		//Click on Membership Period dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[7]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement MPeriod =driver.findElement(By.xpath("//li[contains(text(),'Half Yearly')]"));
		MPeriod.click();
		Thread.sleep(1000);
		
		//Click on Subscription Paid By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[8]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement SPB =driver.findElement(By.xpath("//li[contains(text(),'Company')]"));
		SPB.click();
		Thread.sleep(1000);
		
		//Enter Subscription Amount 
		driver.findElement(By.xpath("//input[@id='SubscriptionAmount']")).sendKeys("500000");
		
		//Click and select Currency in dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[10]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Curncy =driver.findElement(By.xpath("//li[contains(text(),'US DOLLAR')]"));
		Curncy.click();
		Thread.sleep(1000);
		
		//Click and select Subscription Commence Date
		driver.findElement(By.xpath("//input[@id='SubscriptionCommenceDate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(1000);
		
		//Click and select Subscription Renewal Date
		driver.findElement(By.xpath("//input[@id='SubscriptionRenewalDate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")).click();
		Thread.sleep(1000);
		WebElement Date =driver.findElement(By.xpath("//option[contains(text(),'2024')]"));
		Date.click();
		driver.findElement(By.xpath("//a[contains(text(),'20')]")).click();
		Thread.sleep(1000);
		
		//Click on Cancel Button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
		
		
		
		driver.quit();


	}

}
