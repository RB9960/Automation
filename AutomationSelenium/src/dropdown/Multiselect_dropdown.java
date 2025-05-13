package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement drop = driver.findElement(By.id("cars"));
		
		Select sct = new Select(drop);
		System.out.println(sct.isMultiple());
		
		
		
		
		
		
		
		
		
	}
}
