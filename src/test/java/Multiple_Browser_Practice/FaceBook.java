package Multiple_Browser_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FaceBook {

	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser2","url2","uname2","psw2"})
	public void facebook(String Browser2, String url2, String uname2, String psw2) {
		if(Browser2.equals("edge")) {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		driver.get(url2);
		driver.findElement(By.id("email")).sendKeys(uname2);
		driver.findElement(By.id("pass")).sendKeys(psw2);
	}
}
