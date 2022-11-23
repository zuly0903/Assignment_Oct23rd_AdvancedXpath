package nov13th_recording;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_To_Read_From_A_Properties_File {
	public static Properties prop;
	public static FileInputStream ip;
	public static WebDriver driver;

	// C:\Users\zuly0\eclipse-workspace\AUTOMATION_BATCH
	
	public static void main(String[] args) throws Exception {

		String path = System.getProperty("user.dir")+"\\src\\test\\java\\nov13th_recording\\config.properties";
		System.out.println(System.getProperty("user.dir"));
		
		prop = new Properties();
	    ip = new FileInputStream(path);
	    prop.load(ip);
	    
	    System.out.println(prop.getProperty("url"));
	    System.out.println(prop.getProperty("unameXpath"));
	    System.out.println(prop.getProperty("uname"));
	    System.out.println(prop.getProperty("passwordXpath"));
	    System.out.println(prop.getProperty("password"));
	    System.out.println(prop.getProperty("signinbtnXpath"));
	    
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(prop.getProperty("url"));
	    driver.findElement(By.xpath(prop.getProperty("unameXpath"))).sendKeys(prop.getProperty("uname"));
	    driver.findElement(By.xpath(prop.getProperty("passwordXpath"))).sendKeys(prop.getProperty("password"));
	    driver.findElement(By.xpath(prop.getProperty("signinbtnXpath"))).click();
	    
	}

}
