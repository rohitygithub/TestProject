package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Top_menu_items_test_script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// On Login Page
		driver.get("https://www.apps.signitonline.co.uk/index.php/login/login");
		Thread.sleep(2000);
		
		//Enter Username 
		driver.findElement(By.name("username")).sendKeys("DEMadmin");
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("DEMadmin");
		Thread.sleep(2000);
		
		//Click on Login Page 
		driver.findElement(By.className("login_submit")).click();
		Thread.sleep(2000);
		
		
		//User can click on Support option 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[3]/div[5]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		//User click on click on Send new docket  button
		driver.findElement(By.xpath("//span[contains(text(),'Send New Docket')]")).click();
		Thread.sleep(2000);
		
		//User click on Create Template button
		driver.findElement(By.xpath("//span[contains(text(),'Create Template')]")).click();
		Thread.sleep(2000);
		
		//User click on Notification button
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[3]/div[3]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		//User click on credit balance button
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[3]/div[4]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
		Thread.sleep(2000);
		
		//User click on Profile drop-down option
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[3]/div[7]/ul[1]/li[1]/a[1]/p[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Prof")).click();
		Thread.sleep(2000);
		
		//User click on Adopt signature option
		driver.findElement(By.xpath("//img[@id='adapt_sign']")).click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
