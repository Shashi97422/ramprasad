package TestOrMock;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEndFlipkart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Water heater");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[.='AO Smith 15 L Storage Water Geyser (HSE-VAS-X-015, White)']")).click();
		String wd1 = driver.getWindowHandle();
		Set<String> all_wd = driver.getWindowHandles();
		System.out.println(all_wd);
		for (String wd : all_wd) {
			driver.switchTo().window(wd);
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.switchTo().window(wd1);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		String expected="AO Smith 15 L Storage Water Geyser (HSE-VAS-X-015, White)";
		String actual = driver.findElement(By.xpath("//a[.='AO Smith 15 L Storage Water Geyser (HSE-VAS-X-015, White)']")).getText();
		if(expected.equals(actual)) {
			System.out.println("Prodect is added to cart");
		}else {
			System.out.println("Not in cat");
		}
		
		
	}
}

