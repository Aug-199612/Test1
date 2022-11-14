package RediffAutomatio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelect {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement carDropdown= driver.findElement(By.xpath("//select[@id='cars']"));
		Select s =new Select(carDropdown);
		s.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		s.selectByVisibleText("Saab");
		Thread.sleep(2000);
		s.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		//pudhcha code select aslya wrch first selected cha text gheil to.
		//.jr deselect kela tr kasa kay ghear ...ie.deselect tr kra
		WebElement firstElement = s.getFirstSelectedOption();
		System.out.println("First element = " + firstElement.getText());
		
		System.out.println("all selected optio are");
		List<WebElement> AllSelectelemet = s.getAllSelectedOptions();
		for(int i=0;i<AllSelectelemet.size();i++)
		{
			System.out.println(AllSelectelemet.get(i).getText());
		}
		
		s.deselectByVisibleText("Saab");
		Thread.sleep(2000);
		s.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		s.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		
//		WebElement firstselected = s.getFirstSelectedOption();
//		System.out.println("the selected first option is that ="+firstselected.getText());
	
		System.out.println("is car dropdow is multiple selectale-"+s.isMultiple());

		Thread.sleep(3000);
		driver.close();
		
	}

}
