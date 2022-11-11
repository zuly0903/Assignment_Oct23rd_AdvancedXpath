package Nov6th_Sun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Actions_Mouse {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {

		String Url = "https://facebook.com";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(Url);
		
		WebElement uname = driver.findElement(By.name("email"));
		
		Actions builder = new Actions(driver);
		Action series = builder
				.moveToElement(uname)
				.click()
				.keyDown(uname, Keys.SHIFT)
				.sendKeys(uname, "zuly")
				.keyUp(uname, Keys.SHIFT)
				.doubleClick(uname)
				.contextClick()
				.build();
		series.perform();
	}

}
