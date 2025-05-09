package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.110.196.103/#/dashboard");
        
		Window win = driver.manage().window();
		Dimension size = win.getSize();
		win.setSize(new Dimension(400,800));
		
		org.openqa.selenium.Point pos = win.getPosition();
		System.out.println("The x and y position of window is:"+pos);
		
        System.out.println("The x of the window is:"+pos.getX());
        System.out.println("The y of the window is:"+pos.getY());
        
        win.setPosition(new Point(300,200));
		
		
		
		
		
	}

}
