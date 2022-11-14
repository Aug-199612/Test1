package SeleniumSetup;
//automation with xpath locator
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
	 WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@type='text']"));
	 firstNameTextBox.sendKeys("siya");
	 //object through call..apn create karycha object ani cursor naycha tithe just create local variable
	 //cant not give sendkeys in driver ,thing
	//input[@type='text']------this get fromthe inspect from orginal website
	 //just do copy paste after finf xpath in html code
	 
	 Thread.sleep(2000);
     WebElement currentEmailId = driver.findElement(By.xpath("//input[@id='emailid']"));
     currentEmailId.sendKeys("abc@gmail.com");
	 Thread.sleep(2000);

     driver.findElement(By.xpath("//a[text()='rediff.com']")).click();
		 
		 //name1c1d04b4...>name51baaf0d...>name486c30e0//dynamic element changing
	}

}
