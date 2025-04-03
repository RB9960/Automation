package Webdriver;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Navigation r = driver.navigate();
		
		r.back();
		Thread.sleep(6000);
		r.forward();
		Thread.sleep(6000);
		r.refresh();
		
		//System.out.println("page title:"+driver.getTitle());
		//System.out.println("page URL:"+driver.getCurrentUrl());
		//System.out.println("page source:"+driver.getPageSource());
		driver.close();
		
		
		
		

	}

}
