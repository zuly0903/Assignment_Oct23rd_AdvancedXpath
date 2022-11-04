package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_3 {

	public static WebDriver driver;
	
@BeforeTest
public void Browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test
public void testcase1() {
	driver.get("https://www.target.com/");
	System.out.println(driver.getCurrentUrl());
}

@Test
public void testcase2() {
	driver.findElement(By.xpath("//a[text()='Categories']")).click();
	driver.findElement(By.xpath("//div[@class='HeaderModalDropdown']/descendant::span[8]")).click();
}

@Test
public void testcase3() {
	driver.findElement(By.xpath("//span[text()='Furniture Deals']")).click();
	driver.findElement(By.xpath("//div[@id='pageBodyContainer']/descendant::img[1]")).click();
}

@Test
public void testcase4() {
	driver.findElement(By.xpath("//a[text()='Find Stores']")).click();
	driver.findElement(By.xpath("//button[text()='enter zip or city, state']")).click();
}

@Test
public void testcase5() {
	driver.findElement(By.cssSelector("input#zipcode")).sendKeys("20850");
	driver.findElement(By.xpath("//button[text()='find store']")).click();
}

@AfterTest
public void End() {
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.facebook.com/");
}
}
