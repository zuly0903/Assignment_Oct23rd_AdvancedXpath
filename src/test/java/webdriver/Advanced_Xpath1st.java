package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advanced_Xpath1st {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		
		// driver.findElement(By.xpath("//div[@id = 'center']/descendant::input[1]")).sendKeys("Best laptop");
		// driver.findElement(By.xpath("//div[@id = 'center']/descendant::form[1]/descendant::input[1]")).sendKeys("Best laptop");
		// driver.findElement(By.xpath("//div[@id = 'center']/child::ytd-searchbox/descendant::input[1]")).sendKeys("Best Laptop");
		// driver.findElement(By.xpath("//div[@id = 'search-input']/descendant::input[1]")).sendKeys("X");
		// driver.findElement(By.xpath("//div[@class = 'style-scope ytd-searchbox']/descendant::input[1]")).sendKeys("L");
		// driver.findElement(By.xpath("//div[@class = 'style-scope ytd-searchbox']/child::yt-icon/following-sibling::div/descendant::input[1]")).sendKeys("6");
		// driver.findElement(By.xpath("//div[@class = 'style-scope ytd-searchbox']/child::div/descendant::input[1]")).sendKeys("7");
		// driver.findElement(By.xpath("//div[@class = 'ytd-searchbox-spt']/descendant::input[1]")).sendKeys("8");
		// driver.findElement(By.xpath("//button[@id ='search-icon-legacy']/preceding::input")).sendKeys("9");
		driver.findElement(By.xpath("//div[@class ='style-scope ytd-searchbox']/preceding::input")).sendKeys("10");
	}

}
