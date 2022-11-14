package SeleniumSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog8 {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://mpsconline.gov.in/candidate/login");
		Thread.sleep(1000);
		WebElement emailTextbox=
				driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement passTextbox =
				driver.findElement(By.xpath("//input[@id='password']"));		
		System.out.println(emailTextbox.isDisplayed());
		System.out.println(emailTextbox.isEnabled());
		System.out.println(emailTextbox.isSelected());		
		System.out.println("____________________");
		System.out.println(passTextbox.isDisplayed());
		System.out.println(passTextbox.isEnabled());
		System.out.println(passTextbox.isSelected());
		driver.close();
		

	}

}
