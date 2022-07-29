package EmployeeHubSubModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmployeePhone {

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
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]/li[16]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Employee Picture button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//li[contains(text(),'Wadhel')]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click and select Employee Full Name from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement EFN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[7]"));
		EFN.click();
		Thread.sleep(1000);
		
		//Click and select Country code and Enter Mobile no.
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement CC =driver.findElement(By.xpath("//li[contains(text(),'+91')]"));
		CC.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='cntct_phone_id']")).sendKeys("9958745687");
		Thread.sleep(1000);
		
		//Click and enter Employee Phone
		driver.findElement(By.xpath("//input[@id='EMP_phone']")).sendKeys("1406587441");
		Thread.sleep(1000);
		
		//Click and select Phone Type from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[8]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement FT =driver.findElement(By.xpath("//li[contains(text(),'Landline')]"));
		FT.click();
		Thread.sleep(1000);
		
		//Tick mark and select primary checkbox
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[9]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Click on Cancel button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
