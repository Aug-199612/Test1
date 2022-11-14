package ScreeShot;
//rumed
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog1 {
	
	// to get screenshot of the webpage 
	public static void method1() throws Exception  
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		File se = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	   File de = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\ss\\q1.png");
		 FileHandler.copy(se,de);
		  driver.close();
	}
	
	// to get screenshot of the webpage of particular area 

//	public static void method2() throws Exception
//	{
//		WebElement area= driver.findElement(By.xpath("//div[@class='region-inner tabs-inner']"));
//		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		// System.out.println(source);
//		 File dest1 = new File("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\ss\\photo5.png");
//		 FileHandler.copy(source1, dest1);
//	}
//	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		
		method1();
		//method2();
		
	}

}
