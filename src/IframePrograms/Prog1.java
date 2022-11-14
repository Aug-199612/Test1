package IframePrograms;
//totally runed
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\ScreeShotProject\\cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		// driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		System.out.println("11111");
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		Thread.sleep(2000);
		driver.quit();
		

		
	}

}
