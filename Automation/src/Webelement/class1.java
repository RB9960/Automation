package Webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	    WebElement searchbox = driver.findElement(By.id("APjFqb"));
	    searchbox.sendKeys("Hello google i am RB");
	    Thread.sleep(5000);
	    searchbox.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
		driver.close();
		

	}

}
