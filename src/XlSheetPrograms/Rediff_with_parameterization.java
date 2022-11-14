package XlSheetPrograms;
//succesfully automated rediff regidtor page with xl sheet 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Rediff_with_parameterization {
	
	//Do	Google
	//Search	apache	poi	download
	//click	on	stable	version	(The	latest	stable	release	is	Apache	POI 5.2.2)
	//Click	on	poi-bin-5.2.2-20220312.zip...Binary Distribution
	//Click	https://dlcdn.apache.org/poi/release/bin/poi-bin-5.2.2-20220312.zip
	//Download	started......sagdyat varchi file dowload kra
	//Add	jar	files	into	project
	//Passing	the	excel	file	address

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\ScreeShotProject\\cromedriver\\chromedriver.exe");
		WebDriver driver	=	new	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement	FullnameTextbox	=	driver.findElement(By.id("fullname"));
		WebElement	currEmailIdTextbox	=	driver.findElement(By.id("emailid"));
		WebElement	newPasswordTextbox	=	driver.findElement(By.id("pass"));
		WebElement	retypePasswordTextbox	=	driver.findElement(By.id("repass"));
		WebElement maleRadioBtn = driver.findElement(By.id("sex"));
		WebElement DayDropdow = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement MonthDropdow = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement YearDropdow = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement	locationTextbox	= driver.findElement(By.id("signup_city"));
		WebElement	schoolTextbox	=	driver.findElement(By.id("school"));
		WebElement	collegeTextbox	=	driver.findElement(By.id("college"));
		WebElement	captchaTextbox	=	driver.findElement(By.id("fld_captcha"));
		//driver.close();
	
		FileInputStream input = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\sheet_xl\\rediffdataase.xlsx");
		Sheet s1 = WorkbookFactory.create(input).getSheet("Sheet1");
		FullnameTextbox.sendKeys(s1.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		currEmailIdTextbox.sendKeys(s1.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		newPasswordTextbox.sendKeys(s1.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		retypePasswordTextbox.sendKeys(s1.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		//FemaleRadioBtn.sendKeys(s1.getRow(0).getCell(4).getStringCellValue());
		maleRadioBtn.click();Thread.sleep(1000);
		Select s =new Select(DayDropdow);
		s.selectByValue("11");
		Select c =new Select(MonthDropdow);
		c.selectByValue("11");
		Select m =new Select(YearDropdow);
		m.selectByValue("1988");
		
		Thread.sleep(1000);Thread.sleep(1000);
		
		locationTextbox.sendKeys(s1.getRow(0).getCell(5).getStringCellValue());
		Thread.sleep(1000);
		schoolTextbox.sendKeys(s1.getRow(0).getCell(6).getStringCellValue());
		Thread.sleep(1000);
		collegeTextbox.sendKeys(s1.getRow(0).getCell(7).getStringCellValue());
		Thread.sleep(1000);
		captchaTextbox.sendKeys(s1.getRow(0).getCell(8).getStringCellValue());
		Thread.sleep(4000);
		driver.close();
	}

}
