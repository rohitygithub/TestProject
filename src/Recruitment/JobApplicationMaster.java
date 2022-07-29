package Recruitment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JobApplicationMaster {

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
		
		//Hover on Recruitment module
		WebElement leave = driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[31]/a[1]/img[1]"));
		action.moveToElement(leave).build().perform();
		Thread.sleep(2000);
		
		//Click on Job Application Master sub-module
		driver.findElement(By.xpath("//a[contains(text(),'Job Application Master')]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Job Application Master button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
		Thread.sleep(2000);
		
		//Click on req by dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//li[contains(text(),'Narkar')]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click and enter Candidate number
		driver.findElement(By.xpath("//input[@id='CANDIDATE']")).sendKeys("RohitRY");
		Thread.sleep(2000);
		
		//Click and enter Vacancy Name
		driver.findElement(By.xpath("//input[@id='VACANCY']")).sendKeys("Automation Tester");
		Thread.sleep(2000);
		
		//Click and select Application Status from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Apps =driver.findElement(By.xpath("//li[contains(text(),'Application Approved')]"));
	    Apps.click();
		Thread.sleep(1000);
		
		//upload Attachment
		WebElement Attch =driver.findElement(By.xpath("//input[@id='ATTACHMENT']"));
		Attch.sendKeys("C:\\Users\\ABC\\Pictures\\Image 01.jpg");
		Thread.sleep(2000);
		
		//Click on cancel button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
