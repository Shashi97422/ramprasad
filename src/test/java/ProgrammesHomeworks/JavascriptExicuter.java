package ProgrammesHomeworks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExicuter {
@Test
public void java() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	JavascriptExecutor js=(JavascriptExecutor)driver;

	for (int i = 0; i < 3; i++) {
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	}
	for (int j = 0; j < 3; j++) {
		js.executeScript("window.scrollBy(0,-500)");
	}
}
}
