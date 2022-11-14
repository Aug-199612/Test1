package RediffAutomatio;
//dropdow deep progrmsm
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Prog2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement dayDropdown =
				driver.findElement(By.xpath("//select[@id='date_day']"));
				Select s = new Select(dayDropdown);
				
				
		WebElement yearDropdown =
				driver.findElement(By.xpath("//select[@name='Date_Year']"));
				Select s1 = new Select(yearDropdown);
				
				//Get all options present in year list box
		 java.util.List<WebElement> allYearDropdownOptions = s1.getOptions();
				System.out.println("Total values = " + allYearDropdownOptions.size());
				// for(int i=0;i<allYearDropdownOptions.size();i++)
				// {
				// System.out.println(allYearDropdownOptions.get(i).getText());
				// }
				for(WebElement value : allYearDropdownOptions)
				{
				System.out.println(value.getText());
				}
				System.out.println("Selected option in day drop down = " +
				s.getFirstSelectedOption().getText());
				System.out.println("Selected option in year drop down = " +
				s1.getFirstSelectedOption().getText());
				driver.close();
	}

}
