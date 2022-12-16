package practicepackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.ERetailerMart.generalutility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_tocart {
@Test
public void add() throws MalformedURLException {
	//WebDriverManager.chromedriver().setup();
	URL url = new URL("http://localhost:5555/wd/hub");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	RemoteWebDriver driver = new RemoteWebDriver(url, cap);
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//driver.findElement(By.name("//input[@name='q']")).sendKeys("titan watch");
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("SAMSUNG Galaxy F23 5G");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	//driver.findElement(By.xpath("//div[@data-tkid='f01245cc-045b-4f2e-993c-df8c5ad1cfb7.MOBFE4CSQ4MDCBWF.SEARCH']/descendant::span[.='SAMSUNG Galaxy F23 5G (Forest Green, 128 GB)")).click();

}
}
