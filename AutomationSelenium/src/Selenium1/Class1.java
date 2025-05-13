package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("What is selenium");
		search.clear();
		search.sendKeys("what is tag");
		//search.sendKeys(Keys.ENTER);
		System.out.println(search.isDisplayed());
        System.out.println(search.isEnabled());
        System.out.println(search.isSelected());
        System.out.println("the value of the class attribute is:"+search.getDomAttribute("class"));
        System.out.println("the css value of the color attribute is:"+search.getCssValue("color"));
        
		
		
		
		
		

	}

}
