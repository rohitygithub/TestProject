package EmployeeHubSubModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BankAccounts {

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
		
		//Click on Bank Accounts sub-module
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]/li[18]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Bank Account button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//li[contains(text(),'Mohammad Salman Khan Mohammad Naushad Khan')]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click on Emp Full Name dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement EFN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
		EFN.click();
		Thread.sleep(1000);
		
		//Click and Enter Bank Name
		driver.findElement(By.xpath("//input[@id='bankNm']")).sendKeys("IDBI");
		Thread.sleep(1000);
		
		//Click and Enter Branch Name
		driver.findElement(By.xpath("//input[@id='branchNm']")).sendKeys("Raigad");
		Thread.sleep(1000);
		
		//Click and Enter Branch Address
		driver.findElement(By.xpath("//textarea[@id='branchAddress']")).sendKeys("Alibag - Pen - Raigad");
		Thread.sleep(1000);
		
		//Click and Enter Account Holder Name
		driver.findElement(By.xpath("//input[@id='AccholderNm']")).sendKeys("Rohit R Yelamkar");
		Thread.sleep(1000);
		
		//Click and Enter Sort Code
		driver.findElement(By.xpath("//input[@id='sortCd']")).sendKeys("124578");
		Thread.sleep(1000);
		
		//Click and Enter Account No
		driver.findElement(By.xpath("//input[@id='AccNo']")).sendKeys("01250002145");
		Thread.sleep(1000);
		
		//Click and Enter IFSC Code
		driver.findElement(By.xpath("//input[@id='ifscCd']")).sendKeys("12598");
		Thread.sleep(1000);
		
		//Tick mark on Primary option
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[13]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Tick mark on Primary option
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
