package LeaveModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeaveRequest {

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
		
		//Hover on Leave module
		WebElement leave = driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[12]/a[1]"));
		action.moveToElement(leave).build().perform();
		Thread.sleep(2000);
		
		//Click on Leave Request sub-module
		driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[12]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Leave Request button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]/i[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click and Select Leave Type from the dropdown 
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one type
		WebElement EFN =driver.findElement(By.xpath("//li[contains(text(),'Paid Leave')]"));
		EFN.click();
		Thread.sleep(1000);
		
		//Leave Status field is a Read only field
		
		//Click and Enter Leave Reason
		driver.findElement(By.xpath("//textarea[@id='LEAVE_COMMENTS']")).sendKeys("Testing");
		Thread.sleep(2000);
		
		//Click and select start date from the calendar
		driver.findElement(By.xpath("//input[@id='strtDate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click and select End date from the calendar
		driver.findElement(By.xpath("//input[@id='endDate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		Thread.sleep(2000);
		
		//Leave Applied field value directly dispalyed
		
		//Click on Checkbox selected for Half day
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[10]/div[1]/label[1]")).click();
		Thread.sleep(2000);
		
		//Click on Submit For Approval button
		driver.findElement(By.xpath("//button[contains(text(),'Submit For Approval')]")).click();
		Thread.sleep(2000);
		
		//After clicking on Submit For Approval button showing pop-up window 
		//"Do you want add leave request for ended period" and two buttons "Yes" and "No"
		
		
		//Click on Yes Button
		driver.findElement(By.xpath("//button[contains(text(),'Submit For Approval')]")).click();
		Thread.sleep(2000);

	}

}
