package RoomPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaxApp {
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	 opt.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.maxfashion.in/in/en/");
	driver.findElement(By.xpath("//input[@id='js-site-search-input']")).sendKeys("t shirt");
	String expected="Men Checked Flat Knit T-shirt";
    driver.findElement(By.xpath("//div[@class='jss362 jss364']")).click();
	driver.findElement(By.xpath("//div[text()='t shirt']")).click();
    WebElement ele = driver.findElement(By.xpath("//div[@id='product-1']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//span[.='select size']")).click();
	driver.findElement(By.xpath("//div[.='M']")).click();
	driver.findElement(By.xpath("//span[.='add to basket']"));
	WebElement ele1 = driver.findElement(By.xpath("//a[.='Men Checked Flat Knit T-shirt']"));
	String actual = ele1.getText();
	if(expected.equals(actual)) {
		System.out.println(" "+actual+" ==> Test case is pass");
	}else {
		System.out.println("Test case is fail");
	}
	
	
	
	
}
}
