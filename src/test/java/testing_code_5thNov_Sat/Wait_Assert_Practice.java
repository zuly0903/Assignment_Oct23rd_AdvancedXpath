package testing_code_5thNov_Sat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_Assert_Practice {

	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	public static WebDriverWait wait;
	
	@BeforeTest
	public void luanchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
	}
	
	@Test(priority = 1)
	public void signinbtn() {
		WebElement signinbutton = driver.findElement(By.className("signin"));
		softassert.assertTrue(signinbutton.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signinbutton)).click();
		softassert.assertAll();
	}
	
	@Test(priority = 2, dependsOnMethods = "signinbtn", alwaysRun = true)
	@Parameters({"reduname", "redpsw"})
	public void login(String reduname, String redpsw) {
		WebElement uname = driver.findElement(By.id("login1"));
		softassert.assertTrue(uname.isEnabled());
		
		WebElement psw = driver.findElement(By.id("password"));
		softassert.assertTrue(psw.isEnabled());
		
		WebElement signin = driver.findElement(By.name("proceed"));
		softassert.assertTrue(signin.isDisplayed());
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(uname)).sendKeys(reduname);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(psw)).sendKeys(redpsw);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signin)).click();
		
		softassert.assertAll();
	}
	
	@Test(priority = 3, dependsOnMethods = {"signinbtn", "login"}, alwaysRun = true)
	public void logout() {
		WebElement logout = driver.findElement(By.className("rd_logout"));
		softassert.assertTrue(logout.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(logout)).click();
		softassert.assertAll();
	}
	
	@Test(priority = 4, dependsOnMethods = {"signinbtn", "login", "logout"}, alwaysRun = true)
	public void homepage() {
		WebElement home = driver.findElement(By.xpath("//b[text()='Rediff Home']"));
		softassert.assertTrue(home.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(home)).click();
		softassert.assertAll();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
