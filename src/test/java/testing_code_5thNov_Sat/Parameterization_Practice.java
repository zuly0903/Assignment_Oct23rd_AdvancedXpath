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

public class Parameterization_Practice {

	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	public static WebDriverWait wait;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://github.com/");
	}
	
	@Test(priority = 1)
	public void signinLink() {
		WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		softassert.assertTrue(signin.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signin)).click();
		softassert.assertAll();
	}
	
	@Test(priority = 2, dependsOnMethods = "signinLink", alwaysRun = true)
	@Parameters({"gituname", "gitpsw"})
	public void loginCredidential(String gituname, String gitpsw) {
		WebElement uname = driver.findElement(By.id("login_field"));
		softassert.assertTrue(uname.isEnabled());
		
		WebElement psw = driver.findElement(By.id("password"));
		softassert.assertTrue(psw.isEnabled());
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(uname)).sendKeys(gituname);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(psw)).sendKeys(gitpsw);
		
		softassert.assertAll();
	}
	
	@Test(priority = 3, dependsOnMethods = {"signinLink", "loginCredidential"}, alwaysRun = true)
	public void usersignin() {
		WebElement sgnbtn = driver.findElement(By.name("commit"));
		softassert.assertTrue(sgnbtn.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(sgnbtn)).click();
		softassert.assertAll();
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
}
