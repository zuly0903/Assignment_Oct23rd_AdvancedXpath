package assignment_nov20th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Click {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total number of link is : "+link.size());
		
		for(int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i).getText()+"-------"+link.get(i).isDisplayed());
			if(link.get(i).isDisplayed()== true) {
			link.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			Thread.sleep(3000);
			link = driver.findElements(By.tagName("a"));
		}
	}
		
		for(int i = 0; i < link.size(); ++i) {
			System.out.println(link.get(i).getText()+ " " +link.get(i).getAttribute("href"));
		}
		
		driver.close();
	}

}
