package Recruitment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VacancyMaster {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver_win32 (2)\\chromedriver.exe");
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
		
		//Hover on Recruitment module
		WebElement leave = driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[31]/a[1]/img[1]"));
		action.moveToElement(leave).build().perform();
		Thread.sleep(2000);
		
		//Click on Vacancy master sub-module
		driver.findElement(By.xpath("//a[contains(text(),'Vacancy Master')]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Vacancy Master button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req by dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click and enter Vacancy name
		driver.findElement(By.xpath("//input[@id='VACANCY_NAME']")).sendKeys("Software Tester");
		Thread.sleep(1000);
		
		//Click and select Job title from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement JT =driver.findElement(By.xpath("//li[contains(text(),'automation tester')]"));
		JT.click();
		Thread.sleep(1000);
		
		//Click and enter Required skills
		driver.findElement(By.xpath("//input[@id='REQUIRED_SKILLS']")).sendKeys("Javascript");
		Thread.sleep(1000);
		
		//Click and enter required experience in year
		driver.findElement(By.xpath("//input[@id='REQUIRED_EXPERIENCE']")).sendKeys("0-1 year");
		Thread.sleep(1000);
		
		//Click and enter company name
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("GEECON SYSTEM");
		Thread.sleep(1000);
		
		//Click and Select Department from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[10]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Dept =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[10]/div[1]/div[1]/div[1]/ul[1]/li[87]"));
		Dept.click();
		Thread.sleep(1000);
		
		//Click and select contact from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[11]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Contct =driver.findElement(By.xpath("//li[contains(text(),'Rahul Trading Company')]"));
		Contct.click();
		Thread.sleep(1000);
		
		//Click and enter city name
		driver.findElement(By.xpath("//input[@id='City']")).sendKeys("Mira-Road");
		Thread.sleep(1000);
		
		//Click and enter State name
		driver.findElement(By.xpath("//input[@id='State']")).sendKeys("Maharashtra");
		Thread.sleep(1000);
		
		//Click and select Recruiter from the dropdown 
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[14]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Recut =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[14]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
		Recut.click();
		Thread.sleep(1000);
		
		//Click and select Owner from the dropdown 
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[15]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement owner =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[15]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
		owner.click();
		Thread.sleep(1000);
		
		//Click on start date field
		driver.findElement(By.xpath("//input[@id='start_date']")).click();
		Thread.sleep(1000);
		//Select start date
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(1000);
		
		//Click on Job Expiry Date
		driver.findElement(By.xpath("//input[@id='ExpiryDate']")).click();
		Thread.sleep(1000);
		//Select start date
		driver.findElement(By.xpath("//a[contains(text(),'31')]")).click();
		Thread.sleep(1000);
		
		//Click and Enter Duration 
		driver.findElement(By.xpath("//input[@id='Duration']")).sendKeys("10");
		Thread.sleep(1000);
		
		//Click and enter Maximum Rate
		driver.findElement(By.xpath("//input[@id='maximum_rate']")).sendKeys("20");
		Thread.sleep(1000);
		
		//Click and select Type from the dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[20]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement type =driver.findElement(By.xpath("//li[contains(text(),'C2H (Contract to Hire)')]"));
		type.click();
		Thread.sleep(1000);
		
		//Click and enter Minimum salary range
		driver.findElement(By.xpath("//input[@id='minSalaryRange']")).sendKeys("50000");
		Thread.sleep(1000);
		
		//Click and enter maximum salary range
		driver.findElement(By.xpath("//input[@id='maxSalaryRange']")).sendKeys("100000");
		Thread.sleep(1000);
		
		//Click and enter openings 
		driver.findElement(By.xpath("//input[@id='Openings']")).sendKeys("20");
		Thread.sleep(1000);
		
		//Click and enter company job
		driver.findElement(By.xpath("//input[@id='CompanyJobID']")).sendKeys("50");
		Thread.sleep(1000);
		
		//Tick mark on checkbox select for "Hot"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[25]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Tick mark on checkbox select for "Public Check"
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[26]/div[1]/label[1]")).click();
		Thread.sleep(1000);
		
		//Enter Job Description
		driver.findElement(By.xpath("//iframe[@id='VACANCY_DESC_ifr']")).sendKeys("Testing");
		Thread.sleep(1000);
		
		//Click on cancel button
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]s")).click();
		Thread.sleep(1000);
		

	}

}
