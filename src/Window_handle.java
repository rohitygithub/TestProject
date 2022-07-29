import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		
		String parentwindowhandle = driver.getWindowHandle();
		//System.out.println("The Parent handle is" + parentwindowhandle);
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set <String> handles=driver.getWindowHandles();
		
		for(String child:handles) 
		{
		
		if(!child.equals(parentwindowhandle)) {
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//input[@id='malerb']")).click();
		Thread.sleep(2000);
		driver.close();
		}
		}
		
		driver.switchTo().window(parentwindowhandle);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Selenium");
		
		
		
		
		

	}

}
