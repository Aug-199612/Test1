package PopUpPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChidlBrowerProg {
//	Link1 :- https://www.aspsnippets.com/demos/1102/
//		Link1 :- https://skpatro.github.io/demo/links
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		//click on openpop
		WebElement openpop = driver.findElement(By.xpath("//input[@value=\"Open Popup\"]"));
		openpop.click();//its not a pop bcz contain url in it
		
		//then we got two windows so need to stored in set with getwindowhandle
		Set<String> twowin = driver.getWindowHandles();
		
		//Use universal cursor (Iterator)......always use iterator cursor
		Iterator<String> itr = twowin.iterator();
		//used cursor to operate on each value of windowos
		 while(itr.hasNext())
		 {
		 System.out.println(itr.next());//to get adress of windows
		 }
			System.out.println("**************");
		
		String window[] = new String[4];
		//to handle windows to stored the values of collection into the array os string
		//create array to stored windows address, 4 is maxixum limit to handle windows
		Thread.sleep(2000);

		for(int i=0;i<twowin.size();i++)//take reff of twowin
		{
			Thread.sleep(1000);
			window[i]=itr.next();
			
			//win[i]=itr.next();
			//next value get from collection and stored into the array
			System.out.println(window[i]);
			System.out.println("**************");
		}
		
		System.out.println("------------");
		
		WebDriver zero = driver.switchTo().window(window[1]);
		System.out.println("title of this window is "+zero.getTitle());		
		Thread.sleep(2000);
		driver.close();
		WebDriver one = driver.switchTo().window(window[0]);
		System.out.println("title of this window is "+one.getTitle());		
		Thread.sleep(2000);		
		driver.close();
		
		
		
		driver.close();//operate main window not child window
	}

}
