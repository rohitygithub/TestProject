package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Last_modified_date_test_script {

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
		
		//User click on library section 
		driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		//User click on Docket Status Drop-down option
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		//User Select the In-progress  docket status from drop-down option 
		driver.findElement(By.xpath("//li[contains(text(),'InProgress')]")).click();
		Thread.sleep(2000);
		
		//User select Last modified date And enter into Start date  
		driver.findElement(By.xpath("//input[@id='fromdate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[7]/a[1]")).click();
		Thread.sleep(2000);
		
		//User select Last modified date And enter into End date
		driver.findElement(By.xpath("//input[@id='todate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
