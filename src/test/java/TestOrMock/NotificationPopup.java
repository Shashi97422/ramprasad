package TestOrMock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopup {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option =new ChromeOptions();

		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("use-fake-device-for-media-stream"); 
		options.addArguments("use-fake-ui-for-media-stream");
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("version", "latest");
		caps.setCapability("platform", "WIN10");
		caps.setCapability(ChromeOptions.CAPABILITY,options);
		new RemoteWebDriver(caps);
	
		driver.get("https://mictests.com/");
		driver.findElement(By.xpath("//button[text()='Test my mic']")).click();
		
		
		

	}
}


