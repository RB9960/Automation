package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.110.196.103/#/dashboard");
		Navigation nav = driver.navigate();
		
		nav.back();
		Thread.sleep(4000);   //this is used to provide delay time
		nav.forward();
		Thread.sleep(4000);
		nav.refresh();
		
		
		System.out.println("The window is:"+driver.getWindowHandles());
		
		
		}

}
