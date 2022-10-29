package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADV_Xpath3rd {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		
		 driver.findElement(By.xpath("//div[@id='nav-xshop-container']/descendant::a[5]")).click();
		// driver.findElement(By.xpath("//div[@id='nav-main']/descendant::a[5]")).click();
		// driver.findElement(By.xpath("//div[@id='nav-flyout-anchor']/following-sibling::div/descendant::a[6]")).click();
		// driver.findElement(By.xpath("//div[@id='navbar']/child::div[4]/descendant::a[6]")).click();
		// driver.findElement(By.xpath("//div[@id='nav-flyout-iss-anchor']/following-sibling::div[2]/descendant::a[6]")).click();
		// driver.findElement(By.xpath("//div[@id='nav-belt']/following-sibling::div[3]/descendant::a[6]")).click();
		// driver.findElement(By.xpath("//div[@id='nav-flyout-iss-anchor']/following-sibling::div[2]/descendant::a[6]")).click();
		// driver.findElement(By.xpath("//div[@id ='nav-subnav-toaster']/preceding::a[26]")).click();
		// driver.findElement(By.xpath("//div[@id ='nav-main']/child::div[2]/descendant::a[6]")).click();
		// driver.findElement(By.xpath("//div[@id='navbar']/child::div[4]/descendant::a[6]")).click();

		
		
	}

}
