package EmployeeHubSubModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddressDetail {

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
		
		//Click on Job Details sub-module
		driver.findElement(By.xpath("//a[contains(text(),'Address Details')]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Address Detail button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By DrpD field
		//driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		//Thread.sleep(2000);
		
		//WebElement req =driver.findElement(By.xpath("//li[contains(text(),'Wadhel')]"));
		//req.click();
		
		//Click on Emp Full Name DrpD field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement EFN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
		EFN.click();
		
		//Click on Address Type field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement AddTp =driver.findElement(By.xpath("//li[contains(text(),'Home Address')]"));
		AddTp.click();
		
		//Click and Enter House Name
		driver.findElement(By.xpath("//input[@id='HouseName']")).click();
		Thread.sleep(2000);
		
		//Click and Enter House No
		driver.findElement(By.xpath("//input[@id='HouseNo']")).click();
		Thread.sleep(2000);
		
		//Click and Enter Address Line 1
		driver.findElement(By.xpath("//input[@id='street']")).click();
		Thread.sleep(2000);
		
		//Click and Enter City Name
		driver.findElement(By.xpath("//input[@id='City']")).click();
		Thread.sleep(2000);
		
		//Click and Enter District name
		driver.findElement(By.xpath("//input[@id='District']")).click();
		Thread.sleep(2000);
		
		//Click and Enter State name
		driver.findElement(By.xpath("//input[@id='CountryStateId']")).click();
		Thread.sleep(2000);
		
		//Click on Country Drp field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[17]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement Cou = driver.findElement(By.xpath("//li[contains(text(),'Andorra')]"));
		Cou.click();
		
		//Click and Enter POSTCODE
		driver.findElement(By.xpath("//input[@id='Postcode']")).click();
		Thread.sleep(2000);
		
		//Tick Mark on Is Primary Address
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[19]/div[1]/label[1]")).click();
		Thread.sleep(2000);
		
		//Tick Mark on Is Current Address
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[20]/div[1]/label[1]")).click();
		Thread.sleep(2000);
		
		//Click on Cancel Button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);

	}

}
