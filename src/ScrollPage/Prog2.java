package ScrollPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);//one method,one time
		//method1
		//Scroll as per the value of x and y in scrollBy method
		//js.executeScript("window.scrollBy(0,575)");
		
		//method2
		//Scroll as per height of page and reach to bottom
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//method3
		//Scroll up to the web element
		WebElement upto = driver.findElement(By.xpath("//span[text()='Decors & Planters for your garden']"));
		js.executeScript("arguments[0].scrollIntoView();",upto);
		Thread.sleep(5000);

		driver.close();

	}

}
