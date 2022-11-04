package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_1 {

	public static WebDriver driver;
	
@BeforeTest
public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@Test
public void testcase1() {
	driver.get("https://www.rediff.com/");
	System.out.println("The title of the page is : "+driver.getTitle());
}

@Test
public void testcase2() {
	driver.findElement(By.cssSelector("a.signin")).click();
}

@Test
public void testcase3() {
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
}

@Test
public void testcase4() {
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("a.rd_logout")).click();
}

@Test
public void testcase5() {
	driver.findElement(By.xpath("//a[@class='logo']/child::img")).click();
}

@AfterTest
public void quitBrowser() {
	driver.quit();
}
}
