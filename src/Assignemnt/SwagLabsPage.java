package Assignemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabsPage {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement userId = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement password =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement loginClickButton = driver.findElement(By.xpath("//input[@type='submit']"));
		userId.sendKeys("standard_user");
		Thread.sleep(1000);
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginClickButton.click();
		Thread.sleep(1000);
		WebElement sortListBox =driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s= new Select(sortListBox);//support ui.package
		s.selectByIndex(3);
		Thread.sleep(1000);
		WebElement addToCartButoon = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
		addToCartButoon.click();
		Thread.sleep(1000);
		WebElement cartLogo = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartLogo.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("harsha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("thakre");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Zip/Postal Code\"]")).sendKeys("456321");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-test=\"continue\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-test=\"finish\"]")).click();
		Thread.sleep(1000);
		WebElement thankyouText = driver.findElement(By.xpath("//div[@class=\"complete-text\"]"));
        String thankuobject = thankyouText.getText();
		System.out.println(thankuobject);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-test=\"back-to-products\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(1000);
		WebElement userId1 = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement password1 =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement loginClickButton1 = driver.findElement(By.xpath("//input[@type='submit']"));
		userId1.sendKeys("locked_out_user");
		Thread.sleep(1000);
		password1.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginClickButton1.click();
		Thread.sleep(1000); 
		WebElement errorMeassage = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
		String error = errorMeassage.getText();
		System.out.println(error);
		driver.close();
		System.out.println("SWAGLABS PAGE AUTOMATED SUCCESFULLY!!!!!");
	}

}
