package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resend_Docket_test_script {

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
		
		//click on library section
		driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		
		//User click on Docket Status Drop-down option
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(3000);
		
		//User Select the in-progress docket status from drop-down option 
		driver.findElement(By.xpath("//li[contains(text(),'InProgress')]")).click();
		Thread.sleep(3000);
		
		//User click on cancel icon button
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[6]/a[5]/img[1]")).click();
		Thread.sleep(3000);
		
		//User enter comment into comment box And clicked on cancel button
		driver.findElement(By.xpath("//input[@id='cancelationComment-UGhPQnVSRUFkbTl6MVBTWCtjOTdmdz09']")).sendKeys("Some issue");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[2]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		
		//Click click on Docket Status Drop-down option
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(3000);
		
		//User Select the Cancelled docket status from drop-down option 
		driver.findElement(By.xpath("//li[contains(text(),'Cancelled')]")).click();
		Thread.sleep(3000);
		
		//User click on resend button
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[6]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		
		//User click on Resend button
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[5]/button[1]")).click();
		Thread.sleep(3000);
		
		//User upload the document
		WebElement upload = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]"));
		
	    upload.sendKeys("C:\\SIO PDF Demo\\Demo PDF 2-converted.pdf");
	    Thread.sleep(3000);
	    
	    //Click on next button
	    driver.findElement(By.xpath("//a[@id='nextBtn']")).click();
		Thread.sleep(3000);
		
		//User able to See the document is uploaded successfully and can see the party name, email address and set party permission field's are already filled up

		//Click on Next button (Add Parties)
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		
		//User able to see the field are already added on pdf page

		//User click on send docket button
		driver.findElement(By.xpath("//button[contains(text(),'Send Docket')]")).click();
		Thread.sleep(3000);

		
		
		driver.quit();

	}

}
