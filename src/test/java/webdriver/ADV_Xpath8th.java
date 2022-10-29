package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADV_Xpath8th {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cnbc.com/");
		
		driver.findElement(By.xpath("//div[@class='SignInMenu-signInMenu']/child::a")).click();
		/*
		driver.findElement(By.xpath("//div[@class='SignInMenu-signInMenu']/descendant::a")).click();
		driver.findElement(By.xpath("//div[@class='SignInMenu-signInContainerBtn']/descendant::a")).click();
		driver.findElement(By.xpath("//div[@class='SignInMenu-signInContainerBtn']/child::div/descendant::a")).click();
		driver.findElement(By.xpath("//div[@class='branding-menu-brandingMenu']/following-sibling::div[3]/descendant::a")).click();
		driver.findElement(By.xpath("//div[@class='branding-menu-brandingMenu']/following-sibling::div[3]/child::div/descendant::a")).click();
		driver.findElement(By.xpath("//div[@class='SignUpMenu-signUpContainer']/preceding::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='SignUpMenu-signUpContainer']/preceding-sibling::div[1]/descendant::a")).click();
		driver.findElement(By.xpath("//div[@class='CNBCGlobalNav-mobileNavMenu']/preceding::a[2]")).click();
		driver.findElement(By.xpath("//div[@class='CNBCGlobalNav-desktopNavMenu']/following-sibling::div[2]/descendant::a")).click();
		*/
	}

}
