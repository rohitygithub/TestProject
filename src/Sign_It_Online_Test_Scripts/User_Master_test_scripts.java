package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Master_test_scripts {

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
		
		//Click on User module
		driver.findElement(By.xpath("//body/div[2]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		//Click on Add New User master button
		//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[2]/a[1]/i[1]")).click();
		//Thread.sleep(2000);
		
		//"Save" button functionality
		//User fill its all personal details 
		//Enter Full Name
		//driver.findElement(By.xpath("//input[@id='FullName']")).sendKeys("Rohit R Yelamkar");
		//Thread.sleep(2000);
		
		//Enter User name
		//driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Rohity");
		//Thread.sleep(2000);
		
		//Enter Email
		//driver.findElement(By.xpath("//input[@id='RegEmail']")).sendKeys("rohity174@gmail.com");
		//Thread.sleep(2000);
		
		//Enter Password
		//driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("rohity174");
		//Thread.sleep(2000);
		
		//Click on user status checkbox
		//driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/label[1]")).click();
		//Thread.sleep(2000);
		
		//Click on "Save" button after entering all data in the form
		//driver.findElement(By.xpath("//button[@id='main']")).click();
		//Thread.sleep(2000);
		
		//"Save and Add" button functionality 
		//User fill its all personal details 
		//Enter Full Name
		//driver.findElement(By.xpath("//input[@id='FullName']")).sendKeys("Rohit R. Y");
		//Thread.sleep(2000);
		
		//Enter User name
		//driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Rohitry");
		//Thread.sleep(2000);
		
		//Enter Email
		//driver.findElement(By.xpath("//input[@id='RegEmail']")).sendKeys("rohity174@gmail.com");
		//Thread.sleep(2000);
		
		//Enter Password
		//driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("rohity1742000");
		//Thread.sleep(2000);
		
		//Click on user status checkbox
		//driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/label[1]")).click();
		//Thread.sleep(2000);
		
		//Click on "Save and Add" button after entering all data in the form
		//driver.findElement(By.xpath("//button[contains(text(),'Save And Add')]")).click();
		//Thread.sleep(2000);
		
		//"Cancel" button functionality 
		//User fill its all personal details 
		//Enter Full Name
		//driver.findElement(By.xpath("//input[@id='FullName']")).sendKeys("Rohit R.");
		//Thread.sleep(2000);
		
		//Enter User name
		//driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Ro-hitry");
		//Thread.sleep(2000);
		
		//Enter Email
		//driver.findElement(By.xpath("//input[@id='RegEmail']")).sendKeys("rohity174@gmail.com");
		//Thread.sleep(2000);
		
		//Enter Password
		//driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("rohity1742000");
		//Thread.sleep(2000);
		
		//Click on user status checkbox
		//driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/label[1]")).click();
		//Thread.sleep(2000);
		
		//Click on "Cancel" button after entering all data in the form
		//driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		//Thread.sleep(2000);
		
		//Click on edit option from action section
		//driver.findElement(By.xpath("//tbody/tr[@id='row_4287']/td[7]/a[1]/img[1]")).click();
		//Thread.sleep(2000);
		
		//Click on on Active user thumb icon from header
		//driver.findElement(By.xpath("//a[contains(text(),'Activate User')]")).click();
		//Thread.sleep(2000);
		
		//Click on edit option from action section
		//driver.findElement(By.xpath("//tbody/tr[@id='row_4287']/td[7]/a[1]/img[1]")).click();
		//Thread.sleep(2000);
		
		//Click on on Deactivate user thumb icon from header
		//driver.findElement(By.xpath("//a[contains(text(),'Deactivate User')]")).click();
		//Thread.sleep(2000);
		
		//Click on Delete icon to delete User name  with selecting the checkbox
		//driver.findElement(By.xpath("//tbody/tr[@id='row_4287']/td[1]")).click();
		//Thread.sleep(2000);
		
		//Click on Delete icon button
		//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[2]/button[4]/i[1]")).click();    //See the user is successfully deleted
		//Thread.sleep(2000);
		
		//Click on Delete icon to delete User name  without selecting the checkbox 
		//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[2]/button[4]/i[1]")).click();    //see the alert message is generated 
		//Thread.sleep(2000);
		
		//Click on Activate Suspended User Icon from header without selecting any user
		//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[2]/button[1]/i[1]")).click();    //see the alert message is generated 
		//Thread.sleep(2000);
		
		//Close pop-up window 
		//driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
		//Thread.sleep(2000);
		
		//Click on Checkbox for selecting  user
		//driver.findElement(By.xpath("//tbody/tr[@id='row_4520']/td[1]")).click();
		//Thread.sleep(2000);
		
		//Click on Activate Suspended User Icon
		//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[2]/button[1]/i[1]")).click();
		//Thread.sleep(2000);
		
		//User click on search tool
		//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")).click();
		//Thread.sleep(2000);
		
		//User enter (Search) any details
		//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys("DEMadmin");
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")).clear();
		//Thread.sleep(4000);
		
		//Click on Activate User thumb icon from header without selecting any user checkbox
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[2]/button[2]/i[1]")).click();
		Thread.sleep(2000);
		
		//Closing pop-up window
		driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
		Thread.sleep(2000);
		
		//Click on Deactivate User thumb icon from header without selecting any user
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[2]/button[3]/i[1]")).click();
		Thread.sleep(2000);
		
		//Closing pop-up window
		driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
		Thread.sleep(2000);
		
		//Click on selecting option from record per page drop-down 
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[8]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		
		
		driver.quit();
		
		

	}

}
