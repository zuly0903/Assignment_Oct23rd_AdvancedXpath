package testing_code_5thNov_Sat;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	//Assertion - Assert and SoftAssert
	
	public static WebDriver driver;
	
	@Test
	public void logic1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		Assert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
		driver.findElement(By.className("signin")).click();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(driver.getCurrentUrl()); // https://mail.rediff.com/cgi-bin/login.cgi
		System.out.println(driver.getTitle()); // Rediffmail
		
		Assert.assertEquals(url, "https://mail.rediff.com/cgi-bin/login.cgi");
		Assert.assertEquals(title, "Rediffmail");
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		Assert.assertTrue(true);
		
		WebElement password = driver.findElement(By.id("password"));
		Assert.assertTrue(password.isEnabled());
		password.sendKeys("Selenium@123");
		
		driver.findElement(By.className("signinbtn")).click();
		Assert.assertTrue(true);
		
		String title1 = driver.getTitle();
		System.out.println(driver.getTitle()); //  Rediffmail
		
		Assert.assertEquals(title1, "Rediffmail");
		driver.findElement(By.className("rd_logout")).click();
		Assert.assertTrue(true);
		
		String title2 = driver.getTitle();
		System.out.println(driver.getTitle());  // Welcome to Rediffmail
		
	}
}
