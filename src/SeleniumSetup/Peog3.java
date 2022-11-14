package SeleniumSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Peog3 {

	public static void main(String[] args) {

		System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airindia.in/");
		String expectedTitle="Air India";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Application title verification test passed");
		}
		else
		{
			System.out.println("Application title verification test failed");

		}
		String geturl=driver.getCurrentUrl();
		System.out.println(geturl);
		driver.close();
	}

}
