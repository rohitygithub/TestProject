package Sign_It_Online_Test_Scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
		public static ChromeDriver driver;

	 @BeforeTest
	    public void setup() throws InterruptedException {
	    //System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		
	    WebDriverManager.chromedriver().setup(); 
	    ChromeDriver driver = new ChromeDriver();
	    
		
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		// On Login Page
		driver.get("http://www.mydevsystems.com/dev/gap_v2/index.php/login/login");
		Thread.sleep(2000);
		}
	 
	 @AfterTest
		public void End() throws InterruptedException{
		
		driver.quit();
		Thread.sleep(2000);
		}

	

}
