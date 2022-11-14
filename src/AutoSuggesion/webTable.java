package AutoSuggesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(""));
		List<WebElement> row = driver.findElements(By.xpath("//div[@class=\"hmbseindicestable show\"]//ul"));
		List<WebElement> column = driver.findElements(By.xpath("//div[@class=\"hmbseindicestable show\"]//ul[1]//li"));
		
		System.out.println("Total rows = " + row.size());
		System.out.println("Total columns = " + column.size());
		for(int i=0;i<row.size();i++)
		{
		System.out.println(row.get(i).getText());
		}
		
		driver.close();
		
	}

}
