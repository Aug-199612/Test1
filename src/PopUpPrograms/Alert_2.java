package PopUpPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_2 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alerwithCancelAndAccept = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alerwithCancelAndAccept.click();
		WebElement clickButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickButton.click();
		Thread.sleep(1000);
		Alert a= driver.switchTo().alert();
		a.accept();
		
		WebElement alertWithTextBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertWithTextBox.click();
		 WebElement clickbutton = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		 clickbutton.click();
		Alert a1 =driver.switchTo().alert();
		a1.sendKeys("harsha");
		System.out.println(a1);
	
		a1.accept();
		a1.dismiss();
	      System.out.println(a1);
		driver.close();
	}

}
