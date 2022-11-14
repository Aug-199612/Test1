package RediffAutomatio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Select_class {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FirstProject\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");//input[@name='sex'][2]
		
		WebElement yourFullnameTextbox=
		driver.findElement(By.id("//input[@id='fullname']"));
		WebElement currEmailIdTextbox = driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement newPassTextbox = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement retypePassTextbox = driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement FemaleRadioButton = driver.findElement(By.xpath("//input[@name='sex'][2]"));
		WebElement locationTextbox = driver.findElement(By.xpath("//input[@name='city']"));
		WebElement schoolTextbox = driver.findElement(By.xpath("//input[@id='school']"));
		WebElement collegeTextbox = driver.findElement(By.xpath("//input[@id='college']"));
		WebElement captchaTextbox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		yourFullnameTextbox.sendKeys("shivay");
		Thread.sleep(1000);
		currEmailIdTextbox.sendKeys("ac@gmail.com");
		Thread.sleep(1000);
		newPassTextbox.sendKeys("12345689");		
		Thread.sleep(1000);
		retypePassTextbox.sendKeys("12345689");		
		Thread.sleep(1000);

//		System.out.println("Before click = " + FemaleRadioButton.isSelected());		
//		Thread.sleep(1000);
//
//		FemaleRadioButton.click();		
//		Thread.sleep(1000);
//
//		System.out.println("after click = " + FemaleRadioButton.isSelected());		
//		Thread.sleep(1000);

//		System.out.println("Before click = " + maleRadioBtn.isSelected());
//		maleRadioBtn.click();
//		System.out.println("After click = " + maleRadioBtn.isSelected());

		locationTextbox.sendKeys("chadrapur");	
		Thread.sleep(1000);

		schoolTextbox.sendKeys("mat");	
		Thread.sleep(1000);

		collegeTextbox.sendKeys("vjc");	
		Thread.sleep(1000);

		captchaTextbox.sendKeys("asdfgh");
		Thread.sleep(1000);

		
		WebElement DayDropdow = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement MonthDropdow = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement YearDropdow = driver.findElement(By.xpath("//select[@name='Date_Year']"));

		Select s =new Select(DayDropdow);
		s.selectByIndex(25);		
		Thread.sleep(1000);
		s.selectByValue("15");		
		Thread.sleep(1000);
		s.selectByVisibleText("12");
		Thread.sleep(1000);
		System.out.println("-------------");

		Select c =new Select(MonthDropdow);
		c.selectByIndex(3);
		Thread.sleep(1000);
		c.selectByValue("APR");		
		Thread.sleep(1000);
		c.selectByVisibleText("AUG");
		Thread.sleep(1000);

		System.out.println("-------------");

		Select m =new Select(YearDropdow);
		m.selectByIndex(66);
		Thread.sleep(1000);
		m.selectByValue("2014");		
		Thread.sleep(1000);
		m.selectByVisibleText("2022");
		Thread.sleep(1000);

		driver.close();
	}

}
