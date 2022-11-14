package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipCart1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a = new Actions(driver);
		a.moveToElement(loginBtn).build().perform();
		Thread.sleep(2000);
		//when in html code there is no code about element that are hidden and goes on hide
		/////////Press Shift + Control + c//////////
		WebElement select = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		select.click();
		
		Thread.sleep(5000);
		driver.close();
		
	}
	
}
