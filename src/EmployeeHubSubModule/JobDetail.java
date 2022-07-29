package EmployeeHubSubModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JobDetail {

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
		WebElement emp = driver.findElement(By.xpath("//body/div[3]/div[1]/nav[1]/ul[1]/li[1]/a[1]/img[1]"));
		action.moveToElement(emp).build().perform();
		Thread.sleep(2000);
		
		//Click on Job Details sub-module
		driver.findElement(By.xpath("//a[contains(text(),'Job Details')]")).click();
		Thread.sleep(2000);
		
		//Click on Add New Job Details button
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[5]/div[2]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Click on Req By dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement Req =driver.findElement(By.xpath("//li[contains(text(),'Narkar')]"));
		Req.click();
		Thread.sleep(1000);
		
		//Click on Emp Full Name dropdown
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		//Select one name
		WebElement EFN =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
		EFN.click();
		Thread.sleep(1000);
		
		//Click on DOJ field
		driver.findElement(By.xpath("//input[@id='DATE_OF_JOINING']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(1000);
		
		//Click on PSD field
		driver.findElement(By.xpath("//input[@id='PAYROLL_START_DATE']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]")).click();
		Thread.sleep(1000);
		
		//Click on Employee Type field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[8]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement ET =driver.findElement(By.xpath("//li[contains(text(),'Full Time Employee')]"));
		ET.click();
		Thread.sleep(1000);
		
		//Click on Employee Status field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[9]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement ES =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[9]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
		ES.click();
		Thread.sleep(1000);
		
		//Click and Enter Auto Pay No.
		driver.findElement(By.xpath("//input[@id='EMP_auto_pay_no']")).sendKeys("124000157007");
		Thread.sleep(1000);
		
		//Click and Enter PaySlip PDF Password
		driver.findElement(By.xpath("//input[@id='EMP_payslip_pdf_password']")).sendKeys("wubj@hu5@");
		Thread.sleep(1000);
		
		//Click and Enter Employee Gross Salary
		driver.findElement(By.xpath("//input[@id='EMP_grossy_salary']")).sendKeys("50000");  //And we can see the Three field's value's are directly displayed.
		Thread.sleep(1000);                                                                  //1.Basic Hourly  2.Basic Daily 3.Basic Monthly
		
		//Click on Currency field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[16]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement CF =driver.findElement(By.xpath("//li[contains(text(),'US DOLLAR')]"));
		CF.click();
		Thread.sleep(1000);
		
		//Click on Payment Method field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[17]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement PM =driver.findElement(By.xpath("//li[contains(text(),'Direct Payment')]"));
		PM.click();
		Thread.sleep(1000);
		
		//Click on Salary Calculation Basics
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[18]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement SCB =driver.findElement(By.xpath("//li[contains(text(),'Daily')]"));
		SCB.click();
		Thread.sleep(1000);
		
		//Click and Enter Commited Hours
		//driver.findElement(By.xpath("//input[@id='Emp_commited_hours']")).sendKeys("9");  //And we can see the Three field's value's are directly displayed.
		//Thread.sleep(1000);
		
		//Click on Department field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[20]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement Dep =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[20]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
		Dep.click();
		Thread.sleep(1000);
		
		//Click on Work Location field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[21]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement WL =driver.findElement(By.xpath("//li[contains(text(),'Ahmedabad')]"));
		WL.click();
		Thread.sleep(1000);
		
		//Click on Designation field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[22]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement Desg =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[22]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
		Desg.click();
		Thread.sleep(1000);
		
		//Click on Employee Category field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[23]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement EmpCA =driver.findElement(By.xpath("//li[contains(text(),'Audiological Science')]"));
		EmpCA.click();
		Thread.sleep(1000);
		
		//Click on Job Category field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[24]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
		WebElement JobCa =driver.findElement(By.xpath("//li[contains(text(),'Additional Clinical Services')]"));
		JobCa.click();
		Thread.sleep(1000);
		
		//Click on Job Title field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[25]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement JobTitle =driver.findElement(By.xpath("//li[contains(text(),'Java Developer')]"));
		JobTitle.click();
		Thread.sleep(2000);
		
		//Click on Position field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[26]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement Pose =driver.findElement(By.xpath("//li[contains(text(),'first')]"));
		Pose.click();
		Thread.sleep(2000);
		
		//Click on Employee Band field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[27]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement EmpBand =driver.findElement(By.xpath("//li[contains(text(),'Band 1')]"));
		EmpBand.click();
		Thread.sleep(2000);
		
		//Click on Emp Grade field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[28]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement EmpGrd =driver.findElement(By.xpath("//li[contains(text(),'Grade 2')]"));
		EmpGrd.click();
		Thread.sleep(2000);
		
		//Click on Confirmation Date field
		driver.findElement(By.xpath("//input[@id='CONFIRMATION_DATE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();
		Thread.sleep(2000);
		
		//Click on Last Appraisal Date field
		driver.findElement(By.xpath("//input[@id='LAST_APPRAISAL_DATE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]")).click();
		Thread.sleep(2000);
		
		//Click on Appraisal Type
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[31]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement AppType =driver.findElement(By.xpath("//li[contains(text(),'Internship Conversion')]"));
		AppType.click();
		Thread.sleep(2000);
		
		//Click on Holiday Group field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[32]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement HGroup =driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[32]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
		HGroup.click();
		Thread.sleep(2000);
		
		//Click and Enter Work Station 
		driver.findElement(By.xpath("//input[@id='WORK_STATION']")).sendKeys("Raigad");
		Thread.sleep(2000);
		
		//Click on Cost Center field
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[5]/div[2]/form[1]/fieldset[1]/div[1]/div[2]/div[34]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement CostST =driver.findElement(By.xpath("//li[contains(text(),'Non Taxable Income')]"));
		CostST.click();
		Thread.sleep(2000);
		
		//Click on Cancel button 
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
