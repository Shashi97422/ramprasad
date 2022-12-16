package TestOrMock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import collections.Arraylist;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripFlightDetailsa {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[text()='From']")).click();
	String cityname="Bengaluru";
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(cityname);
	driver.findElement(By.xpath("//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']/descendant::p[contains(text(),'"+cityname+"')]")).click();
	driver.findElement(By.xpath("//span[text()='To']")).click();
	String Tocity="Mumbai";
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Tocity);
	driver.findElement(By.xpath("//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']/descendant::p[contains(text(),'"+Tocity+"')]")).click();
	driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	driver.findElement(By.xpath("//div[@class='datePickerContainer']/descendant::div[@class='DayPicker-Week']/div[@aria-label='Fri Dec 02 2022']")).click();
	driver.findElement(By.xpath("//a[text()='Search']")).click();
//	List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='filterWrapper']/descendant::p[text()='Popular Filters']/parent::div[@class='filtersOuter']/descendant::span[@class='filterName' and contains(.,'')]/parent::div[@class='makeFlex flexOne gap-x-10']/span[@class='customCheckbox']"));
//	for (WebElement check : checkboxes) {
//		check.click();
//	}
	
	
	
	
}

}
