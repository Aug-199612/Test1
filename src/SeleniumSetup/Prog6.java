package SeleniumSetup;
//automation with various locator

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog6 {

	public static void main(String[] args) throws Throwable   {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//Thread.sleep(1000);
		driver.get("https://is.rediff.com/signup/register");
		
		driver.findElement(By.tagName("input")).sendKeys("harsha");
		Thread.sleep(1000);//tagname

		driver.findElement(By.id("emailid")).sendKeys("harshathakre@gmail.com");
		Thread.sleep(1000);//id

		driver.findElement(By.name("pass")).sendKeys("rediff");
		Thread.sleep(1000);//name

		driver.findElement(By.name("repass")).sendKeys("rediff");
		Thread.sleep(1000);//name

		driver.findElement(By.name("sex")).click();
		Thread.sleep(1000);//name

		driver.findElement(By.name("date_day")).click();
		Thread.sleep(1000);//name
		
		driver.findElement(By.name("date_mon")).click();//fld_captcha
		Thread.sleep(1000);//name

		driver.findElement(By.name("Date_Year")).click();
		Thread.sleep(1000);//name
		
		driver.findElement(By.id("signup_city")).sendKeys("Nagpur");
		Thread.sleep(1000);//id
		
		driver.findElement(By.id("school")).sendKeys("VCT");
		Thread.sleep(1000);//id

		driver.findElement(By.id("college")).sendKeys("ABCD");
		Thread.sleep(1000);//id

		driver.findElement(By.id("fld_captcha")).sendKeys("123ABHN");
		Thread.sleep(1000);//id

		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(1000);//link text

		driver.findElement(By.partialLinkText("Investo")).click();
		Thread.sleep(1000);//partiallink text
	
	}

}
