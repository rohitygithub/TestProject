package AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LanguageKnownAddandSavebutton {

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
		
		//Click on Language Known sub-module
	    driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[5]/div[1]/ul[1]/li[16]/a[1]")).click();
		Thread.sleep(10000);
		
		//Click on Add New Employee Language button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
		Thread.sleep(6000);
		
		//Click on Requested By field (Dropdown list)
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement Reqb =driver.findElement(By.xpath("//li[contains(text(),'Santosh Bala kadam')]"));
		Reqb.click();
		Thread.sleep(2000);
		
		//Click on Employee Full Name field (Dropdown list)
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement EFN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[12]"));
		EFN.click();
		Thread.sleep(2000);
		
		//Click on Language field (Dorpdown list)
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement Lang =driver.findElement(By.xpath("//li[contains(text(),'Dutch')]"));
		Lang.click();
		Thread.sleep(2000);
		
		//Click on Language Competency field (Dropdown list)
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[7]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement LC =driver.findElement(By.xpath("//li[contains(text(),'Speaking')]"));
		LC.click();
		Thread.sleep(2000);
		
		//Click on Language Fluency field (Dropdown list)
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[8]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement LF =driver.findElement(By.xpath("//li[contains(text(),'Good')]"));
		LF.click();
		Thread.sleep(2000);
		
		//Click on Save Button 
		driver.findElement(By.xpath("//button[@id='main']")).click();
		Thread.sleep(5000);
		
		driver.quit();

	}

}
