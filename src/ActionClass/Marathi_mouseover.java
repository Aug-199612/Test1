package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Marathi_mouseover {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
//		WebElement marathiLan = driver.findElement(By.xpath("//span[@class=\"nav-icon nav-arrow\"]"));
//		Actions a2=new Actions(driver);
//		a2.moveToElement(marathiLan).perform();
//		WebElement marathiChoose=driver.findElement(By.xpath("//span[text()='मराठी']"));
//		Thread.sleep(2000);
//		marathiChoose.click();
//		Thread.sleep(6000);
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2']"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"a-label a-radio-label\"])[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"a-button-inner\"]//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
