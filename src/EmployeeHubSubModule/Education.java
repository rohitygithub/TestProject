package EmployeeHubSubModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Education {

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
		
		//Click on Education sub-module
		driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
		Thread.sleep(2000);
		
		//Click on Add new Employee Education button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click on Employee Full Name dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement EFN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
		EFN.click();
		Thread.sleep(1000);
		
		//Click on Employee Qualification dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement EQ =driver.findElement(By.xpath("//li[contains(text(),'Diploma Course')]"));
		EQ.click();
		Thread.sleep(1000);
		
		//Click on Education Qualification dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[7]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement EdQ =driver.findElement(By.xpath("//li[contains(text(),'Bsc')]"));
		EdQ.click();
		Thread.sleep(1000);
		
		//Enter Institute name
		driver.findElement(By.xpath("//input[@id='INSTITUTE']")).sendKeys("D.Y.Patil");
		Thread.sleep(1000);
		
		//Click on Course Type dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[9]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement CT =driver.findElement(By.xpath("//li[contains(text(),'Distance Learning')]"));
		CT.click();
		Thread.sleep(1000);
		
		//Enter Major name
		driver.findElement(By.xpath("//input[@id='MAJOR']")).sendKeys("Bsc-IT");
		Thread.sleep(1000);
		
		//Enter Year
		driver.findElement(By.xpath("//input[@id='YEAR']")).sendKeys("2018-2020");
		Thread.sleep(1000);
		
		//Enter Score
		driver.findElement(By.xpath("//input[@id='SCORE']")).sendKeys("8.14");
		Thread.sleep(1000);
		
		//Click and select Start Date
		driver.findElement(By.xpath("//input[@id='START_DATE']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(1000);
		
		//Click and Select End Date
		driver.findElement(By.xpath("//input[@id='END_DATE']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")).click();
		Thread.sleep(1000);
		WebElement Date =driver.findElement(By.xpath("//option[contains(text(),'2024')]"));
		Date.click();
		driver.findElement(By.xpath("//a[contains(text(),'29')]")).click();
		Thread.sleep(1000);
		
		//Click on Cancel button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);

	}

}
