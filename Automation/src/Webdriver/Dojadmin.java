package Webdriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dojadmin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://doj.app/auth/doj/admin/#/users/add");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("(//button[@tabindex=\"0\"])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Users']")).click();
        driver.findElement(By.xpath("(//div[@class=\"link_text\"])[3]")).click();
        driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("Rani");
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Devi");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("devi44@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("9856632550");
        driver.findElement(By.xpath("//div[text()='Select Gender']")).click();
        driver.findElement(By.xpath("(//li[@role=\"option\"])[2]")).click();
        driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
        driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
        driver.findElement(By.xpath("//button[text()='OK']")).click();
       
	}

}
