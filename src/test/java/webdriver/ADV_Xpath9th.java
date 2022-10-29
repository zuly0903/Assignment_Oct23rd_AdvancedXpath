package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADV_Xpath9th {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.walmart.com/");
		
		
		/*
		driver.findElement(By.xpath("//div[@class='f7 mw3 mw4-hdkp lh-title truncate']/following-sibling::div")).click();
		driver.findElement(By.xpath("//div[@class='dn db-hdkp relative']/descendant::div[3]")).click();
		driver.findElement(By.xpath("//div[@class='dn db-hdkp relative']/child::a/child::div/child::div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dn db-hdkp relative']/child::a/child::div/descendant::div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dn db-hdkp relative']/child::a/descendant::div[3]")).click();
		driver.findElement(By.xpath("//div[@class='dn db-hdkp relative']/child::a/child::i/following-sibling::div/child::div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dn db-hdkp relative']/child::a/child::i/following-sibling::div/descendant::div[2]")).click();
		driver.findElement(By.xpath("//script[@id='__NEXT_DATA__']/preceding::div[201]")).click();
		driver.findElement(By.xpath("//div[@class='dn db-hdkp ml3 relative']/following-sibling::div/child::a/child::div/child::div[2]")).click();
		*/
		
		driver.findElement(By.xpath("//div[@class='dn db-hdkp ml3 relative']/following-sibling::div/descendant::div[3]")).click();
		
	}

}
