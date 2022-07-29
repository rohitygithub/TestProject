package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_template_as_public_or_private_test_script {

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
		
		//User click on Template  section 
		driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		//User click on Create template button
		driver.findElement(By.xpath("//span[contains(text(),'Create Template')]")).click();
		Thread.sleep(2000);
		
		//User Select the Public option 
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[1]/div[4]/div[1]/label[1]")).click();
		Thread.sleep(2000);
		
		//User Select the Private option 
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[1]/div[4]/div[1]/label[2]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
