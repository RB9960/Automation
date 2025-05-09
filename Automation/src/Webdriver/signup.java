package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("bhaskarji1000@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Rahul9960@#$%");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(2000);
		
		String currentwindowhandle = driver.getWindowHandle();
		driver.switchTo().window(currentwindowhandle);
		driver.findElement(By.linkText("RB9960/Bhaskar")).click();
		Thread.sleep(2000);
		List <WebElement> elementlist = driver.findElements(By.partialLinkText("R.B"));
		System.out.println("Element size:"+ elementlist.size());
		
		

	}

}
