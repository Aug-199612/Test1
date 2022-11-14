package RediffAutomatio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//diff elemet logo,gray var,limk
public class Prog3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement rediffLink =
		driver.findElement(By.xpath("//a[@title='Rediff.com Home']"));
		WebElement rediffLogo =
		driver.findElement(By.xpath("//img[@class='halflogo']"));
		WebElement grayBar =
		driver.findElement(By.xpath("//div[@class='greybar']"));
		WebElement newUserLabel =
		driver.findElement(By.xpath("//b[contains(text(),'New')]"));
		WebElement tellUSFewThingsLabel =
		driver.findElement(By.xpath("//p[@class='grey1']"));
		// WebElement rediffLink = driver.findElement(By.xpath(""));
		// WebElement rediffLink = driver.findElement(By.xpath(""));
		// WebElement rediffLink = driver.findElement(By.xpath(""));
		int count=0; //++ => increment by 1 //-- => decrement
		if(rediffLink.isDisplayed())
		{
		count++;
		System.out.println("Rediff Link is available on web application");
		}
		else
		{
		System.out.println("Rediff Link is not available on web application");
		}
		if(rediffLogo.isDisplayed())
		{
		count++;
		System.out.println("Rediff Logo is available on web application");
		}
		else
		{
		System.out.println("Rediff Logo is not available on web application");
		}
		
		
	}

}
