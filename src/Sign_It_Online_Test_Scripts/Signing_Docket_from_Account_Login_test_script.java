package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signing_Docket_from_Account_Login_test_script {

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
		
		//User Select the Draft docket status from drop-down option 
		driver.findElement(By.xpath("//li[contains(text(),'Draft')]")).click();
		Thread.sleep(3000);
		
		//User Edit the Draft docket status from drop-down option
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[2]/div[6]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		
		//User click to upload button and upload the document
        WebElement upload = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]"));
		
	    upload.sendKeys("C:\\SIO PDF Demo\\Demo PDF 2-converted.pdf");
	    Thread.sleep(3000);
	    
	    //User click to next button
	    driver.findElement(By.xpath("//a[@id='nextBtn']")).click();
		Thread.sleep(3000);
	    driver.get("https://www.apps.signitonline.co.uk/index.php/signIt/customise_docket/index/UGhPQnVSRUFkbTl6MVBTWCtjOTdmdz09");
		Thread.sleep(2000);
		
		//User click add myself as party as party name
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/a[1]/span[1]")).click();
		Thread.sleep(3000);
		
		//User click to next button
		//driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		//Thread.sleep(3000);
		
		//User added signed field to document
		
		driver.get("https://www.apps.signitonline.co.uk/index.php/signIt/customise_docket/index/UGhPQnVSRUFkbTl6MVBTWCtjOTdmdz09");
		Thread.sleep(2000);
		 //Actions action= new Actions(driver);
	 	  
		 //Add Signature field
		 //click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[1]/div[3]/img[1]")))
		 //action.click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[2]/div[2]")))
	 	 //.build();
		 
		 //User click on send docket button
		 driver.findElement(By.xpath("//button[contains(text(),'Send Docket')]")).click();
		 Thread.sleep(3000);
		 
		 //User click on ok button from docket sending popup
		 driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		 Thread.sleep(3000);
		 
		 //User click on sign button 
		 driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
		 Thread.sleep(3000);
		 
		 //User click on signed field 
		 driver.findElement(By.xpath("//body[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/label[1]")).click();
		 Thread.sleep(3000);
		 
		 //User click on finish button
		 driver.findElement(By.xpath("//button[contains(text(),'Finish')]")).click();
		 Thread.sleep(3000);


	}

}
