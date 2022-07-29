package PracticeAutomationScript;





import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//On Find Us On Web login page
		driver.get("https://findusonweb.co.uk/members/index.php");
		Thread.sleep(2000);
		
		
		
		Actions act =new Actions (driver);
		
		driver.findElement(By.name("user_login")).sendKeys("angadgdemo");
		act.sendKeys(Keys.TAB)
		.sendKeys("Geecon0404")
		.sendKeys(Keys.ENTER)
		.build().perform();
		
		
		

	

	
	}

}
