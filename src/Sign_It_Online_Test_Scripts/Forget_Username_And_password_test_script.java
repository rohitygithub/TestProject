package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forget_Username_And_password_test_script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// On Login Page
		driver.get("https://www.apps.signitonline.co.uk/index.php/login/login");
		Thread.sleep(2000);
		
		//User Click on Forget password option
		driver.findElement(By.xpath("//a[contains(text(),'Forget password?')]")).click();
		Thread.sleep(2000);
		
		//User enter Registered Mail id  And clicked on Request New password button 
		driver.findElement(By.xpath("//input[@id='txtuseremail']")).sendKeys("yelmkarr174@gmail.com");
		Thread.sleep(2000);
		
		//User click on Forget Username option
		driver.findElement(By.xpath("//a[contains(text(),'Forget Username?')]")).click();
		Thread.sleep(2000);
		
		//User entered Valid email id And Valid memorable Word
		driver.findElement(By.xpath("//input[@id='txtuseremail']")).sendKeys("yelmkarr174@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtmemorable']")).sendKeys("rohity@1742000");
		Thread.sleep(2000);
		
		//clicked on submit button
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/center[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		
		//
		



	}

}
