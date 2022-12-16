package practicepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//driver.findElement(By.name("//input[@name='q']")).sendKeys("titan watch");
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("SAMSUNG Galaxy F23 5G");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	driver.findElement(By.xpath("//div[@data-tkid='f01245cc-045b-4f2e-993c-df8c5ad1cfb7.MOBFE4CSQ4MDCBWF.SEARCH']/descendant::span[.='SAMSUNG Galaxy F23 5G (Forest Green, 128 GB)")).click();
}
}
