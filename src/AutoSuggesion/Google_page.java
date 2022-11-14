package AutoSuggesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_page {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(""));
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("info");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(""));

		WebElement googleSearch = driver.findElement(By.xpath("//input[@name='q']"));
		googleSearch.sendKeys("info");
		Thread.sleep(2000);
		
		 List<WebElement> googlesugg = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		 for(int i=0;i<googlesugg.size();i++)
		 {
			 System.out.println(googlesugg.get(i).getText());
			 
		 }
		 
		 for(int i=0;i<googlesugg.size();i++)
		 {
			 String act="informal letter";
			 String expected=googlesugg.get(i).getText();
			 
			 if(act.equals(expected))
			 {
				 googlesugg.get(i).click();
				 break; 
			 }
			 Thread.sleep(3000);
				 
		 }
		 
		driver.close();
	}

}
