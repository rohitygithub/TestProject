package EmployeeHubSubModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public record WorkExperience() {

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
		
		//Click on My Picture sub-module
		driver.findElement(By.xpath("//a[contains(text(),'Work Experience')]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Work Experience button
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
		
		//Click and Enter Sequence No.
		driver.findElement(By.xpath("//input[@id='eexpSeqno']")).sendKeys("01245");
		Thread.sleep(1000);
		
		//Click and Enter Employer Name
		driver.findElement(By.xpath("//input[@id='eexpEmployer']")).sendKeys("Sumit Pandey");
		Thread.sleep(1000);
		
		//Click on Job Role dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[8]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Jobr =driver.findElement(By.xpath("//li[contains(text(),'Java Developer')]"));
		Jobr.click();
		Thread.sleep(1000);
		
		//Click and Enter Job Position
		driver.findElement(By.xpath("//input[@id='jobTitle']")).sendKeys("Software Tester");
		Thread.sleep(1000);
		
		//Click and select start date from the calendar 
		driver.findElement(By.xpath("//input[@id='eexpFromDate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(1000);
		
		//Click and select End date from the calendar
		driver.findElement(By.xpath("//input[@id='eexpToDate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();
		Thread.sleep(1000);
		
		
		//Click and Enter Comments
		driver.findElement(By.xpath("//textarea[@id='eexpComments']")).sendKeys("3 years");
		Thread.sleep(1000);
		
		//Tick mark on Internal checkbox 
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[13]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Click on Cancel button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
