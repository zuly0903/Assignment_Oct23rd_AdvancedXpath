package oct29_sat;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	
	public static WebDriver driver;
	public static Select select;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Text of the alert is : "+text);
		
		if(text.equals("Please enter a valid user name")) {
			Thread.sleep(2000);
			alert.accept();
		}else {
			alert.dismiss();
		}
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#login1")).sendKeys("zuly");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://openweathermap.org/");
		
		WebElement openscreen = driver.findElement(By.cssSelector("div.section.where-to"));
		File source = openscreen.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\screenshots\\open.png");
		FileHandler.copy(source, destination);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("zuli");
		driver.findElement(By.name("lastname")).sendKeys("saidi");
		driver.findElement(By.name("reg_email__")).sendKeys("zuly0903@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jan");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("29");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1995");
	}

}
