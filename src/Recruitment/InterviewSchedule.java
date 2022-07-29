package Recruitment;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InterviewSchedule {

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
		
		//Click on Interview Schedule sub-module
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[31]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Interview Schedule button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
		Thread.sleep(2000);
		
		//Click on req by dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//li[contains(text(),'Wadhel')]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click on Application No. search icon
		//driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/a[1]")).click();
		//Thread.sleep(1000);
		
		String parentwindowhandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle:handles) 
		{
		
		if(!handle.equals(parentwindowhandle)) {
		driver.switchTo().window(handle);
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys("Rohit");
		Thread.sleep(2000);
		driver.close();
		}
		}
		
		driver.switchTo().window(parentwindowhandle);
		

	}

}
