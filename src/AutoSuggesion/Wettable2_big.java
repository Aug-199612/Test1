package AutoSuggesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Wettable2_big {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/indices/nse?src=moneyhome_nseIndices_more");
		driver.manage().window().maximize();
		
		WebElement rows = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		rows.click();
		List<WebElement> col =
		driver.findElements(By.xpath("//table[@id='dataTable']//tr"));
		for(int i=0;i<col.size();i++)
		{
		System.out.println(col.get(i).getText());
		}
		driver.close();
	
	}

}
