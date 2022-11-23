package nov12th_saturday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_Browser_Parameters1 {
	
	public static WebDriver driver;
	@Test
	@Parameters({"url1","uname1","password1"})
	public void Rediff(String url1, String uname1, String password1) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url1);
		driver.findElement(By.id("login1")).sendKeys(uname1);
		driver.findElement(By.id("password")).sendKeys(password1);
		
	}
	
}
