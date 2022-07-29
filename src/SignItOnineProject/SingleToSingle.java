package SignItOnineProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleToSingle {

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
		
		//click on Login button
		driver.findElement(By.xpath("//span[contains(text(),'Send New Docket')]")).click();
		Thread.sleep(2000);
		
		//upload PDF file on SIO
	    WebElement upload = driver.findElement(By.xpath("//input[@id='userfile']"));
				
	    upload.sendKeys("C:\\SIO PDF Demo\\Demo PDF 2-converted.pdf");
	    Thread.sleep(3000);
        
      //click on Next button
      driver.findElement(By.xpath("//a[@id='nextBtn']")).click();
 	  Thread.sleep(2000);
 	  
 	  //Enter Party Name
 	  driver.findElement(By.name("partyName[]")).sendKeys("Rohit R Yelamkar");
 	  Thread.sleep(2000);
 	  
 	  //Enter Email Address
 	  driver.findElement(By.xpath("//input[@id='partyEmail']")).sendKeys("yelmkarr174@gmail.com");
 	  Thread.sleep(2000);
 	  
 	  //Select option of Party permission (click on dropdown functionality)
 	  driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/a[1]")).click();
 	  Thread.sleep(2000);
 	  
 	  WebElement option = driver.findElement(By.xpath("//li[contains(text(),'Signer')]"));
 	  option.click();
 	  
 	  //Enter Private message  
 	  driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/textarea[1]")).sendKeys("Please read carefully");
 	  Thread.sleep(2000);
 	  
 	  driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[2]/div[2]/div[1]/ul[1]/div[2]/li[2]/a[1]/img[1]")).click();
 	  
 	 driver.get("https://www.apps.signitonline.co.uk/index.php/signIt/customise_docket/index/Qzk2RlVuTHlKa1p4aC9XZW1EaGhMZz09");
	 Thread.sleep(2000);
	 
	 Actions action= new Actions(driver);
 	  
	 //Add Signature field
	 //click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[1]/div[3]/img[1]")))
	 action.click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[2]/div[2]")))
 	 .build();
	 
	 
	 
	 //Add Text field
	 //action.click(driver.findElement(By.xpath("//div[@id='addTextBox']")))
	  action.click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[2]/div[1]")))
	  .build();
	  
	  
	  //Add List field
	  action.click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[2]/div[11]")))
	  .build();
	  
	  
	  //Add Custom-date field
	  action.click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[2]/div[3]")))
	  .build();
	  
	  
	  
	  //Add Checkbox field
	  action.click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[2]/div[4]")))
	  .build();
	  
	  
	  //Add one or multiple radio button
	  action.click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[2]/div[5]")))
	  .build();
	  
	  
	  //Add Party Name field
	  action.click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[2]/div[16]")))
	  .build();
	  
	  
	  //Add Email Address field
	  action.click(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[2]/div[17]")))
	  .build();
	  
	  
	//Click on Next button  
	  action.click(driver.findElement(By.xpath("//button[contains(text(),'Send Docket')]"))).click();
	  Thread.sleep(5000);
	  
	  //driver.findElement(By.xpath("//textarea[@id='email_message']")).sendKeys("Hello Everyone");
	  
 	  
	   
	   
	   driver.quit();
 	  

	}

}

//Click on Next button  
 //driver.findElement(By.partialLinkText("Nex")).click();
 //Thread.sleep(2000);
