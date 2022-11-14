package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass1 {
	/*-Handling of DropDown
	step1: identify dropdown element
	step2: Create an object of Actions class with webdriver object as a input
	step3: Call Actions class methods--> moveToElement
	-Action class methods
	1. moveToElement         2. contextClick --> To perform mouse right click action
	3. perform -- To execute each statement/action
	4. build -To combile multiple actions in a single statement     5. click
	6. doubleclick     7. dragAndDrop        8. clickAndHold    9. release
	The listbox which created without using select tag name*/
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().window().maximize();
	    WebElement userIdTextbox = driver.findElement(By.xpath("//input[@id=\"user-number\"]"));
	    WebElement passwordTextbox = driver.findElement(By.xpath("//input[@id='email_id']"));
	    WebElement continueBtn = driver.findElement(By.xpath("//button[text()='Continue']"));
	    userIdTextbox.sendKeys("7875667060");
	    Thread.sleep(1000);
	    passwordTextbox.sendKeys("tharshu70@gmail.com");
	    Thread.sleep(1000);
	    continueBtn.click();
	    Thread.sleep(1000);
	    
	    //WebElement dropdown = driver.findElement(By.xpath("//button[@class=\"btn dropdown-toggle\"]"));
	    //from above we get 5 result make it uniqe
	    
	    WebElement oocupationDropdown = driver.findElement(By.xpath("//button[normalize-space(text())='Select Occupation']"));
	  //label[normalize-space(text())='who cares about spaces']...search it on google get format

	    Actions a= new Actions(driver);
	  //  a.moveToElement(oocupationDropdown).click().build();//.perform();
	    a.moveToElement(oocupationDropdown).click().build().perform();

//	    a.sendKeys(Keys.DOWN).build().perform();
//	    Thread.sleep(1000);
//	    a.sendKeys(Keys.DOWN).build().perform();
//	    Thread.sleep(1000);
//	    a.sendKeys(Keys.ENTER).build().perform();
	    for(int i=0;i<=5;i++)
	    {
	    a.sendKeys(Keys.DOWN).build().perform();
	    Thread.sleep(1000);
	    }
	    a.sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(1000);
	    
	   driver.close();
}}
