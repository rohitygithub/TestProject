package AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DependentsDeletebutton {

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
				
				//Click on one "checkbox"
				WebElement cb =driver.findElement(By.xpath("//tbody/tr[@id='row_1490']/td[1]"));
				cb.click();
				Thread.sleep(5000);
				
				//Click on Delete button
				driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/button[1]/i[1]")).click();
				Thread.sleep(10000);
				
				//Click on multiple "checkbox"
				WebElement cb1 =driver.findElement(By.xpath("//tbody/tr[@id='row_1485']/td[1]"));
				cb1.click();
				WebElement cb2 =driver.findElement(By.xpath("//tbody/tr[@id='row_1484']/td[1]"));
				cb2.click();
				Thread.sleep(5000);
				
				//Click on Delete button
				driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/button[1]/i[1]")).click();
				Thread.sleep(10000);
				
				//Click on red color Delete button
				driver.findElement(By.xpath("//tbody/tr[@id='row_1481']/td[2]/a[2]/span[1]")).click();
				Thread.sleep(10000);
				
				//Click on conform button (yes) on pop window
				driver.findElement(By.xpath("//body/div[11]/div[1]/div[10]/button[1]/i[1]")).click();
				Thread.sleep(10000);
				
				driver.quit();

	}

}
