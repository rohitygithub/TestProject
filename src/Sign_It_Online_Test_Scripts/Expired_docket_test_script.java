package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Expired_docket_test_script {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriverManager.chromedriver().setup();
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
		
		//User click on library section 
		driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		//User click on Docket Status Drop-down option
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		//User Select the Expired  docket status from drop-down option 
		driver.findElement(By.xpath("//li[contains(text(),'Expired')]")).click();
		Thread.sleep(2000);
		
		//User click on copy  icon on draft docket 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[6]/a[3]/img[1]")).click();
		Thread.sleep(2000);
		
		//User click on delete  icon on draft docket
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[2]/div[3]/div[2]/div[6]/a[2]/img[1]")).click();
		Thread.sleep(2000);
		
		//User click on Docket name
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[4]/div[2]/h4[1]/a[1]")).click();
		Thread.sleep(2000);
		
		//User click on Resend  icon 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[3]/div[3]/div[2]/div[6]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		//User click on library section 
		driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		////User click on Docket Status Drop-down option
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		//User Select the Expired  docket status from drop-down option 
		driver.findElement(By.xpath("//li[contains(text(),'Expired')]")).click();
		Thread.sleep(2000);
		
		//User click on Docket name
		driver.findElement(By.xpath("//a[contains(text(),'Copy-EventInvitati...')]")).click();
		Thread.sleep(2000);
		
		//User click on Resend button from status page
		driver.findElement(By.xpath("//li[contains(text(),'Expired')]")).click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
