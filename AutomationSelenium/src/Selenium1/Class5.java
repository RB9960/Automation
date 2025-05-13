package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class5 {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.makemytrip.com/");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();

	        WebElement biz = driver.findElement(By.xpath("//span[.='Introducing myBiz']"));

	        Actions act=new Actions(driver);
	        act.moveToElement(biz).contextClick().perform();
	        driver.navigate().to("https://www.kirupa.com/html5/press_and_hold.htm");
	        WebElement circle = driver.findElement(By.id("item"));

	        act.clickAndHold(circle).perform();
	        Thread.sleep(3000);
	        act.release().perform();

	        driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
	        WebElement fr = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));

	        driver.switchTo().frame(fr);

	        WebElement source = driver.findElement(By.xpath("//img[@alt=\"On top of Kozi kopka\"]"));
	        WebElement target = driver.findElement(By.id("trash"));

	        act.dragAndDrop(source,target).perform();
	        // it is used to exit from the frame
	        driver.switchTo().defaultContent();
		
		
	}

}
