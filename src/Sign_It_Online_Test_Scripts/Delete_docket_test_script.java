package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_docket_test_script {

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
		
		//User Selected Draft docket 
		driver.findElement(By.xpath("//li[contains(text(),'Draft')]")).click();
		Thread.sleep(3000);
		
		//User click on delete  icon on draft docket 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[6]/a[2]/img[1]")).click();     //see pop-up message "Are you sure?" and following two button's
		Thread.sleep(3000);                                                                                                            //-Yes
                                                                                                                                       //-No
		
		
		//User click on "No" button
		driver.findElement(By.xpath("//body/div[7]/div[1]/div[10]/button[2]/i[1]")).click();
		Thread.sleep(3000);
		
		//User click on delete  icon on draft docket 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[6]/a[2]/img[1]")).click();
		Thread.sleep(3000);
		
		//User click on "Yes" button
		driver.findElement(By.xpath("//body/div[7]/div[1]/div[10]/button[1]/i[1]")).click();
		Thread.sleep(3000);

        driver.quit();

	}

}
