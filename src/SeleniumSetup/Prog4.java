package SeleniumSetup;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Dimension r=new Dimension(500,1000);
		driver.manage().window().setSize(r);
		Thread.sleep(5000);
		Point r1=new Point(600,300);
		driver.manage().window().setPosition(r1);
		Thread.sleep(5000);

		Dimension r3=new Dimension(100,5000);
		driver.manage().window().setSize(r3);
		Thread.sleep(5000);
		driver.close();
	}

}
