package SeleniumSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Prog5 {

	public static void main(String[] args) {
		//// Configuring the system properties of chrome driver
		System.setProperty("webDriver.chrome.driver","chromeDriver.exe");
		//Initializing the browser driver
		WebDriver rr=new ChromeDriver();
		//Navigating through a particular website
		rr.get("https://www.airindia.in/");
		rr.manage().window().maximize();
		//rr.close();
		rr.findElement(By.tagName("input")).sendKeys("nagpur");
		//rr.get("https://is.rediff.com/signup/register");
		//rr.findElement(By.tagName("input")).sendKeys("Harry");
	}

}
