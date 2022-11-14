package PopUpPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_p1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		WebElement signupButton = driver.findElement(By.xpath("//input[@type='submit']"));
		signupButton.click();
		Thread.sleep(2000);

		Alert a =driver.switchTo().alert();
		a.accept();
		//System.out.println(a);
		a.dismiss();
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
