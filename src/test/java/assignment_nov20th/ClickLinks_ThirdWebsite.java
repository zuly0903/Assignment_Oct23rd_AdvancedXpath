package assignment_nov20th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinks_ThirdWebsite {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links is : "+links.size());
		
		for(int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText()+"--------"+links.get(i).isDisplayed());
			if(links.get(i).isDisplayed() == true) {
				links.get(i).click();
				System.out.println(driver.getTitle());
				driver.navigate().back();
				Thread.sleep(3000);
				links = driver.findElements(By.tagName("a"));
			}
			
		}
		
		driver.close();
	}

}
