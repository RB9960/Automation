import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		//open the page
		driver.get("https://github.com/login");
		//locate user name by tag#id
		driver.findElement(By.cssSelector("Input#login_field")).sendKeys("Bhaskarji1000@gmail.com");
		//locate password by tag[attribute]
		Thread.sleep(300);
		driver.findElement(By.cssSelector("Input[autocomplete=current-password]")).sendKeys("Rahul9960@#$%");
		//locate login button by tag.value of class
		Thread.sleep(300);
		driver.findElement(By.cssSelector("Input.btn.btn-primary.btn-block.js-sign-in-button")).click();
		
		//switch to product page 
		String currentwindowHandle = driver.getWindowHandle();
		
		driver.switchTo().window(currentwindowHandle);
		//tag.value of class[attribute]
		driver.findElement(By.cssSelector("a.color-fg-default.lh-0.mb-2.markdown-title[data-hovercard-type=repository]")).click();
		
		
		
        
		
	}

}
