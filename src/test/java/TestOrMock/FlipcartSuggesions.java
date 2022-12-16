package TestOrMock;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import collections.Arraylist;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartSuggesions {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");  ////span[contains(text(),'mobile')]
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
	List<WebElement> ele = driver.findElements(By.xpath("//span[contains(text(),'mobile')]/.."));
	ArrayList<String>list=new ArrayList<String>();
	for (WebElement suj : ele) {
		String text = suj.getText();
		list.add(text);
		
	}
System.out.println(list.get(list.size()-1));
	
}
}
