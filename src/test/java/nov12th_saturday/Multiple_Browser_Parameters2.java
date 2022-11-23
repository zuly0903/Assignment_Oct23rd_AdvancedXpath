package nov12th_saturday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_Browser_Parameters2 {

	
	public static WebDriver driver;

	@Test
	@Parameters({"url2","uname2","password2"})
	public void Rediff(String url2, String uname2, String password2) {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url2);
		driver.findElement(By.id("email")).sendKeys(uname2);
		driver.findElement(By.id("pass")).sendKeys(password2);
		
		
	}
	
}
