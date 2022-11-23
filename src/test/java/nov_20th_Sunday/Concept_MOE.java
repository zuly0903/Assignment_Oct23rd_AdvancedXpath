package nov_20th_Sunday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_MOE {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		List<WebElement> RediffLink = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links tag is : "+RediffLink.size());
		
		WebElement TwentyFirstLink = RediffLink.get(20);
		System.out.println(TwentyFirstLink.getText());
		System.out.println(TwentyFirstLink.getAttribute("href"));
		System.out.println("X cordinate is : "+TwentyFirstLink.getLocation().x+" Y cordinate is : "+TwentyFirstLink.getLocation().y);
		
		for(int i = 0; i <= RediffLink.size(); i++) {
			WebElement TotalLinks = RediffLink.get(i);
			System.out.println(TotalLinks.getText()+"-------"+TotalLinks.isDisplayed());
			if(TotalLinks.isDisplayed()) {
				TotalLinks.click();
				driver.getTitle();
			}
			driver.navigate().to("https://www.rediff.com/");
		} 
		
		driver.quit();
	}

}
