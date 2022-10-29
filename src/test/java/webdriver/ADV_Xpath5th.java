package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADV_Xpath5th {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://news.yahoo.com/");
		
		driver.findElement(By.xpath("//a[@id='ybar-logo']/descendant::img[1]")).click();
		// driver.findElement(By.xpath("//a[@id='ybar-logo']/child::img[1]")).click();
		// driver.findElement(By.xpath("//div[@class='_yb_niq1g _yb_yr4b6']//descendant::img[1]")).click();
		// driver.findElement(By.xpath("//div[@class='_yb_niq1g _yb_gqckp']/following-sibling::div[1]/descendant::img[1]")).click();
		// driver.findElement(By.xpath("//div[@id='ybar-inner-wrap']/child::div[2]/descendant::img[1]")).click();
		/* driver.findElement(By.xpath("//div[@id='ybar']/descendant::img[2]")).click();
		driver.findElement(By.xpath("//div[@id='ybar']/child::div/descendant::img[2]")).click();
		driver.findElement(By.xpath("//div[@id='ybar-search-box-container']/preceding::img[2]")).click();
		driver.findElement(By.xpath("//div[@class='_yb_1t9rw ybar-menu-hover-open']/preceding-sibling::div[2]/descendant::img[1]")).click();
		driver.findElement(By.xpath("//div[@class='_yb_1t9rw ybar-menu-hover-open']/preceding::img[2]")).click();*/
	}

}
