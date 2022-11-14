package ActionClass;
//sucessfully runed
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//WebElement a = driver.findElement(By.xpath(""));
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);
        WebElement img1= driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement img2= driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
        WebElement img3= driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
        WebElement img4= driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
        WebElement trashbox = driver.findElement(By.xpath("//div[@id='trash']"));
        WebElement gallery = driver.findElement(By.xpath("//ul[@id='gallery']"));

        Actions action =new Actions(driver);
        action.moveToElement(img1).clickAndHold().moveToElement(trashbox).release().build().perform();
        Thread.sleep(2000);
        action.moveToElement(img2).clickAndHold().moveToElement(trashbox).release().build().perform();
        Thread.sleep(2000);
        action.moveToElement(img4).clickAndHold().moveToElement(trashbox).release().build().perform();
        Thread.sleep(2000);
        action.moveToElement(img3).clickAndHold().moveToElement(trashbox).release().build().perform();
        Thread.sleep(2000);
        
        Actions undo =new Actions(driver);
        undo.moveToElement(img1).clickAndHold().moveToElement(gallery).release().build().perform();
        Thread.sleep(2000);
        undo.moveToElement(img2).clickAndHold().moveToElement(gallery).release().build().perform();
        Thread.sleep(2000);
        undo.moveToElement(img3).clickAndHold().moveToElement(gallery).release().build().perform();
        Thread.sleep(2000);
        undo.moveToElement(img4).clickAndHold().moveToElement(gallery).release().build().perform();
        Thread.sleep(2000);

        driver.close();
	
	
	}

}
