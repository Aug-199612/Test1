package IframePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\ScreeShotProject\\cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("school");
		//WebElement	iframe	=	driver.findElement(By.xpath("//iframe[@class='lazyloaded']"));
		//WebElement iframe=driver.findElement(By.xpath("//iframe[@class='lazyloaded']"));;
		driver.switchTo().frame("google_esf");
		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("raa");
		Thread.sleep(3000);
		driver.close();
		
	
		
		
		
	}

}
