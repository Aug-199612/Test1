package diff_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 WebDriver	driver	=	new	ChromeDriver();
//		 WebDriverManager.firefoxdriver().setup();
//		 WebDriver	driver	=	new	FirefoxDriver();
//		 WebDriverManager.edgedriver().setup();
//		 WebDriver	driver	=	new	EdgeDriver();
		 
		//this below driver not opened beacause it is not in our laptop
		 
		 
//		 WebDriverManager.operadriver().setup();
//		 WebDriver	driver	=	new	OperaDriver();
//		WebDriverManager.safaridriver().setup();
//		WebDriver	driver	=	new	SafariDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-andwindows/#iFrame");
		driver.quit();
	}

}
