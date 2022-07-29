package LeaveModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeaveMonthlyCredit {

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
		
		//Hover on Leave module
		WebElement leave = driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[12]/a[1]"));
		action.moveToElement(leave).build().perform();
		Thread.sleep(2000);
		
		//Click on Leave Monthly Credit sub-module
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[12]/div[1]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Leave Monthly Credit button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//li[contains(text(),'Wadhel')]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click and select leave type from the dropdown list
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement LT =driver.findElement(By.xpath("//li[contains(text(),'Paid Leave')]"));
		LT.click();
		Thread.sleep(1000);
		
		//Click and select leave period from the dropdown list
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one
		WebElement LP =driver.findElement(By.xpath("//li[contains(text(),'Leave Period 2022')]"));
		LP.click();
		Thread.sleep(1000);
		
		//Click and enter no of days alloted
		driver.findElement(By.xpath("//input[@id='NO_OF_DAYS_CREDITED']")).sendKeys("2");
		Thread.sleep(1000);
		
		//Click on cancel button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(1000);
		
		
		

	}

}
