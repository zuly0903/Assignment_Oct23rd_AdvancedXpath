package oct29_sat;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab_NewWindow {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com/");
		
		WebElement amazon = driver.findElement(By.xpath("//header[@id='navbar-main']"));
		File source = amazon.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\screenshots\\screenshots1.png");
		FileHandler.copy(source, destination);
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.navigate().to("https://www.youtube.com/");
		
		
	}
	
	
}
