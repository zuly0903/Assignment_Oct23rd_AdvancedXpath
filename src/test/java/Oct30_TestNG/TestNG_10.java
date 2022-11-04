package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_10 {

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
	driver.get("https://www.reddit.com/");
}

@Test
public void testcase2() {
	driver.findElement(By.xpath("//span[text()='Popular']")).click();
}

@Test
public void testcase3() {
	driver.findElement(By.xpath("//div[@class='_3fyECztJ8AQeIuhZWW-tNU']/child::a")).click();
}

@Test
public void testcase4() {
	driver.findElement(By.xpath("//a[text()='News']")).click();
}

@Test
public void testcase5() {
	driver.findElement(By.cssSelector("svg._1O4jTk-dZ-VIxsCuYB6OR8 ")).click();
}

@AfterTest
public void quitBrowser() {
	driver.quit();
}
}
