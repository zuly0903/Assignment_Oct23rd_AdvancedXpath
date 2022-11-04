package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_8 {

	public static WebDriver driver;
@BeforeTest
public void Browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Test
public void tc1() {
	driver.get("https://www.asos.com/us/");
}

@Test
public void tc2() {
	driver.findElement(By.cssSelector("a#men-floor")).click();
}

@Test
public void tc3() {
	driver.findElement(By.cssSelector("input#chrome-search")).sendKeys("Nike");
}

@Test
public void tc4() {
	driver.findElement(By.xpath("//button[@class='kH5PAAC _1KRfEms']")).click();
}

@Test
public void tc5() {
	driver.findElement(By.cssSelector("img._3JHHN36")).click();
}

@AfterTest
public void endBrowser() {
	driver.quit();
}
}
