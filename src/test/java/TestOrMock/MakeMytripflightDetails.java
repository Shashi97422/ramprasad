package TestOrMock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMytripflightDetails {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		//driver.switchTo().frame("webengage-engagement-callback-frame");
		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		List<WebElement> ele2 = driver.findElements(By.xpath("//div[@class='listingCard ']"));
		for (WebElement flights : ele2) {
			String text = flights.getText();
			System.out.println(text);
		}
	}
}
