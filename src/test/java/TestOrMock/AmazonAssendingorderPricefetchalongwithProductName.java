package TestOrMock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import collections.Arraylist;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAssendingorderPricefetchalongwithProductName {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.name("field-keywords")).sendKeys("samsung galaxy a50");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	List<String> list=new ArrayList<String>();
	List<WebElement> alleles = driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']/descendant::span[@class='a-price-whole']"));
	for (WebElement price : alleles) {
		String text = price.getText();
		String actText = text.replace(",", "");
		//System.out.println(actText);
		list.add(actText);
		
			}
	Collections.sort(list);
	System.out.println(list);
	
}
}
