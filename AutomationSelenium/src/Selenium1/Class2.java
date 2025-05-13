package Selenium1;

import java.awt.Button;
import java.awt.Point;
import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement Button = driver.findElement(By.tagName("button"));
        Dimension size = Button.getSize();
        System.out.println("The height and width of the button is:"+size);
        System.out.println("the height of button is:"+size.getHeight());
        System.out.println("the width of button is:"+size.getWidth());
        //to find the x and y coordinate of the login button with the help of getlocation()
        org.openqa.selenium.Point loc = Button.getLocation();
        System.out.println("the x,y coordinate of the button is:"+loc);
        System.out.println("the x coordinate of the button is:"+loc.getX());
        System.out.println("the y coordinate of button is:"+loc.getY());
        // to find the x and y coordinate and height ; width of the login button with the help of getrect();
		org.openqa.selenium.Rectangle rec = Button.getRect();
		System.out.println("The x,y coordinate of button is:"+rec.getPoint());
		System.out.println("The height and width of button is:"+rec.getDimension());
		System.out.println(Button.getTagName());
		
		
		
		
	}

}
