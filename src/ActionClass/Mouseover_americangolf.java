package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover_americangolf {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		//WebElement golffoundation = driver.findElement(By.xpath("//a[text()='American Golf Foundation']"));

		Actions a =new Actions(driver);
		a.moveToElement(aboutus).build().perform();
		WebElement golffoundation = driver.findElement(By.xpath("//a[text()='American Golf Foundation']"));

		Thread.sleep(2000);
		golffoundation.click();
		Thread.sleep(2000);

		driver.close();
	
		
	}

}
