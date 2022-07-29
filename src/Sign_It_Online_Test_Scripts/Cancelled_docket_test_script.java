package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cancelled_docket_test_script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		 On Login Page
		driver.get("http://geecon.co.uk/dev/signIt1/index.php/login/login");
		Thread.sleep(2000);
		
//		Enter Username 
		driver.findElement(By.name("username")).sendKeys("DEMadmin");
		Thread.sleep(2000);
		
//		Enter Password
		driver.findElement(By.name("password")).sendKeys("DEMadmin");
		Thread.sleep(2000);
		
//		Click on Login Page 
		driver.findElement(By.className("login_submit")).click();
		Thread.sleep(2000);
		
//		User click on library section 
		driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
//		User click on Docket Status Drop-down option
		driver.findElement(By.id("docketStatus_chosen")).click();
		Thread.sleep(2000);
		
//		User Select the in-progress docket status from drop-down option 
		driver.findElement(By.xpath("//li[contains(text(),'InProgress')]")).click();
		Thread.sleep(2000);
		
//		User click on cancel icon button
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[10]/div[1]/div[3]/div[2]/div[6]/a[5]/img[1]")).click();
		Thread.sleep(2000);
		
//		User should be able to See cancel comment box is displayed with two button:-
//      • No thanks
//		• Cancel button
		
//        User click on "No Thanks" button 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		
//		User click on cancel icon button
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[6]/a[5]/img[1]")).click();
		Thread.sleep(2000);
		
//		User enter comment into comment box And clicked on cancel button
		driver.findElement(By.id("reminder-VmV6eXVjdEVOYjgrN1EraFk3KzJXUT09")).sendKeys("Some issue");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
		
//		User click on Docket Status Drop-down option and select Cancelled section
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Cancelled')]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
