package ActionClass;
//right click and double click programs successfully runed...exception occur
//unhandled alertv exception occured
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class double_click {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement rightClickbtn= driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleClickbtn= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 Actions ab=new Actions(driver);
		 ab.moveToElement(rightClickbtn).contextClick().build().perform();
		 Thread.sleep(2000);
		 for(int i=0;i<3;i++)
		 {
			 ab.sendKeys(Keys.DOWN).build().perform();/// or
			// ab.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(3000);

		 }
		Thread.sleep(3000);
		/*ab.doubleClick(doubleClickbtn).build().perform();//OR
		ab.moveToElement(doubleClickbtn).doubleClick().build().perform();
		Thread.sleep(3000);*/
		
		
		driver.close();
		
	}

}
