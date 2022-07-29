package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_Cal_us_test_script {

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
		
		//User click on Call Us on function 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/a[7]")).click();
		Thread.sleep(4000);
		
        driver.quit();

	}

}
