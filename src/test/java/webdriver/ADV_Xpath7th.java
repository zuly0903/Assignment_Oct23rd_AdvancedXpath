package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADV_Xpath7th {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		/* driver.findElement(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']/descendant::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='L3eUgb']/child::div[1]/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='L3eUgb']/descendant::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='LX3sZb']/preceding::a[2]")).click();
		driver.findElement(By.xpath("//div[@class='Fgvgjc']/preceding::a[18]")).click();
		driver.findElement(By.xpath("//div[@class='Fgvgjc']/preceding-sibling::div/child::div/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='Fgvgjc']/preceding-sibling::div/descendant::a[1]")).click();
		driver.findElement(By.xpath("//div[@id='lb']/preceding::a[18]")).click(); */
		driver.findElement(By.xpath("//div[@class='gb_ce']/preceding-sibling::div[3]/descendant::a[1]")).click();
	}

}
