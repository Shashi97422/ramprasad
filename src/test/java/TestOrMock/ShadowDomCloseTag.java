package TestOrMock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomCloseTag {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://selectorshub.com/xpath-practice-page/");
	driver.switchTo().frame("pact");
	
	//to handle shadowdom close tag
WebElement ele = driver.findElement(By.xpath("//div[@id='jest']"));  //host element
ele.click();
Actions act=new Actions(driver);
act.sendKeys(Keys.TAB).perform();
act.sendKeys("yes").perform();
	
}
}
