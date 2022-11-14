package RediffAutomatio;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog4 {

	public	static	String	readExcelmethod(int	row,int	col)	throws	Exception
	{
	
		FileInputStream input = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\FirstProject\\sheet_xl\\rediffdataase.xlsx");
		Sheet s1 = (Sheet) WorkbookFactory.create(input).getSheet("Sheet1");
	String	value	=	 ((org.apache.poi.ss.usermodel.Sheet) s1).getRow(row).getCell(col).getStringCellValue();
	return	value;
	}
	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\ScreeShotProject\\cromedriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=	new	ChromeDriver();
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
		
		//FullnameTextbox.sendKeys(readExcelmethod(0,0));
		
		FullnameTextbox.sendKeys(readExcelmethod(0,0));
		currEmailIdTextbox.sendKeys(readExcelmethod(0,1));
		newPasswordTextbox.sendKeys(readExcelmethod(0,2));
		retypePasswordTextbox.sendKeys(readExcelmethod(0,3));
		maleRadioBtn.sendKeys(readExcelmethod(0,4));
		DayDropdow.sendKeys(readExcelmethod(0,5));
		MonthDropdow.sendKeys(readExcelmethod(0,6));
		YearDropdow.sendKeys(readExcelmethod(0,7));
		locationTextbox.sendKeys(readExcelmethod(0,8));
		schoolTextbox.sendKeys(readExcelmethod(0,9));
		collegeTextbox.sendKeys(readExcelmethod(0,10));
		captchaTextbox.sendKeys(readExcelmethod(0,11));}
		
//		Thread.sleep(3000);
//		driver.close();
		
}

