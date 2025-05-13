package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     Thread.sleep(3000);
     //driver.findElement(By.xpath("//span[text()='Login']")).click();
     driver.findElement(By.xpath("(//a[@class=\"_1krdK5 _3jeYYh\"])[1]")).click();
     
     
     

	}

}
