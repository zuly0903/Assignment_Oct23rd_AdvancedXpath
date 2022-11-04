package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_9 {

	public WebDriver driver;

@BeforeTest
public void Browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Test
public void test1() {
	driver.get("https://www.petsmart.com/");
}

@Test

public void test2() {
	driver.findElement(By.xpath("//span[text()='Cat']")).click();
}

@Test
public void test3() {
	driver.findElement(By.xpath("//div[@class='nav-first-level-child'][3]/child::a")).click();
}

@Test
public void test4() {
	driver.findElement(By.xpath("//ul[@id='category-level-1']/child::li[2]/child::a")).click();
}

@Test
public void test5() {
	driver.findElement(By.xpath("//div[@class='dp-logo-container col-lg-3']/descendant::img")).click();
}

@AfterTest
public void quitBrowser() {
	driver.quit();
}
}
