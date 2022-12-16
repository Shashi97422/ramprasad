package TestOrMock;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlecom {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	//driver.findElement(By.xpath("//body[@jsmodel]")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shashidharswamy");
	List<WebElement> ele = driver.findElements(By.xpath("//b"));
	Set<String> set = new TreeSet<String>();
	
	for (WebElement elem : ele) {
		String text = elem.getText();
		set.add(text);
	
	}
	ArrayList<String> list=new ArrayList<String>(set);
	System.out.println(list.get(2));

}
}
