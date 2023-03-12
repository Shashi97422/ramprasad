package TestOrMock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip_ {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/flights/");
	WebElement ele = driver.findElement(By.xpath("//label[@for='fromCity']/descendant::input[@type='text']"));
	ele.click();
	ele.sendKeys("chennai");
	driver.findElement(By.xpath("//input[@data-cy='toCity']")).sendKeys("Bengaluru");
	
}
}
