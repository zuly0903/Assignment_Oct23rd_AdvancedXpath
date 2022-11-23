package assignment_nov20th;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links_SecondWebsite {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		
		List<WebElement> totalLink = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links is : "+totalLink.size());
		
		for(int i = 0; i < totalLink.size(); i++) {
			System.out.println(totalLink.get(i).getText()+"-------"+totalLink.get(i).isDisplayed());
			if(totalLink.get(i).isDisplayed() == true) {
				totalLink.get(i).click();
				System.out.println(driver.getTitle());
				driver.navigate().back();
				Thread.sleep(3000);
				totalLink = driver.findElements(By.tagName("a"));
			}
			
		}
		
		for(int i = 0; i < totalLink.size(); ++i) {
			System.out.println(totalLink.get(i).getText()+" "+totalLink.get(i).getAttribute("href"));
		}
		
		driver.close();
		
	}

}
