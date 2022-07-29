package AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NationalityDeletebutton {

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
				
				//Click on Nationality sub-module
			    driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[5]/div[1]/ul[1]/li[12]/a[1]")).click();
				Thread.sleep(10000);
				
				//Click on one "checkbox"
				WebElement chbk =driver.findElement(By.xpath("//tbody/tr[@id='row_49']/td[1]"));
				chbk.click();
				Thread.sleep(5000);
				
				//Click on Delete button
				driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/button[1]/i[1]")).click();
				Thread.sleep(10000);
				
				//Click on multiple "checkbox"
				WebElement chbk1 =driver.findElement(By.xpath("//tbody/tr[@id='row_51']/td[1]"));
				chbk1.click();
				WebElement chbk2 =driver.findElement(By.xpath("//tbody/tr[@id='row_44']/td[1]"));
				chbk2.click();
				Thread.sleep(5000);
				
				//Click on Delete button
				driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/button[1]/i[1]")).click();
				Thread.sleep(10000);
				
				//Click on Red color delete button
				driver.findElement(By.xpath("//tbody/tr[@id='row_50']/td[2]/a[2]/span[1]")).click();
				Thread.sleep(10000);
				
				//Click on confirm button (Yes)
				driver.findElement(By.xpath("//body/div[11]/div[1]/div[10]/button[1]/i[1]")).click();
				Thread.sleep(10000);
				
				driver.quit();

	}

}
