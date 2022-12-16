package GridPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteExecytion {
@Test
public void gridpractice() throws MalformedURLException {
	URL url = new URL("http://localhost:4444/wd/hub");
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	WebDriver driver=new RemoteWebDriver(url,cap);
	driver.manage().window().maximize();
	driver.get("http://facebook.com");
	
}
}
