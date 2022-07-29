package SignItOnineProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteDocket {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Enter Login credentials here
		driver.get("https://www.apps.signitonline.co.uk/index.php/login/login");
		Thread.sleep(2000);
		
		//Enter Username here
		driver.findElement(By.name("username")).sendKeys("DEMadmin");
		Thread.sleep(2000);
		
		//Enter Password here 
		driver.findElement(By.name("password")).sendKeys("DEMadmin");
		Thread.sleep(2000);
		
		//click on Login button
		driver.findElement(By.className("login_submit")).click();
		Thread.sleep(2000);
		
		//Click on Library 
		driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		//click on red color delete button of draft docket 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[6]/a[2]/img[1]")).click();
		Thread.sleep(2000);
		
		//Delete one docket (Draft docket) 
		driver.findElement(By.xpath("//body/div[7]/div[1]/div[10]/button[1]")).click();
		Thread.sleep(2000);
		
		//After deleting draft docket display confirmation message "Success! Successfully deleted Docket"
		
		driver.quit();

	}

}
