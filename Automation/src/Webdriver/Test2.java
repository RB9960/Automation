package Webdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.110.196.103/#/dashboard");
        
		Window win = driver.manage().window();
		
		win.maximize();
		Thread.sleep(4000);
		win.fullscreen();
		Thread.sleep(40000);
		win.minimize();
        
		System.out.println(win.getSize());
		
		Dimension size = win.getSize();
		System.out.println("The height of the window:"+size.getHeight());
		System.out.println("The width of the window:"+size.getWidth());
		
		
	}

}
