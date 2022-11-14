package ScreeShot;

import java.io.File;
//import java.util.Date;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog2 {
	static WebDriver driver;
//	public static String getDateTime()
//	{
//	Date d = new Date();
//	return d.toString(); //toString() method will convert date into string
//	}
	
	//Capture full page screenshot
	public static void takeScreenShotMethod1() throws Exception
	{
	
		//String Date =getDateTime();
		
		File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\ss\\p1.jpeg");
		FileHandler.copy(sourse, dest);
		
	}
	
	
	//Capture screenshot of specific area
//	public static void takeScreenShotMethod2() throws Exception
//	{
//	
//		String Date =getDateTime();
//		driver.findElement(By.xpath("//div[@class='regioninnertabs-inner']"));
//		File Origin1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
//		File target1 = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\ss\\p2" +Date+".jpeg");
//		FileHandler.copy(Origin1, target1);
//	}
	
//	public static void takeScreenShotMethod3() throws Exception
//	{
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\geckodriver.exe");
//		
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
		
		
//		File Origin2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
//		File target2 = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\ss\\firefoxss.jpeg");
//		FileHandler.copy(Origin2, target2);
		
	//}

	public static void main(String[]args) throws Throwable{
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");

		takeScreenShotMethod1();
		Thread.sleep(2000);
		driver.close();
		
	}

}
