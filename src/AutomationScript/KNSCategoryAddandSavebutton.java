package AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KNSCategoryAddandSavebutton {

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
		
		//Hover on Knowledge and Skills module
		Actions KNS = new Actions(driver);
		WebElement Kns = driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[19]/a[1]"));
		KNS.moveToElement(Kns).build().perform();
		Thread.sleep(2000);
		
		//Click on KNS Category sub-module
	    driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[19]/div[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(8000);
		
		// Click on Add KNS Category button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
		Thread.sleep(5000);
		
		// Click on Requested By field (Dropdown list)
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement RB = driver.findElement(By.xpath("//li[contains(text(),'Poonam')]"));
		RB.click();
		Thread.sleep(3000);
		
		// Click on Skill Type field (Dropdown list)
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		WebElement ST = driver.findElement(By.xpath("//li[contains(text(),'FUNCTIONAL SKILLS')]"));
		ST.click();
		Thread.sleep(3000);
		
		// Click on Skill Category field 
		driver.findElement(By.xpath("//input[@id='skill_cat_name']")).sendKeys("Automation Tester");
		Thread.sleep(2000);
		
		// Click on Save button 
		driver.findElement(By.xpath("//button[@id='main']")).click();
		Thread.sleep(3000);
		
		
		
		
		driver.quit();

	}

}
