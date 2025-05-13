package dropdown;

import java.lang.foreign.Linker.Option;
import java.nio.channels.SelectableChannel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class single_selectdropdown {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement drop = driver.findElement(By.tagName("select"));
		Select sct = new Select(drop);
		
      System.out.println(sct.isMultiple());
		List<WebElement> opt = sct.getOptions();
		/*
		
		System.out.println(opt.size());
		for(WebElement option:opt) {
			System.out.println(option.getText());
			option.click();   }   */
			
		
		sct.selectByIndex(2);
		Thread.sleep(2000);
		sct.selectByValue("ASM");
		Thread.sleep(2000);
		sct.selectByVisibleText("Armenia");
		Thread.sleep(2000);
		sct.selectByContainsVisibleText("Barbuda");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
