package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_23Oct {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String ActualTitle = "Facebook - log in or sign up";
	    String ActualUrl = "https://www.facebook.com/";
	    String ExpectedTitle = driver.getTitle();
	    String ExpectedUrl = driver.getCurrentUrl();
	    
	    if(ActualTitle.equals(ExpectedTitle) && ActualUrl.equals(ExpectedUrl)) {
	    	System.out.println("My url is correct");
	    }else {
	    	System.out.println("My url is wrong");
	    }
	    
	    WebElement create = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
	    if(create.isEnabled() == true && create.isDisplayed() == true) {
	    	create.click();
	    }else {
	    	System.out.println("Error...");
	    }
	    
	   WebElement fname = driver.findElement(By.xpath("//div[@id = 'reg_form_box']/descendant::input[1]"));
	   if(fname.isDisplayed() == true && fname.isEnabled() == true) {
		   fname.sendKeys("Max");
	   }else {
		   System.out.println("Error");
	   }
	   
	   WebElement lname = driver.findElement(By.xpath("//div[@id = 'reg_form_box']/descendant::input[2]"));
	   if(lname.isDisplayed() == true && lname.isEnabled() == true) {
		   lname.sendKeys("John");
	   }else {
		   System.out.println("Error");
	   }
	   
	   WebElement phone = driver.findElement(By.xpath("//div[@id = 'reg_form_box']/descendant::input[3]"));
	   if(phone.isDisplayed() == true && phone.isEnabled() == true) {
		   phone.sendKeys("2223456785");
	   }else {
		   System.out.println("Error");
	   }
	   
	   WebElement psw = driver.findElement(By.xpath("//div[@id = 'reg_form_box']/descendant::input[5]"));
	   if(psw.isDisplayed() == true && psw.isEnabled() == true) {
		   psw.sendKeys("Max@123");
	   }else {
		   System.out.println("Error");
	   }
	}

}
