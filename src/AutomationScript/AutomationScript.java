package AutomationScript;



import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AutomationScript {                        //Export button of Job Detail module

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
		
		//Hover on Emp Hub module
		Actions EmpHub = new Actions(driver);
		WebElement emp = driver.findElement(By.xpath("//span[contains(text(),'Employee Hub')]"));
		EmpHub.moveToElement(emp).build().perform();
		Thread.sleep(1000);
		
		//Click on Job Detail sub-module
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[5]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(8000);
		
		//Click on Export button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]/i[2]")).click();
		Thread.sleep(3000);
		
		//Click on CSV button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(6000);
		
		//Click on Export button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]/i[2]")).click();
		Thread.sleep(3000);
		
		//Click on EXCEL button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
		Thread.sleep(6000);
		
		//Click on Export button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]/i[2]")).click();
		Thread.sleep(3000);
		
		//Click on PDF button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/a[3]")).click();
		Thread.sleep(6000);
		
		//Click on Export button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]/i[2]")).click();
		Thread.sleep(3000);
		
		//Click on PRINT button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/a[4]")).click();
		Thread.sleep(3000);
		
		//handling 2 child and 1 parent window
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		
		String child = it.next();
		String child1 = it.next();
		String parent = it.next();
		
		//switching child pop-up window
		driver.switchTo().window(child);
		//switching child 1 pop-up window
		driver.switchTo().window(child1);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
