package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_5 {

	public static WebDriver driver;
	public static Select select;
	
@BeforeTest
public void Browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test
public void testcase1() {
	driver.get("https://www.cars.com/");
}

@Test
public void testcase2() {
	select = new Select(driver.findElement(By.name("stock_type")));
	select.selectByVisibleText("New");
}

@Test
public void testcase3() {
	select = new Select(driver.findElement(By.name("makes[]")));
	select.selectByVisibleText("BMW");
}

@Test
public void testcase4() {
	select = new Select(driver.findElement(By.name("models[]")));
	select.selectByVisibleText("All models");
}

@Test
public void testcase5() {
	driver.findElement(By.xpath("//div[@id='by-make-tab']/descendant::button")).click();
}

@AfterTest
public void quitBrowser() {
	driver.quit();
}
}
