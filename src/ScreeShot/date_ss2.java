package ScreeShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class date_ss2 {
	static WebDriver driver;
	public static void snap1() throws Exception {
		String date= dateTimeScreenshot();

		File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dest = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\date_ss\\zerodha1"+ date+ ".png");
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\date_ss\\zerodha1.png");
		FileHandler.copy(sourse, dest);
		
	}

	public static String dateTimeScreenshot() {
		//Date dt =new Date(System.currentTimeMillis());
		return new SimpleDateFormat("yyyy-MM-dd HH mm ss").format(new Date());
	//	System.out.println(SimpleDateFormat);
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zerodha.com/");
		Thread.sleep(3000);
		snap1();
		//dateTimeScreenshot();
		Thread.sleep(3000);
	
		driver.close();

		
	}

}
