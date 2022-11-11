package Assignment_Nov6th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_2 {
	
	public static WebDriver driver;
	public static Select select;
	public static WebDriverWait wait;
	
	@BeforeTest
	public void Browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test 
	public void LaunchUrl(){
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void createAccount() {
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("zuly");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("saidi");
		driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys("zulysaidi@gmail.com");
		WebElement reenteremail = driver.findElement(By.cssSelector("input[name=reg_email_confirmation__]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(reenteremail)).sendKeys("zulysaidi@gmail.com");
		driver.findElement(By.cssSelector("input[name=reg_passwd__]")).sendKeys("zuly@123");
		select = new Select(driver.findElement(By.cssSelector("select#month")));
		select.selectByVisibleText("Jan");
		select = new Select(driver.findElement(By.cssSelector("select#day")));
		select.selectByVisibleText("29");
		select = new Select(driver.findElement(By.cssSelector("select#year")));
		select.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.cssSelector("button[name=websubmit]")).click();
		}
	
	@AfterTest
	public void quit() {
		//driver.quit();
	}
}
