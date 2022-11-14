package ScreeShot;
//scroll screenshot with date..runed
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class scroll_ss1 {
	//static WebDriver driver;
	public static String getDateTime()
	{
	//Date d = new Date();
	//return d.toString(); //toString() method will convert date into string
		return new SimpleDateFormat("dd-MM-yyyy hh mm ss").format(new Date());
	}

	public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		String date= getDateTime();
		File Origin3 = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);		
		File target3 = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\ss\\amazon"+date+".jpeg");
		FileHandler.copy(Origin3, target3);
		System.out.println(Origin3);
		System.out.println("         ");
		System.out.println(target3);

		driver.quit();
		

	}

}
