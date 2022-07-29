package LeaveModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeaveTypeConfiguration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//On Login page
		driver.get("http://www.geecon.co.uk/dev/gap_v2/index.php/login/login");
		Thread.sleep(2000);
		
		//Enter Username here
		driver.findElement(By.name("username")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
		
		//Enter Password here 
		driver.findElement(By.name("password")).sendKeys("GSPLadmin");
		Thread.sleep(2000);
		
		//click on Login button
		driver.findElement(By.className("login_submit")).click();
		Thread.sleep(2000);
		
		//Using Action Class 
		Actions action =new Actions(driver);
		
		//Hover on Employee Hub module
		WebElement leave = driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[12]/a[1]"));
		action.moveToElement(leave).build().perform();
		Thread.sleep(2000);
		
		//Click on Leave Request sub-module
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[12]/div[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Leave Type Configuration button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//li[contains(text(),'Narkar')]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click and select Leave Type from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement LT =driver.findElement(By.xpath("//li[contains(text(),'Bereavement Leave')]"));
		LT.click();
		Thread.sleep(1000);
		
		//Click on checkbox selected for Available Flag
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/label[1]")).click();
		Thread.sleep(2000);
		
		//Click and select Applicable Entry from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement AF =driver.findElement(By.xpath("//li[contains(text(),'Afghanistan')]"));
		AF.click();
		Thread.sleep(1000);
		
		//Click and Enter No.Of days
		driver.findElement(By.xpath("//input[@id='NO_OF_DAYS_ALLOTED']")).sendKeys("2");
		Thread.sleep(1000);
		
		//Click and enter Leave in one Stretch
		driver.findElement(By.xpath("//input[@id='LEAVE_IN_ONE_STRETCH']")).sendKeys("5");
		Thread.sleep(1000);
		
		//Tick mark on checkbox of "Allow Nagative Balance"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[10]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Click on checkbox of "Loss of Pay"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[11]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Click on Checkbox of "Adhoc Allocation"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[12]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Click on checkbox of "Applicable on Probation"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[13]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Click on Checkbox of "Applicable on notice period"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[14]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Click on checkbox of "Enable MLA"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[15]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//After clicking on Enable MLA checkbox displayed "MLA limit" field
		
		//Click and Enter MLA Limit
		driver.findElement(By.xpath("//input[@id='leavelimit']")).sendKeys("4");
		Thread.sleep(1000);
		
		//Click on Checkbox of "Advance Leave"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[17]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//After clicking on Advance Leave checkbox displayed "No. of Advanced leave" field
		
		//Click and Enter No. of Advanced Leave
		driver.findElement(By.xpath("//input[@id='advanceNo']")).sendKeys("2");
		Thread.sleep(1000);
		
		//Click on Checkbox of "Back Dated Enable leave"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[19]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//After clicking on Back Dated Enable leave checkbox displayed "Apply Leave Request Limit Unit" and "Apply Leave Request Limit" field
		
		//Click and select Apply Leave Request Limit Unit from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[20]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement ALRLU =driver.findElement(By.xpath("//li[contains(text(),'General Activity')]"));
		ALRLU.click();
		Thread.sleep(1000);
		
		//Click and enter Apply Leave Request Limit
		driver.findElement(By.xpath("//input[@id='ALRL']")).sendKeys("5.0");
		Thread.sleep(1000);
		
		//Click on Checkbox of "Carry Over Allowed"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[22]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//After clicking on Carry Over Allowed checkbox displayed "Max carry over limit" field
		
		//Click and enter Max Carry over limit 
		driver.findElement(By.xpath("//input[@id='maxCarryOverLimit']")).sendKeys("5");
		Thread.sleep(1000);
		
		//Click on checkbox of "Leave Applicable to"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[24]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement LAT =driver.findElement(By.xpath("//li[contains(text(),'Male')]"));
		LAT.click();
		Thread.sleep(1000);
		
		//Click on Cancel button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();

	}

}
