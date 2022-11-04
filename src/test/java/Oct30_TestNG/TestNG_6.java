package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_6 {

	public static WebDriver driver;

@BeforeTest
public void Browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Test
public void testcase1() {
	driver.get("https://www.netflix.com/");
}

@Test
public void testcase2() {
	driver.findElement(By.xpath("//a[text()='Sign In']")).click();
}

@Test
public void testcase3() {
	driver.findElement(By.xpath("//a[text()='Sign up now']")).click();
}

@Test
public void testcase4() {
	driver.findElement(By.cssSelector("input#id_email_hero_fuji")).sendKeys("zuly0903@gmail.com");
}

@Test
public void testcase5() {
	driver.findElement(By.xpath("//div[@class='our-story-card animation-card watchOnTv']/preceding::span[2]")).click();
}

@AfterTest
public void quitBrowser() {
	driver.quit();
}
}
