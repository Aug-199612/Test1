package ScreeShot;
//sir chi method
import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class date_ss {
	//Capture screenshot of specific area
	
	public static String getDateTime()
	{
	Date d = new Date();
	return d.toString(); //toString() method will convert date into string
	}
	
	public static void datScreeshot() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		String Date =getDateTime();
		//driver.findElement(By.xpath("//div[@class='regioninnertabs-inner']"));
		File Origin1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		File target1 = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\ss\\p2" +Date+".jpeg");
		FileHandler.copy(Origin1, target1);
		driver.close();
	}

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		
		datScreeshot();
		
		

		
		
	}

}
