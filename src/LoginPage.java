
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.mydevsystems.com/dev/gap_v2/index.php/login/login");
		//click on Username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("GSPLadmin");
		//click on Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("GSPLadmin");
		//click on Login button
		driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
