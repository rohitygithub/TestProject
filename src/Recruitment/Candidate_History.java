package Recruitment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Candidate_History {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver_win32 (2)\\chromedriver.exe");
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
		
		//Hover on Recruitment module
		WebElement leave = driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[31]/a[1]/img[1]"));
		action.moveToElement(leave).build().perform();
		Thread.sleep(2000);
		
		//Click on Candidate History sub-module
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[31]/div[1]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Candidate History button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
		Thread.sleep(2000);
		
		//Click on req by dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click and select Candidate Name from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement CN =driver.findElement(By.xpath("//li[contains(text(),'Candidate1')]"));
		CN.click();
		Thread.sleep(1000);
		
		//Click and Vacancy Name from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement VN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
		VN.click();
		Thread.sleep(1000);
		
		//Click and Interviewer Name from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement IN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
		IN.click();
		Thread.sleep(1000);
		
		//Click and Select Performed By name from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[8]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement PB =driver.findElement(By.xpath("//li[contains(text(),'SanjeevPO')]"));
		PB.click();
		Thread.sleep(1000);
		
		//Click and select performed Date from the calendar
		driver.findElement(By.xpath("//input[@id='PerformedDate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(1000);
		
		//Click and enter Note 
		driver.findElement(By.xpath("//textarea[@id='Note']")).sendKeys("Testing");
		Thread.sleep(1000);
		
		//Click on Cancel button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(1000);
		
		driver.quit(); 
		

	}

}
