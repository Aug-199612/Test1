package ScreeShot;
//perfectly take screen shot

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PRog3 {
	
	public static void sap() throws Exception
	{
		System.setProperty("WeDriver.Cromedriver", "C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\ss\\harsha3.png");
		FileHandler.copy(source, desti);
		driver.close();
	}
	

	public static void main(String[] args) throws Exception  {

		sap();
		
	}

}
