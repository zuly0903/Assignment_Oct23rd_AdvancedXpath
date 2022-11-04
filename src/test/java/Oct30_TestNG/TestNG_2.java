package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_2 {

	public static WebDriver driver;
	
@BeforeTest
public void Browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
}

@Test
public void testcase1() {
	driver.get("https://www.bestbuy.com/");
	System.out.println("The url of the website is : "+driver.getCurrentUrl());
}

@Test
public void testcase2() {
	driver.findElement(By.cssSelector("input#gh-search-input")).sendKeys("HP laptop");
	driver.findElement(By.cssSelector("button.header-search-button")).click();
}

@Test
public void testcase3() {
	driver.findElement(By.xpath("//input[@id='store-pickup-pickuptoday']")).click();
	driver.findElement(By.xpath("//input[@id='soldout_facet-Exclude-Out-of-Stock-Items-0']")).click();
}

@Test
public void testcase4() {
	driver.findElement(By.cssSelector("span.cart-label")).click();
	driver.findElement(By.cssSelector("a.btn.btn-secondary.btn-block.btn-lg")).click();
}

@Test
public void testcase5() {
	driver.findElement(By.cssSelector("nav.hamburger-menu")).click();
}

@AfterTest
public void End() {
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.target.com/");
	driver.quit();
}
}
