package Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement yourFullnameTextbox=driver.findElement(By.xpath("//input[@name=\"fullname\"]"));
		WebElement currEmailIdTextbox = driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement newPassTextbox = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement retypePassTextbox = driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement FemaleRadioButton = driver.findElement(By.xpath("//input[@name='sex'][2]"));
		WebElement locationTextbox = driver.findElement(By.xpath("//input[@name='city']"));
		WebElement schoolTextbox = driver.findElement(By.xpath("//input[@id='school']"));
		WebElement collegeTextbox = driver.findElement(By.xpath("//input[@id='college']"));
		WebElement captchaTextbox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		
		Thread.sleep(2000);
		yourFullnameTextbox.sendKeys("shivay");
		Thread.sleep(2000);

		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);		Thread.sleep(2000);

		currEmailIdTextbox.sendKeys("ac@gmail.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));		Thread.sleep(2000);

		newPassTextbox.sendKeys("12345689");
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);		Thread.sleep(2000);

		retypePassTextbox.sendKeys("12345689");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));		Thread.sleep(2000);

		
		
		driver.close();
	}

}
