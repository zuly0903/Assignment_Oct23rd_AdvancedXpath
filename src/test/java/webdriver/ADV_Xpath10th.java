package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADV_Xpath10th {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cars.com/");
		
		/*
		driver.findElement(By.xpath("//ep-svg[@class='menu-icon']/following-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[@class='nav-user-menu-button']/child::span[1]")).click();
		driver.findElement(By.xpath("//button[@class='nav-user-menu-button']/child::ep-svg/following-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[@class='nav-user-menu-button']/descendant::span[1]")).click();
		driver.findElement(By.xpath("//button[@class='nav-user-menu-button']/following-sibling::div/preceding::span[2]")).click();
		driver.findElement(By.xpath("//ul[@class='header-links']/following-sibling::button/descendant::span[1]")).click();
		driver.findElement(By.xpath("//ul[@class='header-links']/following-sibling::button/child::span[1]")).click();
		driver.findElement(By.xpath("//ul[@class='header-links']/following-sibling::button/child::ep-svg/following-sibling::span[1]")).click();
		driver.findElement(By.xpath("//div[@id='google-one-tap']/preceding::span[2]")).click();
		*/
		
		driver.findElement(By.xpath("//div[@id='google-one-tap']/preceding-sibling::button/child::span[1]")).click();
	}

}
