package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateImage {

	
	        WebDriver driver;
	        @BeforeClass
	        public void set() throws InterruptedException {
//			System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
	        WebDriverManager.chromedriver().setup();	
			
	        ChromeOptions options = new ChromeOptions();
	        driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("http://www.mydevsystems.com/dev/gap_v2/index.php/login/login");
			Thread.sleep(2000);
	        }
	        
				
//				Enter Credential and Login
	            @Test
	            public void login() throws InterruptedException {
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("GSPLadmin");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GSPLadmin");
				Thread.sleep(2000);
				driver.findElement(By.name("submit")).click();
				Thread.sleep(2000);
				
				WebElement GlobalHR=driver.findElement(By.xpath("//body[1]/div[3]/div[1]/nav[1]/div[1]/img[1]"));     //xpath of image
				String actulimg=GlobalHR.getAttribute("src");                                                         //attribute of image
				String exptimg="http://www.mydevsystems.com/dev/gap_v2/img/global-hr-logo.png";                       //actual url of image
				Assert.assertEquals(actulimg, exptimg);                                                               //comparing both url and xpath of image
				
				
				if(GlobalHR.isDisplayed()) {                                                                         //create condition 
					System.out.println("Image is displayed");
//					verify the image text value
					System.out.println("Image test is"+ GlobalHR );
				}
				else {
					System.out.println("Image is not displayed");
				}
	            }
				@AfterClass
				public void last() {
				driver.quit();
				}
				

	}


