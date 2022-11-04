package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_4 {

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
	driver.get("https://www.facebook.com/");
}

@Test
public void testcase2() {
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
}

@Test
public void testcase3() {
	driver.findElement(By.name("firstname")).sendKeys("zuly");
	driver.findElement(By.name("lastname")).sendKeys("saidi");
	driver.findElement(By.name("reg_email__")).sendKeys("2343454567");
	driver.findElement(By.name("reg_passwd__")).sendKeys("zuly123");
}

@Test
public void testcase4() {
	select = new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("Jan");
	select = new Select(driver.findElement(By.id("day")));
	select.selectByVisibleText("29");
	select = new Select(driver.findElement(By.id("year")));
	select.selectByVisibleText("1995");
}

@Test
public void testcase5() {
	driver.findElement(By.cssSelector("img._8idr.img")).click();
}

@AfterTest
public void quitBrowser() {
	driver.quit();
}
}
