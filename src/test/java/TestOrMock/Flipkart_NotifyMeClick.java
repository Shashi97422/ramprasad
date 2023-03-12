package TestOrMock;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_NotifyMeClick {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	//driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple 14 pro max");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]")).click();
	Set<String> wids = driver.getWindowHandles();
	String title = driver.getTitle();
	System.out.println(title);
	for (String Wd : wids) {
		driver.switchTo().window(Wd);	
	}
	driver.findElement(By.xpath("//button[text()='NOTIFY ME']")).click();
	driver.findElement(By.xpath("//button[text()='Deny']")).click();
}
}
