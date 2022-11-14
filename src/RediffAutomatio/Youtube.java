package RediffAutomatio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {
	//input[@id="search"]
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement searchTab = driver.findElement(By.xpath("//input[@id=\"search\"]"));
		WebElement search = driver.findElement(By.xpath("(//button[@aria-label=\"Search\"])[1]"));		
		searchTab.sendKeys("jiya re");
		Thread.sleep(3000);
		search.click();
		Thread.sleep(1000);
		//WebElement songSelect = driver.findElement(By.xpath("//*[@id=\"contents\"]/ytd-item-section-renderer"));		
		WebElement songSelect1 = driver.findElement(By.xpath("//a[@title=\"Jiya Re Song | Jab Tak Hai Jaan | Shah Rukh Khan, Anushka Sharma | A R Rahman | Gulzar | Neeti Mohan\"]"));
		Thread.sleep(3000);
		songSelect1.click();
		Thread.sleep(40000);
		driver.close();		
	}
}
