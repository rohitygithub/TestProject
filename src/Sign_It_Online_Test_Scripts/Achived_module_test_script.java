package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Achived_module_test_script {

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
		
		//User click on archived module
		driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		//User  click on refresh docket option 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[1]/a[1]/img[1]")).click();
		Thread.sleep(4000);
		
		//User   click on download docket
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[1]/a[2]/img[1]")).click();
		Thread.sleep(4000);
		
		//User  click on Copy Docket 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[1]/a[4]/img[1]")).click();
		Thread.sleep(4000);
		
		//User select the start date and end date & clicked to apply filter button 
		driver.findElement(By.xpath("//input[@id='fromdate']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//option[contains(text(),'2021')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//option[contains(text(),'Jun')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(4000);
		
		
		//User select the end date & clicked to apply filter button 
		driver.findElement(By.xpath("//input[@id='todate']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//option[contains(text(),'2021')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//option[contains(text(),'Jun')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(4000);
		
//User  click on Search icon option
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[3]/div[2]/a[1]/img[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='docket_search']")).sendKeys("Test.pdf");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		Thread.sleep(4000);
		
//User click on refresh icon button
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[2]/div[2]/a[1]/img[1]")).click();
		Thread.sleep(4000);
		
//User click on Docket name
		driver.findElement(By.xpath("//a[contains(text(),'test14_test_resume.pdf...')]")).click();
		Thread.sleep(4000);
		
//User  click on download button from docket status page 
		//driver.findElement(By.xpath("//a[@id='a1']")).click();
		//Thread.sleep(4000);
		
//User  click on Remove button from docket status page
		driver.findElement(By.xpath("//i[contains(text(),'REMOVE')]")).click();
		Thread.sleep(4000);
        
		
		
		driver.quit();
        

	}

}
