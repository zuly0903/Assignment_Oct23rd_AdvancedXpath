package Oct30_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_7 {
	
	public static WebDriver driver;
	public static Select select;

@BeforeTest
public void Browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Test
public void testcase1() {
	driver.get("https://www.ebay.com/");
}

@Test
public void testcase2() {
	driver.findElement(By.xpath("//span[@class='gh-ug-guest']/child::a")).click();
}

@Test
public void testcase3() {
	driver.findElement(By.cssSelector("a#create-account-link")).click();
	driver.findElement(By.cssSelector("input#businessaccount-radio")).click();
}

@Test
public void testcase4() {
	driver.findElement(By.cssSelector("input#businessName")).sendKeys("PeopleNTech");
	driver.findElement(By.cssSelector("input#businessEmail")).sendKeys("peopletech@gmail.com");
	driver.findElement(By.cssSelector("input#bizPassword")).sendKeys("People@123");
	select = new Select(driver.findElement(By.id("businessCountry")));
	select.selectByVisibleText("United States");
	driver.findElement(By.id("bizOnlyToBuy")).click();
}

@Test
public void testcase5() {
	driver.findElement(By.id("BUSINESS_REG_FORM_SUBMIT")).click();
}

@AfterTest
public void endBrowser() {
	driver.quit();
}

}
