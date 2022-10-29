package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advance_Xpath2nd {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bestbuy.com/cart");
		
		// driver.findElement(By.xpath("//div[@class = 'shop-cart-icon']/descendant::span")).click();
		// driver.findElement(By.xpath("//div[@class = 'cart-icon']/descendant::span")).click();
		// driver.findElement(By.xpath("//a[@class = 'cart-link flex align-items-center']/descendant::span")).click();
		// driver.findElement(By.xpath("//div[@class = 'cart-icon']/child::div/descendant::span[1]")).click();
		// driver.findElement(By.xpath("//div[@class = 'shop-cart-icon']/child::div/descendant::span[1]")).click();
		// driver.findElement(By.xpath("//div[@class = 'pricing-price-change-notification']/child::div/preceding::span[1]")).click();
		// driver.findElement(By.xpath("//div[@class = 'pricing-price-change-notification']/preceding::span[1]")).click();
		// driver.findElement(By.xpath("//div[@class = 'bottom-fluid-container ']/preceding::span[1]")).click();
		// driver.findElement(By.xpath("//div[@class = 'store-locator']/following-sibling::div/descendant::span")).click();
		driver.findElement(By.xpath("//div[@class = 'top-nav']/child::div[3]/descendant::span")).click();
		
	}

}
