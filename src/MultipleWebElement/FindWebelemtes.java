package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWebelemtes {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println("the total links presents in this web is= "+links.size());
		
//		for(int i=0;i<=links.size();i++)//26 bez some of them are hidden total of 66
		//it have a small mistake as there is no equal to sign there
//		{
//		System.out.println(links.get(i).getText());
//			//break;
//		}
		for(int i=0;i<links.size();i++) //0-25 = 26
		{
		System.out.println(links.get(i).getText());
		}
		
		System.out.println("Initial title= "+driver.getTitle());
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
			
		}
		for(int i=0;i<=links.size();i++)
		{
			String actual=links.get(i).getText();
			String expected="About";
			
		if(expected.equals(actual))
		{
			links.get(i).click();
			break;
		}
		
		if(driver.getTitle().equals("Google - About Google, Our Culture & Company News"))
		{
			System.out.println("test case passed in about");
		}
		else
		{
			System.out.println("test case failed in about");
		}
		System.out.println("the final title of the web page is ="+driver.getTitle());
		driver.close();
		
}}}
