package Multiple_Browser_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff {

	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser1","url1","uname1","psw1"})
	public void rediff(String Browser1, String url1, String uname1, String psw1) {
		if(Browser1.equals("chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} else {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		driver.get(url1);
		driver.findElement(By.id("login1")).sendKeys(uname1);
		driver.findElement(By.id("password")).sendKeys(psw1);
	}
}
