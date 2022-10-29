package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADV_Xpath6th {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/java/technologies/");
		
		/* driver.findElement(By.xpath("//a[@id='u30btitle']/child::div")).click();
		driver.findElement(By.xpath("//a[@id='u30btitle']/descendant::div")).click();
		driver.findElement(By.xpath("//div[@id='u30brand']/descendant::div[2]")).click();
		driver.findElement(By.xpath("//div[@id='u30brand']/child::div/descendant::div")).click();
		driver.findElement(By.xpath("//section[@id='u30']/child::div[1]/descendant::div[2]")).click();
		driver.findElement(By.xpath("//body[@class='f11 f11v6 ready']/child::div[2]/descendant::div[3]")).click();
		driver.findElement(By.xpath("//div[@id='u30skip2content']/following-sibling::div/descendant::div[3]")).click();
		driver.findElement(By.xpath("//body[@class='f11 f11v6 ready']/descendant::div[5]")).click();
		driver.findElement(By.xpath("//div[@id='u30nav']/preceding::div[2]")).click(); */
		driver.findElement(By.xpath("//div[@id='u30nav']/preceding-sibling::div/child::div")).click();
	}

}
