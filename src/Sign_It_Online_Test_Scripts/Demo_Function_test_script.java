package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Function_test_script {

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
		

		
		//User click on Profile drop-down option
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[3]/div[7]/ul[1]/li[1]/a[1]/p[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Settin")).click();
		Thread.sleep(2000);
		
		//click on close button (on Profile page)
		//driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		//Thread.sleep(2000);
		
		driver.quit();

	}

}
