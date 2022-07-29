package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Credit_Topup_script extends Base {

	    
	   
		
	    @Test
	    public void test() throws InterruptedException {
		//Enter Username 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
		
		//Click on Login Page 
		driver.findElement(By.xpath("//div[@class='form-group login-submit-col']//input[@class='login_submit']")).click();
		Thread.sleep(2000);
		
	    }
		
		
		
    
	}


