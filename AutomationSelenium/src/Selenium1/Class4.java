package Selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class4 {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.makemytrip.com/");
	        Thread.sleep(4000);

	        driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
	        Thread.sleep(3000);
	        Actions act=new Actions(driver);
	        act.sendKeys(Keys.PAGE_DOWN).perform();
	      WebElement text=driver.findElement(By.xpath("//p[contains(text(),'Massive Price Drop &')]"));

	        String parent = driver.getWindowHandle();
	        System.out.println(text.getText());
	        text.click();

	        Set<String> allid = driver.getWindowHandles();

	        for (String id : allid) {
	            if (!parent.equals(id)) {
	                driver.switchTo().window(id);
	                System.out.println(driver.getTitle());
	            
	       
	        Thread.sleep(4000);
	        act.scrollByAmount(0,1300).perform();
	        driver.findElement(By.xpath("(//a[contains(@class,'slider_Item glider-slide active')])[1]")).click();



	        driver.quit();
	    }


	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
