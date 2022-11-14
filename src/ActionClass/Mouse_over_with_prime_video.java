package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over_with_prime_video {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement accountAndList = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	
		Actions a=new Actions(driver);
		a.moveToElement(accountAndList).build().perform();
		Thread.sleep(2000);
		WebElement reccomandation = driver.findElement(By.xpath("//span[text()='Your Recommendations']"));
		reccomandation.click();	
		Thread.sleep(2000);

		//driver.close();
		driver.navigate().back();
		Thread.sleep(2000);

		WebElement accountAndList1 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountAndList1).build().perform();
		Thread.sleep(1000);

		WebElement primeVdo = driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
		primeVdo.click();
		Thread.sleep(1000);
		driver.close();
	
	}

}
