package oct29_sat;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zara.com/us/");
		
		WebElement zara = driver.findElement(By.cssSelector("img.media-image__svg"));
		File source = zara.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\screenshots\\zara.png");
		FileHandler.copy(source, destination);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.apple.com/");
		
		WebElement apple = driver.findElement(By.cssSelector("figure.unit-image.unit-image-ipad-hero-ipad"));
		File source1 = apple.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(System.getProperty("user.dir")+"\\screenshots\\apple.png");
		FileHandler.copy(source1, destination1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www2.hm.com/en_us/free-form-campaigns/2006-hm-studio-aw22.html#/");
		
		WebElement hm = driver.findElement(By.cssSelector("nav.Header-module--headerNavigation__HI4Xz"));
		File source2 = hm.getScreenshotAs(OutputType.FILE);
		File destination2 = new File(System.getProperty("user.dir")+"\\screenshots\\hm.png");
		FileHandler.copy(source2, destination2);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://abcnews.go.com/");
		
		WebElement news = driver.findElement(By.cssSelector("nav.navigation.navigation--has-subnav"));
		File source3 = news.getScreenshotAs(OutputType.FILE);
		File destination3 = new File(System.getProperty("user.dir")+"\\screenshots\\news.png");
		FileHandler.copy(source3, destination3);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://openweathermap.org/");
		
		WebElement weather = driver.findElement(By.cssSelector("div.section.where-to"));
		File source4 = weather.getScreenshotAs(OutputType.FILE);
		File destination4 = new File(System.getProperty("user.dir")+"\\screenshots\\weather.png");
		FileHandler.copy(source4, destination4);
	}

}
