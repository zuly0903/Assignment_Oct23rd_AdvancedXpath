package Assignment_Nov6th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	SoftAssert softassert = new SoftAssert();
	public static WebDriverWait wait;
	
	@BeforeTest
	public void Browser() {
		options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void LaunchUrl() {
		driver.get("https://www.rediff.com/");

	}
	
	@Test
	public void SigninLink() {
		driver.findElement(By.cssSelector("a.signin")).click();

	}
	
	@Test
	public void UserLogin() {
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
	}
	
	@Test
	public void Logout() {
		WebElement logout = driver.findElement(By.cssSelector("a.rd_logout"));
		softassert.assertTrue(logout.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(logout)).click();
		softassert.assertAll();
	}
	
	@Test
	public void HomeLink() {
		driver.findElement(By.cssSelector("div.new_container>span>a:nth-child(2)")).click();

	}
	
	@AfterTest
	public void Quit() {
		driver.quit();
	}
}
