package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//do not open browser runed in background
public class UploadFile_With_Headlless {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions o = new ChromeOptions();
		o.addArguments("headless");
		WebDriver driver = new ChromeDriver(o);
		
		
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement choosefileTab = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		WebElement pressTab = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		choosefileTab.sendKeys("C:\\Users\\hp\\Desktop\\hasrha.txt");
		Thread.sleep(2000);		

		pressTab.click();
		Thread.sleep(2000);	
		
		WebElement text = driver.findElement(By.xpath("/html/body/pre"));
		System.out.println(text.getText());
		
		driver.close();
	}

}
