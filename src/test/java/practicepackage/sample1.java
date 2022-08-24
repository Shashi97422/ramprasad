package practicepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {
@Test
public void login() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://192.168.0.190/");
	SoftAssert s=new SoftAssert();
	s.assertEquals("A", "B");

	System.out.println("manjya .........");
	System.out.println("hi channu................");
	s.assertAll();
	
	
}
}
