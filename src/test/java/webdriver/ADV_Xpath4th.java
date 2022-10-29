package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADV_Xpath4th {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		// driver.findElement(By.xpath("//p[@id='signin_info']/descendant::a[1]")).click();
		// driver.findElement(By.xpath("//div[@class='table']/descendant::a[6]")).click();
		// driver.findElement(By.xpath("//div[@class='table']/child::div[3]/descendant::a[1]")).click();
		// driver.findElement(By.xpath("//p[@id='signin_info']/child::a[1]")).click();
		// driver.findElement(By.xpath("//div[@class='logobar']/child::div/descendant::a[6]")).click();
		// driver.findElement(By.xpath("//div[@class='cell topicons']/following-sibling::div/descendant::a[1]")).click();
		// driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/preceding::a[2]")).click();
		// driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/preceding-sibling::div/descendant::a[6]")).click();
		// driver.findElement(By.xpath("//div[@class='navbar']/preceding-sibling::div[3]/descendant::a[6]")).click();
		driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/preceding-sibling::div[1]/descendant::a[6]")).click();
	}

}
