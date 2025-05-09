package Webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Product_addby_admin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://doj.app/auth/doj/admin/#/users/add");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("(//button[@tabindex=\"0\"])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Products']")).click();
		driver.findElement(By.xpath("//div[text()='Add Products']")).click();
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Tommato soup");
		driver.findElement(By.xpath("(//div[@aria-haspopup=\"listbox\"])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Food']")).click();
		driver.findElement(By.xpath("//span[text()='Price']")).sendKeys("50");
		
		
		/*WebElement dropdown = driver.findElement(By.id("id=\"mui-component-select-categoryId\""));
		Select sct = new Select(dropdown);
		System.out.println(sct.isMultiple());
		List<WebElement> opt = sct.getOptions();   */
		
		
		
		
		
		
		
		

	}

}
