package Selenium1;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class6 {

	public static void main(String[] args) {
		
		    WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	        Actions act=new Actions(driver);

	        act.keyDown(Keys.CONTROL).perform();

	        String parent = driver.getWindowHandle();

	        act.moveByOffset(718,85).click().perform();
	        act.keyUp(Keys.CONTROL).perform();
	        act.keyDown(Keys.CONTROL).sendKeys("a").perform();

	        Set<String> allid = driver.getWindowHandles();

	        for (String id : allid) {
	            if (!parent.equals(id)) {
	                driver.switchTo().window(id);

	            }
	        }
	        act.scrollByAmount(0, 800).perform();
	        
	}
	}
		
