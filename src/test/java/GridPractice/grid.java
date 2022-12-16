package GridPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class grid {
@Test
public void grid() throws MalformedURLException, InterruptedException {
	URL url = new URL("http://192.168.231.218:4444/wd/hub");
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setPlatform(Platform.WINDOWS);
	cap.setBrowserName("chrome");
	//cap.setVersion("106.0.5249.119");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new RemoteWebDriver(url,cap);
	driver.manage().window().maximize();
	driver.get("http://gmail.com");
	Thread.sleep(5000);
	driver.quit();
	
}
}
