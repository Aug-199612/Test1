package SeleniumSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");//opening driver
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title1=driver.getTitle();//facebook title
		System.out.println(title1);
		Thread.sleep(1000);
		driver.navigate().to("https://uidai.gov.in/");
		Thread.sleep(1000);
		String title2=driver.getTitle();//udai title
		System.out.println(title2);
		driver.navigate().to("https://login.yahoo.com/?.intl=in");
		Thread.sleep(1000);
		String title3=driver.getTitle();//yahoo title
		System.out.println(title3);
		Thread.sleep(2000);
		driver.navigate().back();//udai
		String title4=driver.getTitle();//uadai titlte again
		System.out.println(title4);
		Thread.sleep(2000);
		driver.navigate().forward();//Yahoo
		String title5=driver.getTitle();//yahoo title again
		System.out.println(title5);
		Thread.sleep(2000);
		driver.navigate().refresh();//refreshing yahoo
		Thread.sleep(2000);
		driver.close();//close driver
		
		
		
				

	}

}
