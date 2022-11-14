package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size()); //26
		for(int i=0;i<links.size();i++) //0-25 = 26
		{
		System.out.println(links.get(i).getText());
		}
		
		
		System.out.println("Initial Title = " + driver.getTitle());
		if(driver.getTitle().equals("Google"))
		{
		System.out.println("Initial title verification test case pass");
		}
		else
		{
		System.out.println("Initial title verification test case fail");
		}
		
		
		for(int i=0;i<links.size();i++) //i=0 0<=26
		{
		String expexted = "About";
		String actual = links.get(i).getText(); //Gmail
		if(expexted.equals(actual))
		{
		links.get(i).click();
		break;
		// i=26;
		}
		}
		if(driver.getTitle().equals("Google - About Google, Our Culture & Company News"))
		{
		System.out.println("Final title verification test case pass");
		}
		else
		{
		System.out.println("Final title verification test case fail");
		}
		System.out.println("Final Title = " + driver.getTitle());
		driver.quit();
	}}
	


