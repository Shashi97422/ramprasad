package TestOrMock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectorhub {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://selectorshub.com/xpath-practice-page/");
	driver.switchTo().frame("pact");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement ele = (WebElement) js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
    String jsc="arguments[0].setAttribute('value','Yes')";
    js.executeScript(jsc, ele);
	
    
//    WebElement ele2 = (WebElement) js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"div > h4\")");
//	String text = ele2.getText();
//	System.out.println(text);
//	
//	WebElement ele3 = (WebElement) js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
//	String jsc2 = "arguments[0].setAttribute('value','no')";
//	js.executeScript(jsc, ele2);
}
}
