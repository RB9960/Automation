package File_upload_popup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//h2[contains(.,'experienced')]")).click();
		//driver.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\Asus\\Desktop\\Rahul Bhaskar Resume.pdf");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//Thread.sleep(4000);
		
		Runtime.getRuntime().exec("C:\\Users\\Asus\\Desktop\\upload.exe");
		
		

	}

}
