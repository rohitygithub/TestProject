package PracticeAutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
          
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Login on Global HR webpage
		driver.get("http://www.mydevsystems.com/dev/gap_v2/index.php/login/login");
		Thread.sleep(2000);
								
		//Enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
								
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
								
		//click on Login button
		driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(2000);
		
		//Hover on Emp Hub module
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[5]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on My Picture
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[5]/div[1]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(2000);
		
		//click on Add button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
		Thread.sleep(2000);
		
		
		//upload file on picture field
        WebElement upload = driver.findElement(By.xpath("//input[@id='userfile']"));
        
        upload.sendKeys("F:\\Swati Ganesh Yelamkar.docx");
        Thread.sleep(3000);
		
		
		
		
		

	}

}
