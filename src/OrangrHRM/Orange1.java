package OrangrHRM;
//new exception got.....element click intercepted exception
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement loginIdTab = driver.findElement(By.xpath("//input[@name='username']"));
		loginIdTab.sendKeys("Admin");
		Thread.sleep(1000);
		WebElement ButtonTab = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		ButtonTab.sendKeys("admin123");
		Thread.sleep(1000);		
		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();
		Thread.sleep(3000);	
		WebElement leavebutton = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[3]"));		
		leavebutton.click();
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		WebElement checkboxAll = driver.findElement(By.xpath("//div[@role=\"columnheader\"]//div[@class=\"oxd-checkbox-wrapper\"]"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));		
		checkboxAll.click();
		Thread.sleep(2000);
		checkboxAll.click();
		Thread.sleep(2000);
		List<WebElement> singleSelect = driver.findElements(By.xpath("//div[@role=\"rowgroup\"]//i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]"));
		System.out.println(singleSelect.size());		
		for(int i=0;i<singleSelect.size();i++)                                                                                   
		{
			singleSelect.get(i).click();
			Thread.sleep(1000);
		}
		driver.close();
		
	}
}
