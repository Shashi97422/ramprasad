package TestOrMock;

import java.awt.Window;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWashingMc {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.name("field-keywords")).sendKeys("washing machine");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//div[@class='sg-col-inner']/ancestor::div[@id='search']"
			+ "/descendant::div[@class='sg-row']/descendant::a")).click();
	Set<String> all_id = driver.getWindowHandles();
	for (String id : all_id) {
		driver.switchTo().window(id);
	}
WebElement details = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
String detail = details.getText();
System.out.println(details.getText());
if(detail.contains("6.5 Kilograms")) {
	System.out.println("items are present");
}

WebElement ele = driver.findElement(By.xpath("//input[@id='mbb-offeringID-1']"));
ele.click();

}
}
