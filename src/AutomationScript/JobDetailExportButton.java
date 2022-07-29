package AutomationScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class JobDetailExportButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Login on Global HR webpage
		driver.get("http://www.mydevsystems.com/dev/gap_v2/index.php/login/login");
		
		//Enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("GSPLadmin");
		
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GSPLadmin");
		
		//click on Login button
		driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(2000);
		
		//Hover on Emp Hub module
		Actions EmpHub = new Actions(driver);
		WebElement emp = driver.findElement(By.xpath("//span[contains(text(),'Employee Hub')]"));
		EmpHub.moveToElement(emp).build().perform();
		Thread.sleep(2000);
		
		//Click on Address Detail sub-module
		driver.findElement(By.xpath("//a[contains(text(),'Address Details')]")).click();
		Thread.sleep(8000);
		
		//Click on Export button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]/i[2]")).click();
		Thread.sleep(4000);
		
		//Click on CSV button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(8000);
		
		//Click on Export button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]/i[2]")).click();
		Thread.sleep(4000);
		
		//Click on EXCEL button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
		Thread.sleep(8000);
		
		//Click on Export button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]/i[2]")).click();
		Thread.sleep(4000);
		
        //Click on PDF button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/a[3]")).click();
		Thread.sleep(8000);
		
		//Click on Export button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]/i[2]")).click();
		Thread.sleep(4000);
		
		//Click on PRINT button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/a[4]")).click();
		Thread.sleep(4000);
		
		// Handling child window by creating "Set" table's object
		Set<String> s = driver.getWindowHandles();
				
		Iterator<String> it = s.iterator();
				
		String parent = it.next();
		String child1  = it.next();
		String child2 = it.next();
				
		// switching iterator on child window
		driver.switchTo().window(child1);
		driver.switchTo().window(child2);
		System.out.println("Child window's URL :" +driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
				
		// switching iterator on parent window again
		driver.switchTo().window(parent);
		System.out.println("Parent window's title name :" +driver.getTitle());
		Thread.sleep(3000);
		
		driver.quit();

	}

}
