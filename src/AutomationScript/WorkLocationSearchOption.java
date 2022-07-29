package AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkLocationSearchOption {

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
		
		//Click on Work Location sub-module
	    driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[5]/div[1]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(10000);
		
		//Search record in main search option 
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys("sneha ram kadam");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")).clear();
		Thread.sleep(8000);
		
		//Search record in main search option 
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys("Mira Road");		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")).clear();	
		Thread.sleep(8000);
		
		//Search Emp Code
		driver.findElement(By.xpath("//thead/tr[2]/th[3]/input[1]")).sendKeys("AT20120016");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//thead/tr[2]/th[3]/input[1]")).clear();
		Thread.sleep(5000);
				
		driver.quit();

	}

}
