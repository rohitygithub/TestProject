package AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BankAccountsRecordsPerpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Login on Global HR webpage
		driver.get("http://www.mydevsystems.com/dev/gap_v2/index.php/login/login");
		Thread.sleep(2000);
				
		//Enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
				
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
				
		//click on Login button
		driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(2000);
				
		//Hover on Emp Hub module
		Actions EmpHub = new Actions(driver);
		WebElement emp = driver.findElement(By.xpath("//span[contains(text(),'Employee Hub')]"));
		EmpHub.moveToElement(emp).build().perform();
		Thread.sleep(2000);
		
		//Click on Bank Accounts sub-module
	    driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[5]/div[1]/ul[1]/li[18]/a[1]")).click();
		Thread.sleep(10000);
		
		//Click on Record per page option
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement value1 = driver.findElement(By.xpath("//li[contains(text(),'25')]"));           //select one value "25" in dropdown.
		value1.click();
		Thread.sleep(1000);
		
				
		//Click on Record per page option
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement value50 = driver.findElement(By.xpath("//li[contains(text(),'50')]"));           //select one value "50" in dropdown.
		value50.click();
		Thread.sleep(1000);
				
		//Click on Record per page option
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement value100 = driver.findElement(By.xpath("//li[contains(text(),'100')]"));           //select one value "100" in dropdown.
		value100.click();
		Thread.sleep(1000);

	}

}
